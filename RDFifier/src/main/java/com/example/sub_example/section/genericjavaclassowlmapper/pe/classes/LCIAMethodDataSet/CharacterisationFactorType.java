
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Java class for CharacterisationFactorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacterisationFactorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceToFlowDataSet" type="{http://lca.jrc.it/ILCD/Common}GlobalReferenceType"/&gt;
 *         &lt;element name="location" type="{http://lca.jrc.it/ILCD/Common}String" minOccurs="0"/&gt;
 *         &lt;element name="exchangeDirection" type="{http://lca.jrc.it/ILCD/Common}ExchangeDirectionValues"/&gt;
 *         &lt;element name="meanValue" type="{http://lca.jrc.it/ILCD/Common}Real"/&gt;
 *         &lt;element name="minimumValue" type="{http://lca.jrc.it/ILCD/Common}Real" minOccurs="0"/&gt;
 *         &lt;element name="maximumValue" type="{http://lca.jrc.it/ILCD/Common}Real" minOccurs="0"/&gt;
 *         &lt;element name="uncertaintyDistributionType" type="{http://lca.jrc.it/ILCD/Common}UncertaintyDistributionTypeValues" minOccurs="0"/&gt;
 *         &lt;element name="relativeStandardDeviation95In" type="{http://lca.jrc.it/ILCD/Common}Perc" minOccurs="0"/&gt;
 *         &lt;element name="dataDerivationTypeStatus" type="{http://lca.jrc.it/ILCD/Common}DataDerivationTypeStatusValues" minOccurs="0"/&gt;
 *         &lt;element name="deviatingRecommendation" type="{http://lca.jrc.it/ILCD/Common}RecommendationLevelValues" minOccurs="0"/&gt;
 *         &lt;element name="referencesToDataSource" type="{http://lca.jrc.it/ILCD/LCIAMethod}ReferencesToDataSourceType" minOccurs="0"/&gt;
 *         &lt;element name="generalComment" type="{http://lca.jrc.it/ILCD/Common}StringMultiLang" maxOccurs="100" minOccurs="0"/&gt;
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
@XmlType(name = "CharacterisationFactorType", namespace = "http://lca.jrc.it/ILCD/LCIAMethod", propOrder = {
    "referenceToFlowDataSet",
    "location",
    "exchangeDirection",
    "meanValue",
    "minimumValue",
    "maximumValue",
    "uncertaintyDistributionType",
    "relativeStandardDeviation95In",
    "dataDerivationTypeStatus",
    "deviatingRecommendation",
    "referencesToDataSource",
    "generalComment",
    "other"
})
public class CharacterisationFactorType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod", required = true)
    protected GlobalReferenceType referenceToFlowDataSet;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected String location;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod", required = true)
    @XmlSchemaType(name = "string")
    protected ExchangeDirectionValues exchangeDirection;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected double meanValue;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected Double minimumValue;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected Double maximumValue;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    @XmlSchemaType(name = "string")
    protected UncertaintyDistributionTypeValues uncertaintyDistributionType;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected BigDecimal relativeStandardDeviation95In;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    @XmlSchemaType(name = "string")
    protected DataDerivationTypeStatusValues dataDerivationTypeStatus;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    @XmlSchemaType(name = "string")
    protected RecommendationLevelValues deviatingRecommendation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected ReferencesToDataSourceType referencesToDataSource;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<StringMultiLang> generalComment;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the referenceToFlowDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalReferenceType }
     *     
     */
    public GlobalReferenceType getReferenceToFlowDataSet() {
        return referenceToFlowDataSet;
    }

    /**
     * Sets the value of the referenceToFlowDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalReferenceType }
     *     
     */
    public void setReferenceToFlowDataSet(GlobalReferenceType value) {
        this.referenceToFlowDataSet = value;
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
     * Gets the value of the exchangeDirection property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeDirectionValues }
     *     
     */
    public ExchangeDirectionValues getExchangeDirection() {
        return exchangeDirection;
    }

    /**
     * Sets the value of the exchangeDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeDirectionValues }
     *     
     */
    public void setExchangeDirection(ExchangeDirectionValues value) {
        this.exchangeDirection = value;
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
     * Gets the value of the minimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimumValue() {
        return minimumValue;
    }

    /**
     * Sets the value of the minimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumValue(Double value) {
        this.minimumValue = value;
    }

    /**
     * Gets the value of the maximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumValue() {
        return maximumValue;
    }

    /**
     * Sets the value of the maximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumValue(Double value) {
        this.maximumValue = value;
    }

    /**
     * Gets the value of the uncertaintyDistributionType property.
     * 
     * @return
     *     possible object is
     *     {@link UncertaintyDistributionTypeValues }
     *     
     */
    public UncertaintyDistributionTypeValues getUncertaintyDistributionType() {
        return uncertaintyDistributionType;
    }

    /**
     * Sets the value of the uncertaintyDistributionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncertaintyDistributionTypeValues }
     *     
     */
    public void setUncertaintyDistributionType(UncertaintyDistributionTypeValues value) {
        this.uncertaintyDistributionType = value;
    }

    /**
     * Gets the value of the relativeStandardDeviation95In property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRelativeStandardDeviation95In() {
        return relativeStandardDeviation95In;
    }

    /**
     * Sets the value of the relativeStandardDeviation95In property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRelativeStandardDeviation95In(BigDecimal value) {
        this.relativeStandardDeviation95In = value;
    }

    /**
     * Gets the value of the dataDerivationTypeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DataDerivationTypeStatusValues }
     *     
     */
    public DataDerivationTypeStatusValues getDataDerivationTypeStatus() {
        return dataDerivationTypeStatus;
    }

    /**
     * Sets the value of the dataDerivationTypeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataDerivationTypeStatusValues }
     *     
     */
    public void setDataDerivationTypeStatus(DataDerivationTypeStatusValues value) {
        this.dataDerivationTypeStatus = value;
    }

    /**
     * Gets the value of the deviatingRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendationLevelValues }
     *     
     */
    public RecommendationLevelValues getDeviatingRecommendation() {
        return deviatingRecommendation;
    }

    /**
     * Sets the value of the deviatingRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendationLevelValues }
     *     
     */
    public void setDeviatingRecommendation(RecommendationLevelValues value) {
        this.deviatingRecommendation = value;
    }

    /**
     * Gets the value of the referencesToDataSource property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencesToDataSourceType }
     *     
     */
    public ReferencesToDataSourceType getReferencesToDataSource() {
        return referencesToDataSource;
    }

    /**
     * Sets the value of the referencesToDataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencesToDataSourceType }
     *     
     */
    public void setReferencesToDataSource(ReferencesToDataSourceType value) {
        this.referencesToDataSource = value;
    }

    /**
     * Gets the value of the generalComment property.
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
     * {@link StringMultiLang }
     * 
     * 
     */
    public List<StringMultiLang> getGeneralComment() {
        if (generalComment == null) {
            generalComment = new ArrayList<StringMultiLang>();
        }
        return this.generalComment;
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
