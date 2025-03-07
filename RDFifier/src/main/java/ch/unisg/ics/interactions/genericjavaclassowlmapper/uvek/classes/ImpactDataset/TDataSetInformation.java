
package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.ImpactDataset;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains the administrative information about the dataset at issue: type of dataset (unit process, elementary flow, impact category, multi-output process) timestamp, version and internalVersion number as well as language and localLanguage code.
 * 
 * <p>Java class for TDataSetInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDataSetInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="type" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="5"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="impactAssessmentResult" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="timestamp" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="version" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *             &lt;pattern value="\d{1,2} ?\.?\d{0,2}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="internalVersion" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float"&gt;
 *             &lt;pattern value="\d{1,2}\.\d{1,2}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="energyValues" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="languageCode" type="{http://www.EcoInvent.org/EcoSpold01Impact}TISOLanguageCode" default="en" /&gt;
 *       &lt;attribute name="localLanguageCode" type="{http://www.EcoInvent.org/EcoSpold01Impact}TISOLanguageCode" default="de" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDataSetInformation", namespace = "http://www.EcoInvent.org/EcoSpold01Impact")
public class TDataSetInformation {

    @XmlAttribute(name = "type", required = true)
    protected int type;
    @XmlAttribute(name = "impactAssessmentResult", required = true)
    protected boolean impactAssessmentResult;
    @XmlAttribute(name = "timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "version", required = true)
    protected float version;
    @XmlAttribute(name = "internalVersion", required = true)
    protected float internalVersion;
    @XmlAttribute(name = "energyValues", required = true)
    protected int energyValues;
    @XmlAttribute(name = "languageCode")
    protected TISOLanguageCode languageCode;
    @XmlAttribute(name = "localLanguageCode")
    protected TISOLanguageCode localLanguageCode;

    /**
     * Gets the value of the type property.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Gets the value of the impactAssessmentResult property.
     * 
     */
    public boolean isImpactAssessmentResult() {
        return impactAssessmentResult;
    }

    /**
     * Sets the value of the impactAssessmentResult property.
     * 
     */
    public void setImpactAssessmentResult(boolean value) {
        this.impactAssessmentResult = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the version property.
     * 
     */
    public float getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(float value) {
        this.version = value;
    }

    /**
     * Gets the value of the internalVersion property.
     * 
     */
    public float getInternalVersion() {
        return internalVersion;
    }

    /**
     * Sets the value of the internalVersion property.
     * 
     */
    public void setInternalVersion(float value) {
        this.internalVersion = value;
    }

    /**
     * Gets the value of the energyValues property.
     * 
     */
    public int getEnergyValues() {
        return energyValues;
    }

    /**
     * Sets the value of the energyValues property.
     * 
     */
    public void setEnergyValues(int value) {
        this.energyValues = value;
    }

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link TISOLanguageCode }
     *     
     */
    public TISOLanguageCode getLanguageCode() {
        if (languageCode == null) {
            return TISOLanguageCode.EN;
        } else {
            return languageCode;
        }
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TISOLanguageCode }
     *     
     */
    public void setLanguageCode(TISOLanguageCode value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the localLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link TISOLanguageCode }
     *     
     */
    public TISOLanguageCode getLocalLanguageCode() {
        if (localLanguageCode == null) {
            return TISOLanguageCode.DE;
        } else {
            return localLanguageCode;
        }
    }

    /**
     * Sets the value of the localLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TISOLanguageCode }
     *     
     */
    public void setLocalLanguageCode(TISOLanguageCode value) {
        this.localLanguageCode = value;
    }

}
