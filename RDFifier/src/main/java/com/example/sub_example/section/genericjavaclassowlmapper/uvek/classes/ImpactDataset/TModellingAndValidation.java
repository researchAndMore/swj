
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
 * Contains metainformation about how impact categories are modelled and about the review/validation of the dataset.
 * 
 * <p>Java class for TModellingAndValidation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TModellingAndValidation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="representativeness" type="{http://www.EcoInvent.org/EcoSpold01Impact}TRepresentativeness" maxOccurs="0" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.EcoInvent.org/EcoSpold01Impact}TSource" maxOccurs="unbounded"/&gt;
 *         &lt;element name="validation" type="{http://www.EcoInvent.org/EcoSpold01Impact}TValidation" minOccurs="0"/&gt;
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
@XmlType(name = "TModellingAndValidation", namespace = "http://www.EcoInvent.org/EcoSpold01Impact", propOrder = {
    "source",
    "validation",
    "any"
})
public class TModellingAndValidation {

    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01Impact", required = true)
    protected List<TSource> source;
    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01Impact")
    protected TValidation validation;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the source property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the source property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TSource }
     * 
     * 
     */
    public List<TSource> getSource() {
        if (source == null) {
            source = new ArrayList<TSource>();
        }
        return this.source;
    }

    /**
     * Gets the value of the validation property.
     * 
     * @return
     *     possible object is
     *     {@link TValidation }
     *     
     */
    public TValidation getValidation() {
        return validation;
    }

    /**
     * Sets the value of the validation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TValidation }
     *     
     */
    public void setValidation(TValidation value) {
        this.validation = value;
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
