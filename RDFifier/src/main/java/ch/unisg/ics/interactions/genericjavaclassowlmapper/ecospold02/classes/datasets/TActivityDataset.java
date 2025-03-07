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
@XmlType(name="TActivityDataset", namespace="http://www.EcoInvent.org/EcoSpold02", propOrder={"activityDescription", "flowData", "modellingAndValidation", "administrativeInformation", "any"})
public class TActivityDataset {
    @XmlElement(required=true)
    protected TActivityDescription activityDescription;
    @XmlElement(required=true)
    protected TFlowData flowData;
    @XmlElement(required=true)
    protected TModellingAndValidation modellingAndValidation;
    @XmlElement(required=true)
    protected TAdministrativeInformation administrativeInformation;
    @XmlAnyElement(lax=true)
    protected List<Object> any;

    public TActivityDescription getActivityDescription() {
        return this.activityDescription;
    }

    public void setActivityDescription(TActivityDescription value) {
        this.activityDescription = value;
    }

    public TFlowData getFlowData() {
        return this.flowData;
    }

    public void setFlowData(TFlowData value) {
        this.flowData = value;
    }

    public TModellingAndValidation getModellingAndValidation() {
        return this.modellingAndValidation;
    }

    public void setModellingAndValidation(TModellingAndValidation value) {
        this.modellingAndValidation = value;
    }

    public TAdministrativeInformation getAdministrativeInformation() {
        return this.administrativeInformation;
    }

    public void setAdministrativeInformation(TAdministrativeInformation value) {
        this.administrativeInformation = value;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }
}
