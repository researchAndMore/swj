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
@XmlType(name="TGeography",namespace="http://www.EcoInvent.org/EcoSpold02", propOrder={"shortname", "comment", "any"})
public class TGeography {
    @XmlElement(required=true)
    protected List<TString40> shortname;
    protected TTextAndImage comment;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="geographyId", required=true)
    protected String geographyId;
    @XmlAttribute(name="geographyContextId")
    protected String geographyContextId;

    public List<TString40> getShortname() {
        if (this.shortname == null) {
            this.shortname = new ArrayList<TString40>();
        }
        return this.shortname;
    }

    public TTextAndImage getComment() {
        return this.comment;
    }

    public void setComment(TTextAndImage value) {
        this.comment = value;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }

    public String getGeographyId() {
        return this.geographyId;
    }

    public void setGeographyId(String value) {
        this.geographyId = value;
    }

    public String getGeographyContextId() {
        return this.geographyContextId;
    }

    public void setGeographyContextId(String value) {
        this.geographyContextId = value;
    }
}
