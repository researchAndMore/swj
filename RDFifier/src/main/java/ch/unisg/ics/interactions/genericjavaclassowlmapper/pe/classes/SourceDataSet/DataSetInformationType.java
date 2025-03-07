
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.SourceDataSet;

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
 *         &lt;element name="classificationInformation" type="{http://lca.jrc.it/ILCD/Common}ClassificationInformationType" minOccurs="0"/&gt;
 *         &lt;element name="sourceCitation" type="{http://lca.jrc.it/ILCD/Common}ST" minOccurs="0"/&gt;
 *         &lt;element name="publicationType" type="{http://lca.jrc.it/ILCD/Common}PublicationTypeValues" minOccurs="0"/&gt;
 *         &lt;element name="sourceDescriptionOrComment" type="{http://lca.jrc.it/ILCD/Common}FTMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="referenceToDigitalFile" type="{http://lca.jrc.it/ILCD/Source}ReferenceToDigitalFileType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "DataSetInformationType", namespace = "http://lca.jrc.it/ILCD/Source", propOrder = {
    "uuid",
    "shortName",
    "classificationInformation",
    "sourceCitation",
    "publicationType",
    "sourceDescriptionOrComment",
    "referenceToDigitalFile",
    "referenceToContact",
    "referenceToLogo",
    "other"
})
public class DataSetInformationType {

    @XmlElement(name = "UUID", namespace = "http://lca.jrc.it/ILCD/Common", required = true)
    protected String uuid;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected List<StringMultiLang> shortName;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Source")
    protected ClassificationInformationType classificationInformation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Source")
    protected String sourceCitation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Source")
    @XmlSchemaType(name = "string")
    protected PublicationTypeValues publicationType;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Source")
    protected List<FTMultiLang> sourceDescriptionOrComment;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Source")
    protected List<ReferenceToDigitalFileType> referenceToDigitalFile;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Source")
    protected List<GlobalReferenceType> referenceToContact;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Source")
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
     * Short name for the "Source citation", i.e. for the bibliographical reference or reference to internal data sources used.Gets the value of the shortName property.
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
     * Gets the value of the sourceCitation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCitation() {
        return sourceCitation;
    }

    /**
     * Sets the value of the sourceCitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCitation(String value) {
        this.sourceCitation = value;
    }

    /**
     * Gets the value of the publicationType property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationTypeValues }
     *     
     */
    public PublicationTypeValues getPublicationType() {
        return publicationType;
    }

    /**
     * Sets the value of the publicationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationTypeValues }
     *     
     */
    public void setPublicationType(PublicationTypeValues value) {
        this.publicationType = value;
    }

    /**
     * Gets the value of the sourceDescriptionOrComment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceDescriptionOrComment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceDescriptionOrComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTMultiLang }
     * 
     * 
     */
    public List<FTMultiLang> getSourceDescriptionOrComment() {
        if (sourceDescriptionOrComment == null) {
            sourceDescriptionOrComment = new ArrayList<FTMultiLang>();
        }
        return this.sourceDescriptionOrComment;
    }

    /**
     * Gets the value of the referenceToDigitalFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceToDigitalFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceToDigitalFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceToDigitalFileType }
     * 
     * 
     */
    public List<ReferenceToDigitalFileType> getReferenceToDigitalFile() {
        if (referenceToDigitalFile == null) {
            referenceToDigitalFile = new ArrayList<ReferenceToDigitalFileType>();
        }
        return this.referenceToDigitalFile;
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
