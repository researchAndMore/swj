
package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.Dataset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains information about who carried out the critical review and about the main results and conclusions of the review and the recommendations made.
 * 
 * <p>Java class for TValidation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TValidation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="proofReadingDetails" use="required" type="{http://www.EcoInvent.org/EcoSpold01}TString32000" /&gt;
 *       &lt;attribute name="proofReadingValidator" use="required" type="{http://www.EcoInvent.org/EcoSpold01}TIndexNumber" /&gt;
 *       &lt;attribute name="otherDetails" type="{http://www.EcoInvent.org/EcoSpold01}TString32000" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TValidation", namespace = "http://www.EcoInvent.org/EcoSpold01")
public class TValidation {

    @XmlAttribute(name = "proofReadingDetails", required = true)
    protected String proofReadingDetails;
    @XmlAttribute(name = "proofReadingValidator", required = true)
    protected int proofReadingValidator;
    @XmlAttribute(name = "otherDetails")
    protected String otherDetails;

    /**
     * Gets the value of the proofReadingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProofReadingDetails() {
        return proofReadingDetails;
    }

    /**
     * Sets the value of the proofReadingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProofReadingDetails(String value) {
        this.proofReadingDetails = value;
    }

    /**
     * Gets the value of the proofReadingValidator property.
     * 
     */
    public int getProofReadingValidator() {
        return proofReadingValidator;
    }

    /**
     * Sets the value of the proofReadingValidator property.
     * 
     */
    public void setProofReadingValidator(int value) {
        this.proofReadingValidator = value;
    }

    /**
     * Gets the value of the otherDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDetails() {
        return otherDetails;
    }

    /**
     * Sets the value of the otherDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDetails(String value) {
        this.otherDetails = value;
    }

}
