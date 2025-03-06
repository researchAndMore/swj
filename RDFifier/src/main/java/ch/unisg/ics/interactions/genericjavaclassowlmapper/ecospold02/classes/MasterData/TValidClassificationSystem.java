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
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.MasterData;


import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TValidClassificationSystem", propOrder={"name", "comment", "classificationValue", "any"})
public class TValidClassificationSystem {
    @XmlElement(required=true)
    protected List<TString255> name;
    protected List<TString32000> comment;
    @XmlElement(required=true)
    protected List<TValidClassificationValue> classificationValue;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="id", required=true)
    protected String id;
    @XmlAttribute(name="type", required=true)
    protected int type;

    public List<TString255> getName() {
        if (this.name == null) {
            this.name = new ArrayList<TString255>();
        }
        return this.name;
    }

    public List<TString32000> getComment() {
        if (this.comment == null) {
            this.comment = new ArrayList<TString32000>();
        }
        return this.comment;
    }

    public List<TValidClassificationValue> getClassificationValue() {
        if (this.classificationValue == null) {
            this.classificationValue = new ArrayList<TValidClassificationValue>();
        }
        return this.classificationValue;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int value) {
        this.type = value;
    }
}
