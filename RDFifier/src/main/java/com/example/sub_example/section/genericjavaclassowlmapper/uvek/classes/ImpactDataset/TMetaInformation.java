
package com.example.sub_example.section.genericjavaclassowlmapper.uvek.classes.ImpactDataset;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Contains information about the impact category (its name, unit, classification, geography, time etc.), about validation details and about dataset administration (version number, kind of dataset, language).
 * 
 * <p>Java class for TMetaInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMetaInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processInformation" type="{http://www.EcoInvent.org/EcoSpold01Impact}TProcessInformation"/&gt;
 *         &lt;element name="modellingAndValidation" type="{http://www.EcoInvent.org/EcoSpold01Impact}TModellingAndValidation"/&gt;
 *         &lt;element name="administrativeInformation" type="{http://www.EcoInvent.org/EcoSpold01Impact}TAdministrativeInformation"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMetaInformation", namespace = "http://www.EcoInvent.org/EcoSpold01Impact", propOrder = {
    "processInformation",
    "modellingAndValidation",
    "administrativeInformation",
    "any"
})
public class TMetaInformation {

    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01Impact", required = true)
    protected TProcessInformation processInformation;
    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01Impact", required = true)
    protected TModellingAndValidation modellingAndValidation;
    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01Impact", required = true)
    protected TAdministrativeInformation administrativeInformation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the processInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TProcessInformation }
     *     
     */
    public TProcessInformation getProcessInformation() {
        return processInformation;
    }

    /**
     * Sets the value of the processInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TProcessInformation }
     *     
     */
    public void setProcessInformation(TProcessInformation value) {
        this.processInformation = value;
    }

    /**
     * Gets the value of the modellingAndValidation property.
     * 
     * @return
     *     possible object is
     *     {@link TModellingAndValidation }
     *     
     */
    public TModellingAndValidation getModellingAndValidation() {
        return modellingAndValidation;
    }

    /**
     * Sets the value of the modellingAndValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TModellingAndValidation }
     *     
     */
    public void setModellingAndValidation(TModellingAndValidation value) {
        this.modellingAndValidation = value;
    }

    /**
     * Gets the value of the administrativeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TAdministrativeInformation }
     *     
     */
    public TAdministrativeInformation getAdministrativeInformation() {
        return administrativeInformation;
    }

    /**
     * Sets the value of the administrativeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAdministrativeInformation }
     *     
     */
    public void setAdministrativeInformation(TAdministrativeInformation value) {
        this.administrativeInformation = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
