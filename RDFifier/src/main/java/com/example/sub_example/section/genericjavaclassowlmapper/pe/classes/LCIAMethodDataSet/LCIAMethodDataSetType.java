
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;


/**
 * <p>Java class for LCIAMethodDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LCIAMethodDataSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LCIAMethodInformation" type="{http://lca.jrc.it/ILCD/LCIAMethod}LCIAMethodInformationType"/&gt;
 *         &lt;element name="modellingAndValidation" type="{http://lca.jrc.it/ILCD/LCIAMethod}ModellingAndValidationType"/&gt;
 *         &lt;element name="administrativeInformation" type="{http://lca.jrc.it/ILCD/LCIAMethod}AdministrativeInformationType" minOccurs="0"/&gt;
 *         &lt;element name="characterisationFactors" type="{http://lca.jrc.it/ILCD/LCIAMethod}CharacterisationFactorsType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}other" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://lca.jrc.it/ILCD/Common}SchemaVersion" /&gt;
 *       &lt;attribute name="locations" type="{http://lca.jrc.it/ILCD/Common}String" /&gt;
 *       &lt;attribute name="lciaMethodologies" type="{http://lca.jrc.it/ILCD/Common}String" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LCIAMethodDataSetType", namespace = "http://lca.jrc.it/ILCD/LCIAMethod", propOrder = {
    "lciaMethodInformation",
    "modellingAndValidation",
    "administrativeInformation",
    "characterisationFactors",
    "other"
})
public class LCIAMethodDataSetType {

    @XmlElement(name = "LCIAMethodInformation", namespace = "http://lca.jrc.it/ILCD/LCIAMethod", required = true)
    protected LCIAMethodInformationType lciaMethodInformation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod", required = true)
    protected ModellingAndValidationType modellingAndValidation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected AdministrativeInformationType administrativeInformation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected CharacterisationFactorsType characterisationFactors;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "locations")
    protected String locations;
    @XmlAttribute(name ="lciaMethodologies")
    protected String lciaMethodologies;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the lciaMethodInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LCIAMethodInformationType }
     *     
     */
    public LCIAMethodInformationType getLCIAMethodInformation() {
        return lciaMethodInformation;
    }

    /**
     * Sets the value of the lciaMethodInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LCIAMethodInformationType }
     *     
     */
    public void setLCIAMethodInformation(LCIAMethodInformationType value) {
        this.lciaMethodInformation = value;
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
     * Gets the value of the characterisationFactors property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterisationFactorsType }
     *     
     */
    public CharacterisationFactorsType getCharacterisationFactors() {
        return characterisationFactors;
    }

    /**
     * Sets the value of the characterisationFactors property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterisationFactorsType }
     *     
     */
    public void setCharacterisationFactors(CharacterisationFactorsType value) {
        this.characterisationFactors = value;
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
     * Gets the value of the lciaMethodologies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLCIAMethodologies() {
        return lciaMethodologies;
    }

    /**
     * Sets the value of the lciaMethodologies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLCIAMethodologies(String value) {
        this.lciaMethodologies = value;
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
