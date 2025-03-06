/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAttribute
 *  jakarta.xml.bind.annotation.XmlElement
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TImpactIndicatorResult", namespace="http://www.EcoInvent.org/EcoSpold02",propOrder={"impactMethodName", "impactCategoryName", "name", "unitName"})
public class TImpactIndicatorResult {
    @XmlElement(required=true)
    protected List<TString120> impactMethodName;
    @XmlElement(required=true)
    protected List<TString120> impactCategoryName;
    @XmlElement(required=true)
    protected List<TString120> name;
    @XmlElement(required=true)
    protected List<TString40> unitName;
    @XmlAttribute(name="impactIndicatorId", required=true)
    protected String impactIndicatorId;
    @XmlAttribute(name="impactIndicatorContextId")
    protected String impactIndicatorContextId;
    @XmlAttribute(name="impactMethodId", required=true)
    protected String impactMethodId;
    @XmlAttribute(name="impactMethodContextId")
    protected String impactMethodContextId;
    @XmlAttribute(name="impactCategoryId", required=true)
    protected String impactCategoryId;
    @XmlAttribute(name="impactCategoryContextId")
    protected String impactCategoryContextId;
    @XmlAttribute(name="amount", required=true)
    protected double amount;

    public List<TString120> getImpactMethodName() {
        if (this.impactMethodName == null) {
            this.impactMethodName = new ArrayList<TString120>();
        }
        return this.impactMethodName;
    }

    public List<TString120> getImpactCategoryName() {
        if (this.impactCategoryName == null) {
            this.impactCategoryName = new ArrayList<TString120>();
        }
        return this.impactCategoryName;
    }

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

    public String getImpactIndicatorId() {
        return this.impactIndicatorId;
    }

    public void setImpactIndicatorId(String value) {
        this.impactIndicatorId = value;
    }

    public String getImpactIndicatorContextId() {
        return this.impactIndicatorContextId;
    }

    public void setImpactIndicatorContextId(String value) {
        this.impactIndicatorContextId = value;
    }

    public String getImpactMethodId() {
        return this.impactMethodId;
    }

    public void setImpactMethodId(String value) {
        this.impactMethodId = value;
    }

    public String getImpactMethodContextId() {
        return this.impactMethodContextId;
    }

    public void setImpactMethodContextId(String value) {
        this.impactMethodContextId = value;
    }

    public String getImpactCategoryId() {
        return this.impactCategoryId;
    }

    public void setImpactCategoryId(String value) {
        this.impactCategoryId = value;
    }

    public String getImpactCategoryContextId() {
        return this.impactCategoryContextId;
    }

    public void setImpactCategoryContextId(String value) {
        this.impactCategoryContextId = value;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double value) {
        this.amount = value;
    }
}
