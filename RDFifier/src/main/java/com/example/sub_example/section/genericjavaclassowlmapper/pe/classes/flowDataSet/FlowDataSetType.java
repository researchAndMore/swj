
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.flowDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;


/**
 * <p>Java class for FlowDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowDataSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flowInformation" type="{http://lca.jrc.it/ILCD/Flow}FlowInformationType"/&gt;
 *         &lt;element name="modellingAndValidation" type="{http://lca.jrc.it/ILCD/Flow}ModellingAndValidationType" minOccurs="0"/&gt;
 *         &lt;element name="administrativeInformation" type="{http://lca.jrc.it/ILCD/Flow}AdministrativeInformationType" minOccurs="0"/&gt;
 *         &lt;element name="flowProperties" type="{http://lca.jrc.it/ILCD/Flow}FlowPropertiesType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}other" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://lca.jrc.it/ILCD/Common}SchemaVersion" /&gt;
 *       &lt;attribute name="locations" type="{http://lca.jrc.it/ILCD/Common}String" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowDataSetType", propOrder = {
    "flowInformation",
    "modellingAndValidation",
    "administrativeInformation",
    "flowProperties",
    "other"
})
public class FlowDataSetType {

    @XmlElement(required = true)
    protected FlowInformationType flowInformation;
    protected ModellingAndValidationType modellingAndValidation;
    protected AdministrativeInformationType administrativeInformation;
    protected FlowPropertiesType flowProperties;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "locations")
    protected String locations;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the flowInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FlowInformationType }
     *     
     */
    public FlowInformationType getFlowInformation() {
        return flowInformation;
    }

    /**
     * Sets the value of the flowInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowInformationType }
     *     
     */
    public void setFlowInformation(FlowInformationType value) {
        this.flowInformation = value;
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
     * Gets the value of the flowProperties property.
     * 
     * @return
     *     possible object is
     *     {@link FlowPropertiesType }
     *     
     */
    public FlowPropertiesType getFlowProperties() {
        return flowProperties;
    }

    /**
     * Sets the value of the flowProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowPropertiesType }
     *     
     */
    public void setFlowProperties(FlowPropertiesType value) {
        this.flowProperties = value;
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
