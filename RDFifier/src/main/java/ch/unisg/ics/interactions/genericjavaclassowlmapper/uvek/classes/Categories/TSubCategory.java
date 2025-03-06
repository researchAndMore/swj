
package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.Categories;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * SubCategories are used as a substructure (below the database structuring element 'category') for processes (only structuring function), elementary flows and impact categories (structuring function and discriminating different datasets with the same entry in the data field "name").
 * 
 * <p>Java class for TSubCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSubCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.EcoInvent.org/Categories}TCategoryName" /&gt;
 *       &lt;attribute name="localName" use="required" type="{http://www.EcoInvent.org/Categories}TCategoryName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSubCategory", namespace = "http://www.EcoInvent.org/Categories")
public class TSubCategory {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "localName", required = true)
    protected String localName;

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

}
