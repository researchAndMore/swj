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
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.MasterData;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TValidTag", propOrder={"comment", "any"})
public class TValidTag {
    protected List<TString32000> comment;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="name", required=true)
    protected String name;

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

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }
}
