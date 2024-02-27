package com.example.sub_example.section.genericjavaclassowlmapper.pe.mapper.classes;

import com.example.sub_example.section.genericjavaclassowlmapper.generic.GenericMapper;
import com.example.sub_example.section.genericjavaclassowlmapper.generic.OntLoader;
import com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.flowDataSet.FlowDataSetType;
import jakarta.xml.bind.JAXBException;
import org.apache.jena.query.Dataset;
import org.apache.jena.query.DatasetFactory;

import javax.xml.stream.XMLStreamException;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;

import static com.example.sub_example.section.genericjavaclassowlmapper.utils.DataUtils.generateMD5;
import static com.example.sub_example.section.genericjavaclassowlmapper.utils.DataUtils.measureTime;
import static com.example.sub_example.section.genericjavaclassowlmapper.utils.FileUtils.*;
import static com.example.sub_example.section.genericjavaclassowlmapper.utils.WISERNamespaces.ILCD_FLOW_NAMESPACE;

public class Flows {
    public static final String PE_FLOW_DATA_FILENAME = "pe_flows_mapped_data_solid.ttl";
    public static final String PE_FLOW_FOLDER = "src/main/resources/plasticseurope/flows";

    public static void flows(boolean reloadData, ClassLoader classLoader) {
        String name = getMethodName();
        String dataFileName = PE_FLOW_DATA_FILENAME;
        if (reloadData) {
            Dataset dataset = DatasetFactory.create();
            measureTime(() -> {
                System.out.println("Writing " + name + " XML to Graphs");
                handleILCDFile(
                        dataset,
                        ILCD_FLOW_NAMESPACE,
                        PE_FLOW_FOLDER,
                        file -> loadFlowDataType(classLoader, file),
                        Flows::writeFlowDataSetTypeToModel);
            });
            measureTime(() -> {
                System.out.println("Writing " + name + " Graphs to File");
                writeDataToFile(dataset, dataFileName);
            });
        }else{
            OntLoader ontLoader = new OntLoader();
            measureTime(() -> {
                System.out.println("loading " + name + " Data from File to new Ontology");
                ontLoader.loadProperties(dataFileName);
            });
        }
    }

    private static void writeFlowDataSetTypeToModel(Dataset dataset, FlowDataSetType flowDataSetType) {
        GenericMapper genericMapper = new GenericMapper(FlowDataSetType.class, flowDataSetType, dataset);
        String name = flowDataSetType.getFlowInformation().getDataSetInformation().getUUID();
        String version = flowDataSetType.getVersion();
        var md5 = generateMD5(name);
        genericMapper.writeClassToModel(name, PE_FLOW_DATA_FILENAME);
    }

    private static FlowDataSetType loadFlowDataType(ClassLoader classLoader, File file) {
        String fileName = file.toString().replace("src\\main\\resources\\", "").replace("\\", "/");
        //setup main class
        FlowDataSetType tFlowDataSet = new FlowDataSetType();
        //get file
        URL resource = classLoader.getResource(fileName);
        //read file with jakara XML API
        try {
            assert resource != null;
            Object fileContent = readContentFromFile(resource, FlowDataSetType.class);
            tFlowDataSet = (FlowDataSetType) fileContent;
        } catch (JAXBException e) {
            Throwable linkedExc = e.getLinkedException();
            System.out.println("linkedExc.getMessage() = " + linkedExc.getMessage());
        } catch (XMLStreamException | FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
        return tFlowDataSet;
    }
}
