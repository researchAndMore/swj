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
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TValidGeography", propOrder={"name", "shortname", "comment", "kml", "any"})
public class TValidGeography {
    @XmlElement(required=true)
    protected List<TString255> name;
    @XmlElement(required=true)
    protected List<TString40> shortname;
    protected TTextAndImage comment;
    protected TKml kml;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="id", required=true)
    protected String id;
    @XmlAttribute(name="longitude")
    protected Double longitude;
    @XmlAttribute(name="latitude")
    protected Double latitude;
    @XmlAttribute(name="ISOTwoLetterCode")
    protected String isoTwoLetterCode;
    @XmlAttribute(name="ISOThreeLetterCode")
    protected String isoThreeLetterCode;
    @XmlAttribute(name="uNCode")
    protected BigInteger unCode;
    @XmlAttribute(name="uNRegionCode")
    protected BigInteger unRegionCode;
    @XmlAttribute(name="uNSubregionCode")
    protected BigInteger unSubregionCode;

    public List<TString255> getName() {
        if (this.name == null) {
            this.name = new ArrayList<TString255>();
        }
        return this.name;
    }

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

    public TKml getKml() {
        return this.kml;
    }

    public void setKml(TKml value) {
        this.kml = value;
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

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double value) {
        this.longitude = value;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double value) {
        this.latitude = value;
    }

    public String getISOTwoLetterCode() {
        return this.isoTwoLetterCode;
    }

    public void setISOTwoLetterCode(String value) {
        this.isoTwoLetterCode = value;
    }

    public String getISOThreeLetterCode() {
        return this.isoThreeLetterCode;
    }

    public void setISOThreeLetterCode(String value) {
        this.isoThreeLetterCode = value;
    }

    public BigInteger getUNCode() {
        return this.unCode;
    }

    public void setUNCode(BigInteger value) {
        this.unCode = value;
    }

    public BigInteger getUNRegionCode() {
        return this.unRegionCode;
    }

    public void setUNRegionCode(BigInteger value) {
        this.unRegionCode = value;
    }

    public BigInteger getUNSubregionCode() {
        return this.unSubregionCode;
    }

    public void setUNSubregionCode(BigInteger value) {
        this.unSubregionCode = value;
    }
}
