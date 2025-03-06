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
@XmlType(name="TValidProperty", propOrder={"name", "unitName", "comment", "any"})
public class TValidProperty {
    @XmlElement(required=true)
    protected List<TString80> name;
    protected List<TString40> unitName;
    protected List<TString32000> comment;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="id", required=true)
    protected String id;
    @XmlAttribute(name="defaultVariableName")
    protected String defaultVariableName;
    @XmlAttribute(name="unitId")
    protected String unitId;
    @XmlAttribute(name="unitContextId")
    protected String unitContextId;

    public List<TString80> getName() {
        if (this.name == null) {
            this.name = new ArrayList<TString80>();
        }
        return this.name;
    }

    public List<TString40> getUnitName() {
        if (this.unitName == null) {
            this.unitName = new ArrayList<TString40>();
        }
        return this.unitName;
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

    public String getId() {
        return this.id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getDefaultVariableName() {
        return this.defaultVariableName;
    }

    public void setDefaultVariableName(String value) {
        this.defaultVariableName = value;
    }

    public String getUnitId() {
        return this.unitId;
    }

    public void setUnitId(String value) {
        this.unitId = value;
    }

    public String getUnitContextId() {
        return this.unitContextId;
    }

    public void setUnitContextId(String value) {
        this.unitContextId = value;
    }
}
