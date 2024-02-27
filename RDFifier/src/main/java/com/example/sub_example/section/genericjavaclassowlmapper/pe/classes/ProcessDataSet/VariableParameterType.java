
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.ProcessDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Java class for VariableParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariableParameterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formula" type="{http://lca.jrc.it/ILCD/Common}MatR" minOccurs="0"/&gt;
 *         &lt;element name="meanValue" type="{http://lca.jrc.it/ILCD/Common}Real" minOccurs="0"/&gt;
 *         &lt;element name="minimumValue" type="{http://lca.jrc.it/ILCD/Common}Real" minOccurs="0"/&gt;
 *         &lt;element name="maximumValue" type="{http://lca.jrc.it/ILCD/Common}Real" minOccurs="0"/&gt;
 *         &lt;element name="uncertaintyDistributionType" type="{http://lca.jrc.it/ILCD/Common}UncertaintyDistributionTypeValues" minOccurs="0"/&gt;
 *         &lt;element name="relativeStandardDeviation95In" type="{http://lca.jrc.it/ILCD/Common}Perc" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://lca.jrc.it/ILCD/Common}StringMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}other" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://lca.jrc.it/ILCD/Common}MatV" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariableParameterType", namespace = "http://lca.jrc.it/ILCD/Process", propOrder = {
    "formula",
    "meanValue",
    "minimumValue",
    "maximumValue",
    "uncertaintyDistributionType",
    "relativeStandardDeviation95In",
    "comment",
    "other"
})
public class VariableParameterType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Process")
    protected String formula;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Process")
    protected Double meanValue;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Process")
    protected Double minimumValue;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Process")
    protected Double maximumValue;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Process")
    @XmlSchemaType(name = "string")
    protected UncertaintyDistributionTypeValues uncertaintyDistributionType;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Process")
    protected BigDecimal relativeStandardDeviation95In;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Process")
    protected List<StringMultiLang> comment;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the meanValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMeanValue() {
        return meanValue;
    }

    /**
     * Sets the value of the meanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMeanValue(Double value) {
        this.meanValue = value;
    }

    /**
     * Gets the value of the minimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumValue() {
        return minimumValue;
    }

    /**
     * Sets the value of the minimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumValue(Double value) {
        this.minimumValue = value;
    }

    /**
     * Gets the value of the maximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumValue() {
        return maximumValue;
    }

    /**
     * Sets the value of the maximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumValue(Double value) {
        this.maximumValue = value;
    }

    /**
     * Gets the value of the uncertaintyDistributionType property.
     * 
     * @return
     *     possible object is
     *     {@link UncertaintyDistributionTypeValues }
     *     
     */
    public UncertaintyDistributionTypeValues getUncertaintyDistributionType() {
        return uncertaintyDistributionType;
    }

    /**
     * Sets the value of the uncertaintyDistributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncertaintyDistributionTypeValues }
     *     
     */
    public void setUncertaintyDistributionType(UncertaintyDistributionTypeValues value) {
        this.uncertaintyDistributionType = value;
    }

    /**
     * Gets the value of the relativeStandardDeviation95In property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelativeStandardDeviation95In() {
        return relativeStandardDeviation95In;
    }

    /**
     * Sets the value of the relativeStandardDeviation95In property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelativeStandardDeviation95In(BigDecimal value) {
        this.relativeStandardDeviation95In = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringMultiLang }
     * 
     * 
     */
    public List<StringMultiLang> getComment() {
        if (comment == null) {
            comment = new ArrayList<StringMultiLang>();
        }
        return this.comment;
    }

    /**
     * May contain arbitrary content.
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
