
package com.example.sub_example.section.genericjavaclassowlmapper.uvek.classes.ImpactDataset;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ImpactDataset package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EcoSpold_QNAME = new QName("http://www.EcoInvent.org/EcoSpold01Impact", "ecoSpold");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ImpactDataset
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TEcoSpold }
     * 
     */
    public TEcoSpold createTEcoSpold() {
        return new TEcoSpold();
    }

    /**
     * Create an instance of {@link TPerson }
     * 
     */
    public TPerson createTPerson() {
        return new TPerson();
    }

    /**
     * Create an instance of {@link TDataSetInformation }
     * 
     */
    public TDataSetInformation createTDataSetInformation() {
        return new TDataSetInformation();
    }

    /**
     * Create an instance of {@link TDataEntryBy }
     * 
     */
    public TDataEntryBy createTDataEntryBy() {
        return new TDataEntryBy();
    }

    /**
     * Create an instance of {@link TTimePeriod }
     * 
     */
    public TTimePeriod createTTimePeriod() {
        return new TTimePeriod();
    }

    /**
     * Create an instance of {@link TGeography }
     * 
     */
    public TGeography createTGeography() {
        return new TGeography();
    }

    /**
     * Create an instance of {@link TTechnology }
     * 
     */
    public TTechnology createTTechnology() {
        return new TTechnology();
    }

    /**
     * Create an instance of {@link TRepresentativeness }
     * 
     */
    public TRepresentativeness createTRepresentativeness() {
        return new TRepresentativeness();
    }

    /**
     * Create an instance of {@link TDataGeneratorAndPublication }
     * 
     */
    public TDataGeneratorAndPublication createTDataGeneratorAndPublication() {
        return new TDataGeneratorAndPublication();
    }

    /**
     * Create an instance of {@link TSource }
     * 
     */
    public TSource createTSource() {
        return new TSource();
    }

    /**
     * Create an instance of {@link TValidation }
     * 
     */
    public TValidation createTValidation() {
        return new TValidation();
    }

    /**
     * Create an instance of {@link TReferenceFunction }
     * 
     */
    public TReferenceFunction createTReferenceFunction() {
        return new TReferenceFunction();
    }

    /**
     * Create an instance of {@link TExchange }
     * 
     */
    public TExchange createTExchange() {
        return new TExchange();
    }

    /**
     * Create an instance of {@link TAllocation }
     * 
     */
    public TAllocation createTAllocation() {
        return new TAllocation();
    }

    /**
     * Create an instance of {@link TProcessInformation }
     * 
     */
    public TProcessInformation createTProcessInformation() {
        return new TProcessInformation();
    }

    /**
     * Create an instance of {@link TModellingAndValidation }
     * 
     */
    public TModellingAndValidation createTModellingAndValidation() {
        return new TModellingAndValidation();
    }

    /**
     * Create an instance of {@link TAdministrativeInformation }
     * 
     */
    public TAdministrativeInformation createTAdministrativeInformation() {
        return new TAdministrativeInformation();
    }

    /**
     * Create an instance of {@link TMetaInformation }
     * 
     */
    public TMetaInformation createTMetaInformation() {
        return new TMetaInformation();
    }

    /**
     * Create an instance of {@link TFlowData }
     * 
     */
    public TFlowData createTFlowData() {
        return new TFlowData();
    }

    /**
     * Create an instance of {@link TDataset }
     * 
     */
    public TDataset createTDataset() {
        return new TDataset();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEcoSpold }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TEcoSpold }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.EcoInvent.org/EcoSpold01Impact", name = "ecoSpold")
    public JAXBElement<TEcoSpold> createEcoSpold(TEcoSpold value) {
        return new JAXBElement<TEcoSpold>(_EcoSpold_QNAME, TEcoSpold.class, null, value);
    }

}
