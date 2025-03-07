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
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TDataEntryBy",namespace="http://www.EcoInvent.org/EcoSpold02", propOrder={"any"})
public class TDataEntryBy {
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="personId", required=true)
    protected String personId;
    @XmlAttribute(name="personContextId")
    protected String personContextId;
    @XmlAttribute(name="isActiveAuthor")
    protected Boolean isActiveAuthor;
    @XmlAttribute(name="personName", required=true)
    protected String personName;
    @XmlAttribute(name="personEmail", required=true)
    protected String personEmail;

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }

    public String getPersonId() {
        return this.personId;
    }

    public void setPersonId(String value) {
        this.personId = value;
    }

    public String getPersonContextId() {
        return this.personContextId;
    }

    public void setPersonContextId(String value) {
        this.personContextId = value;
    }

    public boolean isIsActiveAuthor() {
        if (this.isActiveAuthor == null) {
            return false;
        }
        return this.isActiveAuthor;
    }

    public void setIsActiveAuthor(Boolean value) {
        this.isActiveAuthor = value;
    }

    public String getPersonName() {
        return this.personName;
    }

    public void setPersonName(String value) {
        this.personName = value;
    }

    public String getPersonEmail() {
        return this.personEmail;
    }

    public void setPersonEmail(String value) {
        this.personEmail = value;
    }
}
