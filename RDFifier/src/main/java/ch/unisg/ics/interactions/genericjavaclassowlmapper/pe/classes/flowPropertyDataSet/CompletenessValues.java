
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.flowPropertyDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompletenessValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompletenessValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="All relevant flows quantified"/&gt;
 *     &lt;enumeration value="Relevant flows missing"/&gt;
 *     &lt;enumeration value="Topic not relevant"/&gt;
 *     &lt;enumeration value="No statement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompletenessValues")
@XmlEnum
public enum CompletenessValues {


    /**
     * All relevant flows are recorded. [Note: This does not consider yet the quality or representativeness of the data.]
     * 
     */
    @XmlEnumValue("All relevant flows quantified")
    ALL_RELEVANT_FLOWS_QUANTIFIED("All relevant flows quantified"),

    /**
     * One or more relevant flows are not recorded respectively not quantified. [Note: These flows should be found in the Inputs and Outputs with
     *                         mean amount "0" and marked as "Missing relevant" in the field "Data derivation type/status".]
     * 
     */
    @XmlEnumValue("Relevant flows missing")
    RELEVANT_FLOWS_MISSING("Relevant flows missing"),

    /**
     * Process is not relevant for the environmental impact. E.g. it is a dummy process or a generic mixer process, or is not contributing to a
     *                         specified environmental problem.
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

    CompletenessValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompletenessValues fromValue(String v) {
        for (CompletenessValues c: CompletenessValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
