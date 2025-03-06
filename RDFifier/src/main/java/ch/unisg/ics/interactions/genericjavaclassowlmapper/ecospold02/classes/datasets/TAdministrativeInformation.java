/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAnyElement
 *  jakarta.xml.bind.annotation.XmlElement
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;


import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TAdministrativeInformation", namespace="http://www.EcoInvent.org/EcoSpold02",propOrder={"dataEntryBy", "dataGeneratorAndPublication", "fileAttributes", "any"})
public class TAdministrativeInformation {
    @XmlElement(required=true)
    protected TDataEntryBy dataEntryBy;
    @XmlElement(required=true)
    protected TDataGeneratorAndPublication dataGeneratorAndPublication;
    @XmlElement(required=true)
    protected TFileAttributes fileAttributes;
    @XmlAnyElement(lax=true)
    protected List<Object> any;

    public TDataEntryBy getDataEntryBy() {
        return this.dataEntryBy;
    }

    public void setDataEntryBy(TDataEntryBy value) {
        this.dataEntryBy = value;
    }

    public TDataGeneratorAndPublication getDataGeneratorAndPublication() {
        return this.dataGeneratorAndPublication;
    }

    public void setDataGeneratorAndPublication(TDataGeneratorAndPublication value) {
        this.dataGeneratorAndPublication = value;
    }

    public TFileAttributes getFileAttributes() {
        return this.fileAttributes;
    }

    public void setFileAttributes(TFileAttributes value) {
        this.fileAttributes = value;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }
}
