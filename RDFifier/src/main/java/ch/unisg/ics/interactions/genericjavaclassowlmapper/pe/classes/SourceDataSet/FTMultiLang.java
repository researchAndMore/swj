
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.SourceDataSet;

import jakarta.xml.bind.annotation.*;


/**
 * Multi-lang free text with an unlimited length.
 * 
 * <p>Java class for FTMultiLang complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FTMultiLang"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://lca.jrc.it/ILCD/Common&gt;FT"&gt;
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang default="en""/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FTMultiLang", namespace = "http://lca.jrc.it/ILCD/Common", propOrder = {
    "value"
})
public class FTMultiLang {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;

    /**
     * Free text with an unlimited length.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        if (lang == null) {
            return "en";
        } else {
            return lang;
        }
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
