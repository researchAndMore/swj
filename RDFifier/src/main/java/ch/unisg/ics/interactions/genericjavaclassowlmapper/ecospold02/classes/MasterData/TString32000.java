/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAttribute
 *  jakarta.xml.bind.annotation.XmlSeeAlso
 *  jakarta.xml.bind.annotation.XmlType
 *  jakarta.xml.bind.annotation.XmlValue
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.MasterData;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TString32000", propOrder={"value"})
@XmlSeeAlso(value={TIndexedString32000.class, TNamedString32000.class})
public class TString32000 {
    @XmlValue
    protected String value;
    @XmlAttribute(name="lang", namespace="http://www.w3.org/XML/1998/namespace")
    protected String lang;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String value) {
        this.lang = value;
    }
}
