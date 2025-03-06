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
@XmlType(name="TTechnology",namespace="http://www.EcoInvent.org/EcoSpold02", propOrder={"comment", "any"})
public class TTechnology {
    protected TTextAndImage comment;
    @XmlAnyElement(lax=true)
    protected List<Object> any;
    @XmlAttribute(name="technologyLevel")
    protected Integer technologyLevel;

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

    public int getTechnologyLevel() {
        if (this.technologyLevel == null) {
            return 3;
        }
        return this.technologyLevel;
    }

    public void setTechnologyLevel(Integer value) {
        this.technologyLevel = value;
    }
}
