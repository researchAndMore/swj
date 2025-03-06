
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>Java class for CompletenessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletenessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="completenessImpactCoverage" type="{http://lca.jrc.it/ILCD/Common}Perc" minOccurs="0"/&gt;
 *         &lt;element name="inventoryItems" type="{http://lca.jrc.it/ILCD/Common}Int6" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletenessType", namespace = "http://lca.jrc.it/ILCD/LCIAMethod", propOrder = {
    "completenessImpactCoverage",
    "inventoryItems"
})
public class CompletenessType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected BigDecimal completenessImpactCoverage;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected BigInteger inventoryItems;

    /**
     * Gets the value of the completenessImpactCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCompletenessImpactCoverage() {
        return completenessImpactCoverage;
    }

    /**
     * Sets the value of the completenessImpactCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCompletenessImpactCoverage(BigDecimal value) {
        this.completenessImpactCoverage = value;
    }

    /**
     * Gets the value of the inventoryItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInventoryItems() {
        return inventoryItems;
    }

    /**
     * Sets the value of the inventoryItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInventoryItems(BigInteger value) {
        this.inventoryItems = value;
    }

}
