
package com.example.sub_example.section.genericjavaclassowlmapper.uvek.classes.ImpactDataset;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains information about author(s), title, kind of publication, place of publication, name of editors (if any), etc..
 * 
 * <p>Java class for TSource complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSource"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="number" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TIndexNumber" /&gt;
 *       &lt;attribute name="sourceType" default="0"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="7"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="firstAuthor" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString40" /&gt;
 *       &lt;attribute name="additionalAuthors" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString255" /&gt;
 *       &lt;attribute name="year" use="required" type="{http://www.w3.org/2001/XMLSchema}gYear" /&gt;
 *       &lt;attribute name="title" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString32000" /&gt;
 *       &lt;attribute name="pageNumbers"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="15"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="nameOfEditors" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString40" /&gt;
 *       &lt;attribute name="titleOfAnthology" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString255" /&gt;
 *       &lt;attribute name="placeOfPublications" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString40" /&gt;
 *       &lt;attribute name="publisher" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString40" /&gt;
 *       &lt;attribute name="journal" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString40" /&gt;
 *       &lt;attribute name="volumeNo"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;pattern value="\d{1,3}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="issueNo" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString40" /&gt;
 *       &lt;attribute name="text" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString32000" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSource", namespace = "http://www.EcoInvent.org/EcoSpold01Impact")
public class TSource {

    @XmlAttribute(name = "number", required = true)
    protected int number;
    @XmlAttribute(name = "sourceType")
    protected Integer sourceType;
    @XmlAttribute(name = "firstAuthor", required = true)
    protected String firstAuthor;
    @XmlAttribute(name = "additionalAuthors")
    protected String additionalAuthors;
    @XmlAttribute(name = "year", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar year;
    @XmlAttribute(name = "title", required = true)
    protected String title;
    @XmlAttribute(name = "pageNumbers")
    protected String pageNumbers;
    @XmlAttribute(name = "nameOfEditors")
    protected String nameOfEditors;
    @XmlAttribute(name = "titleOfAnthology")
    protected String titleOfAnthology;
    @XmlAttribute(name = "placeOfPublications", required = true)
    protected String placeOfPublications;
    @XmlAttribute(name = "publisher")
    protected String publisher;
    @XmlAttribute(name = "journal")
    protected String journal;
    @XmlAttribute(name = "volumeNo")
    protected BigInteger volumeNo;
    @XmlAttribute(name = "issueNo")
    protected String issueNo;
    @XmlAttribute(name = "text")
    protected String text;

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSourceType() {
        if (sourceType == null) {
            return  0;
        } else {
            return sourceType;
        }
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSourceType(Integer value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the firstAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstAuthor() {
        return firstAuthor;
    }

    /**
     * Sets the value of the firstAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstAuthor(String value) {
        this.firstAuthor = value;
    }

    /**
     * Gets the value of the additionalAuthors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalAuthors() {
        return additionalAuthors;
    }

    /**
     * Sets the value of the additionalAuthors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalAuthors(String value) {
        this.additionalAuthors = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setYear(XMLGregorianCalendar value) {
        this.year = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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

    /**
     * Gets the value of the nameOfEditors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfEditors() {
        return nameOfEditors;
    }

    /**
     * Sets the value of the nameOfEditors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfEditors(String value) {
        this.nameOfEditors = value;
    }

    /**
     * Gets the value of the titleOfAnthology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleOfAnthology() {
        return titleOfAnthology;
    }

    /**
     * Sets the value of the titleOfAnthology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleOfAnthology(String value) {
        this.titleOfAnthology = value;
    }

    /**
     * Gets the value of the placeOfPublications property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceOfPublications() {
        return placeOfPublications;
    }

    /**
     * Sets the value of the placeOfPublications property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceOfPublications(String value) {
        this.placeOfPublications = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the journal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournal() {
        return journal;
    }

    /**
     * Sets the value of the journal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournal(String value) {
        this.journal = value;
    }

    /**
     * Gets the value of the volumeNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVolumeNo() {
        return volumeNo;
    }

    /**
     * Sets the value of the volumeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVolumeNo(BigInteger value) {
        this.volumeNo = value;
    }

    /**
     * Gets the value of the issueNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueNo() {
        return issueNo;
    }

    /**
     * Sets the value of the issueNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueNo(String value) {
        this.issueNo = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
