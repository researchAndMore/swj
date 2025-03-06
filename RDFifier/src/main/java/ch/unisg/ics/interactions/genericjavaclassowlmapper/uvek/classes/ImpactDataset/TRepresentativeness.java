
package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.ImpactDataset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains information about the fraction of the relevant market supplied by the product/service described in the dataset. Information about market share, production volume (in the ecoinvent quality network: also consumption volume in the market area) and information about how data have been sampled.
 * 
 * <p>Java class for TRepresentativeness complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRepresentativeness"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="percent"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.EcoInvent.org/EcoSpold01Impact}TPercent"&gt;
 *             &lt;maxInclusive value="100.0"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="productionVolume" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString80" /&gt;
 *       &lt;attribute name="samplingProcedure" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString32000" /&gt;
 *       &lt;attribute name="extrapolations" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString32000" /&gt;
 *       &lt;attribute name="uncertaintyAdjustments" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString32000" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRepresentativeness", namespace = "http://www.EcoInvent.org/EcoSpold01Impact")
public class TRepresentativeness {

    @XmlAttribute(name = "percent")
    protected Float percent;
    @XmlAttribute(name = "productionVolume")
    protected String productionVolume;
    @XmlAttribute(name = "samplingProcedure")
    protected String samplingProcedure;
    @XmlAttribute(name = "extrapolations")
    protected String extrapolations;
    @XmlAttribute(name = "uncertaintyAdjustments")
    protected String uncertaintyAdjustments;

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPercent(Float value) {
        this.percent = value;
    }

    /**
     * Gets the value of the productionVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionVolume() {
        return productionVolume;
    }

    /**
     * Sets the value of the productionVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionVolume(String value) {
        this.productionVolume = value;
    }

    /**
     * Gets the value of the samplingProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplingProcedure() {
        return samplingProcedure;
    }

    /**
     * Sets the value of the samplingProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplingProcedure(String value) {
        this.samplingProcedure = value;
    }

    /**
     * Gets the value of the extrapolations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtrapolations() {
        return extrapolations;
    }

    /**
     * Sets the value of the extrapolations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtrapolations(String value) {
        this.extrapolations = value;
    }

    /**
     * Gets the value of the uncertaintyAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUncertaintyAdjustments() {
        return uncertaintyAdjustments;
    }

    /**
     * Sets the value of the uncertaintyAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUncertaintyAdjustments(String value) {
        this.uncertaintyAdjustments = value;
    }

}
