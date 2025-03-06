package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;

import jakarta.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(value=XmlAccessType.FIELD)
@XmlType(name="TTextAndImage", namespace="http://www.EcoInvent.org/EcoSpold02",
        propOrder={"texts", "imageUrls", "variables"})
public class TTextAndImage {

    @XmlElement(name="text", namespace="http://www.EcoInvent.org/EcoSpold02")
    protected List<Text> texts;

    @XmlElement(name="imageUrl", namespace="http://www.EcoInvent.org/EcoSpold02")
    protected List<ImageUrl> imageUrls;

    @XmlElement(name="variable", namespace="http://www.EcoInvent.org/EcoSpold02")
    protected List<String> variables;

    public List<Text> getTexts() {
        if (this.texts == null) {
            this.texts = new ArrayList<>();
        }
        return this.texts;
    }

    public List<ImageUrl> getImageUrls() {
        if (this.imageUrls == null) {
            this.imageUrls = new ArrayList<>();
        }
        return this.imageUrls;
    }

    public List<String> getVariables() {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        return this.variables;
    }

    @XmlAccessorType(value=XmlAccessType.FIELD)
    @XmlType(name="")
    public static class Text {
        @XmlValue
        protected String value;

        @XmlAttribute(name="lang", namespace="http://www.w3.org/XML/1998/namespace")
        protected String language;

        @XmlAttribute(name="index", required=true)
        protected BigInteger index;

        public String getValue() {
            return this.value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getLanguage() {
            return this.language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public BigInteger getIndex() {
            return this.index;
        }

        public void setIndex(BigInteger value) {
            this.index = value;
        }
    }

    @XmlAccessorType(value=XmlAccessType.FIELD)
    @XmlType(name="")
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