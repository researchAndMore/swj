package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.mapper.classes;

import ch.unisg.ics.interactions.genericjavaclassowlmapper.generic.GenericMapper;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.generic.OntLoader;
import ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.flowPropertyDataSet.FlowPropertyDataSetType;
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
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.WISERNamespaces.ILCD_FLOW_PROPERTY_NAMESPACE;

public class FlowProperties {
    public static final String PE_FLOW_PROPERTIES_DATA_FILENAME = "pe_flow_properties_mapped_data_solid.ttl";
    public static final String PE_FLOW_PROPERTIES_FOLDER = "src/main/resources/plasticseurope/flowproperties";


    public static void flowProperties(boolean reloadData, ClassLoader classLoader) {
        String name = getMethodName();
        String dataFileName = PE_FLOW_PROPERTIES_DATA_FILENAME;
        if (reloadData) {
            Dataset dataset = DatasetFactory.create();
            measureTime(() -> {
                System.out.println("Writing " + name + " XML to Graphs");
                handleILCDFile(
                        dataset,
                        ILCD_FLOW_PROPERTY_NAMESPACE,
                        PE_FLOW_PROPERTIES_FOLDER,
                        file -> loadFlowPropertyDataType(classLoader, file),
                        FlowProperties::writeFlowPropertyToClasses);
            });
            measureTime(() -> {
                System.out.println("Writing " + name + " Graphs to File");
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

    private static void writeFlowPropertyToClasses(Dataset dataset, FlowPropertyDataSetType tFlowPropertyDataSet) {
        GenericMapper genericMapper = new GenericMapper(FlowPropertyDataSetType.class, tFlowPropertyDataSet, dataset);
        String name = tFlowPropertyDataSet.getFlowPropertiesInformation().getDataSetInformation().getUUID();
        String version = tFlowPropertyDataSet.getVersion();
        var md5 = generateMD5(name );
        genericMapper.writeClassToModel(name, PE_FLOW_PROPERTIES_DATA_FILENAME);
    }

    private static FlowPropertyDataSetType loadFlowPropertyDataType(ClassLoader classLoader, File file) {
        String fileName = file.toString().replace("src\\main\\resources\\", "").replace("\\", "/");
        //setup main class
        FlowPropertyDataSetType tFlowPropertyDataSet = new FlowPropertyDataSetType();
        //get file
        URL resource = classLoader.getResource(fileName);
        //read file with jakara XML API
        try {
            assert resource != null;
            Object fileContent = readContentFromFile(resource, FlowPropertyDataSetType.class);
            tFlowPropertyDataSet = (FlowPropertyDataSetType) fileContent;
        } catch (JAXBException e) {
            Throwable linkedExc = e.getLinkedException();
            System.out.println("linkedExc.getMessage() = " + linkedExc.getMessage());
        } catch (XMLStreamException | FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
        return tFlowPropertyDataSet;
    }

}
