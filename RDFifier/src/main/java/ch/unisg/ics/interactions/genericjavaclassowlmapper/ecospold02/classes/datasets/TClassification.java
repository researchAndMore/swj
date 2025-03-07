/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAttribute
 *  jakarta.xml.bind.annotation.XmlElement
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;


import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TClassification", namespace="http://www.EcoInvent.org/EcoSpold02",propOrder={"classificationSystem", "classificationValue"})
public class TClassification {
    @XmlElement(required=true)
    protected List<TString255> classificationSystem;
    @XmlElement(required=true)
    protected List<TString120> classificationValue;
    @XmlAttribute(name="classificationId", required=true)
    protected String classificationId;
    @XmlAttribute(name="classificationContextId")
    protected String classificationContextId;

    public List<TString255> getClassificationSystem() {
        if (this.classificationSystem == null) {
            this.classificationSystem = new ArrayList<TString255>();
        }
        return this.classificationSystem;
    }

    public List<TString120> getClassificationValue() {
        if (this.classificationValue == null) {
            this.classificationValue = new ArrayList<TString120>();
        }
        return this.classificationValue;
    }

    public String getClassificationId() {
        return this.classificationId;
    }

    public void setClassificationId(String value) {
        this.classificationId = value;
    }

    public String getClassificationContextId() {
        return this.classificationContextId;
    }

    public void setClassificationContextId(String value) {
        this.classificationContextId = value;
    }
}
