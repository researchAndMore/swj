package com.example.sub_example.section.genericjavaclassowlmapper.pe.mapper.classes;

import com.example.sub_example.section.genericjavaclassowlmapper.generic.GenericMapper;
import com.example.sub_example.section.genericjavaclassowlmapper.generic.OntLoader;
import com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.UnitGroupDataSet.UnitGroupDataSetType;
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
import static com.example.sub_example.section.genericjavaclassowlmapper.utils.WISERNamespaces.ILCD_UNIT_GROUP_NAMESPACE;

public class UnitGroups {
    public static final String PE_UNIT_GROUP_DATA_FILE = "pe_unit_group_mapped_data_solid.ttl";
    public static final String PE_UNIT_GROUP_FOLDER = "src/main/resources/plasticseurope/unitgroups";

    public static void unitGroups(boolean reloadData, ClassLoader classLoader) {
        String name = getMethodName();
        String dataFileName = PE_UNIT_GROUP_DATA_FILE;
        if (reloadData) {
            Dataset dataset = DatasetFactory.create();
            measureTime(() -> {
                System.out.println("Writing " + name + " XML to Graphs");
                handleILCDFile(
                        dataset,
                        ILCD_UNIT_GROUP_NAMESPACE,
                        PE_UNIT_GROUP_FOLDER,
                        file -> loadUnitGroup(classLoader, file),
                        UnitGroups::writeUnitGroupToClass);
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

    private static void writeUnitGroupToClass(Dataset dataset, UnitGroupDataSetType unitGroupDataSetType) {
        GenericMapper genericMapper = new GenericMapper(UnitGroupDataSetType.class, unitGroupDataSetType, dataset);
        String name = unitGroupDataSetType.getUnitGroupInformation().getDataSetInformation().getUUID();
        String version = unitGroupDataSetType.getVersion();
        var md5 = generateMD5(name );
        genericMapper.writeClassToModel(name, PE_UNIT_GROUP_DATA_FILE);
    }

    private static UnitGroupDataSetType loadUnitGroup(ClassLoader classLoader, File file) {
        String fileName = file.toString().replace("src\\main\\resources\\", "").replace("\\", "/");
        //setup main class
        UnitGroupDataSetType unitGroupDataSetType = new UnitGroupDataSetType();
        //get file
        URL resource = classLoader.getResource(fileName);
        //read file with jakara XML API
        try {
            assert resource != null;
            Object fileContent = readContentFromFile(resource, UnitGroupDataSetType.class);
            unitGroupDataSetType = (UnitGroupDataSetType) fileContent;
        } catch (JAXBException e) {
            Throwable linkedExc = e.getLinkedException();
            System.out.println("linkedExc.getMessage() = " + linkedExc.getMessage());
        } catch (XMLStreamException | FileNotFoundException | NumberFormatException e) {
            e.printStackTrace();
        }
        return unitGroupDataSetType;
    }

}
