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
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.MasterData;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TValidElementaryExchange", propOrder={"name", "unitName", "compartment", "comment", "synonym", "property", "productInformation", "any"})
public class TValidElementaryExchange {
    @XmlElement(required=true)
    protected List<TString120> name;
    @XmlElement(required=true)
    protected List<TString40> unitName;
    @XmlElement(required=true)
    protected TCompartment compartment;
    protected List<TString32000> comment;
    protected List<TSynonym> synonym;
    protected List<TProperty> property;
    protected TTextAndImage productInformation;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="id", required=true)
    protected String id;
    @XmlAttribute(name="unitId", required=true)
    protected String unitId;
    @XmlAttribute(name="unitContextId")
    protected String unitContextId;
    @XmlAttribute(name="formula")
    protected String formula;
    @XmlAttribute(name="casNumber")
    protected String casNumber;
    @XmlAttribute(name="defaultVariableName")
    protected String defaultVariableName;

    public List<TString120> getName() {
        if (this.name == null) {
            this.name = new ArrayList<TString120>();
        }
        return this.name;
    }

    public List<TString40> getUnitName() {
        if (this.unitName == null) {
            this.unitName = new ArrayList<TString40>();
        }
        return this.unitName;
    }

    public TCompartment getCompartment() {
        return this.compartment;
    }

    public void setCompartment(TCompartment value) {
        this.compartment = value;
    }

    public List<TString32000> getComment() {
        if (this.comment == null) {
            this.comment = new ArrayList<TString32000>();
        }
        return this.comment;
    }

    public List<TSynonym> getSynonym() {
        if (this.synonym == null) {
            this.synonym = new ArrayList<TSynonym>();
        }
        return this.synonym;
    }

    public List<TProperty> getProperty() {
        if (this.property == null) {
            this.property = new ArrayList<TProperty>();
        }
        return this.property;
    }

    public TTextAndImage getProductInformation() {
        return this.productInformation;
    }

    public void setProductInformation(TTextAndImage value) {
        this.productInformation = value;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getUnitId() {
        return this.unitId;
    }

    public void setUnitId(String value) {
        this.unitId = value;
    }

    public String getUnitContextId() {
        return this.unitContextId;
    }

    public void setUnitContextId(String value) {
        this.unitContextId = value;
    }

    public String getFormula() {
        return this.formula;
    }

    public void setFormula(String value) {
        this.formula = value;
    }

    public String getCasNumber() {
        return this.casNumber;
    }

    public void setCasNumber(String value) {
        this.casNumber = value;
    }

    public String getDefaultVariableName() {
        return this.defaultVariableName;
    }

    public void setDefaultVariableName(String value) {
        this.defaultVariableName = value;
    }
}
