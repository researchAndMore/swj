
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;


/**
 * <p>Java class for LCIAMethodInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LCIAMethodInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataSetInformation" type="{http://lca.jrc.it/ILCD/LCIAMethod}DataSetInformationType"/&gt;
 *         &lt;element name="quantitativeReference" type="{http://lca.jrc.it/ILCD/LCIAMethod}QuantitativeReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="time" type="{http://lca.jrc.it/ILCD/LCIAMethod}TimeType" minOccurs="0"/&gt;
 *         &lt;element name="geography" type="{http://lca.jrc.it/ILCD/LCIAMethod}GeographyType"/&gt;
 *         &lt;element name="impactModel" type="{http://lca.jrc.it/ILCD/LCIAMethod}ImpactModelType" minOccurs="0"/&gt;
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
@XmlType(name = "LCIAMethodInformationType", namespace = "http://lca.jrc.it/ILCD/LCIAMethod", propOrder = {
    "dataSetInformation",
    "quantitativeReference",
    "time",
    "geography",
    "impactModel",
    "other"
})
public class LCIAMethodInformationType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod", required = true)
    protected DataSetInformationType dataSetInformation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected QuantitativeReferenceType quantitativeReference;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected TimeType time;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod", required = true)
    protected GeographyType geography;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected ImpactModelType impactModel;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the dataSetInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetInformationType }
     *     
     */
    public DataSetInformationType getDataSetInformation() {
        return dataSetInformation;
    }

    /**
     * Sets the value of the dataSetInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetInformationType }
     *     
     */
    public void setDataSetInformation(DataSetInformationType value) {
        this.dataSetInformation = value;
    }

    /**
     * Gets the value of the quantitativeReference property.
     * 
     * @return
     *     possible object is
     *     {@link QuantitativeReferenceType }
     *     
     */
    public QuantitativeReferenceType getQuantitativeReference() {
        return quantitativeReference;
    }

    /**
     * Sets the value of the quantitativeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitativeReferenceType }
     *     
     */
    public void setQuantitativeReference(QuantitativeReferenceType value) {
        this.quantitativeReference = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link TimeType }
     *     
     */
    public TimeType getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeType }
     *     
     */
    public void setTime(TimeType value) {
        this.time = value;
    }

    /**
     * Gets the value of the geography property.
     * 
     * @return
     *     possible object is
     *     {@link GeographyType }
     *     
     */
    public GeographyType getGeography() {
        return geography;
    }

    /**
     * Sets the value of the geography property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographyType }
     *     
     */
    public void setGeography(GeographyType value) {
        this.geography = value;
    }

    /**
     * Gets the value of the impactModel property.
     * 
     * @return
     *     possible object is
     *     {@link ImpactModelType }
     *     
     */
    public ImpactModelType getImpactModel() {
        return impactModel;
    }

    /**
     * Sets the value of the impactModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpactModelType }
     *     
     */
    public void setImpactModel(ImpactModelType value) {
        this.impactModel = value;
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
