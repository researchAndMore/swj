
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.flowPropertyDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfQuantitativeReferenceValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfQuantitativeReferenceValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Reference flow(s)"/&gt;
 *     &lt;enumeration value="Functional unit"/&gt;
 *     &lt;enumeration value="Other parameter"/&gt;
 *     &lt;enumeration value="Production period"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfQuantitativeReferenceValues")
@XmlEnum
public enum TypeOfQuantitativeReferenceValues {


    /**
     *  One or more of the data set's inputs or outputs is identified as quantiative reference flow. This covers the 14048 types of quantitative
     *                         references "Reference flow of process", "Outgoing product flow", "Incoming product flow", "Other flow". E.g. ['Electricity; 220V; to consumer; AC' - '1
     *                         MJ']. E.g. for multi-functional processes e.g. ['Wheat grains; at farm; 16% H2O' - '1 kg'] and also ['Wheat straw; at farm; 14% H2O' - '0.9 kg'].
     *                     
     * 
     */
    @XmlEnumValue("Reference flow(s)")
    REFERENCE_FLOW_S("Reference flow(s)"),

    /**
     *  The functional unit of the process may relate to the process' performance expressed without referring to a flow. E.g. "Protective coating of
     *                         1 m2 of car surface acc. to XY specifications for 15 years". One or more functional unit entries can be given in addition to a reference flow.
     *                     
     * 
     */
    @XmlEnumValue("Functional unit")
    FUNCTIONAL_UNIT("Functional unit"),

    /**
     *  Other information items quantify the process' reference. E.g. "Input of 1 MJ fuel oils" into an energy conversion process, which might be
     *                         represented by two different fuels in the inputs/outputs, but which are inventoried individually and in kg (e.g. as 0.015 kg light fuel oil and 0,018 kg
     *                         heavy fuel oil). 
     * 
     */
    @XmlEnumValue("Other parameter")
    OTHER_PARAMETER("Other parameter"),

    /**
     *  Time period of operation that a process represents, e.g. "January 2003 to including June 2003". 
     * 
     */
    @XmlEnumValue("Production period")
    PRODUCTION_PERIOD("Production period");
    private final String value;

    TypeOfQuantitativeReferenceValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfQuantitativeReferenceValues fromValue(String v) {
        for (TypeOfQuantitativeReferenceValues c: TypeOfQuantitativeReferenceValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
