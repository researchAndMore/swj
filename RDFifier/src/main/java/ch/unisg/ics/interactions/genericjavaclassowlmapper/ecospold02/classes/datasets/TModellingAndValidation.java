/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAnyElement
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TModellingAndValidation", namespace="http://www.EcoInvent.org/EcoSpold02",propOrder={"representativeness", "review", "any"})
public class TModellingAndValidation {
    protected TRepresentativeness representativeness;
    protected List<TReview> review;
    @XmlAnyElement(lax=true)
    protected List<Object> any;

    public TRepresentativeness getRepresentativeness() {
        return this.representativeness;
    }

    public void setRepresentativeness(TRepresentativeness value) {
        this.representativeness = value;
    }

    public List<TReview> getReview() {
        if (this.review == null) {
            this.review = new ArrayList<TReview>();
        }
        return this.review;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }
}
