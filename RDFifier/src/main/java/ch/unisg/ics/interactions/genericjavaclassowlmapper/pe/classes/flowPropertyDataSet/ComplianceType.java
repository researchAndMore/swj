
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.flowPropertyDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;


/**
 * <p>Java class for ComplianceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplianceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://lca.jrc.it/ILCD/Common}ComplianceGroup"/&gt;
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
@XmlType(name = "ComplianceType", namespace = "http://lca.jrc.it/ILCD/FlowProperty", propOrder = {
    "referenceToComplianceSystem",
    "approvalOfOverallCompliance"
})
public class ComplianceType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common", required = true)
    protected GlobalReferenceType referenceToComplianceSystem;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    @XmlSchemaType(name = "string")
    protected ComplianceValues approvalOfOverallCompliance;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the referenceToComplianceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalReferenceType }
     *     
     */
    public GlobalReferenceType getReferenceToComplianceSystem() {
        return referenceToComplianceSystem;
    }

    /**
     * Sets the value of the referenceToComplianceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalReferenceType }
     *     
     */
    public void setReferenceToComplianceSystem(GlobalReferenceType value) {
        this.referenceToComplianceSystem = value;
    }

    /**
     * Gets the value of the approvalOfOverallCompliance property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceValues }
     *     
     */
    public ComplianceValues getApprovalOfOverallCompliance() {
        return approvalOfOverallCompliance;
    }

    /**
     * Sets the value of the approvalOfOverallCompliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceValues }
     *     
     */
    public void setApprovalOfOverallCompliance(ComplianceValues value) {
        this.approvalOfOverallCompliance = value;
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
