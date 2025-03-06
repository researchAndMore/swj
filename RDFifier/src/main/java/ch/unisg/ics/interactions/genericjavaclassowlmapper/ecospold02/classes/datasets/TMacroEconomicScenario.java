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
@XmlType(name="TMacroEconomicScenario",namespace="http://www.EcoInvent.org/EcoSpold02", propOrder={"name", "comment", "any"})
public class TMacroEconomicScenario {
    @XmlElement(required=true)
    protected List<TString80> name;
    protected List<TString32000> comment;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="macroEconomicScenarioId", required=true)
    protected String macroEconomicScenarioId;
    @XmlAttribute(name="macroEconomicScenarioContextId")
    protected String macroEconomicScenarioContextId;

    public List<TString80> getName() {
        if (this.name == null) {
            this.name = new ArrayList<TString80>();
        }
        return this.name;
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

    public String getMacroEconomicScenarioId() {
        return this.macroEconomicScenarioId;
    }

    public void setMacroEconomicScenarioId(String value) {
        this.macroEconomicScenarioId = value;
    }

    public String getMacroEconomicScenarioContextId() {
        return this.macroEconomicScenarioContextId;
    }

    public void setMacroEconomicScenarioContextId(String value) {
        this.macroEconomicScenarioContextId = value;
    }
}
