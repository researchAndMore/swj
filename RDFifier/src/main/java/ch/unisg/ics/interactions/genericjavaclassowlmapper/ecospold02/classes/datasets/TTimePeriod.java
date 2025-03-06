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
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TTimePeriod", namespace="http://www.EcoInvent.org/EcoSpold02",propOrder={"comment", "any"})
public class TTimePeriod {
    protected TTextAndImage comment;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="startDate", required=true)
    @XmlSchemaType(name="date")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name="endDate", required=true)
    @XmlSchemaType(name="date")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name="isDataValidForEntirePeriod", required=true)
    protected boolean isDataValidForEntirePeriod;

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

    public XMLGregorianCalendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    public XMLGregorianCalendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    public boolean isIsDataValidForEntirePeriod() {
        return this.isDataValidForEntirePeriod;
    }

    public void setIsDataValidForEntirePeriod(boolean value) {
        this.isDataValidForEntirePeriod = value;
    }
}
