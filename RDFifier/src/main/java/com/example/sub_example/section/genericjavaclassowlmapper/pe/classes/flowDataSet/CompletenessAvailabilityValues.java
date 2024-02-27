
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.flowDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompletenessAvailabilityValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompletenessAvailabilityValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Fully available"/&gt;
 *     &lt;enumeration value="Partly available"/&gt;
 *     &lt;enumeration value="Not available"/&gt;
 *     &lt;enumeration value="Topic not relevant"/&gt;
 *     &lt;enumeration value="No statement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompletenessAvailabilityValues", namespace = "http://lca.jrc.it/ILCD/Common")
@XmlEnum
public enum CompletenessAvailabilityValues {


    /**
     * For all referenced LCIA methods an impact factor is provided for this flow, in case this flow contributes to the respective mid-point problem
     *                         field in an relevant way. The impact factor for the specific flow has to cover all effect chains and impacts addressed by the specific LCIA
     *                         method.
     * 
     */
    @XmlEnumValue("Fully available")
    FULLY_AVAILABLE("Fully available"),

    /**
     * In one or more of the referenced impact methods, no impact factors are provided for this flow, while the flow's relevant contribution to that
     *                         mid-point aspect is scientifically acknowledged by state-of-the-art. Or for that specific flow not all effect chains and impacts that are addressed by on or
     *                         more of the respective LCIA methods are covered also for this flow.
     * 
     */
    @XmlEnumValue("Partly available")
    PARTLY_AVAILABLE("Partly available"),

    /**
     * For none of the referenced impact methods impact factors are provided for this flow, while by scientific state-of-the-art knowledge this flow
     *                         contributes to a relevant degree to the named mid-point problem field.
     * 
     */
    @XmlEnumValue("Not available")
    NOT_AVAILABLE("Not available"),

    /**
     * Flow is not relevant for the specific mid-point problem field. E.g. it is an elementary flow such as "Carbon dioxide emissions to air" which
     *                         does not contribute to "Human toxicity" or it is a product flow.
     * 
     */
    @XmlEnumValue("Topic not relevant")
    TOPIC_NOT_RELEVANT("Topic not relevant"),

    /**
     * Unclear, not stated.
     * 
     */
    @XmlEnumValue("No statement")
    NO_STATEMENT("No statement");
    private final String value;

    CompletenessAvailabilityValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompletenessAvailabilityValues fromValue(String v) {
        for (CompletenessAvailabilityValues c: CompletenessAvailabilityValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
