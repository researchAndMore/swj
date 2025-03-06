
package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.Dataset;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * Contains information about the person that compiled and entered the dataset in the database and about kind of publication and the accessibility of the dataset.
 * 
 * <p>Java class for TAdministrativeInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAdministrativeInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataEntryBy" type="{http://www.EcoInvent.org/EcoSpold01}TDataEntryBy"/&gt;
 *         &lt;element name="dataGeneratorAndPublication" type="{http://www.EcoInvent.org/EcoSpold01}TDataGeneratorAndPublication"/&gt;
 *         &lt;element name="person" type="{http://www.EcoInvent.org/EcoSpold01}TPerson" maxOccurs="unbounded"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAdministrativeInformation", namespace = "http://www.EcoInvent.org/EcoSpold01", propOrder = {
    "dataEntryBy",
    "dataGeneratorAndPublication",
    "person",
    "any"
})
public class TAdministrativeInformation {

    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01", required = true)
    protected TDataEntryBy dataEntryBy;
    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01", required = true)
    protected TDataGeneratorAndPublication dataGeneratorAndPublication;
    @XmlElement(namespace = "http://www.EcoInvent.org/EcoSpold01", required = true)
    protected List<TPerson> person;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the dataEntryBy property.
     * 
     * @return
     *     possible object is
     *     {@link TDataEntryBy }
     *     
     */
    public TDataEntryBy getDataEntryBy() {
        return dataEntryBy;
    }

    /**
     * Sets the value of the dataEntryBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDataEntryBy }
     *     
     */
    public void setDataEntryBy(TDataEntryBy value) {
        this.dataEntryBy = value;
    }

    /**
     * Gets the value of the dataGeneratorAndPublication property.
     * 
     * @return
     *     possible object is
     *     {@link TDataGeneratorAndPublication }
     *     
     */
    public TDataGeneratorAndPublication getDataGeneratorAndPublication() {
        return dataGeneratorAndPublication;
    }

    /**
     * Sets the value of the dataGeneratorAndPublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDataGeneratorAndPublication }
     *     
     */
    public void setDataGeneratorAndPublication(TDataGeneratorAndPublication value) {
        this.dataGeneratorAndPublication = value;
    }

    /**
     * Gets the value of the person property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the person property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPerson }
     * 
     * 
     */
    public List<TPerson> getPerson() {
        if (person == null) {
            person = new ArrayList<TPerson>();
        }
        return this.person;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
