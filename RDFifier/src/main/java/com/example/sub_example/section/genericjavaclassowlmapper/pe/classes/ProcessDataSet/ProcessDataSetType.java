
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.ProcessDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;


/**
 * <p>Java class for ProcessDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessDataSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processInformation" type="{http://lca.jrc.it/ILCD/Process}ProcessInformationType"/&gt;
 *         &lt;element name="modellingAndValidation" type="{http://lca.jrc.it/ILCD/Process}ModellingAndValidationType" minOccurs="0"/&gt;
 *         &lt;element name="administrativeInformation" type="{http://lca.jrc.it/ILCD/Process}AdministrativeInformationType" minOccurs="0"/&gt;
 *         &lt;element name="exchanges" type="{http://lca.jrc.it/ILCD/Process}ExchangesType" minOccurs="0"/&gt;
 *         &lt;element name="LCIAResults" type="{http://lca.jrc.it/ILCD/Process}LCIAResultsType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}other" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://lca.jrc.it/ILCD/Common}SchemaVersion" /&gt;
 *       &lt;attribute name="locations" type="{http://lca.jrc.it/ILCD/Common}String" /&gt;
 *       &lt;attribute name="metaDataOnly" type="{http://lca.jrc.it/ILCD/Common}boolean" default="false" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessDataSetType", namespace = "http://lca.jrc.it/ILCD/Process", propOrder = {
    "processInformation",
    "modellingAndValidation",
    "administrativeInformation",
    "exchanges",
    "lciaResults",
    "other"
})
public class ProcessDataSetType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Process", required = true)
    protected ProcessInformationType processInformation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Process")
    protected ModellingAndValidationType modellingAndValidation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Process")
    protected AdministrativeInformationType administrativeInformation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Process")
    protected ExchangesType exchanges;
    @XmlElement(name = "LCIAResults", namespace = "http://lca.jrc.it/ILCD/Process")
    protected LCIAResultsType lciaResults;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "locations")
    protected String locations;
    @XmlAttribute(name = "metaDataOnly")
    protected Boolean metaDataOnly;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the processInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessInformationType }
     *     
     */
    public ProcessInformationType getProcessInformation() {
        return processInformation;
    }

    /**
     * Sets the value of the processInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessInformationType }
     *     
     */
    public void setProcessInformation(ProcessInformationType value) {
        this.processInformation = value;
    }

    /**
     * Gets the value of the modellingAndValidation property.
     * 
     * @return
     *     possible object is
     *     {@link ModellingAndValidationType }
     *     
     */
    public ModellingAndValidationType getModellingAndValidation() {
        return modellingAndValidation;
    }

    /**
     * Sets the value of the modellingAndValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModellingAndValidationType }
     *     
     */
    public void setModellingAndValidation(ModellingAndValidationType value) {
        this.modellingAndValidation = value;
    }

    /**
     * Gets the value of the administrativeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeInformationType }
     *     
     */
    public AdministrativeInformationType getAdministrativeInformation() {
        return administrativeInformation;
    }

    /**
     * Sets the value of the administrativeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeInformationType }
     *     
     */
    public void setAdministrativeInformation(AdministrativeInformationType value) {
        this.administrativeInformation = value;
    }

    /**
     * Gets the value of the exchanges property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangesType }
     *     
     */
    public ExchangesType getExchanges() {
        return exchanges;
    }

    /**
     * Sets the value of the exchanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangesType }
     *     
     */
    public void setExchanges(ExchangesType value) {
        this.exchanges = value;
    }

    /**
     * Gets the value of the lciaResults property.
     * 
     * @return
     *     possible object is
     *     {@link LCIAResultsType }
     *     
     */
    public LCIAResultsType getLCIAResults() {
        return lciaResults;
    }

    /**
     * Sets the value of the lciaResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link LCIAResultsType }
     *     
     */
    public void setLCIAResults(LCIAResultsType value) {
        this.lciaResults = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link Other }
     *     
     */
    public Other getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link Other }
     *     
     */
    public void setOther(Other value) {
        this.other = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocations(String value) {
        this.locations = value;
    }

    /**
     * Gets the value of the metaDataOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMetaDataOnly() {
        if (metaDataOnly == null) {
            return false;
        } else {
            return metaDataOnly;
        }
    }

    /**
     * Sets the value of the metaDataOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMetaDataOnly(Boolean value) {
        this.metaDataOnly = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
