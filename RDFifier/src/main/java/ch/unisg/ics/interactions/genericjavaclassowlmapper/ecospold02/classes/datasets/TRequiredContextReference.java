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
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;

import jakarta.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TRequiredContextReference",namespace="http://www.EcoInvent.org/EcoSpold02", propOrder={"requiredContextName", "any"})
public class TRequiredContextReference {
    @XmlElement(required=true)
    protected List<TString80> requiredContextName;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="majorRelease", required=true)
    protected BigInteger majorRelease;
    @XmlAttribute(name="minorRelease", required=true)
    protected BigInteger minorRelease;
    @XmlAttribute(name="majorRevision")
    protected BigInteger majorRevision;
    @XmlAttribute(name="minorRevision")
    protected BigInteger minorRevision;
    @XmlAttribute(name="requiredContextId", required=true)
    protected String requiredContextId;
    @XmlAttribute(name="requiredContextFileLocation")
    @XmlSchemaType(name="anyURI")
    protected String requiredContextFileLocation;

    public List<TString80> getRequiredContextName() {
        if (this.requiredContextName == null) {
            this.requiredContextName = new ArrayList<TString80>();
        }
        return this.requiredContextName;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
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

    public String getRequiredContextId() {
        return this.requiredContextId;
    }

    public void setRequiredContextId(String value) {
        this.requiredContextId = value;
    }

    public String getRequiredContextFileLocation() {
        return this.requiredContextFileLocation;
    }

    public void setRequiredContextFileLocation(String value) {
        this.requiredContextFileLocation = value;
    }
}
