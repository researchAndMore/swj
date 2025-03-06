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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TProperty",namespace="http://www.EcoInvent.org/EcoSpold02", propOrder={"name", "unitName", "uncertainty", "comment", "any"})
public class TProperty {
    @XmlElement(required=true)
    protected List<TString80> name;
    protected List<TString40> unitName;
    protected TUncertainty uncertainty;
    protected List<TString32000> comment;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="propertyId", required=true)
    protected String propertyId;
    @XmlAttribute(name="propertyContextId")
    protected String propertyContextId;
    @XmlAttribute(name="variableName")
    protected String variableName;
    @XmlAttribute(name="amount", required=true)
    protected double amount;
    @XmlAttribute(name="isDefiningValue")
    protected Boolean isDefiningValue;
    @XmlAttribute(name="mathematicalRelation")
    protected String mathematicalRelation;
    @XmlAttribute(name="isCalculatedAmount")
    protected Boolean isCalculatedAmount;
    @XmlAttribute(name="unitId")
    protected String unitId;
    @XmlAttribute(name="unitContextId")
    protected String unitContextId;
    @XmlAttribute(name="sourceId")
    protected String sourceId;
    @XmlAttribute(name="sourceIdOverwrittenByChild")
    protected Boolean sourceIdOverwrittenByChild;
    @XmlAttribute(name="sourceContextId")
    protected String sourceContextId;
    @XmlAttribute(name="sourceYear")
    protected String sourceYear;
    @XmlAttribute(name="sourceFirstAuthor")
    protected String sourceFirstAuthor;

    public List<TString80> getName() {
        if (this.name == null) {
            this.name = new ArrayList<TString80>();
        }
        return this.name;
    }

    public List<TString40> getUnitName() {
        if (this.unitName == null) {
            this.unitName = new ArrayList<TString40>();
        }
        return this.unitName;
    }

    public TUncertainty getUncertainty() {
        return this.uncertainty;
    }

    public void setUncertainty(TUncertainty value) {
        this.uncertainty = value;
    }

    public List<TString32000> getComment() {
        if (this.comment == null) {
            this.comment = new ArrayList<TString32000>();
        }
        return this.comment;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }

    public String getPropertyId() {
        return this.propertyId;
    }

    public void setPropertyId(String value) {
        this.propertyId = value;
    }

    public String getPropertyContextId() {
        return this.propertyContextId;
    }

    public void setPropertyContextId(String value) {
        this.propertyContextId = value;
    }

    public String getVariableName() {
        return this.variableName;
    }

    public void setVariableName(String value) {
        this.variableName = value;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double value) {
        this.amount = value;
    }

    public boolean isIsDefiningValue() {
        if (this.isDefiningValue == null) {
            return false;
        }
        return this.isDefiningValue;
    }

    public void setIsDefiningValue(Boolean value) {
        this.isDefiningValue = value;
    }

    public String getMathematicalRelation() {
        return this.mathematicalRelation;
    }

    public void setMathematicalRelation(String value) {
        this.mathematicalRelation = value;
    }

    public boolean isIsCalculatedAmount() {
        if (this.isCalculatedAmount == null) {
            return false;
        }
        return this.isCalculatedAmount;
    }

    public void setIsCalculatedAmount(Boolean value) {
        this.isCalculatedAmount = value;
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

    public String getSourceId() {
        return this.sourceId;
    }

    public void setSourceId(String value) {
        this.sourceId = value;
    }

    public Boolean isSourceIdOverwrittenByChild() {
        return this.sourceIdOverwrittenByChild;
    }

    public void setSourceIdOverwrittenByChild(Boolean value) {
        this.sourceIdOverwrittenByChild = value;
    }

    public String getSourceContextId() {
        return this.sourceContextId;
    }

    public void setSourceContextId(String value) {
        this.sourceContextId = value;
    }

    public String getSourceYear() {
        return this.sourceYear;
    }

    public void setSourceYear(String value) {
        this.sourceYear = value;
    }

    public String getSourceFirstAuthor() {
        return this.sourceFirstAuthor;
    }

    public void setSourceFirstAuthor(String value) {
        this.sourceFirstAuthor = value;
    }
}
