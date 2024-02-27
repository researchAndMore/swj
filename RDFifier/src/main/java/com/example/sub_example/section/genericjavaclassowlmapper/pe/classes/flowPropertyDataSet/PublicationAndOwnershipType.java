
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.flowPropertyDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Java class for PublicationAndOwnershipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicationAndOwnershipType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://lca.jrc.it/ILCD/Common}PublicationAndOwnershipGroup1"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}referenceToOwnershipOfDataSet" minOccurs="0"/&gt;
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
@XmlType(name = "PublicationAndOwnershipType", namespace = "http://lca.jrc.it/ILCD/FlowProperty", propOrder = {
    "dataSetVersion",
    "referenceToPrecedingDataSetVersion",
    "permanentDataSetURI",
    "referenceToOwnershipOfDataSet",
    "other"
})
public class PublicationAndOwnershipType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common", required = true)
    protected String dataSetVersion;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected List<GlobalReferenceType> referenceToPrecedingDataSetVersion;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    @XmlSchemaType(name = "anyURI")
    protected String permanentDataSetURI;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected GlobalReferenceType referenceToOwnershipOfDataSet;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the dataSetVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSetVersion() {
        return dataSetVersion;
    }

    /**
     * Sets the value of the dataSetVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSetVersion(String value) {
        this.dataSetVersion = value;
    }

    /**
     * Gets the value of the referenceToPrecedingDataSetVersion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceToPrecedingDataSetVersion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceToPrecedingDataSetVersion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalReferenceType }
     * 
     * 
     */
    public List<GlobalReferenceType> getReferenceToPrecedingDataSetVersion() {
        if (referenceToPrecedingDataSetVersion == null) {
            referenceToPrecedingDataSetVersion = new ArrayList<GlobalReferenceType>();
        }
        return this.referenceToPrecedingDataSetVersion;
    }

    /**
     * Gets the value of the permanentDataSetURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermanentDataSetURI() {
        return permanentDataSetURI;
    }

    /**
     * Sets the value of the permanentDataSetURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermanentDataSetURI(String value) {
        this.permanentDataSetURI = value;
    }

    /**
     * "Contact data set" of the person or entity who owns this data set. (Note: this is not necessarily the publisher of the data set.)
     * 
     * @return
     *     possible object is
     *     {@link GlobalReferenceType }
     *     
     */
    public GlobalReferenceType getReferenceToOwnershipOfDataSet() {
        return referenceToOwnershipOfDataSet;
    }

    /**
     * Sets the value of the referenceToOwnershipOfDataSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalReferenceType }
     *     
     */
    public void setReferenceToOwnershipOfDataSet(GlobalReferenceType value) {
        this.referenceToOwnershipOfDataSet = value;
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
