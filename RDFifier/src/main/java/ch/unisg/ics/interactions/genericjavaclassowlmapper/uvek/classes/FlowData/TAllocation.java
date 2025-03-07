
package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.FlowData;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains all information about allocation procedure, allocation parameters and allocation factors applied on a multi-output process.
 * 
 * <p>Java class for TAllocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAllocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="referenceToInputOutput" type="{}TIndexNumber"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="referenceToCoProduct" use="required" type="{}TIndexNumber" /&gt;
 *       &lt;attribute name="allocationMethod" default="-1"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;minInclusive value="-1"/&gt;
 *             &lt;maxInclusive value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="fraction" use="required" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="explanations" type="{}TString32000" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAllocation", propOrder = {
    "referenceToInputOutput"
})
public class TAllocation {

    @XmlElement(type = Integer.class)
    protected List<Integer> referenceToInputOutput;
    @XmlAttribute(name = "referenceToCoProduct", required = true)
    protected int referenceToCoProduct;
    @XmlAttribute(name = "allocationMethod")
    protected Integer allocationMethod;
    @XmlAttribute(name = "fraction", required = true)
    protected float fraction;
    @XmlAttribute(name = "explanations")
    protected String explanations;

    /**
     * Gets the value of the referenceToInputOutput property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the referenceToInputOutput property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceToInputOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getReferenceToInputOutput() {
        if (referenceToInputOutput == null) {
            referenceToInputOutput = new ArrayList<Integer>();
        }
        return this.referenceToInputOutput;
    }

    /**
     * Gets the value of the referenceToCoProduct property.
     * 
     */
    public int getReferenceToCoProduct() {
        return referenceToCoProduct;
    }

    /**
     * Sets the value of the referenceToCoProduct property.
     * 
     */
    public void setReferenceToCoProduct(int value) {
        this.referenceToCoProduct = value;
    }

    /**
     * Gets the value of the allocationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getAllocationMethod() {
        if (allocationMethod == null) {
            return -1;
        } else {
            return allocationMethod;
        }
    }

    /**
     * Sets the value of the allocationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAllocationMethod(Integer value) {
        this.allocationMethod = value;
    }

    /**
     * Gets the value of the fraction property.
     * 
     */
    public float getFraction() {
        return fraction;
    }

    /**
     * Sets the value of the fraction property.
     * 
     */
    public void setFraction(float value) {
        this.fraction = value;
    }

    /**
     * Gets the value of the explanations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanations() {
        return explanations;
    }

    /**
     * Sets the value of the explanations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanations(String value) {
        this.explanations = value;
    }

}
