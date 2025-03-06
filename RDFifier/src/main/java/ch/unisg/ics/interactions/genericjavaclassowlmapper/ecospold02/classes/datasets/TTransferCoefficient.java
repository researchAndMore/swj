/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAnyElement
 *  jakarta.xml.bind.annotation.XmlAttribute
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TTransferCoefficient", namespace="http://www.EcoInvent.org/EcoSpold02",propOrder={"uncertainty", "comment", "any"})
public class TTransferCoefficient {
    protected TUncertainty uncertainty;
    protected List<TString32000> comment;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="exchangeId", required=true)
    protected String exchangeId;
    @XmlAttribute(name="amount", required=true)
    protected double amount;
    @XmlAttribute(name="mathematicalRelation")
    protected String mathematicalRelation;
    @XmlAttribute(name="isCalculatedAmount")
    protected Boolean isCalculatedAmount;
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

    public String getExchangeId() {
        return this.exchangeId;
    }

    public void setExchangeId(String value) {
        this.exchangeId = value;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double value) {
        this.amount = value;
    }

    public String getMathematicalRelation() {
        return this.mathematicalRelation;
    }

    public void setMathematicalRelation(String value) {
        this.mathematicalRelation = value;
    }

    public Boolean isIsCalculatedAmount() {
        return this.isCalculatedAmount;
    }

    public void setIsCalculatedAmount(Boolean value) {
        this.isCalculatedAmount = value;
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
