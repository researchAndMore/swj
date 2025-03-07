
package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.ImpactDataset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Used for the identification of members of the organisation / institute co-operating within a quality network (e.g., ecoinvent) referred to in the areas Validation, dataEntryBy and dataGeneratorAndPublication.
 * 
 * <p>Java class for TPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="number" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TIndexNumber" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString40" /&gt;
 *       &lt;attribute name="address" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString255" /&gt;
 *       &lt;attribute name="telephone" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString40" /&gt;
 *       &lt;attribute name="telefax" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString40" /&gt;
 *       &lt;attribute name="email" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString80" /&gt;
 *       &lt;attribute name="companyCode" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TCompanyCode" /&gt;
 *       &lt;attribute name="countryCode" use="required" type="{http://www.EcoInvent.org/EcoSpold01Impact}TISOCountryCode" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPerson", namespace = "http://www.EcoInvent.org/EcoSpold01Impact")
public class TPerson {

    @XmlAttribute(name = "number", required = true)
    protected int number;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "address", required = true)
    protected String address;
    @XmlAttribute(name = "telephone", required = true)
    protected String telephone;
    @XmlAttribute(name = "telefax")
    protected String telefax;
    @XmlAttribute(name = "email")
    protected String email;
    @XmlAttribute(name = "companyCode", required = true)
    protected String companyCode;
    @XmlAttribute(name = "countryCode", required = true)
    protected TISOCountryCode countryCode;

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephone(String value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the telefax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefax() {
        return telefax;
    }

    /**
     * Sets the value of the telefax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefax(String value) {
        this.telefax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link TISOCountryCode }
     *     
     */
    public TISOCountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TISOCountryCode }
     *     
     */
    public void setCountryCode(TISOCountryCode value) {
        this.countryCode = value;
    }

}
