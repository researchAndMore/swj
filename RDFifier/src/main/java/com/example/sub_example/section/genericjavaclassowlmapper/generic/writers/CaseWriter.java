package com.example.sub_example.section.genericjavaclassowlmapper.generic.writers;

import com.example.sub_example.section.genericjavaclassowlmapper.utils.NamespaceProvider;
import com.example.sub_example.section.genericjavaclassowlmapper.utils.WISERNamespaces;
import com.example.sub_example.section.genericjavaclassowlmapper.generic.lists.ListOfSpecialClasses;
import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.OWL;
import org.apache.jena.vocabulary.OWL2;
import org.apache.jena.vocabulary.RDF;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.sub_example.section.genericjavaclassowlmapper.utils.DataUtils.*;

public class CaseWriter {

    /**
     * CaseWriter class which transforms a Java Class into RDF and saves it to a Ontology-Model.
     * @param model Ontology-Model
     * @param resourceClass name of Class to create
     * @param property name of the property which is linked to the parent class
     * @param parentResource RDF-Resource of the parent to write the class into
     * @param clazz java-Class of the object to write
     * @param instance java-instance of the object to write
     * @param name if the instance should not be blank one, please provide a value, otherwise it should be null (for a blank node)
     */
    public static void handleClass(Model model, String resourceClass, String property, Resource parentResource, Class<?> clazz, Object instance, String name) {
        Resource objectResource = model.createResource();
        String namespace = "";
        if (name != null) {
            namespace = evaluateNamespace(clazz, true);
            objectResource = model.createResource(namespace + name);
            Resource ontClass = model.createResource(replaceLastSlashWithFragment(namespace) + resourceClass);
            ontClass.addProperty(RDF.type, OWL.Class);
            objectResource.addProperty(RDF.type, ontClass);
        }
        if (parentResource != null && property != null) {
            namespace = evaluateNamespace(clazz, false);
            writeClassWithNewProperty(model, resourceClass, property, parentResource, objectResource, namespace);
        }
        iterateFields(model, clazz, instance, objectResource);
    }

    private static void iterateFields(Model model, Class<?> clazz, Object instance, Resource objectResource) {
        List<Field> classFields = Arrays.stream(clazz.getDeclaredFields()).toList();

        for (Field field : classFields) {
            String comparableClass = extractLastClassName(instance.getClass().getName());
            switch (comparableClass) {
                // here reflection is not working that great somehow
                case "String", "XMLGregorianCalendarImpl":
                    Object value = instance.toString();
                    writeField(objectResource, field,  value,instance, model);
                    break;
                case "HashMap":
                    //WARN: if there is a map included, we have to trick a little bit
                    Map test = (Map) instance;
                    HashMap<String, String> transformedMap = new HashMap<>();
                    for (Object key : test.keySet()) {
                        var val = test.get(key);
                        transformedMap.put(key.toString(), val.toString());
                    }
                    for (Map.Entry<String, String> entrySet : transformedMap.entrySet()) {
                        //write directly to the model without checking
                        objectResource.addLiteral(model.createProperty(entrySet.getKey()),entrySet.getValue());
                        System.out.println("HashMap in data detected: please check " + entrySet.getKey());
                    }
                    break;
                default:
                    field.setAccessible(true);  // Allow access to private fields
                    try {
                        Object valueDefault = field.get(instance);
                        writeField(objectResource, field, valueDefault, instance, model);
                    } catch (IllegalAccessException e) {
                        System.out.println("field not accessible = " + field.getDeclaringClass().getSimpleName() + "." + field.getName());
                    }
            }
        }
    }


    private static void writeClassWithNewProperty(Model model, String resourceClass, String property, Resource parentResource, Resource objectResource, String namespace) {
        Resource ontClass = model.createResource(namespace + resourceClass);
        ontClass.addProperty(RDF.type, OWL.Class);
        objectResource.addProperty(RDF.type, ontClass);
        Property propertyResource = model.createProperty(namespace + property);
        propertyResource.addProperty(RDF.type, OWL.ObjectProperty);
        model.add(parentResource, propertyResource, objectResource);
    }
    
    private static void writeField(Resource objectResource, Field field, Object fieldInstance, Object instance, Model model) {
        String namespace = evaluateNamespace(field, false);
        if (fieldInstance != null) {
            String classTypeAsString = extractLastClassName(fieldInstance.getClass().getName());
            String propertyName = field.getName();
            if(field.toString().contains(".TExchange.") && propertyName.equals("name")){
                String exchangeLink = "exchangeLink";
                String name = fieldInstance.toString();
                String location = "";
                String unit = "";
                try {
                    var locationField = instance.getClass().getDeclaredField("location");
                    locationField.setAccessible(true);
                    if(locationField.get(instance) != null){
                        location = locationField.get(instance).toString();
                    }
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    //we can ignore if there is no location
                }
                try {
                    var unitField = instance.getClass().getDeclaredField("unit");
                    unitField.setAccessible(true);
                    if(unitField.get(instance) != null) {
                        unit = unitField.get(instance).toString();
                    }
                } catch (NoSuchFieldException | IllegalAccessException e) {
                    //we can ignore if there is no unit
                }
                String ref = generateMD5(name+location+unit);
                writeGlobalReferenceType(objectResource, exchangeLink, ref, model, namespace, classTypeAsString);
            }
            if(propertyName.equals("referenceToLCAMethodDetails")){
                //System.out.println("version = " + propertyName);
            }
            // we need to treat lists differently, because we will just enlist the parametrized type on the parent object
            if (field.getType() == List.class) {
                propertyName = field.getName();
                Class<?> paramClass = getGenericType(field.getGenericType());
                String classNameAsString = extractLastClassName(paramClass.getSimpleName());
                var objectList = castToObjectList(fieldInstance);
                if (objectList != null && objectList.size() > 0) {
                    for (Object o : objectList) {
                        checkTypeAndWriteCorrespondingClass(objectResource, propertyName, o, model, namespace, classNameAsString, paramClass, false);
                    }
                }
            } else if (classTypeAsString.equals("GlobalReferenceType")) {
                //use the power of the semantic web, if a valid URI is given
                handleGlobalRefType(objectResource, field.getType(), fieldInstance, model, namespace, classTypeAsString, propertyName);
            } else {
                checkTypeAndWriteCorrespondingClass(objectResource, propertyName, fieldInstance, model, namespace, classTypeAsString, field.getType(), false);
            }
        }
    }

    private static void handleGlobalRefType(Resource objectResource, Class<?> fieldType, Object fieldInstance, Model model, String namespace, String classTypeAsString, String propertyName) {
        String ref = getURI(fieldInstance);
        //TODO: find how the correlate
        if(ref.length() > 0){
            namespace = getNameSpaceFromType(fieldInstance);
            String version = testAndCallMethodOnInstance("getVersion", fieldInstance.getClass(), fieldInstance);
            if(version.length() > 0){
                //ref = generateMD5(ref + version);
            }
            writeGlobalReferenceType(objectResource, propertyName, ref, model, namespace, classTypeAsString);
        }else{
            checkTypeAndWriteCorrespondingClass(objectResource, propertyName, fieldInstance, model, namespace, classTypeAsString, fieldType, true);
        }
    }

    private static String getNameSpaceFromType(Object fieldInstance) {
        NamespaceProvider namespaceProvider = NamespaceProvider.getInstance();
        String namespace = namespaceProvider.getBaseNamespace();
        if(fieldInstance == null){
            return namespace;
        }
        String uri = testAndCallMethodOnInstance("getType", fieldInstance.getClass(), fieldInstance);
        if(uri.length()> 0){
            switch (uri){
                case "CONTACT_DATA_SET": return WISERNamespaces.ILCD_CONTACT_NAMESPACE;
                case "SOURCE_DATA_SET": return WISERNamespaces.ILCD_SOURCE_NAMESPACE;
                case "PROCESS_DATA_SET": return WISERNamespaces.ILCD_PROCESS_NAMESPACE;
                case "FLOW_DATA_SET": return WISERNamespaces.ILCD_FLOW_NAMESPACE;
                case "FLOW_PROPERTY_DATA_SET": return WISERNamespaces.ILCD_FLOW_PROPERTY_NAMESPACE;
                case "UNIT_GROUP_DATA_SET": return WISERNamespaces.ILCD_UNIT_GROUP_NAMESPACE;
                case "LCIA_METHOD_DATA_SET": return WISERNamespaces.ILCD_LCIA_METHODS_NAMESPACE;
                default: return WISERNamespaces.ILCD_COMMON_NAMESPACE;
            }
        }
        return namespace;
    }

    private static void writeGlobalReferenceType(Resource objectResource, String propertyName, String uri, Model model, String namespace, String classTypeAsString) {
       Property property = model.createProperty(WISERNamespaces.ILCD_COMMON_NAMESPACE + propertyName);
       property.addProperty(RDF.type, OWL.ObjectProperty);
       String refLink = namespace + uri;
       if(propertyName.equals("exchangeLink")){
           property = model.createProperty( replaceLastSlashWithFragment(WISERNamespaces.UVEK_BASE) + propertyName);
           refLink = refLink.replace("#", "/");
       }
       Resource globalRef = model.createResource(refLink);
       //globalRef.addProperty(RDF.type, model.createResource(WISERNamespaces.ILCD_COMMON_NAMESPACE + classTypeAsString));
       model.add(objectResource, property, globalRef);
    }

    private static String getURI(Object fieldInstance) {
        if(fieldInstance == null){
            return "";
        }
        String uri = testAndCallMethodOnInstance("getRefObjectId", fieldInstance.getClass(), fieldInstance);
        if(uri.length()> 0){
            return uri;
        }
        return "";
    }

    public static boolean containsSlashOrDot(String input) {
        return input != null && (input.contains("/") || input.contains("."));
    }

    private static void checkTypeAndWriteCorrespondingClass(Resource objectResource, String propertyName, Object fieldInstance, Model model, String namespace, String comparableName, Class<?> fieldType, boolean stop) {
        if (ListOfSpecialClasses.getPrimitiveClassList().contains(comparableName)) {
            writeSimpleLiteral(model, namespace, propertyName, objectResource, model.createTypedLiteral(fieldInstance));
        } else if (ListOfSpecialClasses.getMappingList().containsKey(comparableName)) {
            writeSimpleLiteral(model, namespace, propertyName, objectResource, model.createTypedLiteral(fieldInstance, ListOfSpecialClasses.getMappingList().get(fieldInstance.getClass())));
        } else if (ListOfSpecialClasses.getLanguageClassList().contains(comparableName)) {
            String value = testAndCallMethodOnInstance("getValue", fieldType, fieldInstance);
            String lang = testAndCallMethodOnInstance("getLang", fieldType, fieldInstance);
            if(value.length() > 0 && lang.length() > 0){
                //successful multilang object
                writeSimpleLiteral(model, namespace, propertyName, objectResource, model.createLiteral(value, lang));
            } else if (value.length() > 0) {
                writeSimpleLiteral(model, namespace, propertyName, objectResource, model.createLiteral(value));
            }else{
                System.out.println("your multilang object might not be called correctly: " + propertyName);
            }
        } else if (fieldType == Map.class) {
            Map castedMap = (Map) fieldInstance;
            String prettyPrintedMap = prettyPrintMap(castedMap);
            if(castedMap.size() > 0){
                writeSimpleLiteral(model, namespace, propertyName, objectResource, model.createLiteral(prettyPrintedMap));
            }
        } else if (fieldType.isEnum()) {
            writeEnum(objectResource, propertyName, fieldInstance, model, namespace);
        } else if (fieldType.getSimpleName().equals("GlobalReferenceType") && !stop){
           handleGlobalRefType(objectResource, fieldType, fieldInstance, model, namespace, comparableName, propertyName );
        }
        else {
            handleClass(model, fieldInstance.getClass().getSimpleName(), propertyName, objectResource, fieldInstance.getClass(), fieldInstance, null);
        }
    }

    private static void writeEnum(Resource objectResource,String propertyName, Object fieldInstance, Model model, String namespace) {
        Resource namedIndividual = model.createResource(namespace + fieldInstance);
        namedIndividual.addProperty(RDF.type, OWL2.NamedIndividual);
        String enumClass = fieldInstance.getClass().getSimpleName();
        namedIndividual.addProperty(RDF.type, model.createResource(namespace + enumClass));
        Property property = model.createProperty(namespace + propertyName);
        property.addProperty(RDF.type, OWL.ObjectProperty);
        model.add(objectResource, property, namedIndividual);
    }

    private static void writeSimpleLiteral(Model model, String namespace, String propertyName, Resource
            objectResource, Literal model1) {
        Property property = model.createProperty(namespace + propertyName);
        property.addProperty(RDF.type, OWL.DatatypeProperty);
        model.add(
                objectResource,
                property,
                model1
        );
    }
}
