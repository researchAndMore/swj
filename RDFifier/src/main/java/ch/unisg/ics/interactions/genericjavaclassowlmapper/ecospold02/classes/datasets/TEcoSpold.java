/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.JAXBElement
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAnyElement
 *  jakarta.xml.bind.annotation.XmlElementRef
 *  jakarta.xml.bind.annotation.XmlElementRefs
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TEcoSpold", propOrder={"childActivityDataset", "any"})
@XmlRootElement(name = "ecoSpold", namespace = "http://www.EcoInvent.org/EcoSpold02")
public class TEcoSpold {
    @XmlElementRefs(value={@XmlElementRef(name="childActivityDataset", namespace="http://www.EcoInvent.org/EcoSpold02", type=JAXBElement.class, required=false)})
    protected List<JAXBElement<TActivityDataset>> childActivityDataset;
    @XmlAnyElement(lax=true)
    protected List<Object> any;

    public List<JAXBElement<TActivityDataset>> getChildActivityDataset() {
        if (this.childActivityDataset == null) {
            this.childActivityDataset = new ArrayList<JAXBElement<TActivityDataset>>();
        }
        return this.childActivityDataset;
    }

    public List<Object> getAny() {
        if (this.any == null) {
            this.any = new ArrayList<Object>();
        }
        return this.any;
    }
}
