
package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.ImpactDataset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains information about the geographic validity of the process. The region described with regional code and free text is the market area of the product / service at issue and not necessarily the place of production.
 * 
 * <p>Java class for TGeography complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TGeography"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="location" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TRegionalCode" /&gt;
 *       &lt;attribute name="text" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString32000" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TGeography", namespace = "http://www.EcoInvent.org/EcoSpold01Impact")
public class TGeography {

    @XmlAttribute(name = "location", required = true)
    protected String location;
    @XmlAttribute(name = "text")
    protected String text;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
