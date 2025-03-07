
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.UnitGroupDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Java class for UnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://lca.jrc.it/ILCD/Common}String"/&gt;
 *         &lt;element name="meanValue" type="{http://lca.jrc.it/ILCD/Common}Real"/&gt;
 *         &lt;element name="generalComment" type="{http://lca.jrc.it/ILCD/Common}StringMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}other" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dataSetInternalID" type="{http://lca.jrc.it/ILCD/Common}Int5" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitType", namespace = "http://lca.jrc.it/ILCD/UnitGroup", propOrder = {
    "name",
    "meanValue",
    "generalComment",
    "other"
})
public class UnitType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/UnitGroup", required = true)
    protected String name;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/UnitGroup")
    protected double meanValue;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/UnitGroup")
    protected List<StringMultiLang> generalComment;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAttribute(name = "dataSetInternalID")
    protected BigInteger dataSetInternalID;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

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
     * Gets the value of the dataSetInternalID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataSetInternalID() {
        return dataSetInternalID;
    }

    /**
     * Sets the value of the dataSetInternalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDataSetInternalID(BigInteger value) {
        this.dataSetInternalID = value;
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
