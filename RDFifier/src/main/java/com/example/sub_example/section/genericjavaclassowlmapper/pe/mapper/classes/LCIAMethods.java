package com.example.sub_example.section.genericjavaclassowlmapper.pe.mapper.classes;

import com.example.sub_example.section.genericjavaclassowlmapper.generic.GenericMapper;
import com.example.sub_example.section.genericjavaclassowlmapper.generic.OntLoader;
import com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet.LCIAMethodDataSetType;
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
import static com.example.sub_example.section.genericjavaclassowlmapper.utils.WISERNamespaces.ILCD_LCIA_METHODS_NAMESPACE;

public class LCIAMethods {
    public static final String PE_LCIA_METHODS_DATA_FILE = "pe_lcia_methods_mapped_data_solid.ttl";
    public static final String PE_LCIA_METHODS_FOLDER = "src/main/resources/plasticseurope/lciamethods";

    public static void lciaMethods(boolean reloadData, ClassLoader classLoader) {
        String name = getMethodName();
        String dataFileName = PE_LCIA_METHODS_DATA_FILE;
        if (reloadData) {
            Dataset dataset = DatasetFactory.create();
            measureTime(() -> {
                System.out.println("Writing " + name + " XML to Graphs");
                handleILCDFile(
                        dataset,
                        ILCD_LCIA_METHODS_NAMESPACE,
                        PE_LCIA_METHODS_FOLDER,
                        file -> loadLCIAMethods(classLoader, file),
                        LCIAMethods::writeLCIAMethods);
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

    private static void writeLCIAMethods(Dataset dataset, LCIAMethodDataSetType lciaMethodDataSetType) {
        GenericMapper genericMapper = new GenericMapper(LCIAMethodDataSetType.class, lciaMethodDataSetType, dataset);
        String name = lciaMethodDataSetType.getLCIAMethodInformation().getDataSetInformation().getUUID();
        String version = lciaMethodDataSetType.getVersion();
        var md5 = generateMD5(name );
        genericMapper.writeClassToModel(name, PE_LCIA_METHODS_DATA_FILE);
    }

    private static LCIAMethodDataSetType loadLCIAMethods(ClassLoader classLoader, File file) {
        String fileName = file.toString().replace("src\\main\\resources\\", "").replace("\\", "/");
        //setup main class
        LCIAMethodDataSetType lciaMethodData = new LCIAMethodDataSetType();
        //get file
        URL resource = classLoader.getResource(fileName);
        //read file with jakara XML API
        try {
            assert resource != null;
            Object fileContent = readContentFromFile(resource, LCIAMethodDataSetType.class);
            lciaMethodData = (LCIAMethodDataSetType) fileContent;
        } catch (JAXBException e) {
            Throwable linkedExc = e.getLinkedException();
            System.out.println("linkedExc.getMessage() = " + linkedExc.getMessage());
        } catch (XMLStreamException | FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
        return lciaMethodData;
    }

}
