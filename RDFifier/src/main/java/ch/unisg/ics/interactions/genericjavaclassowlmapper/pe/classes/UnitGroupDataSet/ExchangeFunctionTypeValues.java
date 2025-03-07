
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.UnitGroupDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExchangeFunctionTypeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExchangeFunctionTypeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="General reminder flow"/&gt;
 *     &lt;enumeration value="Allocation reminder flow"/&gt;
 *     &lt;enumeration value="System expansion reminder flow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ExchangeFunctionTypeValues", namespace = "http://lca.jrc.it/ILCD/Common")
@XmlEnum
public enum ExchangeFunctionTypeValues {


    /**
     * Reminder flow on the amount of (selected) product and waste flows of included processes. Purely informative flow for additional reporting that
     *                         has already been fully considered in the inventory of the data set. Serves to document e.g. the total amount of hazardous waste generated over the life
     *                         cycle of a product system.
     * 
     */
    @XmlEnumValue("General reminder flow")
    GENERAL_REMINDER_FLOW("General reminder flow"),

    /**
     * Reminder flow on allocated co-products that have been excluded during allocation when calculating the LCI results. Purely informative flow for
     *                         additional reporting that has already been fully considered in the inventory of the data set.
     * 
     */
    @XmlEnumValue("Allocation reminder flow")
    ALLOCATION_REMINDER_FLOW("Allocation reminder flow"),

    /**
     * Reminder flow on excluded co-products that have been excluded in consequential modelling e.g. by system expansion / substitution when
     *                         calculating the LCI results.
     * 
     */
    @XmlEnumValue("System expansion reminder flow")
    SYSTEM_EXPANSION_REMINDER_FLOW("System expansion reminder flow");
    private final String value;

    ExchangeFunctionTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExchangeFunctionTypeValues fromValue(String v) {
        for (ExchangeFunctionTypeValues c: ExchangeFunctionTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
