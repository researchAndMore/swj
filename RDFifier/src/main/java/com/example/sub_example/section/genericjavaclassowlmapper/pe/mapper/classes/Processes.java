package com.example.sub_example.section.genericjavaclassowlmapper.pe.mapper.classes;

import com.example.sub_example.section.genericjavaclassowlmapper.generic.GenericMapper;
import com.example.sub_example.section.genericjavaclassowlmapper.generic.OntLoader;
import com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.ProcessDataSet.ProcessDataSetType;
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
import static com.example.sub_example.section.genericjavaclassowlmapper.utils.FileUtils.readContentFromFile;
import static com.example.sub_example.section.genericjavaclassowlmapper.utils.WISERNamespaces.ILCD_PROCESS_NAMESPACE;

public class Processes {
    public static final String PE_PROCESS_DATA_FILENAME = "pe_process_mapped_data_solid.ttl";
    public static final String PE_PROCESSES_FOLDER = "src/main/resources/plasticseurope/processes";


    public static void processes(boolean reloadData, ClassLoader classLoader) {
        String name = getMethodName();
        String dataFileName = PE_PROCESS_DATA_FILENAME;
        if (reloadData) {
            Dataset dataset = DatasetFactory.create();
            measureTime(() -> {
                System.out.println("Writing " + name + " XML to Graphs");
                handleILCDFile(
                        dataset,
                        ILCD_PROCESS_NAMESPACE,
                        PE_PROCESSES_FOLDER,
                        file -> loadProcessDataType(classLoader, file),
                        Processes::writeProcessDataSetTypeToModel);
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

    private static void writeProcessDataSetTypeToModel(Dataset dataset, ProcessDataSetType tProcessDataSet) {
        GenericMapper genericMapper = new GenericMapper(ProcessDataSetType.class, tProcessDataSet, dataset);
        String name = tProcessDataSet.getProcessInformation().getDataSetInformation().getUUID();
        String version = tProcessDataSet.getVersion();
        var md5 = generateMD5(name);
        genericMapper.writeClassToModel(name, PE_PROCESS_DATA_FILENAME);
    }

    private static ProcessDataSetType loadProcessDataType(ClassLoader classLoader, File file) {
        String fileName = file.toString().replace("src\\main\\resources\\", "").replace("\\", "/");
        //setup main class
        ProcessDataSetType tProcessDataSet = new ProcessDataSetType();
        //get file
        URL resource = classLoader.getResource(fileName);
        //read file with jakara XML API
        try {
            assert resource != null;
            Object fileContent = readContentFromFile(resource, ProcessDataSetType.class);
            tProcessDataSet = (ProcessDataSetType) fileContent;
        } catch (JAXBException e) {
            Throwable linkedExc = e.getLinkedException();
            System.out.println("linkedExc.getMessage() = " + linkedExc.getMessage());
        } catch (XMLStreamException | FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
        return tProcessDataSet;
    }

}
