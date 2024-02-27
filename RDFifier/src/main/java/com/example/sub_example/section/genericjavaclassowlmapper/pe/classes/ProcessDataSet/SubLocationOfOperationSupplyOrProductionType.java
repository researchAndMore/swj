
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.ProcessDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Java class for SubLocationOfOperationSupplyOrProductionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubLocationOfOperationSupplyOrProductionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descriptionOfRestrictions" type="{http://lca.jrc.it/ILCD/Common}FTMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}other" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="subLocation" type="{http://lca.jrc.it/ILCD/Common}String" /&gt;
 *       &lt;attribute name="latitudeAndLongitude" type="{http://lca.jrc.it/ILCD/Common}GIS" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubLocationOfOperationSupplyOrProductionType", namespace = "http://lca.jrc.it/ILCD/Process", propOrder = {
    "descriptionOfRestrictions",
    "other"
})
public class SubLocationOfOperationSupplyOrProductionType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Process")
    protected List<FTMultiLang> descriptionOfRestrictions;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAttribute(name = "subLocation")
    protected String subLocation;
    @XmlAttribute(name = "latitudeAndLongitude")
    protected String latitudeAndLongitude;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the descriptionOfRestrictions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionOfRestrictions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionOfRestrictions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTMultiLang }
     * 
     * 
     */
    public List<FTMultiLang> getDescriptionOfRestrictions() {
        if (descriptionOfRestrictions == null) {
            descriptionOfRestrictions = new ArrayList<FTMultiLang>();
        }
        return this.descriptionOfRestrictions;
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
     * Gets the value of the subLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLocation() {
        return subLocation;
    }

    /**
     * Sets the value of the subLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLocation(String value) {
        this.subLocation = value;
    }

    /**
     * Gets the value of the latitudeAndLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeAndLongitude() {
        return latitudeAndLongitude;
    }

    /**
     * Sets the value of the latitudeAndLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeAndLongitude(String value) {
        this.latitudeAndLongitude = value;
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
