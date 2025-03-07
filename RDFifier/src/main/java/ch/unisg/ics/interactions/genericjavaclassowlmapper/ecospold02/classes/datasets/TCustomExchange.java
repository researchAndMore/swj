/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAttribute
 *  jakarta.xml.bind.annotation.XmlElement
 *  jakarta.xml.bind.annotation.XmlSeeAlso
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;


import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TCustomExchange",namespace="http://www.EcoInvent.org/EcoSpold02", propOrder={"name", "unitName", "comment", "uncertainty", "synonym", "property", "transferCoefficient", "tag"})
@XmlSeeAlso(value={TIntermediateExchange.class, TElementaryExchange.class})
public class TCustomExchange {
    @XmlElement(required=true)
    protected List<TString120> name;
    @XmlElement(required=true)
    protected List<TString40> unitName;
    protected List<TString32000> comment;
    protected TUncertainty uncertainty;
    protected List<TSynonym> synonym;
    protected List<TProperty> property;
    protected List<TTransferCoefficient> transferCoefficient;
    protected List<TTag> tag;
    @XmlAttribute(name="id", required=true)
    protected String id;
    @XmlAttribute(name="unitId", required=true)
    protected String unitId;
    @XmlAttribute(name="unitContextId")
    protected String unitContextId;
    @XmlAttribute(name="variableName")
    protected String variableName;
    @XmlAttribute(name="casNumber")
    protected String casNumber;
    @XmlAttribute(name="amount", required=true)
    protected double amount;
    @XmlAttribute(name="isCalculatedAmount")
    protected Boolean isCalculatedAmount;
    @XmlAttribute(name="mathematicalRelation")
    protected String mathematicalRelation;
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
    @XmlAttribute(name="pageNumbers")
    protected String pageNumbers;
    @XmlAttribute(name="specificAllocationPropertyId")
    protected String specificAllocationPropertyId;
    @XmlAttribute(name="specificAllocationPropertyIdOverwrittenByChild")
    protected Boolean specificAllocationPropertyIdOverwrittenByChild;
    @XmlAttribute(name="specificAllocationPropertyContextId")
    protected String specificAllocationPropertyContextId;

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

    public List<TString32000> getComment() {
        if (this.comment == null) {
            this.comment = new ArrayList<TString32000>();
        }
        return this.comment;
    }

    public TUncertainty getUncertainty() {
        return this.uncertainty;
    }

    public void setUncertainty(TUncertainty value) {
        this.uncertainty = value;
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

    public List<TTransferCoefficient> getTransferCoefficient() {
        if (this.transferCoefficient == null) {
            this.transferCoefficient = new ArrayList<TTransferCoefficient>();
        }
        return this.transferCoefficient;
    }

    public List<TTag> getTag() {
        if (this.tag == null) {
            this.tag = new ArrayList<TTag>();
        }
        return this.tag;
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

    public String getVariableName() {
        return this.variableName;
    }

    public void setVariableName(String value) {
        this.variableName = value;
    }

    public String getCasNumber() {
        return this.casNumber;
    }

    public void setCasNumber(String value) {
        this.casNumber = value;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double value) {
        this.amount = value;
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

    public String getMathematicalRelation() {
        return this.mathematicalRelation;
    }

    public void setMathematicalRelation(String value) {
        this.mathematicalRelation = value;
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

    public String getPageNumbers() {
        return this.pageNumbers;
    }

    public void setPageNumbers(String value) {
        this.pageNumbers = value;
    }

    public String getSpecificAllocationPropertyId() {
        return this.specificAllocationPropertyId;
    }

    public void setSpecificAllocationPropertyId(String value) {
        this.specificAllocationPropertyId = value;
    }

    public Boolean isSpecificAllocationPropertyIdOverwrittenByChild() {
        return this.specificAllocationPropertyIdOverwrittenByChild;
    }

    public void setSpecificAllocationPropertyIdOverwrittenByChild(Boolean value) {
        this.specificAllocationPropertyIdOverwrittenByChild = value;
    }

    public String getSpecificAllocationPropertyContextId() {
        return this.specificAllocationPropertyContextId;
    }

    public void setSpecificAllocationPropertyContextId(String value) {
        this.specificAllocationPropertyContextId = value;
    }
}
