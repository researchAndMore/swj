package com.example.sub_example.section.genericjavaclassowlmapper.utils;

import com.example.sub_example.section.genericjavaclassowlmapper.generic.OntLoader;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.JAXBIntrospector;
import jakarta.xml.bind.Unmarshaller;
import org.apache.jena.ontology.OntModel;
import org.apache.jena.query.Dataset;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.riot.RDFDataMgr;
import org.apache.jena.riot.RDFFormat;
import org.apache.jena.vocabulary.OWL;
import org.apache.jena.vocabulary.RDF;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.example.sub_example.section.genericjavaclassowlmapper.utils.DataUtils.measureTime;

/**
 * Class with random helper methods around files.
 */
public class FileUtils {

    public static final String PE_ONT_FILENAME = "pe_mapped_ontology.ttl";

    /**
     * writes Ontology-Model to the specified file
     *
     * @param model    Ontology-Model
     * @param fileName filename
     */
    public static void writeBasicOntologyToFile(Model model, String fileName) {
        try (OutputStream out = new FileOutputStream(fileName, true)) { // Append mode
            try (Writer writer = new OutputStreamWriter(out, StandardCharsets.UTF_8)) {
                RDFDataMgr.write(writer, model, RDFFormat.TTL); // Write triples in Turtle format
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * takes a OWL-construct (such as owl:Thing, owl:DatatypeProperty) and a set of Strings (better be URIs)
     * and writes it as that type into the model
     *
     * @param listOfThings   list of URIs
     * @param model          OntModel
     * @param objectProperty OWL-construct
     */
    public static void writeOWLThingToModel(Set<String> listOfThings, Model model, Resource objectProperty) {
        for (String datatypeProperty : listOfThings) {
            Resource property = model.createResource(datatypeProperty);
            property.addProperty(RDF.type, objectProperty);
        }
    }

    /**
     * writes the Ontology-Dataset to the specified File.
     *
     * @param dataset  Ontology-Dataset
     * @param fileName filename for the Trig-File generated. Please use the ending .trig
     */
    public static void writeDataToFile(Dataset dataset, String fileName) {
        Iterator<String> modelNames = dataset.listNames();
        try (OutputStream out = new FileOutputStream(fileName, true)) { // Append mode
            try (Writer writer = new OutputStreamWriter(out, StandardCharsets.UTF_8)) {
                while (modelNames.hasNext()) {
                    String modelName = modelNames.next();
                    Model model = dataset.getNamedModel(modelName);

                    RDFDataMgr.write(writer, model, RDFFormat.TTL);


                    /*
                    writer.write("<" + modelName + "> {\n"); // Start of named graph
                    RDFDataMgr.write(writer, model, RDFFormat.NTRIPLES); // Write triples in Turtle format
                    writer.write("}\n"); // End of named graph
                     */
                }
            }
        } catch (Exception e) {
            System.err.println("Error writing the models: " + e.getMessage());
        }
    }


    public static void writeDataToFileIndividually(Dataset dataset, String folderName) {
        Iterator<String> modelNames = dataset.listNames();
        while (modelNames.hasNext()) {
            String modelName = modelNames.next();
            String[] parts = modelName.split("/");
            String lastPart = parts[parts.length - 1];

            // Remove the "_Graph" suffix
            String modelID = lastPart.replace("_Graph", "");
            modelID = modelID + ".ttl";
            try (OutputStream out = new FileOutputStream(folderName + "/" + modelID)) { // Append mode
                try (Writer writer = new OutputStreamWriter(out, StandardCharsets.UTF_8)) {
                    Model model = dataset.getNamedModel(modelName);
                    RDFDataMgr.write(writer, model, RDFFormat.TTL);
                }
            } catch (Exception e) {
                System.err.println("Error writing the models: " + e.getMessage());
            }
        }

    }

    public static <T> void handleILCDFile(Dataset dataset, String defaultNamespace,
                                          String folderPath,
                                          Function<File, T> loadProcessDataTypeFunction,
                                          BiConsumer<Dataset, T> writeProcessDataSetTypeFunction) {
        NamespaceProvider namespaceProvider = NamespaceProvider.getInstance();
        namespaceProvider.setBaseNamespace(defaultNamespace);
        List<File> fileList = new ArrayList<>();
        File folder = new File(folderPath);
        if (folder.exists() && folder.isDirectory()) {
            recursivelyLoadFiles(folder, fileList);
        }

        for (File file : fileList) {
            // convert file to spring structure
            T tProcessDataSet = loadProcessDataTypeFunction.apply(file);
            writeProcessDataSetTypeFunction.accept(dataset, tProcessDataSet);
        }
    }

    public static Object readContentFromFile(URL resource, Class<?> dataSetTypeClass) throws FileNotFoundException, XMLStreamException, JAXBException {
        assert resource != null;
        InputStream is = new FileInputStream(resource.getFile());
        XMLStreamReader xsr = XMLInputFactory.newFactory().createXMLStreamReader(is, "UTF-8");
        //unmarshal
        JAXBContext jaxbContext = JAXBContext.newInstance(dataSetTypeClass);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        return JAXBIntrospector.getValue(jaxbUnmarshaller.unmarshal(xsr));
    }

    public static void appendToOntology(String name, OntLoader ontLoader) {
        Model model = ModelFactory.createDefaultModel();
        // write all the properties to the new file.
        //writeOWLThingToModel(ontLoader.getDatatypeProperties(), model, OWL.DatatypeProperty);
        //writeOWLThingToModel(ontLoader.getResources(), model, OWL.Class);
        //writeOWLThingToModel(ontLoader.getObjectProperties(), model, OWL.ObjectProperty);
        measureTime(() -> {
            System.out.println("writing " + name + " ontology to file");
            writeBasicOntologyToFile(model, PE_ONT_FILENAME);
        });
    }

    public static void appendToOntology(String name, OntModel ontModel) {
        Model model = ModelFactory.createDefaultModel();
        // write all the properties to the new file.
        writeOWLThingToModel(ontModel.listDatatypeProperties().toSet().stream().map((Resource::getURI)).collect(Collectors.toSet()), model, OWL.DatatypeProperty);
        writeOWLThingToModel(ontModel.listClasses().toSet().stream().map((Resource::getURI)).collect(Collectors.toSet()), model, OWL.Class);
        writeOWLThingToModel(ontModel.listObjectProperties().toSet().stream().map((Resource::getURI)).collect(Collectors.toSet()), model, OWL.ObjectProperty);
        writeBasicOntologyToFile(model, PE_ONT_FILENAME);
    }

    public static void recursivelyLoadFiles(File folder, List<File> fileList) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    recursivelyLoadFiles(file, fileList);
                } else {
                    fileList.add(file);
                }
            }
        }
    }

    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    /**
     * deletes the file already there, because the write operation in this application is append
     *
     * @param fileName name of the files to be deleted
     */

    public static void setupFilesystem(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }

}
