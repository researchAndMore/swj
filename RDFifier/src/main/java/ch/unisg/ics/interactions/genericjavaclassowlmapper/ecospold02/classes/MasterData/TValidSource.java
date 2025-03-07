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
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TValidSource", propOrder={"comment", "any"})
public class TValidSource {
    protected List<TString32000> comment;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="id", required=true)
    protected String id;
    @XmlAttribute(name="sourceType")
    protected Integer sourceType;
    @XmlAttribute(name="year", required=true)
    protected String year;
    @XmlAttribute(name="volumeNo")
    protected BigInteger volumeNo;
    @XmlAttribute(name="firstAuthor", required=true)
    protected String firstAuthor;
    @XmlAttribute(name="additionalAuthors")
    protected String additionalAuthors;
    @XmlAttribute(name="title", required=true)
    protected String title;
    @XmlAttribute(name="shortName")
    protected String shortName;
    @XmlAttribute(name="pageNumbers")
    protected String pageNumbers;
    @XmlAttribute(name="namesOfEditors")
    protected String namesOfEditors;
    @XmlAttribute(name="titleOfAnthology")
    protected String titleOfAnthology;
    @XmlAttribute(name="placeOfPublications")
    protected String placeOfPublications;
    @XmlAttribute(name="publisher")
    protected String publisher;
    @XmlAttribute(name="journal")
    protected String journal;
    @XmlAttribute(name="issueNo")
    protected String issueNo;

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

    public int getSourceType() {
        if (this.sourceType == null) {
            return 0;
        }
        return this.sourceType;
    }

    public void setSourceType(Integer value) {
        this.sourceType = value;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String value) {
        this.year = value;
    }

    public BigInteger getVolumeNo() {
        return this.volumeNo;
    }

    public void setVolumeNo(BigInteger value) {
        this.volumeNo = value;
    }

    public String getFirstAuthor() {
        return this.firstAuthor;
    }

    public void setFirstAuthor(String value) {
        this.firstAuthor = value;
    }

    public String getAdditionalAuthors() {
        return this.additionalAuthors;
    }

    public void setAdditionalAuthors(String value) {
        this.additionalAuthors = value;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String value) {
        this.shortName = value;
    }

    public String getPageNumbers() {
        return this.pageNumbers;
    }

    public void setPageNumbers(String value) {
        this.pageNumbers = value;
    }

    public String getNamesOfEditors() {
        return this.namesOfEditors;
    }

    public void setNamesOfEditors(String value) {
        this.namesOfEditors = value;
    }

    public String getTitleOfAnthology() {
        return this.titleOfAnthology;
    }

    public void setTitleOfAnthology(String value) {
        this.titleOfAnthology = value;
    }

    public String getPlaceOfPublications() {
        return this.placeOfPublications;
    }

    public void setPlaceOfPublications(String value) {
        this.placeOfPublications = value;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String value) {
        this.publisher = value;
    }

    public String getJournal() {
        return this.journal;
    }

    public void setJournal(String value) {
        this.journal = value;
    }

    public String getIssueNo() {
        return this.issueNo;
    }

    public void setIssueNo(String value) {
        this.issueNo = value;
    }
}
