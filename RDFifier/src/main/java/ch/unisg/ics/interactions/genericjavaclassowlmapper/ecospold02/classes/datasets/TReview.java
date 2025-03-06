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
@XmlType(name="TReview", namespace="http://www.EcoInvent.org/EcoSpold02",propOrder={"details", "otherDetails", "any"})
public class TReview {
    protected TTextAndImage details;
    protected List<TString32000> otherDetails;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="reviewerId", required=true)
    protected String reviewerId;
    @XmlAttribute(name="reviewerContextId")
    protected String reviewerContextId;
    @XmlAttribute(name="reviewerName", required=true)
    protected String reviewerName;
    @XmlAttribute(name="reviewerEmail", required=true)
    protected String reviewerEmail;
    @XmlAttribute(name="reviewDate", required=true)
    @XmlSchemaType(name="date")
    protected XMLGregorianCalendar reviewDate;
    @XmlAttribute(name="reviewedMajorRelease", required=true)
    protected BigInteger reviewedMajorRelease;
    @XmlAttribute(name="reviewedMinorRelease", required=true)
    protected BigInteger reviewedMinorRelease;
    @XmlAttribute(name="reviewedMajorRevision", required=true)
    protected BigInteger reviewedMajorRevision;
    @XmlAttribute(name="reviewedMinorRevision", required=true)
    protected BigInteger reviewedMinorRevision;

    public TTextAndImage getDetails() {
        return this.details;
    }

    public void setDetails(TTextAndImage value) {
        this.details = value;
    }

    public List<TString32000> getOtherDetails() {
        if (this.otherDetails == null) {
            this.otherDetails = new ArrayList<TString32000>();
        }
        return this.otherDetails;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }

    public String getReviewerId() {
        return this.reviewerId;
    }

    public void setReviewerId(String value) {
        this.reviewerId = value;
    }

    public String getReviewerContextId() {
        return this.reviewerContextId;
    }

    public void setReviewerContextId(String value) {
        this.reviewerContextId = value;
    }

    public String getReviewerName() {
        return this.reviewerName;
    }

    public void setReviewerName(String value) {
        this.reviewerName = value;
    }

    public String getReviewerEmail() {
        return this.reviewerEmail;
    }

    public void setReviewerEmail(String value) {
        this.reviewerEmail = value;
    }

    public XMLGregorianCalendar getReviewDate() {
        return this.reviewDate;
    }

    public void setReviewDate(XMLGregorianCalendar value) {
        this.reviewDate = value;
    }

    public BigInteger getReviewedMajorRelease() {
        return this.reviewedMajorRelease;
    }

    public void setReviewedMajorRelease(BigInteger value) {
        this.reviewedMajorRelease = value;
    }

    public BigInteger getReviewedMinorRelease() {
        return this.reviewedMinorRelease;
    }

    public void setReviewedMinorRelease(BigInteger value) {
        this.reviewedMinorRelease = value;
    }

    public BigInteger getReviewedMajorRevision() {
        return this.reviewedMajorRevision;
    }

    public void setReviewedMajorRevision(BigInteger value) {
        this.reviewedMajorRevision = value;
    }

    public BigInteger getReviewedMinorRevision() {
        return this.reviewedMinorRevision;
    }

    public void setReviewedMinorRevision(BigInteger value) {
        this.reviewedMinorRevision = value;
    }
}
