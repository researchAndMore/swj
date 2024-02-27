
package com.example.sub_example.section.genericjavaclassowlmapper.uvek.classes.Dataset;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * contains information about one individual unit process (or terminated system). Information is divided into metaInformation and flowData.
 * 
 * <p>Java class for TDataset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDataset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="metaInformation" type="{http://www.EcoInvent.org/EcoSpold01}TMetaInformation"/&gt;
 *         &lt;element name="flowData" type="{http://www.EcoInvent.org/EcoSpold01}TFlowData" maxOccurs="unbounded"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="number" use="required" type="{http://www.EcoInvent.org/EcoSpold01}TIndexNumber" /&gt;
 *       &lt;attribute name="internalSchemaVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="generator" use="required" type="{http://www.EcoInvent.org/EcoSpold01}TString255" /&gt;
 *       &lt;attribute name="timestamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="validCompanyCodes" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="validRegionalCodes" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="validCategories" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="validUnits" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDataset", namespace = "http://www.EcoInvent.org/EcoSpold01", propOrder = {
    "metaInformation",
    "flowData",
    "any"
})
public class TDataset {

    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01", required = true)
    protected TMetaInformation metaInformation;
    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01", required = true)
    protected List<TFlowData> flowData;
    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAttribute(name = "number", required = true)
    protected int number;
    @XmlAttribute(name = "internalSchemaVersion")
    protected String internalSchemaVersion;
    @XmlAttribute(name = "generator", required = true)
    protected String generator;
    @XmlAttribute(name = "timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "validCompanyCodes")
    protected String validCompanyCodes;
    @XmlAttribute(name = "validRegionalCodes")
    protected String validRegionalCodes;
    @XmlAttribute(name = "validCategories")
    protected String validCategories;
    @XmlAttribute(name = "validUnits")
    protected String validUnits;

    /**
     * Gets the value of the metaInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TMetaInformation }
     *     
     */
    public TMetaInformation getMetaInformation() {
        return metaInformation;
    }

    /**
     * Sets the value of the metaInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMetaInformation }
     *     
     */
    public void setMetaInformation(TMetaInformation value) {
        this.metaInformation = value;
    }

    /**
     * Gets the value of the flowData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the flowData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TFlowData }
     * 
     * 
     */
    public List<TFlowData> getFlowData() {
        if (flowData == null) {
            flowData = new ArrayList<TFlowData>();
        }
        return this.flowData;
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

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the internalSchemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalSchemaVersion() {
        return internalSchemaVersion;
    }

    /**
     * Sets the value of the internalSchemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalSchemaVersion(String value) {
        this.internalSchemaVersion = value;
    }

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerator(String value) {
        this.generator = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the validCompanyCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidCompanyCodes() {
        return validCompanyCodes;
    }

    /**
     * Sets the value of the validCompanyCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidCompanyCodes(String value) {
        this.validCompanyCodes = value;
    }

    /**
     * Gets the value of the validRegionalCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidRegionalCodes() {
        return validRegionalCodes;
    }

    /**
     * Sets the value of the validRegionalCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidRegionalCodes(String value) {
        this.validRegionalCodes = value;
    }

    /**
     * Gets the value of the validCategories property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidCategories() {
        return validCategories;
    }

    /**
     * Sets the value of the validCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidCategories(String value) {
        this.validCategories = value;
    }

    /**
     * Gets the value of the validUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidUnits() {
        return validUnits;
    }

    /**
     * Sets the value of the validUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidUnits(String value) {
        this.validUnits = value;
    }

}
