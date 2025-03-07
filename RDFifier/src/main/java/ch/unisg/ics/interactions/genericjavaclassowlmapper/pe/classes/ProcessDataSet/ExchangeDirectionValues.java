
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.ProcessDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeDirectionValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeDirectionValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Input"/&gt;
 *     &lt;enumeration value="Output"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExchangeDirectionValues", namespace = "http://lca.jrc.it/ILCD/Common")
@XmlEnum
public enum ExchangeDirectionValues {


    /**
     * Flow in input list of the process, e.g. resources from nature or energy carriers, or commodities and services entering from the technosphere.
     *                         (In case the flow has an negative "resulting amount" value this is equivalent to belonging to the output list of the process.)
     * 
     */
    @XmlEnumValue("Input")
    INPUT("Input"),

    /**
     * Flow in output list of the process, e.g. emissions to nature, or products and waste going to the technosphere into another process. (In case
     *                         the flow has a negative "resulting amount" value this is equivalent to belonging to the input list of the process.)
     * 
     */
    @XmlEnumValue("Output")
    OUTPUT("Output");
    private final String value;

    ExchangeDirectionValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExchangeDirectionValues fromValue(String v) {
        for (ExchangeDirectionValues c: ExchangeDirectionValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
