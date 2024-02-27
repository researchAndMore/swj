package com.example.sub_example.section.genericjavaclassowlmapper.generic.lists;

import org.apache.jena.datatypes.RDFDatatype;
import org.apache.jena.datatypes.xsd.XSDDatatype;
import org.apache.jena.datatypes.xsd.impl.XSDBaseStringType;
import org.apache.jena.datatypes.xsd.impl.XSDDateType;
import org.apache.jena.datatypes.xsd.impl.XSDDouble;

import java.util.HashMap;
import java.util.List;

public class ListOfSpecialClasses {

    /**
     * contains all classes which can be 1 to 1 written to RDF by the framework
     * @return list of the name of those classes
     */
    public static List<String> getPrimitiveClassList() {
        return List.of(
                "String",
                "int",
                "boolean",
                "Boolean",
                "Long",
                "double",
                "Double",
                "float",
                "int",
                "char",
                "byte",
                "byte[]",
                "Integer",
                "long",
                "long[]"
        );
    }

    /**
     * map of all the classes which should be directly written to a datatype, but need to be explicitely told which type.
     * @return use this map to extract the right datatype property for your class
     */
    public static HashMap<String, RDFDatatype> getMappingList() {
        HashMap<String, RDFDatatype> dataTypeMap = new HashMap<>();
        // Add the key-value pairs
        dataTypeMap.put("BigDecimal", XSDDouble.XSDdouble);
        dataTypeMap.put("String", XSDBaseStringType.XSDstring);
        dataTypeMap.put("byte", XSDBaseStringType.XSDstring);
        dataTypeMap.put("int", XSDDouble.XSDanyURI);
        dataTypeMap.put("boolean", XSDDatatype.XSDboolean);
        dataTypeMap.put("Boolean", XSDDatatype.XSDboolean);
        dataTypeMap.put("Long", XSDDouble.XSDlong);
        dataTypeMap.put("double", XSDDouble.XSDdouble);
        dataTypeMap.put("Double", XSDDouble.XSDdouble);
        dataTypeMap.put("float", XSDDouble.XSDfloat);
        dataTypeMap.put("BigInteger", XSDDouble.XSDinteger);
        dataTypeMap.put("int[]", XSDDouble.XSDinteger);
        dataTypeMap.put("Class", XSDDouble.XSDanyURI);
        dataTypeMap.put("Constructor", XSDDouble.XSDanyURI);
        dataTypeMap.put("Module", XSDDouble.XSDanyURI);
        dataTypeMap.put("char", XSDBaseStringType.XSDstring);
        dataTypeMap.put("byte[]", XSDDatatype.XSDbase64Binary);
        dataTypeMap.put("Integer", XSDDouble.XSDinteger);
        dataTypeMap.put("long", XSDDouble.XSDlong);
        dataTypeMap.put("long[]", XSDDouble.XSDlong);
        dataTypeMap.put("Object", XSDDouble.XSDanyURI);
        dataTypeMap.put("XMLGregorianCalendarImpl", XSDDateType.XSDdateTime);

        return dataTypeMap;
    }

    /**
     * there are classes which try to mimick the rdf:label style with language.
     * for this case, just write them to a typed Literal directly. List of those classes
     * @return see above.
     */
    public static List<String> getLanguageClassList() {
        return List.of(
                "FTString",
                "STMultiLang",
                "StringMultiLang",
                "FTMultiLang"
        );
    }


}
