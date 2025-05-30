
package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.Dataset;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains information about the person that entered data in the database or transformed data into the format of the ecoinvent (or any other) quality network.
 * 
 * <p>Java class for TDataEntryBy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDataEntryBy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="person" use="required" type="{http://www.EcoInvent.org/EcoSpold01}TIndexNumber" /&gt;
 *       &lt;attribute name="qualityNetwork" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDataEntryBy", namespace = "http://www.EcoInvent.org/EcoSpold01")
public class TDataEntryBy {

    @XmlAttribute(name = "person", required = true)
    protected int person;
    @XmlAttribute(name = "qualityNetwork")
    protected BigInteger qualityNetwork;

    /**
     * Gets the value of the person property.
     * 
     */
    public int getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     */
    public void setPerson(int value) {
        this.person = value;
    }

    /**
     * Gets the value of the qualityNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQualityNetwork() {
        return qualityNetwork;
    }

    /**
     * Sets the value of the qualityNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQualityNetwork(BigInteger value) {
        this.qualityNetwork = value;
    }

}
