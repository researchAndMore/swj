/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAnyElement
 *  jakarta.xml.bind.annotation.XmlAttribute
 *  jakarta.xml.bind.annotation.XmlElement
 *  jakarta.xml.bind.annotation.XmlSchemaType
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.MasterData;

import jakarta.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TValidUnits", propOrder={"contextName", "unit", "any"})
public class TValidUnits {
    protected List<TString80> contextName;
    @XmlElement(required=true)
    protected List<TValidUnit> unit;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="originalSource")
    @XmlSchemaType(name="anyURI")
    protected String originalSource;
    @XmlAttribute(name="majorRelease", required=true)
    protected BigInteger majorRelease;
    @XmlAttribute(name="minorRelease", required=true)
    protected BigInteger minorRelease;
    @XmlAttribute(name="majorRevision")
    protected BigInteger majorRevision;
    @XmlAttribute(name="minorRevision")
    protected BigInteger minorRevision;
    @XmlAttribute(name="contextId")
    protected String contextId;

    public List<TString80> getContextName() {
        if (this.contextName == null) {
            this.contextName = new ArrayList<TString80>();
        }
        return this.contextName;
    }

    public List<TValidUnit> getUnit() {
        if (this.unit == null) {
            this.unit = new ArrayList<TValidUnit>();
        }
        return this.unit;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }

    public String getOriginalSource() {
        return this.originalSource;
    }

    public void setOriginalSource(String value) {
        this.originalSource = value;
    }

    public BigInteger getMajorRelease() {
        return this.majorRelease;
    }

    public void setMajorRelease(BigInteger value) {
        this.majorRelease = value;
    }

    public BigInteger getMinorRelease() {
        return this.minorRelease;
    }

    public void setMinorRelease(BigInteger value) {
        this.minorRelease = value;
    }

    public BigInteger getMajorRevision() {
        return this.majorRevision;
    }

    public void setMajorRevision(BigInteger value) {
        this.majorRevision = value;
    }

    public BigInteger getMinorRevision() {
        return this.minorRevision;
    }

    public void setMinorRevision(BigInteger value) {
        this.minorRevision = value;
    }

    public String getContextId() {
        if (this.contextId == null) {
            return "DE659012-50C4-4e96-B54A-FC781BF987AB";
        }
        return this.contextId;
    }

    public void setContextId(String value) {
        this.contextId = value;
    }
}
