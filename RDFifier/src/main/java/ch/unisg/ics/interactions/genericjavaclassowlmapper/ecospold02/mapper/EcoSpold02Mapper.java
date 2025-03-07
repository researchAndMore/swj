package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.mapper;

import ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets.TActivity;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets.TActivityDataset;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets.TActivityDescription;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets.TEcoSpold;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.generic.GenericMapper;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.generic.OntLoader;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.NamespaceProvider;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.WISERNamespaces;

import jakarta.xml.bind.*;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.DatasetFactory;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.vocabulary.OWL;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.DataUtils.measureTime;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.FileUtils.*;

/**
 * transforms the UVEK-database into RDF-format and its corresponding ontology.
 */
public class EcoSpold02Mapper {

    public static final String EC2_FILE_NAME = "ec2_mapped_data_solid.ttl";
    public static final String EC2_ONT_FILE_NAME = "ec2_mapped_ontology.ttl";
    public static final String EC2_FOLDER = "ec2/";

    /**
     * Classloader is needed to load the file, the reload flag tells the method whether to do a data reload.
     * @param reloadData true if the data-file should be recreated
     * @param classLoader idk why Spring boot needs this
     */
    public static void ec2mapper(boolean reloadData, ClassLoader classLoader) {
        if (reloadData) {
            NamespaceProvider namespaceProvider = NamespaceProvider.getInstance();
            namespaceProvider.setBaseNamespace(WISERNamespaces.EC2_BASE);
            setupFilesystem(EC2_FILE_NAME);
            Dataset dataset = DatasetFactory.create();
            measureTime(() -> {
                System.out.println("transforming EC2");
                transformEcoSpold02Folder(classLoader, dataset);
            });
            measureTime(() -> {
                System.out.println("writing EC2 to file");
                writeDataToFile(dataset, EC2_FILE_NAME, true);
                writeDataToFileIndividually(dataset, "EC2");
            });
        } else {
            // Rest of the code remains unchanged
            OntLoader ontLoader = new OntLoader(EC2_ONT_FILE_NAME);
            measureTime(() -> {
                System.out.println("loading Data to new Ontology");
                ontLoader.loadProperties(EC2_FILE_NAME);
            });
            Model model = ModelFactory.createDefaultModel();
            writeOWLThingToModel(ontLoader.getDatatypeProperties(), model, OWL.DatatypeProperty);
            writeOWLThingToModel(ontLoader.getResources(), model, OWL.Class);
            writeOWLThingToModel(ontLoader.getObjectProperties(), model, OWL.ObjectProperty);
            measureTime(() -> {
                System.out.println("writing ontology to file");
                writeBasicOntologyToFile(model, EC2_ONT_FILE_NAME);
            });
        }
    }

    /**
     * Process all XML files in the EC2_FOLDER
     * @param classLoader Spring Boot specific to load the files
     * @param dataset (empty) Ontology-Dataset
     */
    private static void transformEcoSpold02Folder(ClassLoader classLoader, Dataset dataset) {
        List<String> xmlFiles = getXMLFilesInFolder(classLoader, EC2_FOLDER);

        for (String xmlFile : xmlFiles) {
            System.out.println("Processing file: " + xmlFile);
            TEcoSpold ecospold01DataSet = loadEC2(classLoader, xmlFile);
            processEcoSpoldDataset(ecospold01DataSet, dataset);
        }
    }

    /**
     * Get all XML files in the specified folder
     * @param classLoader ClassLoader to access resources
     * @param folderPath Path to the folder containing XML files
     * @return List of XML file paths
     */
    private static List<String> getXMLFilesInFolder(ClassLoader classLoader, String folderPath) {
        List<String> xmlFiles = new ArrayList<>();
        try {
            URL folderURL = classLoader.getResource(folderPath);
            if (folderURL == null) {
                throw new FileNotFoundException("Folder not found: " + folderPath);
            }

            File folder = new File(folderURL.getFile());
            if (folder.exists() && folder.isDirectory()) {
                File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".xml"));
                if (files != null) {
                    for (File file : files) {
                        xmlFiles.add(folderPath + file.getName());
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error accessing folder: " + e.getMessage());
            throw new RuntimeException("Failed to access folder", e);
        }
        return xmlFiles;
    }

    private static void processEcoSpoldDataset(TEcoSpold ecospold01DataSet, Dataset dataset) {
        if (ecospold01DataSet == null || ecospold01DataSet.getChildActivityDataset() == null) {
            return;
        }

        for (JAXBElement<TActivityDataset> element : ecospold01DataSet.getChildActivityDataset()) {
            if ("childActivityDataset".equals(element.getName().getLocalPart())) {
                try {
                    TActivityDataset activity = element.getValue();
                    if (activity == null) {
                        continue;
                    }

                    TActivityDescription description = activity.getActivityDescription();
                    if (description == null) {
                        continue;
                    }

                    TActivity activityDetails = description.getActivity();
                    if (activityDetails == null) {
                        continue;
                    }

                    String id = activityDetails.getId();
                    GenericMapper genericMapper = new GenericMapper(TActivityDataset.class, activity, dataset);
                    genericMapper.writeClassToModel(id, EC2_FILE_NAME);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to process child activity dataset: " + e.getMessage(), e);
                }
            }
        }
    }

    private static TEcoSpold loadEC2(ClassLoader classLoader, String xmlFilePath) {
        try {
            InputStream is = classLoader.getResourceAsStream(xmlFilePath);
            if (is == null) {
                throw new FileNotFoundException("Resource not found: " + xmlFilePath);
            }

            JAXBContext context = JAXBContext.newInstance(TEcoSpold.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            XMLInputFactory xif = XMLInputFactory.newFactory();
            xif.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, true);
            xif.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, false);
            xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);

            XMLStreamReader xsr = xif.createXMLStreamReader(is);

            JAXBElement<TEcoSpold> root = unmarshaller.unmarshal(xsr, TEcoSpold.class);
            TEcoSpold result = root.getValue();

            if (result != null && result.getChildActivityDataset() != null) {
                System.out.println("File: " + xmlFilePath);
                System.out.println("Number of activities: " + result.getChildActivityDataset().size());
            }

            return result;

        } catch (JAXBException e) {
            System.err.println("JAXB Error in file " + xmlFilePath + ": " + e.getMessage());
            if (e.getLinkedException() != null) {
                System.err.println("Linked Exception: " + e.getLinkedException().getMessage());
            }
            throw new RuntimeException("JAXB unmarshalling failed for " + xmlFilePath, e);
        } catch (XMLStreamException | FileNotFoundException e) {
            System.err.println("Error processing " + xmlFilePath + ": " + e.getMessage());
            throw new RuntimeException("Failed to read XML file: " + xmlFilePath, e);
        }
    }
}