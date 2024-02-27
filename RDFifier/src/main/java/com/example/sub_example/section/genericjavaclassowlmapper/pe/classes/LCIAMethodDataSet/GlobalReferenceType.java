
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Represents a reference to another dataset or file. Either refObjectId and version, or uri, or both have to be specified.
 * 
 * <p>Java class for GlobalReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GlobalReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subReference" type="{http://lca.jrc.it/ILCD/Common}String" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="shortDescription" type="{http://lca.jrc.it/ILCD/Common}STMultiLang" maxOccurs="100" minOccurs="0"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}other" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" use="required" type="{http://lca.jrc.it/ILCD/Common}GlobalReferenceTypeValues" /&gt;
 *       &lt;attribute name="refObjectId" type="{http://lca.jrc.it/ILCD/Common}UUID" /&gt;
 *       &lt;attribute name="version" type="{http://lca.jrc.it/ILCD/Common}Version" /&gt;
 *       &lt;attribute name="uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalReferenceType", namespace = "http://lca.jrc.it/ILCD/Common", propOrder = {
    "subReference",
    "shortDescription",
    "other"
})
public class GlobalReferenceType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected List<String> subReference;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected List<STMultiLang> shortDescription;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAttribute(name = "type", required = true)
    protected GlobalReferenceTypeValues type;
    @XmlAttribute(name = "refObjectId")
    protected String refObjectId;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the subReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSubReference() {
        if (subReference == null) {
            subReference = new ArrayList<String>();
        }
        return this.subReference;
    }

    /**
     * Gets the value of the shortDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link STMultiLang }
     * 
     * 
     */
    public List<STMultiLang> getShortDescription() {
        if (shortDescription == null) {
            shortDescription = new ArrayList<STMultiLang>();
        }
        return this.shortDescription;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalReferenceTypeValues }
     *     
     */
    public GlobalReferenceTypeValues getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalReferenceTypeValues }
     *     
     */
    public void setType(GlobalReferenceTypeValues value) {
        this.type = value;
    }

    /**
     * Gets the value of the refObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefObjectId() {
        return refObjectId;
    }

    /**
     * Sets the value of the refObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefObjectId(String value) {
        this.refObjectId = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
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
