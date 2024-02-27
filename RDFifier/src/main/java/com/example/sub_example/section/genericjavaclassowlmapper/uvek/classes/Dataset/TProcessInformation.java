
package com.example.sub_example.section.genericjavaclassowlmapper.uvek.classes.Dataset;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Contains content-related metainformation for the unit process.
 * 
 * <p>Java class for TProcessInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TProcessInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceFunction" type="{http://www.EcoInvent.org/EcoSpold01}TReferenceFunction"/&gt;
 *         &lt;element name="geography" type="{http://www.EcoInvent.org/EcoSpold01}TGeography"/&gt;
 *         &lt;element name="technology" type="{http://www.EcoInvent.org/EcoSpold01}TTechnology"/&gt;
 *         &lt;element name="timePeriod" type="{http://www.EcoInvent.org/EcoSpold01}TTimePeriod"/&gt;
 *         &lt;element name="dataSetInformation" type="{http://www.EcoInvent.org/EcoSpold01}TDataSetInformation"/&gt;
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
@XmlType(name = "TProcessInformation", namespace = "http://www.EcoInvent.org/EcoSpold01", propOrder = {
    "referenceFunction",
    "geography",
    "technology",
    "timePeriod",
    "dataSetInformation",
    "any"
})
public class TProcessInformation {

    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01", required = true)
    protected TReferenceFunction referenceFunction;
    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01", required = true)
    protected TGeography geography;
    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01", required = true)
    protected TTechnology technology;
    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01", required = true)
    protected TTimePeriod timePeriod;
    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01", required = true)
    protected TDataSetInformation dataSetInformation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the referenceFunction property.
     * 
     * @return
     *     possible object is
     *     {@link TReferenceFunction }
     *     
     */
    public TReferenceFunction getReferenceFunction() {
        return referenceFunction;
    }

    /**
     * Sets the value of the referenceFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TReferenceFunction }
     *     
     */
    public void setReferenceFunction(TReferenceFunction value) {
        this.referenceFunction = value;
    }

    /**
     * Gets the value of the geography property.
     * 
     * @return
     *     possible object is
     *     {@link TGeography }
     *     
     */
    public TGeography getGeography() {
        return geography;
    }

    /**
     * Sets the value of the geography property.
     * 
     * @param value
     *     allowed object is
     *     {@link TGeography }
     *     
     */
    public void setGeography(TGeography value) {
        this.geography = value;
    }

    /**
     * Gets the value of the technology property.
     * 
     * @return
     *     possible object is
     *     {@link TTechnology }
     *     
     */
    public TTechnology getTechnology() {
        return technology;
    }

    /**
     * Sets the value of the technology property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTechnology }
     *     
     */
    public void setTechnology(TTechnology value) {
        this.technology = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TTimePeriod }
     *     
     */
    public TTimePeriod getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTimePeriod }
     *     
     */
    public void setTimePeriod(TTimePeriod value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the dataSetInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TDataSetInformation }
     *     
     */
    public TDataSetInformation getDataSetInformation() {
        return dataSetInformation;
    }

    /**
     * Sets the value of the dataSetInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDataSetInformation }
     *     
     */
    public void setDataSetInformation(TDataSetInformation value) {
        this.dataSetInformation = value;
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
