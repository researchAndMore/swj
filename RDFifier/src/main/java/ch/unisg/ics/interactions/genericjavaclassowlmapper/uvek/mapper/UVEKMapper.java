package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.mapper;

import ch.unisg.ics.interactions.genericjavaclassowlmapper.generic.GenericMapper;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.generic.OntLoader;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.NamespaceProvider;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.WISERNamespaces;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.Dataset.TDataset;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.Dataset.TEcoSpold;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.JAXBIntrospector;
import jakarta.xml.bind.Unmarshaller;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.DatasetFactory;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.vocabulary.OWL;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;

import static ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.DataUtils.generateMD5;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.DataUtils.measureTime;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.FileUtils.*;

/**
 * transforms the UVEK-database into RDF-format and its corresponding ontology.
 */
public class UVEKMapper {

    public static final String UVEK_DATA_FILENAME = "uvek_mapped_data_solid.ttl";
    public static final String UVEK_ONT_FILENAME = "uvek_mapped_ontology.ttl";
    public static final String UVEK_DATABASE_NAME = "uvek/UVEK_Database.XML";

    /**
     * Classloader is needed to load the file, the reload flag tells the method whether to do a data reload.
     * @param reloadData true if the data-file should be recreated
     * @param classLoader idk why Spring boot needs this
     */
    public static void uvek(boolean reloadData, ClassLoader classLoader) {
        if (reloadData) {
            NamespaceProvider namespaceProvider = NamespaceProvider.getInstance();
            namespaceProvider.setBaseNamespace(WISERNamespaces.UVEK_BASE);
            setupFilesystem(UVEK_DATA_FILENAME);
            Dataset dataset = DatasetFactory.create();
            measureTime(() -> {
                System.out.println("transforming UVEK");
                transformUVEK(classLoader,dataset, UVEK_DATABASE_NAME);
            });
            measureTime(() -> {
                System.out.println("writing UVEK to file");
                //writeDataToFile(dataset, UVEK_DATA_FILENAME);
                writeDataToFileIndividually(dataset, "UVEK");
            });

        }else{
            OntLoader ontLoader = new OntLoader(UVEK_ONT_FILENAME);
            measureTime(() -> {
                System.out.println("loading Data to new Ontology");
                ontLoader.loadProperties(UVEK_DATA_FILENAME);
            });
            Model model = ModelFactory.createDefaultModel();
            // write all the properties to the new file.
            writeOWLThingToModel(ontLoader.getDatatypeProperties(), model, OWL.DatatypeProperty);
            writeOWLThingToModel(ontLoader.getResources(), model, OWL.Class);
            writeOWLThingToModel(ontLoader.getObjectProperties(), model, OWL.ObjectProperty);
            measureTime(() -> {
                System.out.println("writing ontology to file");
                writeBasicOntologyToFile(model, UVEK_ONT_FILENAME);
            });
        }
    }
    /**
    * @param classLoader Spring Boot specific to load the file
     * @param dataset (empty) Ontology-Dataset
     * @param databaseName file of the base-database
     */
    private static void transformUVEK(ClassLoader classLoader, Dataset dataset, String databaseName) {
        TEcoSpold ecospold01DataSet = loadUVEK(classLoader, databaseName);
        for (TDataset tDataset : ecospold01DataSet.getDataset()) {
            GenericMapper genericMapper = new GenericMapper(TDataset.class, tDataset, dataset);
            String name = tDataset.getMetaInformation().getProcessInformation().getReferenceFunction().getName();
            //String version = tDataset.getMetaInformation().getProcessInformation().getDataSetInformation().getVersion();
            String geography = tDataset.getMetaInformation().getProcessInformation().getGeography().getLocation();
            String unit = tDataset.getMetaInformation().getProcessInformation().getReferenceFunction().getUnit();
            var md5 = generateMD5(name + geography + unit );

            genericMapper.writeClassToModel(md5, UVEK_DATA_FILENAME);
        }
    }



    private static TEcoSpold loadUVEK(ClassLoader classLoader, String databaseName) {
        URL resource = classLoader.getResource(databaseName);
        TEcoSpold ecospold01DataSet = new TEcoSpold();
        try {
            assert resource != null;
            InputStream is = new FileInputStream(resource.getFile());
            XMLStreamReader xsr = XMLInputFactory.newFactory().createXMLStreamReader(is, "UTF-8");
            //unmarshal
            JAXBContext jaxbContext = JAXBContext.newInstance(TDataset.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            var test = JAXBIntrospector.getValue(jaxbUnmarshaller.unmarshal(xsr));
            ecospold01DataSet = (TEcoSpold) test;

        } catch (JAXBException e) {
            Throwable linkedExc = e.getLinkedException();
            System.out.println("linkedExc.getMessage() = " + linkedExc.getMessage());
        } catch (XMLStreamException | FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
        return ecospold01DataSet;
    }
}
