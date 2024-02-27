
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.contactDataSet;

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
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}shortName" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}name" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="classificationInformation" type="{http://lca.jrc.it/ILCD/Common}ClassificationInformationType" minOccurs="0"/&gt;
 *         &lt;element name="contactAddress" type="{http://lca.jrc.it/ILCD/Common}STMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="telephone" type="{http://lca.jrc.it/ILCD/Common}String" minOccurs="0"/&gt;
 *         &lt;element name="telefax" type="{http://lca.jrc.it/ILCD/Common}String" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://lca.jrc.it/ILCD/Common}String" minOccurs="0"/&gt;
 *         &lt;element name="WWWAddress" type="{http://lca.jrc.it/ILCD/Common}ST" minOccurs="0"/&gt;
 *         &lt;element name="centralContactPoint" type="{http://lca.jrc.it/ILCD/Common}STMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="contactDescriptionOrComment" type="{http://lca.jrc.it/ILCD/Common}STMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="referenceToContact" type="{http://lca.jrc.it/ILCD/Common}GlobalReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenceToLogo" type="{http://lca.jrc.it/ILCD/Common}GlobalReferenceType" minOccurs="0"/&gt;
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
@XmlType(name = "DataSetInformationType", namespace = "http://lca.jrc.it/ILCD/Contact", propOrder = {
    "uuid",
    "shortName",
    "name",
    "classificationInformation",
    "contactAddress",
    "telephone",
    "telefax",
    "email",
    "wwwAddress",
    "centralContactPoint",
    "contactDescriptionOrComment",
    "referenceToContact",
    "referenceToLogo",
    "other"
})
public class DataSetInformationType {

    @XmlElement(name = "UUID", namespace = "http://lca.jrc.it/ILCD/Common", required = true)
    protected String uuid;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected List<StringMultiLang> shortName;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected List<StringMultiLang> name;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Contact")
    protected ClassificationInformationType classificationInformation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Contact")
    protected List<STMultiLang> contactAddress;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Contact")
    protected String telephone;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Contact")
    protected String telefax;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Contact")
    protected String email;
    @XmlElement(name = "WWWAddress", namespace = "http://lca.jrc.it/ILCD/Contact")
    protected String wwwAddress;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Contact")
    protected List<STMultiLang> centralContactPoint;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Contact")
    protected List<STMultiLang> contactDescriptionOrComment;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Contact")
    protected List<GlobalReferenceType> referenceToContact;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Contact")
    protected GlobalReferenceType referenceToLogo;
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
     * Short name for the contact, that is used for display e.g. of links to this data set (especially in case the full name of the contact is rather long, e.g.
     *             "FAO" for "Food and Agriculture Organization").Gets the value of the shortName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringMultiLang }
     * 
     * 
     */
    public List<StringMultiLang> getShortName() {
        if (shortName == null) {
            shortName = new ArrayList<StringMultiLang>();
        }
        return this.shortName;
    }

    /**
     * Name of the person, working group, organisation, or database network, which is represented by this contact data set.Gets the value of the name property.
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
     * Gets the value of the contactAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STMultiLang }
     * 
     * 
     */
    public List<STMultiLang> getContactAddress() {
        if (contactAddress == null) {
            contactAddress = new ArrayList<STMultiLang>();
        }
        return this.contactAddress;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the telefax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefax() {
        return telefax;
    }

    /**
     * Sets the value of the telefax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefax(String value) {
        this.telefax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the wwwAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWWWAddress() {
        return wwwAddress;
    }

    /**
     * Sets the value of the wwwAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWWWAddress(String value) {
        this.wwwAddress = value;
    }

    /**
     * Gets the value of the centralContactPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the centralContactPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCentralContactPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STMultiLang }
     * 
     * 
     */
    public List<STMultiLang> getCentralContactPoint() {
        if (centralContactPoint == null) {
            centralContactPoint = new ArrayList<STMultiLang>();
        }
        return this.centralContactPoint;
    }

    /**
     * Gets the value of the contactDescriptionOrComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactDescriptionOrComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactDescriptionOrComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STMultiLang }
     * 
     * 
     */
    public List<STMultiLang> getContactDescriptionOrComment() {
        if (contactDescriptionOrComment == null) {
            contactDescriptionOrComment = new ArrayList<STMultiLang>();
        }
        return this.contactDescriptionOrComment;
    }

    /**
     * Gets the value of the referenceToContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceToContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceToContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalReferenceType }
     * 
     * 
     */
    public List<GlobalReferenceType> getReferenceToContact() {
        if (referenceToContact == null) {
            referenceToContact = new ArrayList<GlobalReferenceType>();
        }
        return this.referenceToContact;
    }

    /**
     * Gets the value of the referenceToLogo property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalReferenceType }
     *     
     */
    public GlobalReferenceType getReferenceToLogo() {
        return referenceToLogo;
    }

    /**
     * Sets the value of the referenceToLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalReferenceType }
     *     
     */
    public void setReferenceToLogo(GlobalReferenceType value) {
        this.referenceToLogo = value;
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
