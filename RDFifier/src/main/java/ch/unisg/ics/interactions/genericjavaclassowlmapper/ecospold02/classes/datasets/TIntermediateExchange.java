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
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TIntermediateExchange", namespace="http://www.EcoInvent.org/EcoSpold02",propOrder={"productionVolumeComment", "productionVolumeUncertainty", "classification", "inputGroup", "outputGroup", "any"})
public class TIntermediateExchange
extends TCustomExchange {
    protected List<TString32000> productionVolumeComment;
    protected TUncertainty productionVolumeUncertainty;
    protected List<TClassification> classification;
    protected BigInteger inputGroup;
    protected BigInteger outputGroup;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="intermediateExchangeId", required=true)
    protected String intermediateExchangeId;
    @XmlAttribute(name="intermediateExchangeContextId")
    protected String intermediateExchangeContextId;
    @XmlAttribute(name="activityLinkId")
    protected String activityLinkId;
    @XmlAttribute(name="activityLinkIdOverwrittenByChild")
    protected Boolean activityLinkIdOverwrittenByChild;
    @XmlAttribute(name="activityLinkContextId")
    protected String activityLinkContextId;
    @XmlAttribute(name="productionVolumeAmount")
    protected Double productionVolumeAmount;
    @XmlAttribute(name="productionVolumeVariableName")
    protected String productionVolumeVariableName;
    @XmlAttribute(name="productionVolumeMathematicalRelation")
    protected String productionVolumeMathematicalRelation;
    @XmlAttribute(name="productionVolumeSourceId")
    protected String productionVolumeSourceId;
    @XmlAttribute(name="productionVolumeSourceIdOverwrittenByChild")
    protected Boolean productionVolumeSourceIdOverwrittenByChild;
    @XmlAttribute(name="productionVolumeSourceContextId")
    protected String productionVolumeSourceContextId;
    @XmlAttribute(name="productionVolumeSourceYear")
    protected String productionVolumeSourceYear;
    @XmlAttribute(name="productionVolumeSourceFirstAuthor")
    protected String productionVolumeSourceFirstAuthor;

    public List<TString32000> getProductionVolumeComment() {
        if (this.productionVolumeComment == null) {
            this.productionVolumeComment = new ArrayList<TString32000>();
        }
        return this.productionVolumeComment;
    }

    public TUncertainty getProductionVolumeUncertainty() {
        return this.productionVolumeUncertainty;
    }

    public void setProductionVolumeUncertainty(TUncertainty value) {
        this.productionVolumeUncertainty = value;
    }

    public List<TClassification> getClassification() {
        if (this.classification == null) {
            this.classification = new ArrayList<TClassification>();
        }
        return this.classification;
    }

    public BigInteger getInputGroup() {
        return this.inputGroup;
    }

    public void setInputGroup(BigInteger value) {
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

    public String getIntermediateExchangeId() {
        return this.intermediateExchangeId;
    }

    public void setIntermediateExchangeId(String value) {
        this.intermediateExchangeId = value;
    }

    public String getIntermediateExchangeContextId() {
        return this.intermediateExchangeContextId;
    }

    public void setIntermediateExchangeContextId(String value) {
        this.intermediateExchangeContextId = value;
    }

    public String getActivityLinkId() {
        return this.activityLinkId;
    }

    public void setActivityLinkId(String value) {
        this.activityLinkId = value;
    }

    public Boolean isActivityLinkIdOverwrittenByChild() {
        return this.activityLinkIdOverwrittenByChild;
    }

    public void setActivityLinkIdOverwrittenByChild(Boolean value) {
        this.activityLinkIdOverwrittenByChild = value;
    }

    public String getActivityLinkContextId() {
        return this.activityLinkContextId;
    }

    public void setActivityLinkContextId(String value) {
        this.activityLinkContextId = value;
    }

    public Double getProductionVolumeAmount() {
        return this.productionVolumeAmount;
    }

    public void setProductionVolumeAmount(Double value) {
        this.productionVolumeAmount = value;
    }

    public String getProductionVolumeVariableName() {
        return this.productionVolumeVariableName;
    }

    public void setProductionVolumeVariableName(String value) {
        this.productionVolumeVariableName = value;
    }

    public String getProductionVolumeMathematicalRelation() {
        return this.productionVolumeMathematicalRelation;
    }

    public void setProductionVolumeMathematicalRelation(String value) {
        this.productionVolumeMathematicalRelation = value;
    }

    public String getProductionVolumeSourceId() {
        return this.productionVolumeSourceId;
    }

    public void setProductionVolumeSourceId(String value) {
        this.productionVolumeSourceId = value;
    }

    public Boolean isProductionVolumeSourceIdOverwrittenByChild() {
        return this.productionVolumeSourceIdOverwrittenByChild;
    }

    public void setProductionVolumeSourceIdOverwrittenByChild(Boolean value) {
        this.productionVolumeSourceIdOverwrittenByChild = value;
    }

    public String getProductionVolumeSourceContextId() {
        return this.productionVolumeSourceContextId;
    }

    public void setProductionVolumeSourceContextId(String value) {
        this.productionVolumeSourceContextId = value;
    }

    public String getProductionVolumeSourceYear() {
        return this.productionVolumeSourceYear;
    }

    public void setProductionVolumeSourceYear(String value) {
        this.productionVolumeSourceYear = value;
    }

    public String getProductionVolumeSourceFirstAuthor() {
        return this.productionVolumeSourceFirstAuthor;
    }

    public void setProductionVolumeSourceFirstAuthor(String value) {
        this.productionVolumeSourceFirstAuthor = value;
    }
}
