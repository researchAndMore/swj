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
@XmlType(name="TFlowData",namespace="http://www.EcoInvent.org/EcoSpold02", propOrder={"intermediateExchange", "elementaryExchange", "parameter", "impactIndicator", "any"})
public class TFlowData {
    @XmlElement(required=true)
    protected List<TIntermediateExchange> intermediateExchange;
    protected List<TElementaryExchange> elementaryExchange;
    protected List<TParameter> parameter;
    protected List<TImpactIndicatorResult> impactIndicator;
    @XmlAnyElement(lax=true)
    protected List<Object> any;

    public List<TIntermediateExchange> getIntermediateExchange() {
        if (this.intermediateExchange == null) {
            this.intermediateExchange = new ArrayList<TIntermediateExchange>();
        }
        return this.intermediateExchange;
    }

    public List<TElementaryExchange> getElementaryExchange() {
        if (this.elementaryExchange == null) {
            this.elementaryExchange = new ArrayList<TElementaryExchange>();
        }
        return this.elementaryExchange;
    }

    public List<TParameter> getParameter() {
        if (this.parameter == null) {
            this.parameter = new ArrayList<TParameter>();
        }
        return this.parameter;
    }

    public List<TImpactIndicatorResult> getImpactIndicator() {
        if (this.impactIndicator == null) {
            this.impactIndicator = new ArrayList<TImpactIndicatorResult>();
        }
        return this.impactIndicator;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }
}
