
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for LCIAMethodNormalisationAndWeightingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LCIAMethodNormalisationAndWeightingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeOfDataSet" type="{http://lca.jrc.it/ILCD/Common}TypeOfLCIAMethodValues" minOccurs="0"/&gt;
 *         &lt;element name="LCIAMethodPrinciple" type="{http://lca.jrc.it/ILCD/Common}LCIAMethodPrincipleValues" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="deviationsFromLCIAMethodPrinciple" type="{http://lca.jrc.it/ILCD/Common}FTMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="normalisation" type="{http://lca.jrc.it/ILCD/Common}boolean" minOccurs="0"/&gt;
 *         &lt;element name="referenceToUsableNormalisationDataSets" type="{http://lca.jrc.it/ILCD/Common}GlobalReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="normalisationDescription" type="{http://lca.jrc.it/ILCD/Common}STMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="referenceToIncludedNormalisationDataSets" type="{http://lca.jrc.it/ILCD/Common}GlobalReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="weighting" type="{http://lca.jrc.it/ILCD/Common}boolean" minOccurs="0"/&gt;
 *         &lt;element name="referenceToUsableWeightingDataSets" type="{http://lca.jrc.it/ILCD/Common}GlobalReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="weightingDescription" type="{http://lca.jrc.it/ILCD/Common}STMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element name="referenceToIncludedWeightingDataSets" type="{http://lca.jrc.it/ILCD/Common}GlobalReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LCIAMethodNormalisationAndWeightingType", namespace = "http://lca.jrc.it/ILCD/LCIAMethod", propOrder = {
    "typeOfDataSet",
    "lciaMethodPrinciple",
    "deviationsFromLCIAMethodPrinciple",
    "normalisation",
    "referenceToUsableNormalisationDataSets",
    "normalisationDescription",
    "referenceToIncludedNormalisationDataSets",
    "weighting",
    "referenceToUsableWeightingDataSets",
    "weightingDescription",
    "referenceToIncludedWeightingDataSets"
})
public class LCIAMethodNormalisationAndWeightingType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    @XmlSchemaType(name = "string")
    protected TypeOfLCIAMethodValues typeOfDataSet;
    @XmlElement(name = "LCIAMethodPrinciple", namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    @XmlSchemaType(name = "string")
    protected List<LCIAMethodPrincipleValues> lciaMethodPrinciple;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<FTMultiLang> deviationsFromLCIAMethodPrinciple;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected Boolean normalisation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<GlobalReferenceType> referenceToUsableNormalisationDataSets;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<STMultiLang> normalisationDescription;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<GlobalReferenceType> referenceToIncludedNormalisationDataSets;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected Boolean weighting;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<GlobalReferenceType> referenceToUsableWeightingDataSets;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<STMultiLang> weightingDescription;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<GlobalReferenceType> referenceToIncludedWeightingDataSets;

    /**
     * Gets the value of the typeOfDataSet property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfLCIAMethodValues }
     *     
     */
    public TypeOfLCIAMethodValues getTypeOfDataSet() {
        return typeOfDataSet;
    }

    /**
     * Sets the value of the typeOfDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfLCIAMethodValues }
     *     
     */
    public void setTypeOfDataSet(TypeOfLCIAMethodValues value) {
        this.typeOfDataSet = value;
    }

    /**
     * Gets the value of the lciaMethodPrinciple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lciaMethodPrinciple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLCIAMethodPrinciple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LCIAMethodPrincipleValues }
     * 
     * 
     */
    public List<LCIAMethodPrincipleValues> getLCIAMethodPrinciple() {
        if (lciaMethodPrinciple == null) {
            lciaMethodPrinciple = new ArrayList<LCIAMethodPrincipleValues>();
        }
        return this.lciaMethodPrinciple;
    }

    /**
     * Gets the value of the deviationsFromLCIAMethodPrinciple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviationsFromLCIAMethodPrinciple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviationsFromLCIAMethodPrinciple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTMultiLang }
     * 
     * 
     */
    public List<FTMultiLang> getDeviationsFromLCIAMethodPrinciple() {
        if (deviationsFromLCIAMethodPrinciple == null) {
            deviationsFromLCIAMethodPrinciple = new ArrayList<FTMultiLang>();
        }
        return this.deviationsFromLCIAMethodPrinciple;
    }

    /**
     * Gets the value of the normalisation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNormalisation() {
        return normalisation;
    }

    /**
     * Sets the value of the normalisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNormalisation(Boolean value) {
        this.normalisation = value;
    }

    /**
     * Gets the value of the referenceToUsableNormalisationDataSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceToUsableNormalisationDataSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceToUsableNormalisationDataSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalReferenceType }
     * 
     * 
     */
    public List<GlobalReferenceType> getReferenceToUsableNormalisationDataSets() {
        if (referenceToUsableNormalisationDataSets == null) {
            referenceToUsableNormalisationDataSets = new ArrayList<GlobalReferenceType>();
        }
        return this.referenceToUsableNormalisationDataSets;
    }

    /**
     * Gets the value of the normalisationDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the normalisationDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNormalisationDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STMultiLang }
     * 
     * 
     */
    public List<STMultiLang> getNormalisationDescription() {
        if (normalisationDescription == null) {
            normalisationDescription = new ArrayList<STMultiLang>();
        }
        return this.normalisationDescription;
    }

    /**
     * Gets the value of the referenceToIncludedNormalisationDataSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceToIncludedNormalisationDataSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceToIncludedNormalisationDataSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalReferenceType }
     * 
     * 
     */
    public List<GlobalReferenceType> getReferenceToIncludedNormalisationDataSets() {
        if (referenceToIncludedNormalisationDataSets == null) {
            referenceToIncludedNormalisationDataSets = new ArrayList<GlobalReferenceType>();
        }
        return this.referenceToIncludedNormalisationDataSets;
    }

    /**
     * Gets the value of the weighting property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWeighting() {
        return weighting;
    }

    /**
     * Sets the value of the weighting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWeighting(Boolean value) {
        this.weighting = value;
    }

    /**
     * Gets the value of the referenceToUsableWeightingDataSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceToUsableWeightingDataSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceToUsableWeightingDataSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalReferenceType }
     * 
     * 
     */
    public List<GlobalReferenceType> getReferenceToUsableWeightingDataSets() {
        if (referenceToUsableWeightingDataSets == null) {
            referenceToUsableWeightingDataSets = new ArrayList<GlobalReferenceType>();
        }
        return this.referenceToUsableWeightingDataSets;
    }

    /**
     * Gets the value of the weightingDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weightingDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeightingDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STMultiLang }
     * 
     * 
     */
    public List<STMultiLang> getWeightingDescription() {
        if (weightingDescription == null) {
            weightingDescription = new ArrayList<STMultiLang>();
        }
        return this.weightingDescription;
    }

    /**
     * Gets the value of the referenceToIncludedWeightingDataSets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceToIncludedWeightingDataSets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceToIncludedWeightingDataSets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalReferenceType }
     * 
     * 
     */
    public List<GlobalReferenceType> getReferenceToIncludedWeightingDataSets() {
        if (referenceToIncludedWeightingDataSets == null) {
            referenceToIncludedWeightingDataSets = new ArrayList<GlobalReferenceType>();
        }
        return this.referenceToIncludedWeightingDataSets;
    }

}
