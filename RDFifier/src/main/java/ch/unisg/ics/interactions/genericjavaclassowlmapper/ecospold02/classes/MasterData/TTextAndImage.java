/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.JAXBElement
 *  jakarta.xml.bind.annotation.XmlAccessType
 *  jakarta.xml.bind.annotation.XmlAccessorType
 *  jakarta.xml.bind.annotation.XmlAnyElement
 *  jakarta.xml.bind.annotation.XmlAttribute
 *  jakarta.xml.bind.annotation.XmlElementRef
 *  jakarta.xml.bind.annotation.XmlElementRefs
 *  jakarta.xml.bind.annotation.XmlSchemaType
 *  jakarta.xml.bind.annotation.XmlType
 *  jakarta.xml.bind.annotation.XmlValue
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.MasterData;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TTextAndImage", propOrder={"textOrImageUrlOrVariable"})
public class TTextAndImage {
    @XmlElementRefs(value={@XmlElementRef(name="text", namespace="http://www.EcoInvent.org/EcoSpold02", type=JAXBElement.class, required=false), @XmlElementRef(name="imageUrl", namespace="http://www.EcoInvent.org/EcoSpold02", type=JAXBElement.class, required=false), @XmlElementRef(name="variable", namespace="http://www.EcoInvent.org/EcoSpold02", type=JAXBElement.class, required=false)})
    @XmlAnyElement(lax=true)
    protected List<Object> textOrImageUrlOrVariable;

    public List<Object> getTextOrImageUrlOrVariable() {
        if (this.textOrImageUrlOrVariable == null) {
            this.textOrImageUrlOrVariable = new ArrayList<Object>();
        }
        return this.textOrImageUrlOrVariable;
    }

    @XmlAccessorType(value=XmlAccessType.FIELD)
    @XmlType(name="", propOrder={"value"})
    public static class ImageUrl {
        @XmlValue
        @XmlSchemaType(name="anyURI")
        protected String value;
        @XmlAttribute(name="index", required=true)
        protected BigInteger index;

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public BigInteger getIndex() {
            return this.index;
        }

        public void setIndex(BigInteger value) {
            this.index = value;
        }
    }
}
