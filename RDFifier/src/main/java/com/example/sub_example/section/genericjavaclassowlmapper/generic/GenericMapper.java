package com.example.sub_example.section.genericjavaclassowlmapper.generic;

import com.example.sub_example.section.genericjavaclassowlmapper.utils.WISERNamespaces;
import com.example.sub_example.section.genericjavaclassowlmapper.generic.writers.CaseWriter;
import lombok.Getter;
import org.apache.jena.query.Dataset;
import org.apache.jena.rdf.model.Model;

import static com.example.sub_example.section.genericjavaclassowlmapper.utils.FileUtils.appendToOntology;

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
        CaseWriter.handleClass(model, className, null, null, baseClass, baseInstance, uuid);
        OntLoader ontLoader = new OntLoader();
        ontLoader.loadProperties(model);
    }
}
