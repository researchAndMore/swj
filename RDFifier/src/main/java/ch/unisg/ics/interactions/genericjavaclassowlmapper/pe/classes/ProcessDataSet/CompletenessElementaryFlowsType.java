
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.ProcessDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.Map;


/**
 * <p>Java class for CompletenessElementaryFlowsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletenessElementaryFlowsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="type" type="{http://lca.jrc.it/ILCD/Common}CompletenessTypeValues" /&gt;
 *       &lt;attribute name="value" type="{http://lca.jrc.it/ILCD/Common}CompletenessValues" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletenessElementaryFlowsType", namespace = "http://lca.jrc.it/ILCD/Process")
public class CompletenessElementaryFlowsType {

    @XmlAttribute(name = "type")
    protected CompletenessTypeValues type;
    @XmlAttribute(name = "value")
    protected CompletenessValues value;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CompletenessTypeValues }
     *     
     */
    public CompletenessTypeValues getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletenessTypeValues }
     *     
     */
    public void setType(CompletenessTypeValues value) {
        this.type = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link CompletenessValues }
     *     
     */
    public CompletenessValues getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletenessValues }
     *     
     */
    public void setValue(CompletenessValues value) {
        this.value = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
