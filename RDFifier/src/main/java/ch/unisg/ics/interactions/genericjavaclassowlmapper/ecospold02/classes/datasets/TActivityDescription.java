/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAnyElement
 *  jakarta.xml.bind.annotation.XmlElement
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;



import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TActivityDescription", namespace="http://www.EcoInvent.org/EcoSpold02",propOrder={"activity", "classification", "geography", "technology", "timePeriod", "macroEconomicScenario", "any"})
public class TActivityDescription {
    @XmlElement(required=true)
    protected TActivity activity;
    protected List<TClassification> classification;
    @XmlElement(required=true)
    protected TGeography geography;
    @XmlElement(required=true)
    protected TTechnology technology;
    @XmlElement(required=true)
    protected TTimePeriod timePeriod;
    @XmlElement(required=true)
    protected TMacroEconomicScenario macroEconomicScenario;
    @XmlAnyElement(lax=true)
    protected List<Object> any;

    public TActivity getActivity() {
        return this.activity;
    }

    public void setActivity(TActivity value) {
        this.activity = value;
    }

    public List<TClassification> getClassification() {
        if (this.classification == null) {
            this.classification = new ArrayList<TClassification>();
        }
        return this.classification;
    }

    public TGeography getGeography() {
        return this.geography;
    }

    public void setGeography(TGeography value) {
        this.geography = value;
    }

    public TTechnology getTechnology() {
        return this.technology;
    }

    public void setTechnology(TTechnology value) {
        this.technology = value;
    }

    public TTimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    public void setTimePeriod(TTimePeriod value) {
        this.timePeriod = value;
    }

    public TMacroEconomicScenario getMacroEconomicScenario() {
        return this.macroEconomicScenario;
    }

    public void setMacroEconomicScenario(TMacroEconomicScenario value) {
        this.macroEconomicScenario = value;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }
}
