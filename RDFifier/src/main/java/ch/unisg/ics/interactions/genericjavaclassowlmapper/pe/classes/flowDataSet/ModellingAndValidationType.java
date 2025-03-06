
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.flowDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;


/**
 * <p>Java class for ModellingAndValidationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModellingAndValidationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LCIMethod" type="{http://lca.jrc.it/ILCD/Flow}LCIMethodType" minOccurs="0"/&gt;
 *         &lt;element name="complianceDeclarations" type="{http://lca.jrc.it/ILCD/Flow}ComplianceDeclarationsType" minOccurs="0"/&gt;
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
@XmlType(name = "ModellingAndValidationType", propOrder = {
    "lciMethod",
    "complianceDeclarations",
    "other"
})
public class ModellingAndValidationType {

    @XmlElement(name = "LCIMethod")
    protected LCIMethodType lciMethod;
    protected ComplianceDeclarationsType complianceDeclarations;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the lciMethod property.
     * 
     * @return
     *     possible object is
     *     {@link LCIMethodType }
     *     
     */
    public LCIMethodType getLCIMethod() {
        return lciMethod;
    }

    /**
     * Sets the value of the lciMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link LCIMethodType }
     *     
     */
    public void setLCIMethod(LCIMethodType value) {
        this.lciMethod = value;
    }

    /**
     * Gets the value of the complianceDeclarations property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceDeclarationsType }
     *     
     */
    public ComplianceDeclarationsType getComplianceDeclarations() {
        return complianceDeclarations;
    }

    /**
     * Sets the value of the complianceDeclarations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceDeclarationsType }
     *     
     */
    public void setComplianceDeclarations(ComplianceDeclarationsType value) {
        this.complianceDeclarations = value;
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
