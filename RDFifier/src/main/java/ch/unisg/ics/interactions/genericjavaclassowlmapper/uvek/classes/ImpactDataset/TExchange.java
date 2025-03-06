
package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.ImpactDataset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Comprises all inputs and outputs (both elementary flows and intermediate product flows) recorded in a unit process and its related information.
 * 
 * <p>Java class for TExchange complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TExchange"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="inputGroup"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="outputGroup"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="number" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TIndexNumber" /&gt;
 *       &lt;attribute name="category" type="{http://www.EcoInvent.org/EcoSpold01Impact}TCategoryName" /&gt;
 *       &lt;attribute name="subCategory" type="{http://www.EcoInvent.org/EcoSpold01Impact}TCategoryName" /&gt;
 *       &lt;attribute name="localCategory" type="{http://www.EcoInvent.org/EcoSpold01Impact}TCategoryName" /&gt;
 *       &lt;attribute name="localSubCategory" type="{http://www.EcoInvent.org/EcoSpold01Impact}TCategoryName" /&gt;
 *       &lt;attribute name="CASNumber"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;length value="11"/&gt;
 *             &lt;pattern value="\d{6,6}-\d{2,2}-\d"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString80" /&gt;
 *       &lt;attribute name="location" type="{http://www.EcoInvent.org/EcoSpold01Impact}TRegionalCode" /&gt;
 *       &lt;attribute name="unit" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TUnit" /&gt;
 *       &lt;attribute name="meanValue" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TFloatNumber" /&gt;
 *       &lt;attribute name="uncertaintyType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *             &lt;minInclusive value="0"/&gt;
 *             &lt;maxInclusive value="4"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="standardDeviation95" type="{http://www.EcoInvent.org/EcoSpold01Impact}TFloatNumber" /&gt;
 *       &lt;attribute name="formula" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString40" /&gt;
 *       &lt;attribute name="referenceToSource" type="{http://www.EcoInvent.org/EcoSpold01Impact}TIndexNumber" /&gt;
 *       &lt;attribute name="pageNumbers" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString30" /&gt;
 *       &lt;attribute name="generalComment" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString32000" /&gt;
 *       &lt;attribute name="localName" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString80" /&gt;
 *       &lt;attribute name="infrastructureProcess" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="minValue" type="{http://www.EcoInvent.org/EcoSpold01Impact}TFloatNumber" /&gt;
 *       &lt;attribute name="maxValue" type="{http://www.EcoInvent.org/EcoSpold01Impact}TFloatNumber" /&gt;
 *       &lt;attribute name="mostLikelyValue" type="{http://www.EcoInvent.org/EcoSpold01Impact}TFloatNumber" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TExchange", namespace = "http://www.EcoInvent.org/EcoSpold01Impact", propOrder = {
    "inputGroup",
    "outputGroup"
})
public class TExchange {

    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01Impact")
    protected Integer inputGroup;
    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01Impact")
    protected Integer outputGroup;
    @XmlAttribute(name = "number", required = true)
    protected int number;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "subCategory")
    protected String subCategory;
    @XmlAttribute(name = "localCategory")
    protected String localCategory;
    @XmlAttribute(name = "localSubCategory")
    protected String localSubCategory;
    @XmlAttribute(name = "CASNumber")
    protected String casNumber;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "location")
    protected String location;
    @XmlAttribute(name = "unit", required = true)
    protected String unit;
    @XmlAttribute(name = "meanValue", required = true)
    protected double meanValue;
    @XmlAttribute(name = "uncertaintyType")
    protected Integer uncertaintyType;
    @XmlAttribute(name = "standardDeviation95")
    protected Double standardDeviation95;
    @XmlAttribute(name = "formula")
    protected String formula;
    @XmlAttribute(name = "referenceToSource")
    protected Integer referenceToSource;
    @XmlAttribute(name = "pageNumbers")
    protected String pageNumbers;
    @XmlAttribute(name = "generalComment")
    protected String generalComment;
    @XmlAttribute(name = "localName")
    protected String localName;
    @XmlAttribute(name = "infrastructureProcess")
    protected Boolean infrastructureProcess;
    @XmlAttribute(name = "minValue")
    protected Double minValue;
    @XmlAttribute(name = "maxValue")
    protected Double maxValue;
    @XmlAttribute(name = "mostLikelyValue")
    protected Double mostLikelyValue;

    /**
     * Gets the value of the inputGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInputGroup() {
        return inputGroup;
    }

    /**
     * Sets the value of the inputGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInputGroup(Integer value) {
        this.inputGroup = value;
    }

    /**
     * Gets the value of the outputGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutputGroup() {
        return outputGroup;
    }

    /**
     * Sets the value of the outputGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutputGroup(Integer value) {
        this.outputGroup = value;
    }

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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the subCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCategory() {
        return subCategory;
    }

    /**
     * Sets the value of the subCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCategory(String value) {
        this.subCategory = value;
    }

    /**
     * Gets the value of the localCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalCategory() {
        return localCategory;
    }

    /**
     * Sets the value of the localCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalCategory(String value) {
        this.localCategory = value;
    }

    /**
     * Gets the value of the localSubCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalSubCategory() {
        return localSubCategory;
    }

    /**
     * Sets the value of the localSubCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalSubCategory(String value) {
        this.localSubCategory = value;
    }

    /**
     * Gets the value of the casNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCASNumber() {
        return casNumber;
    }

    /**
     * Sets the value of the casNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCASNumber(String value) {
        this.casNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the meanValue property.
     * 
     */
    public double getMeanValue() {
        return meanValue;
    }

    /**
     * Sets the value of the meanValue property.
     * 
     */
    public void setMeanValue(double value) {
        this.meanValue = value;
    }

    /**
     * Gets the value of the uncertaintyType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUncertaintyType() {
        return uncertaintyType;
    }

    /**
     * Sets the value of the uncertaintyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUncertaintyType(Integer value) {
        this.uncertaintyType = value;
    }

    /**
     * Gets the value of the standardDeviation95 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getStandardDeviation95() {
        return standardDeviation95;
    }

    /**
     * Sets the value of the standardDeviation95 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setStandardDeviation95(Double value) {
        this.standardDeviation95 = value;
    }

    /**
     * Gets the value of the formula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Sets the value of the formula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormula(String value) {
        this.formula = value;
    }

    /**
     * Gets the value of the referenceToSource property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReferenceToSource() {
        return referenceToSource;
    }

    /**
     * Sets the value of the referenceToSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReferenceToSource(Integer value) {
        this.referenceToSource = value;
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
     * Gets the value of the generalComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralComment() {
        return generalComment;
    }

    /**
     * Sets the value of the generalComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralComment(String value) {
        this.generalComment = value;
    }

    /**
     * Gets the value of the localName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalName() {
        return localName;
    }

    /**
     * Sets the value of the localName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalName(String value) {
        this.localName = value;
    }

    /**
     * Gets the value of the infrastructureProcess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInfrastructureProcess() {
        return infrastructureProcess;
    }

    /**
     * Sets the value of the infrastructureProcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInfrastructureProcess(Boolean value) {
        this.infrastructureProcess = value;
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinValue(Double value) {
        this.minValue = value;
    }

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaxValue(Double value) {
        this.maxValue = value;
    }

    /**
     * Gets the value of the mostLikelyValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMostLikelyValue() {
        return mostLikelyValue;
    }

    /**
     * Sets the value of the mostLikelyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMostLikelyValue(Double value) {
        this.mostLikelyValue = value;
    }

}
