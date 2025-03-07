package ch.unisg.ics.interactions.genericjavaclassowlmapper.generic;

import ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.WISERNamespaces;
import lombok.Getter;
import org.apache.jena.query.Dataset;
import org.apache.jena.rdf.model.Model;

import static ch.unisg.ics.interactions.genericjavaclassowlmapper.generic.writers.CaseWriter.handleClass;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.FileUtils.PE_ONT_FILENAME;
import static ch.unisg.ics.interactions.genericjavaclassowlmapper.utils.FileUtils.appendToOntology;

public class GenericMapper {
    @Getter
    private Class<?> baseClass;
    @Getter
    private Object baseInstance;
    @Getter
    private Dataset dataset;

    public GenericMapper(Class<?> clazz, Object instance, Dataset dataset) {
        this.baseClass = clazz;
        this.baseInstance = instance;
        this.dataset = dataset;
    }

    /**
     * writes the Class as RDF to the classes own model.
     *
     * @param uuid name of the named graph created for this class
     */
    public void writeClassToModel(String uuid, String dataFileName) {
        Model model = this.dataset.getNamedModel(WISERNamespaces.WISER_BASE + uuid + "_Graph");
        String className = baseClass.getSimpleName();
        handleClass(model, className, null, null, baseClass, baseInstance, uuid);
        //TODO: which ont-file?
        OntLoader ontLoader = new OntLoader(PE_ONT_FILENAME);
        ontLoader.loadProperties(model);
    }
}
