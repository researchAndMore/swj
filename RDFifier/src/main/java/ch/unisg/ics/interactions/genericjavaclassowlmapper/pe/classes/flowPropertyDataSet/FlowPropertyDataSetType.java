
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.flowPropertyDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;


/**
 * <p>Java class for FlowPropertyDataSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowPropertyDataSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flowPropertiesInformation" type="{http://lca.jrc.it/ILCD/FlowProperty}FlowPropertiesInformationType"/&gt;
 *         &lt;element name="modellingAndValidation" type="{http://lca.jrc.it/ILCD/FlowProperty}ModellingAndValidationType" minOccurs="0"/&gt;
 *         &lt;element name="administrativeInformation" type="{http://lca.jrc.it/ILCD/FlowProperty}AdministrativeInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}other" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" use="required" type="{http://lca.jrc.it/ILCD/Common}SchemaVersion" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowPropertyDataSetType", namespace = "http://lca.jrc.it/ILCD/FlowProperty", propOrder = {
    "flowPropertiesInformation",
    "modellingAndValidation",
    "administrativeInformation",
    "other"
})
public class FlowPropertyDataSetType {

    @XmlElement(required = true)
    protected FlowPropertiesInformationType flowPropertiesInformation;
    protected ModellingAndValidationType modellingAndValidation;
    protected AdministrativeInformationType administrativeInformation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the flowPropertiesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FlowPropertiesInformationType }
     *     
     */
    public FlowPropertiesInformationType getFlowPropertiesInformation() {
        return flowPropertiesInformation;
    }

    /**
     * Sets the value of the flowPropertiesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowPropertiesInformationType }
     *     
     */
    public void setFlowPropertiesInformation(FlowPropertiesInformationType value) {
        this.flowPropertiesInformation = value;
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
