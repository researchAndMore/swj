/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAttribute
 *  jakarta.xml.bind.annotation.XmlType
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import java.math.BigInteger;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TIndexedString32000", namespace="http://www.EcoInvent.org/EcoSpold02")
public class TIndexedString32000
extends TString32000 {
    @XmlAttribute(name="index", required=true)
    protected BigInteger index;

    public BigInteger getIndex() {
        return this.index;
    }

    public void setIndex(BigInteger value) {
        this.index = value;
    }
}
