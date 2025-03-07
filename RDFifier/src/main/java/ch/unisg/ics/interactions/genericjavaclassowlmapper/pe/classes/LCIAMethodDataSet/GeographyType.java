
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Java class for GeographyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="interventionLocation" type="{http://lca.jrc.it/ILCD/Common}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="interventionSubLocation" type="{http://lca.jrc.it/ILCD/Common}LocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="impactLocation" type="{http://lca.jrc.it/ILCD/Common}LocationType" minOccurs="0"/&gt;
 *         &lt;element name="geographicalRepresentativenessDescription" type="{http://lca.jrc.it/ILCD/Common}FTMultiLang" maxOccurs="100" minOccurs="0"/&gt;
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
@XmlType(name = "GeographyType", namespace = "http://lca.jrc.it/ILCD/LCIAMethod", propOrder = {
    "interventionLocation",
    "interventionSubLocation",
    "impactLocation",
    "geographicalRepresentativenessDescription",
    "other"
})
public class GeographyType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected LocationType interventionLocation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<LocationType> interventionSubLocation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected LocationType impactLocation;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
    protected List<FTMultiLang> geographicalRepresentativenessDescription;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the interventionLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getInterventionLocation() {
        return interventionLocation;
    }

    /**
     * Sets the value of the interventionLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setInterventionLocation(LocationType value) {
        this.interventionLocation = value;
    }

    /**
     * Gets the value of the interventionSubLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interventionSubLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterventionSubLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getInterventionSubLocation() {
        if (interventionSubLocation == null) {
            interventionSubLocation = new ArrayList<LocationType>();
        }
        return this.interventionSubLocation;
    }

    /**
     * Gets the value of the impactLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getImpactLocation() {
        return impactLocation;
    }

    /**
     * Sets the value of the impactLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setImpactLocation(LocationType value) {
        this.impactLocation = value;
    }

    /**
     * Gets the value of the geographicalRepresentativenessDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicalRepresentativenessDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicalRepresentativenessDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTMultiLang }
     * 
     * 
     */
    public List<FTMultiLang> getGeographicalRepresentativenessDescription() {
        if (geographicalRepresentativenessDescription == null) {
            geographicalRepresentativenessDescription = new ArrayList<FTMultiLang>();
        }
        return this.geographicalRepresentativenessDescription;
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
