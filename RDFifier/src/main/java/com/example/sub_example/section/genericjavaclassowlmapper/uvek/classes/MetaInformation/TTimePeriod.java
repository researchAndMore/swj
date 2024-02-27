
package com.example.sub_example.section.genericjavaclassowlmapper.uvek.classes.MetaInformation;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains all possible date-formats applicable to describe start and end date of the time period for which the dataset is valid.
 * 
 * <p>Java class for TTimePeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTimePeriod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
 *           &lt;element name="startYearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *           &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
 *           &lt;element name="endYearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *           &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dataValidForEntirePeriod" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="text" type="{}TString32000" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTimePeriod", propOrder = {
    "startYear",
    "startYearMonth",
    "startDate",
    "endYear",
    "endYearMonth",
    "endDate"
})
public class TTimePeriod {

    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar startYear;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar startYearMonth;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar endYear;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar endYearMonth;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "dataValidForEntirePeriod", required = true)
    protected boolean dataValidForEntirePeriod;
    @XmlAttribute(name = "text")
    protected String text;

    /**
     * Gets the value of the startYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartYear() {
        return startYear;
    }

    /**
     * Sets the value of the startYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartYear(XMLGregorianCalendar value) {
        this.startYear = value;
    }

    /**
     * Gets the value of the startYearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartYearMonth() {
        return startYearMonth;
    }

    /**
     * Sets the value of the startYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartYearMonth(XMLGregorianCalendar value) {
        this.startYearMonth = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndYear() {
        return endYear;
    }

    /**
     * Sets the value of the endYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndYear(XMLGregorianCalendar value) {
        this.endYear = value;
    }

    /**
     * Gets the value of the endYearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndYearMonth() {
        return endYearMonth;
    }

    /**
     * Sets the value of the endYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndYearMonth(XMLGregorianCalendar value) {
        this.endYearMonth = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the dataValidForEntirePeriod property.
     * 
     */
    public boolean isDataValidForEntirePeriod() {
        return dataValidForEntirePeriod;
    }

    /**
     * Sets the value of the dataValidForEntirePeriod property.
     * 
     */
    public void setDataValidForEntirePeriod(boolean value) {
        this.dataValidForEntirePeriod = value;
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
