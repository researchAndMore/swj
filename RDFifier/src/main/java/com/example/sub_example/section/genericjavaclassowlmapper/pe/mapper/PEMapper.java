package com.example.sub_example.section.genericjavaclassowlmapper.pe.mapper;

import com.example.sub_example.section.genericjavaclassowlmapper.pe.mapper.classes.*;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.util.FileManager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


/**
 * transforms the UVEK-database into RDF-format and its corresponding ontology.
 */
public class PEMapper {
    /**
     * Classloader is needed to load the file, the reload flag tells the method whether to do a data reload.
     *
     * @param reloadData  true if the data-file should be recreated
     * @param classLoader idk why Spring boot needs this
     */

    public static final String PE_ONT_FILENAME = "pe_mapped_ontology.ttl";

    public static void plasticsEurope(boolean reloadData, ClassLoader classLoader) {

        Processes.processes(reloadData, classLoader);
        Contacts.contacts(reloadData,classLoader);
        Flows.flows(reloadData, classLoader);
        FlowProperties.flowProperties(reloadData, classLoader);
        Source.sources(reloadData, classLoader);
        UnitGroups.unitGroups(reloadData, classLoader);
        LCIAMethods.lciaMethods(reloadData, classLoader);
        cleanOntology(PE_ONT_FILENAME);
    }

    private static void cleanOntology(String peOntFilename) {
        // I have the problem, that some statements are duplicate
        Model model = FileManager.get().loadModel(peOntFilename, "TURTLE");

        // Create a new Model to store cleaned ontology
        Model cleanedModel = ModelFactory.createDefaultModel();

        // Iterate over statements in the input model and remove duplicates
        StmtIterator stmtIterator = model.listStatements();
        while (stmtIterator.hasNext()) {
            Statement stmt = stmtIterator.nextStatement();
            if (!cleanedModel.contains(stmt)) {
                cleanedModel.add(stmt);
            }
        }

        // Write the cleaned ontology back to Turtle format
        String outputFilePath = "final_ontology.ttl";  // Replace with your desired output file path
        try {
            OutputStream outputStream = new FileOutputStream(outputFilePath);
            cleanedModel.write(outputStream, "TURTLE");
            System.out.println("Cleaned ontology written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
