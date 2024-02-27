package com.example.sub_example.section.genericjavaclassowlmapper.pe.mapper.classes;

import com.example.sub_example.section.genericjavaclassowlmapper.generic.GenericMapper;
import com.example.sub_example.section.genericjavaclassowlmapper.generic.OntLoader;
import com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.SourceDataSet.SourceDataSetType;
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
import static com.example.sub_example.section.genericjavaclassowlmapper.utils.WISERNamespaces.ILCD_SOURCE_NAMESPACE;

public class Source {
    public static final String PE_SOURCE_DATA_FILENAME = "pe_source_mapped_data_solid.ttl";
    public static final String PE_SOURCE_FOLDER = "src/main/resources/plasticseurope/sources";

    public static void sources(boolean reloadData, ClassLoader classLoader) {
        String name = getMethodName();
        String dataFileName = PE_SOURCE_DATA_FILENAME;
        if (reloadData) {
            Dataset dataset = DatasetFactory.create();
            measureTime(() -> {
                System.out.println("Writing " + name + " XML to Graphs");
                handleILCDFile(
                        dataset,
                        ILCD_SOURCE_NAMESPACE,
                        PE_SOURCE_FOLDER,
                        file -> loadSourceData(classLoader, file),
                        Source::writeSourceToClass);
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

    private static void writeSourceToClass(Dataset dataset, SourceDataSetType tSourceDataType) {
        GenericMapper genericMapper = new GenericMapper(SourceDataSetType.class, tSourceDataType, dataset);
        String name = tSourceDataType.getSourceInformation().getDataSetInformation().getUUID();
        String version = tSourceDataType.getVersion();
        var md5 = generateMD5(name );
        genericMapper.writeClassToModel(name, PE_SOURCE_DATA_FILENAME);
    }

    private static SourceDataSetType loadSourceData(ClassLoader classLoader, File file) {
        String fileName = file.toString().replace("src\\main\\resources\\", "").replace("\\", "/");
        //setup main class
        SourceDataSetType sourceDataSetType = new SourceDataSetType();
        //get file
        URL resource = classLoader.getResource(fileName);
        //read file with jakara XML API
        try {
            assert resource != null;
            Object fileContent = readContentFromFile(resource, SourceDataSetType.class);
            sourceDataSetType = (SourceDataSetType) fileContent;
        } catch (JAXBException e) {
            Throwable linkedExc = e.getLinkedException();
            System.out.println("linkedExc.getMessage() = " + linkedExc.getMessage());
        } catch (XMLStreamException | FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
        return sourceDataSetType;
    }

}