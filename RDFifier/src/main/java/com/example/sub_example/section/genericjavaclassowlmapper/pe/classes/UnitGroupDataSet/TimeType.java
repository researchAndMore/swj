
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.UnitGroupDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Java class for TimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceYear" type="{http://lca.jrc.it/ILCD/Common}Year" minOccurs="0"/&gt;
 *         &lt;element name="dataSetValidUntil" type="{http://lca.jrc.it/ILCD/Common}Year" minOccurs="0"/&gt;
 *         &lt;element name="timeRepresentativenessDescription" type="{http://lca.jrc.it/ILCD/Common}FTMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}other" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeType", namespace = "http://lca.jrc.it/ILCD/Common", propOrder = {
    "referenceYear",
    "dataSetValidUntil",
    "timeRepresentativenessDescription",
    "other"
})
public class TimeType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected BigInteger referenceYear;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected BigInteger dataSetValidUntil;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected List<FTMultiLang> timeRepresentativenessDescription;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the referenceYear property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferenceYear() {
        return referenceYear;
    }

    /**
     * Sets the value of the referenceYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferenceYear(BigInteger value) {
        this.referenceYear = value;
    }

    /**
     * Gets the value of the dataSetValidUntil property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataSetValidUntil() {
        return dataSetValidUntil;
    }

    /**
     * Sets the value of the dataSetValidUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDataSetValidUntil(BigInteger value) {
        this.dataSetValidUntil = value;
    }

    /**
     * Gets the value of the timeRepresentativenessDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeRepresentativenessDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeRepresentativenessDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTMultiLang }
     * 
     * 
     */
    public List<FTMultiLang> getTimeRepresentativenessDescription() {
        if (timeRepresentativenessDescription == null) {
            timeRepresentativenessDescription = new ArrayList<FTMultiLang>();
        }
        return this.timeRepresentativenessDescription;
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
