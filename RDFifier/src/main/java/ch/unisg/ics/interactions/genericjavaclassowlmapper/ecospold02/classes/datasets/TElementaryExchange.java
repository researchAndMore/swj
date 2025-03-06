/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAnyElement
 *  jakarta.xml.bind.annotation.XmlAttribute
 *  jakarta.xml.bind.annotation.XmlElement
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;


import jakarta.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TElementaryExchange", namespace="http://www.EcoInvent.org/EcoSpold02",propOrder={"compartment", "inputGroup", "outputGroup", "any"})
public class TElementaryExchange
extends TCustomExchange {
    @XmlElement(required=true)
    protected TCompartment compartment;
    protected Integer inputGroup;
    protected BigInteger outputGroup;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="elementaryExchangeId", required=true)
    protected String elementaryExchangeId;
    @XmlAttribute(name="elementaryExchangeContextId")
    protected String elementaryExchangeContextId;
    @XmlAttribute(name="formula")
    protected String formula;

    public TCompartment getCompartment() {
        return this.compartment;
    }

    public void setCompartment(TCompartment value) {
        this.compartment = value;
    }

    public Integer getInputGroup() {
        return this.inputGroup;
    }

    public void setInputGroup(Integer value) {
        this.inputGroup = value;
    }

    public BigInteger getOutputGroup() {
        return this.outputGroup;
    }

    public void setOutputGroup(BigInteger value) {
        this.outputGroup = value;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }

    public String getElementaryExchangeId() {
        return this.elementaryExchangeId;
    }

    public void setElementaryExchangeId(String value) {
        this.elementaryExchangeId = value;
    }

    public String getElementaryExchangeContextId() {
        return this.elementaryExchangeContextId;
    }

    public void setElementaryExchangeContextId(String value) {
        this.elementaryExchangeContextId = value;
    }

    public String getFormula() {
        return this.formula;
    }

    public void setFormula(String value) {
        this.formula = value;
    }
}
