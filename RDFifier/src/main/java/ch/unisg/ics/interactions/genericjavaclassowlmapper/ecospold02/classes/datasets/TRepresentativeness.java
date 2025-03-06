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
@XmlType(name="TRepresentativeness", namespace="http://www.EcoInvent.org/EcoSpold02",propOrder={"systemModelName", "samplingProcedure", "extrapolations", "any"})
public class TRepresentativeness {
    @XmlElement(required=true)
    protected List<TString120> systemModelName;
    protected List<TString32000> samplingProcedure;
    protected List<TString32000> extrapolations;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="percent")
    protected Float percent;
    @XmlAttribute(name="systemModelId", required=true)
    protected String systemModelId;
    @XmlAttribute(name="systemModelContextId")
    protected String systemModelContextId;

    public List<TString120> getSystemModelName() {
        if (this.systemModelName == null) {
            this.systemModelName = new ArrayList<TString120>();
        }
        return this.systemModelName;
    }

    public List<TString32000> getSamplingProcedure() {
        if (this.samplingProcedure == null) {
            this.samplingProcedure = new ArrayList<TString32000>();
        }
        return this.samplingProcedure;
    }

    public List<TString32000> getExtrapolations() {
        if (this.extrapolations == null) {
            this.extrapolations = new ArrayList<TString32000>();
        }
        return this.extrapolations;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }

    public Float getPercent() {
        return this.percent;
    }

    public void setPercent(Float value) {
        this.percent = value;
    }

    public String getSystemModelId() {
        return this.systemModelId;
    }

    public void setSystemModelId(String value) {
        this.systemModelId = value;
    }

    public String getSystemModelContextId() {
        return this.systemModelContextId;
    }

    public void setSystemModelContextId(String value) {
        this.systemModelContextId = value;
    }
}
