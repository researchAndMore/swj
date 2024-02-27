
package com.example.sub_example.section.genericjavaclassowlmapper.uvek.classes.ImpactDataset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains information about who compiled for and entered data into the database. Furthermore contains information about kind of publication underlying the dataset and the accessibility of the dataset.
 * 
 * <p>Java class for TDataGeneratorAndPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDataGeneratorAndPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="person" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TIndexNumber" /&gt;
 *       &lt;attribute name="dataPublishedIn" default="0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="2"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="referenceToPublishedSource" type="{http://www.EcoInvent.org/EcoSpold01Impact}TIndexNumber" /&gt;
 *       &lt;attribute name="copyright" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="accessRestrictedTo"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="3"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="companyCode" type="{http://www.EcoInvent.org/EcoSpold01Impact}TCompanyCode" /&gt;
 *       &lt;attribute name="countryCode" type="{http://www.EcoInvent.org/EcoSpold01Impact}TISOCountryCode" /&gt;
 *       &lt;attribute name="pageNumbers" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString30" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDataGeneratorAndPublication", namespace = "http://www.EcoInvent.org/EcoSpold01Impact")
public class TDataGeneratorAndPublication {

    @XmlAttribute(name = "person", required = true)
    protected int person;
    @XmlAttribute(name = "dataPublishedIn")
    protected Integer dataPublishedIn;
    @XmlAttribute(name = "referenceToPublishedSource")
    protected Integer referenceToPublishedSource;
    @XmlAttribute(name = "copyright", required = true)
    protected boolean copyright;
    @XmlAttribute(name = "accessRestrictedTo")
    protected Integer accessRestrictedTo;
    @XmlAttribute(name = "companyCode")
    protected String companyCode;
    @XmlAttribute(name = "countryCode")
    protected TISOCountryCode countryCode;
    @XmlAttribute(name = "pageNumbers")
    protected String pageNumbers;

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
     * Gets the value of the dataPublishedIn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDataPublishedIn() {
        if (dataPublishedIn == null) {
            return  0;
        } else {
            return dataPublishedIn;
        }
    }

    /**
     * Sets the value of the dataPublishedIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataPublishedIn(Integer value) {
        this.dataPublishedIn = value;
    }

    /**
     * Gets the value of the referenceToPublishedSource property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferenceToPublishedSource() {
        return referenceToPublishedSource;
    }

    /**
     * Sets the value of the referenceToPublishedSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferenceToPublishedSource(Integer value) {
        this.referenceToPublishedSource = value;
    }

    /**
     * Gets the value of the copyright property.
     * 
     */
    public boolean isCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     */
    public void setCopyright(boolean value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the accessRestrictedTo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccessRestrictedTo() {
        return accessRestrictedTo;
    }

    /**
     * Sets the value of the accessRestrictedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccessRestrictedTo(Integer value) {
        this.accessRestrictedTo = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link TISOCountryCode }
     *     
     */
    public TISOCountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TISOCountryCode }
     *     
     */
    public void setCountryCode(TISOCountryCode value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the pageNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNumbers() {
        return pageNumbers;
    }

    /**
     * Sets the value of the pageNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNumbers(String value) {
        this.pageNumbers = value;
    }

}
