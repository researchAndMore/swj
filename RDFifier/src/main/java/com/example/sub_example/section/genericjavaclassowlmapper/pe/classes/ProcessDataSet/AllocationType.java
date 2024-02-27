
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.ProcessDataSet;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

import java.math.BigDecimal;
import java.math.BigInteger;


/**
 * <p>Java class for AllocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="internalReferenceToCoProduct" type="{http://lca.jrc.it/ILCD/Common}Int6" /&gt;
 *       &lt;attribute name="allocatedFraction" type="{http://lca.jrc.it/ILCD/Common}Perc" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocationType", namespace = "http://lca.jrc.it/ILCD/Process")
public class AllocationType {

    @XmlAttribute(name = "internalReferenceToCoProduct")
    protected BigInteger internalReferenceToCoProduct;
    @XmlAttribute(name = "allocatedFraction")
    protected BigDecimal allocatedFraction;

    /**
     * Gets the value of the internalReferenceToCoProduct property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInternalReferenceToCoProduct() {
        return internalReferenceToCoProduct;
    }

    /**
     * Sets the value of the internalReferenceToCoProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInternalReferenceToCoProduct(BigInteger value) {
        this.internalReferenceToCoProduct = value;
    }

    /**
     * Gets the value of the allocatedFraction property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAllocatedFraction() {
        return allocatedFraction;
    }

    /**
     * Sets the value of the allocatedFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAllocatedFraction(BigDecimal value) {
        this.allocatedFraction = value;
    }

}
