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
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.MasterData;


import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TCompartment", propOrder={"compartment", "subcompartment"})
public class TCompartment {
    @XmlElement(required=true)
    protected List<TCompartmentName> compartment;
    @XmlElement(required=true)
    protected List<TCompartmentName> subcompartment;
    @XmlAttribute(name="subcompartmentId", required=true)
    protected String subcompartmentId;
    @XmlAttribute(name="subcompartmentContextId")
    protected String subcompartmentContextId;

    public List<TCompartmentName> getCompartment() {
        if (this.compartment == null) {
            this.compartment = new ArrayList<TCompartmentName>();
        }
        return this.compartment;
    }

    public List<TCompartmentName> getSubcompartment() {
        if (this.subcompartment == null) {
            this.subcompartment = new ArrayList<TCompartmentName>();
        }
        return this.subcompartment;
    }

    public String getSubcompartmentId() {
        return this.subcompartmentId;
    }

    public void setSubcompartmentId(String value) {
        this.subcompartmentId = value;
    }

    public String getSubcompartmentContextId() {
        return this.subcompartmentContextId;
    }

    public void setSubcompartmentContextId(String value) {
        this.subcompartmentContextId = value;
    }
}
