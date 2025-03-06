
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for RecommendationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecommendationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceToEntity" type="{http://lca.jrc.it/ILCD/Common}GlobalReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="level" type="{http://lca.jrc.it/ILCD/Common}RecommendationLevelValues" minOccurs="0"/&gt;
 *         &lt;element name="meaning" type="{http://lca.jrc.it/ILCD/Common}FTMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecommendationType", namespace = "http://lca.jrc.it/ILCD/LCIAMethod", propOrder = {
    "referenceToEntity",
    "level",
    "meaning"
})
public class RecommendationType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<GlobalReferenceType> referenceToEntity;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    @XmlSchemaType(name = "string")
    protected RecommendationLevelValues level;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<FTMultiLang> meaning;

    /**
     * Gets the value of the referenceToEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceToEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceToEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalReferenceType }
     * 
     * 
     */
    public List<GlobalReferenceType> getReferenceToEntity() {
        if (referenceToEntity == null) {
            referenceToEntity = new ArrayList<GlobalReferenceType>();
        }
        return this.referenceToEntity;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link RecommendationLevelValues }
     *     
     */
    public RecommendationLevelValues getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecommendationLevelValues }
     *     
     */
    public void setLevel(RecommendationLevelValues value) {
        this.level = value;
    }

    /**
     * Gets the value of the meaning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meaning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeaning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTMultiLang }
     * 
     * 
     */
    public List<FTMultiLang> getMeaning() {
        if (meaning == null) {
            meaning = new ArrayList<FTMultiLang>();
        }
        return this.meaning;
    }

}
