
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Java class for DataSetInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSetInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}UUID"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}name" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="methodology" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="classificationInformation" type="{http://lca.jrc.it/ILCD/Common}ClassificationInformationType" minOccurs="0"/&gt;
 *         &lt;element name="impactCategory" type="{http://lca.jrc.it/ILCD/Common}LCIAImpactCategoryValues" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="areaOfProtection" type="{http://lca.jrc.it/ILCD/Common}AreaOfProtectionValues" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="impactIndicator" type="{http://lca.jrc.it/ILCD/Common}String" minOccurs="0"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}generalComment" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="referenceToExternalDocumentation" type="{http://lca.jrc.it/ILCD/Common}GlobalReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DataSetInformationType", namespace = "http://lca.jrc.it/ILCD/LCIAMethod", propOrder = {
    "uuid",
    "name",
    "methodology",
    "classificationInformation",
    "impactCategory",
    "areaOfProtection",
    "impactIndicator",
    "generalComment",
    "referenceToExternalDocumentation",
    "other"
})
public class DataSetInformationType {

    @XmlElement(name = "UUID", namespace = "http://lca.jrc.it/ILCD/Common", required = true)
    protected String uuid;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected List<StringMultiLang> name;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<String> methodology;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected ClassificationInformationType classificationInformation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<String> impactCategory;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    @XmlSchemaType(name = "string")
    protected List<AreaOfProtectionValues> areaOfProtection;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected String impactIndicator;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected List<FTMultiLang> generalComment;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<GlobalReferenceType> referenceToExternalDocumentation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Automatically generated Universally Unique Identifier of this data set. Together with the "Data set version", the UUID uniquely identifies each data
     *             set.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * Name of the data set. Composed as follows "LCIA methodology short name; Impact category/ies; midpoint/endpoint; Impact indicator; Source short name". Not
     *             applicable components are left out. Examples: "Impacts2007+; Climate change; midpoint; Global Warming Potential; IPCC 2001"; "ABC 2006; Acidification; endpoint; Species
     *             diversity loss; John Doe 2006"; "My-indicator2009; combined; endpoint; Ecopoints; various"Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringMultiLang }
     * 
     * 
     */
    public List<StringMultiLang> getName() {
        if (name == null) {
            name = new ArrayList<StringMultiLang>();
        }
        return this.name;
    }

    /**
     * Gets the value of the methodology property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the methodology property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodology().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMethodology() {
        if (methodology == null) {
            methodology = new ArrayList<String>();
        }
        return this.methodology;
    }

    /**
     * Gets the value of the classificationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationInformationType }
     *     
     */
    public ClassificationInformationType getClassificationInformation() {
        return classificationInformation;
    }

    /**
     * Sets the value of the classificationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationInformationType }
     *     
     */
    public void setClassificationInformation(ClassificationInformationType value) {
        this.classificationInformation = value;
    }

    /**
     * Gets the value of the impactCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impactCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpactCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImpactCategory() {
        if (impactCategory == null) {
            impactCategory = new ArrayList<String>();
        }
        return this.impactCategory;
    }

    /**
     * Gets the value of the areaOfProtection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaOfProtection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaOfProtection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AreaOfProtectionValues }
     * 
     * 
     */
    public List<AreaOfProtectionValues> getAreaOfProtection() {
        if (areaOfProtection == null) {
            areaOfProtection = new ArrayList<AreaOfProtectionValues>();
        }
        return this.areaOfProtection;
    }

    /**
     * Gets the value of the impactIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpactIndicator() {
        return impactIndicator;
    }

    /**
     * Sets the value of the impactIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpactIndicator(String value) {
        this.impactIndicator = value;
    }

    /**
     * General information about the data set, including e.g. general (internal, not reviewed) quality statements as well as information sources used. (Note: Please also check the more specific fields e.g. on "Intended application", "Advice on data set use" and the fields in the "Modelling and validation" section to avoid overlapping entries.) Gets the value of the generalComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTMultiLang }
     * 
     * 
     */
    public List<FTMultiLang> getGeneralComment() {
        if (generalComment == null) {
            generalComment = new ArrayList<FTMultiLang>();
        }
        return this.generalComment;
    }

    /**
     * Gets the value of the referenceToExternalDocumentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceToExternalDocumentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceToExternalDocumentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalReferenceType }
     * 
     * 
     */
    public List<GlobalReferenceType> getReferenceToExternalDocumentation() {
        if (referenceToExternalDocumentation == null) {
            referenceToExternalDocumentation = new ArrayList<GlobalReferenceType>();
        }
        return this.referenceToExternalDocumentation;
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
