
package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.ImpactDataset;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains a description of the technology for which flow data have been collected. Free text can be used. Pictures, graphs and tables are not allowed. The text should cover information necessary to identify the properties and particularities of the technology(ies) underlying the process data.
 * 
 * <p>Java class for TTechnology complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TTechnology"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="text" type="{http://www.EcoInvent.org/EcoSpold01Impact}TString32000" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTechnology", namespace = "http://www.EcoInvent.org/EcoSpold01Impact")
public class TTechnology {

    @XmlAttribute(name = "text")
    protected String text;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
