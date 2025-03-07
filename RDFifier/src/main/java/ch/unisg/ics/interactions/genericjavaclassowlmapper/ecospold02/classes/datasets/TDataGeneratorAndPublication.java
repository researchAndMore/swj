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
@XmlType(name="TDataGeneratorAndPublication", namespace="http://www.EcoInvent.org/EcoSpold02",propOrder={"any"})
public class TDataGeneratorAndPublication {
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="personId", required=true)
    protected String personId;
    @XmlAttribute(name="personContextId")
    protected String personContextId;
    @XmlAttribute(name="personName", required=true)
    protected String personName;
    @XmlAttribute(name="personEmail", required=true)
    protected String personEmail;
    @XmlAttribute(name="dataPublishedIn")
    protected Integer dataPublishedIn;
    @XmlAttribute(name="publishedSourceId")
    protected String publishedSourceId;
    @XmlAttribute(name="publishedSourceIdOverwrittenByChild")
    protected Boolean publishedSourceIdOverwrittenByChild;
    @XmlAttribute(name="publishedSourceContextId")
    protected String publishedSourceContextId;
    @XmlAttribute(name="publishedSourceYear")
    protected String publishedSourceYear;
    @XmlAttribute(name="publishedSourceFirstAuthor")
    protected String publishedSourceFirstAuthor;
    @XmlAttribute(name="isCopyrightProtected", required=true)
    protected boolean isCopyrightProtected;
    @XmlAttribute(name="pageNumbers")
    protected String pageNumbers;
    @XmlAttribute(name="accessRestrictedTo")
    protected Integer accessRestrictedTo;
    @XmlAttribute(name="companyId")
    protected String companyId;
    @XmlAttribute(name="companyIdOverwrittenByChild")
    protected Boolean companyIdOverwrittenByChild;
    @XmlAttribute(name="companyContextId")
    protected String companyContextId;
    @XmlAttribute(name="companyCode")
    protected String companyCode;

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

    public int getDataPublishedIn() {
        if (this.dataPublishedIn == null) {
            return 0;
        }
        return this.dataPublishedIn;
    }

    public void setDataPublishedIn(Integer value) {
        this.dataPublishedIn = value;
    }

    public String getPublishedSourceId() {
        return this.publishedSourceId;
    }

    public void setPublishedSourceId(String value) {
        this.publishedSourceId = value;
    }

    public Boolean isPublishedSourceIdOverwrittenByChild() {
        return this.publishedSourceIdOverwrittenByChild;
    }

    public void setPublishedSourceIdOverwrittenByChild(Boolean value) {
        this.publishedSourceIdOverwrittenByChild = value;
    }

    public String getPublishedSourceContextId() {
        return this.publishedSourceContextId;
    }

    public void setPublishedSourceContextId(String value) {
        this.publishedSourceContextId = value;
    }

    public String getPublishedSourceYear() {
        return this.publishedSourceYear;
    }

    public void setPublishedSourceYear(String value) {
        this.publishedSourceYear = value;
    }

    public String getPublishedSourceFirstAuthor() {
        return this.publishedSourceFirstAuthor;
    }

    public void setPublishedSourceFirstAuthor(String value) {
        this.publishedSourceFirstAuthor = value;
    }

    public boolean isIsCopyrightProtected() {
        return this.isCopyrightProtected;
    }

    public void setIsCopyrightProtected(boolean value) {
        this.isCopyrightProtected = value;
    }

    public String getPageNumbers() {
        return this.pageNumbers;
    }

    public void setPageNumbers(String value) {
        this.pageNumbers = value;
    }

    public int getAccessRestrictedTo() {
        if (this.accessRestrictedTo == null) {
            return 0;
        }
        return this.accessRestrictedTo;
    }

    public void setAccessRestrictedTo(Integer value) {
        this.accessRestrictedTo = value;
    }

    public String getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(String value) {
        this.companyId = value;
    }

    public Boolean isCompanyIdOverwrittenByChild() {
        return this.companyIdOverwrittenByChild;
    }

    public void setCompanyIdOverwrittenByChild(Boolean value) {
        this.companyIdOverwrittenByChild = value;
    }

    public String getCompanyContextId() {
        return this.companyContextId;
    }

    public void setCompanyContextId(String value) {
        this.companyContextId = value;
    }

    public String getCompanyCode() {
        return this.companyCode;
    }

    public void setCompanyCode(String value) {
        this.companyCode = value;
    }
}
