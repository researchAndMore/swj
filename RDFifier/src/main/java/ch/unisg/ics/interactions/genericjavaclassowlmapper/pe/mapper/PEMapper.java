package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.mapper;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.util.FileManager;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import static ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.mapper.classes.Contacts.contacts;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.mapper.classes.FlowProperties.flowProperties;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.mapper.classes.Flows.flows;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.mapper.classes.LCIAMethods.lciaMethods;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.mapper.classes.Processes.processes;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.mapper.classes.Source.sources;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.mapper.classes.UnitGroups.unitGroups;


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

        processes(reloadData, classLoader);
        contacts(reloadData,classLoader);
        flows(reloadData, classLoader);
        flowProperties(reloadData, classLoader);
        sources(reloadData, classLoader);
        unitGroups(reloadData, classLoader);
        lciaMethods(reloadData, classLoader);
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
