
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 *         &lt;element name="useAdviceForDataSet" type="{http://lca.jrc.it/ILCD/Common}STMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="LCIAMethodNormalisationAndWeighting" type="{http://lca.jrc.it/ILCD/LCIAMethod}LCIAMethodNormalisationAndWeightingType" minOccurs="0"/&gt;
 *         &lt;element name="dataSources" type="{http://lca.jrc.it/ILCD/LCIAMethod}DataSourcesType" minOccurs="0"/&gt;
 *         &lt;element name="completeness" type="{http://lca.jrc.it/ILCD/LCIAMethod}CompletenessType" minOccurs="0"/&gt;
 *         &lt;element name="validation" type="{http://lca.jrc.it/ILCD/LCIAMethod}ValidationType" minOccurs="0"/&gt;
 *         &lt;element name="complianceDeclarations" type="{http://lca.jrc.it/ILCD/LCIAMethod}ComplianceDeclarationsType" minOccurs="0"/&gt;
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
@XmlType(name = "ModellingAndValidationType", namespace = "http://lca.jrc.it/ILCD/LCIAMethod", propOrder = {
    "useAdviceForDataSet",
    "lciaMethodNormalisationAndWeighting",
    "dataSources",
    "completeness",
    "validation",
    "complianceDeclarations",
    "other"
})
public class ModellingAndValidationType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<STMultiLang> useAdviceForDataSet;
    @XmlElement(name = "LCIAMethodNormalisationAndWeighting", namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected LCIAMethodNormalisationAndWeightingType lciaMethodNormalisationAndWeighting;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected DataSourcesType dataSources;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected CompletenessType completeness;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected ValidationType validation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected ComplianceDeclarationsType complianceDeclarations;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the useAdviceForDataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useAdviceForDataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseAdviceForDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STMultiLang }
     * 
     * 
     */
    public List<STMultiLang> getUseAdviceForDataSet() {
        if (useAdviceForDataSet == null) {
            useAdviceForDataSet = new ArrayList<STMultiLang>();
        }
        return this.useAdviceForDataSet;
    }

    /**
     * Gets the value of the lciaMethodNormalisationAndWeighting property.
     * 
     * @return
     *     possible object is
     *     {@link LCIAMethodNormalisationAndWeightingType }
     *     
     */
    public LCIAMethodNormalisationAndWeightingType getLCIAMethodNormalisationAndWeighting() {
        return lciaMethodNormalisationAndWeighting;
    }

    /**
     * Sets the value of the lciaMethodNormalisationAndWeighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link LCIAMethodNormalisationAndWeightingType }
     *     
     */
    public void setLCIAMethodNormalisationAndWeighting(LCIAMethodNormalisationAndWeightingType value) {
        this.lciaMethodNormalisationAndWeighting = value;
    }

    /**
     * Gets the value of the dataSources property.
     * 
     * @return
     *     possible object is
     *     {@link DataSourcesType }
     *     
     */
    public DataSourcesType getDataSources() {
        return dataSources;
    }

    /**
     * Sets the value of the dataSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSourcesType }
     *     
     */
    public void setDataSources(DataSourcesType value) {
        this.dataSources = value;
    }

    /**
     * Gets the value of the completeness property.
     * 
     * @return
     *     possible object is
     *     {@link CompletenessType }
     *     
     */
    public CompletenessType getCompleteness() {
        return completeness;
    }

    /**
     * Sets the value of the completeness property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletenessType }
     *     
     */
    public void setCompleteness(CompletenessType value) {
        this.completeness = value;
    }

    /**
     * Gets the value of the validation property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationType }
     *     
     */
    public ValidationType getValidation() {
        return validation;
    }

    /**
     * Sets the value of the validation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationType }
     *     
     */
    public void setValidation(ValidationType value) {
        this.validation = value;
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
