/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAnyElement
 *  jakarta.xml.bind.annotation.XmlAttribute
 *  jakarta.xml.bind.annotation.XmlSchemaType
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;


import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TFileAttributes", namespace="http://www.EcoInvent.org/EcoSpold02",propOrder={"contextName", "requiredContext", "any"})
public class TFileAttributes {
    protected List<TString80> contextName;
    protected List<TRequiredContextReference> requiredContext;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="majorRelease", required=true)
    protected BigInteger majorRelease;
    @XmlAttribute(name="minorRelease", required=true)
    protected BigInteger minorRelease;
    @XmlAttribute(name="majorRevision", required=true)
    protected BigInteger majorRevision;
    @XmlAttribute(name="minorRevision", required=true)
    protected BigInteger minorRevision;
    @XmlAttribute(name="internalSchemaVersion")
    protected String internalSchemaVersion;
    @XmlAttribute(name="defaultLanguage")
    protected String defaultLanguage;
    @XmlAttribute(name="creationTimestamp")
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar creationTimestamp;
    @XmlAttribute(name="lastEditTimestamp")
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar lastEditTimestamp;
    @XmlAttribute(name="fileGenerator")
    protected String fileGenerator;
    @XmlAttribute(name="fileTimestamp")
    @XmlSchemaType(name="dateTime")
    protected XMLGregorianCalendar fileTimestamp;
    @XmlAttribute(name="contextId")
    protected String contextId;

    public List<TString80> getContextName() {
        if (this.contextName == null) {
            this.contextName = new ArrayList<TString80>();
        }
        return this.contextName;
    }

    public List<TRequiredContextReference> getRequiredContext() {
        if (this.requiredContext == null) {
            this.requiredContext = new ArrayList<TRequiredContextReference>();
        }
        return this.requiredContext;
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

    public String getInternalSchemaVersion() {
        return this.internalSchemaVersion;
    }

    public void setInternalSchemaVersion(String value) {
        this.internalSchemaVersion = value;
    }

    public String getDefaultLanguage() {
        if (this.defaultLanguage == null) {
            return "en";
        }
        return this.defaultLanguage;
    }

    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

    public XMLGregorianCalendar getCreationTimestamp() {
        return this.creationTimestamp;
    }

    public void setCreationTimestamp(XMLGregorianCalendar value) {
        this.creationTimestamp = value;
    }

    public XMLGregorianCalendar getLastEditTimestamp() {
        return this.lastEditTimestamp;
    }

    public void setLastEditTimestamp(XMLGregorianCalendar value) {
        this.lastEditTimestamp = value;
    }

    public String getFileGenerator() {
        return this.fileGenerator;
    }

    public void setFileGenerator(String value) {
        this.fileGenerator = value;
    }

    public XMLGregorianCalendar getFileTimestamp() {
        return this.fileTimestamp;
    }

    public void setFileTimestamp(XMLGregorianCalendar value) {
        this.fileTimestamp = value;
    }

    public String getContextId() {
        return this.contextId;
    }

    public void setContextId(String value) {
        this.contextId = value;
    }
}
