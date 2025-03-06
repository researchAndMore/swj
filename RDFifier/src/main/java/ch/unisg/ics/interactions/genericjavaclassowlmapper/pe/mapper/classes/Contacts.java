package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.mapper.classes;

import ch.unisg.ics.interactions.genericjavaclassowlmapper.generic.GenericMapper;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.generic.OntLoader;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.contactDataSet.ContactDataSetType;
import jakarta.xml.bind.JAXBException;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.DatasetFactory;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;

import static ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.DataUtils.generateMD5;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.DataUtils.measureTime;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.FileUtils.*;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.WISERNamespaces.ILCD_CONTACT_NAMESPACE;

public class Contacts {
    public static final String PE_CONTACT_DATA_FILENAME = "pe_contact_mapped_data_solid.ttl";
    public static final String PE_CONTACTS_FOLDER = "src/main/resources/plasticseurope/contacts";

    public static void contacts(boolean reloadData, ClassLoader classLoader) {
        String name = getMethodName();
        String dataFileName = PE_CONTACT_DATA_FILENAME;
        if (reloadData) {
            Dataset dataset = DatasetFactory.create();
            measureTime(() -> {
                System.out.println("Writing " + name + " XML to Graphs");
                handleILCDFile(
                        dataset,
                        ILCD_CONTACT_NAMESPACE,
                        PE_CONTACTS_FOLDER,
                        file -> loadContactDataType(classLoader, file),
                        Contacts::writeContactDataSetTypeToModel);
            });
            measureTime(() -> {
                System.out.println("writing " + name + " Data to File");
                writeDataToFile(dataset, dataFileName);
            });
        }else{
            OntLoader ontLoader = new OntLoader(PE_ONT_FILENAME);
            measureTime(() -> {
                System.out.println("loading " + name + " Data from File to new Ontology");
                ontLoader.loadProperties(dataFileName);
            });
        }

    }

    private static void writeContactDataSetTypeToModel(Dataset dataset, ContactDataSetType contactDataSetType) {
        GenericMapper genericMapper = new GenericMapper(ContactDataSetType.class, contactDataSetType, dataset);
        String name = contactDataSetType.getContactInformation().getDataSetInformation().getUUID();
        String version = contactDataSetType.getVersion();
        var md5 = generateMD5(name);
        genericMapper.writeClassToModel(name, PE_CONTACT_DATA_FILENAME);
    }

    private static ContactDataSetType loadContactDataType(ClassLoader classLoader, File file) {
        String fileName = file.toString().replace("src\\main\\resources\\", "").replace("\\", "/");
        //setup main class
        ContactDataSetType tContactDataSet = new ContactDataSetType();
        //get file
        URL resource = classLoader.getResource(fileName);
        //read file with jakara XML API
        try {
            assert resource != null;
            Object fileContent = readContentFromFile(resource, ContactDataSetType.class);
            tContactDataSet = (ContactDataSetType) fileContent;
        } catch (JAXBException e) {
            Throwable linkedExc = e.getLinkedException();
            System.out.println("linkedExc.getMessage() = " + linkedExc.getMessage());
        } catch (XMLStreamException | FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
        return tContactDataSet;
    }
}
