package com.example.sub_example.section.genericjavaclassowlmapper.generic;

import com.example.sub_example.section.genericjavaclassowlmapper.utils.WISERNamespaces;
import com.example.sub_example.section.genericjavaclassowlmapper.utils.FileUtils;
import lombok.Getter;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.ontology.OntModelSpec;
import org.apache.jena.query.Dataset;
import org.apache.jena.rdf.model.*;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.vocabulary.RDF;
import org.apache.jena.vocabulary.RDFS;

import java.util.HashSet;
import java.util.Set;

public class OntLoader {
    @Getter
    private Set<String> resources;
    @Getter
    private Set<String> datatypeProperties;
    @Getter
    private Set<String> objectProperties;

    /**
     * Class that holds owl:Class, owl:DatatypeProperty and owl:ObjectProperty.
     */
    public OntLoader() {
        datatypeProperties = new HashSet<>();
        resources = new HashSet<>();
        objectProperties = new HashSet<>();
    }

    private static boolean isSubjectOfClass(Resource subject, Model graph, String relevantClass) {
        StmtIterator typeStatements = graph.listStatements(subject, RDF.type, (Resource) null);
        while (typeStatements.hasNext()) {
            Statement typeStatement = typeStatements.nextStatement();
            Resource objectType = typeStatement.getObject().asResource();
            if (objectType.getURI().equals(relevantClass)) {
                return true;
            }
        }
        return false;
    }

    /**
     * writes all the classes, dataproperties and objectproperties to the class properties.
     *
     * @param file filename from which the properties should be filled.
     */
    public void loadProperties(String file) {
        Dataset dataset = RDFDataMgr.loadDataset(file, Lang.TRIG);
        dataset.listNames().forEachRemaining(mN -> {
            Model model = dataset.getNamedModel(mN);
            OntModel ontModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, model);
            Model parentModel = ModelFactory.createDefaultModel();
            extractProperty(ontModel,parentModel );
            FileUtils.appendToOntology(FileUtils.getMethodName(), ontModel);
            FileUtils.writeBasicOntologyToFile(parentModel, FileUtils.PE_ONT_FILENAME);
        });
    }

    public void loadProperties(Model model) {
        OntModel ontModel = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, model);
        Model parentModel = ModelFactory.createDefaultModel();
        extractProperty(ontModel, parentModel);
        FileUtils.appendToOntology(FileUtils.getMethodName(), ontModel);
        FileUtils.writeBasicOntologyToFile(parentModel, FileUtils.PE_ONT_FILENAME);
    }

    private void extractProperty(OntModel ontModel, Model parentModel) {
        StmtIterator stmtIterator = ontModel.listStatements();
        while (stmtIterator.hasNext()) {
            Statement statement = stmtIterator.nextStatement();
            Resource subject = statement.getSubject();
            String owlClass = "http://www.w3.org/2002/07/owl#Class";
            String owlData = "http://www.w3.org/2002/07/owl#DatatypeProperty";
            String owlObject = "http://www.w3.org/2002/07/owl#ObjectProperty";

            if (subject.getURI() != null && !subject.getURI().toLowerCase().contains("w3.org")) {
                if (isSubjectOfClass(subject, ontModel, owlClass)) {
                    Resource parent = ontModel.createResource(WISERNamespaces.ILCD_MAIN_NAMESPACE + subject.getLocalName());
                    if (!parent.getNameSpace().equals(subject.getNameSpace()) && subject.getNameSpace().toLowerCase().contains("ilcd")) {
                        // to better handle ILCD
                        parentModel.add(subject, RDFS.subClassOf, parent);
                        getResources().add(parent.getURI());
                    }
                    getResources().add(subject.getURI());
                }
                if (isSubjectOfClass(subject, ontModel, owlData)) {
                    Resource parent = ontModel.createDatatypeProperty(WISERNamespaces.ILCD_MAIN_NAMESPACE + subject.getLocalName());
                    if (!parent.getNameSpace().equals(subject.getNameSpace()) && subject.getNameSpace().toLowerCase().contains("ilcd")) {
                        parentModel.add(subject, RDFS.subPropertyOf, parent);
                        getResources().add(parent.getURI());
                    }
                    getResources().add(subject.getURI());
                }
                if (isSubjectOfClass(subject, ontModel, owlObject)) {
                    Resource parent = ontModel.createObjectProperty(WISERNamespaces.ILCD_MAIN_NAMESPACE + subject.getLocalName());
                    if (!parent.getNameSpace().equals(subject.getNameSpace()) && subject.getNameSpace().toLowerCase().contains("ilcd")) {
                        parentModel.add(subject, RDFS.subPropertyOf, parent);
                        getResources().add(parent.getURI());
                    }
                    getObjectProperties().add(subject.getURI());
                }
            }
        }
    }
}
