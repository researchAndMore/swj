
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.flowPropertyDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComplianceValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComplianceValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Fully compliant"/&gt;
 *     &lt;enumeration value="Not compliant"/&gt;
 *     &lt;enumeration value="Not defined"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ComplianceValues")
@XmlEnum
public enum ComplianceValues {


    /**
     * Meets all requirements of this compliance aspect as defined in the respective "Compliance system".
     * 
     */
    @XmlEnumValue("Fully compliant")
    FULLY_COMPLIANT("Fully compliant"),

    /**
     * Does not meet all requirements of this compliance aspect, as defined for the respective "Compliance system".
     * 
     */
    @XmlEnumValue("Not compliant")
    NOT_COMPLIANT("Not compliant"),

    /**
     * For this compliance aspect the named "Compliance system" has not defined compliance requirements.
     * 
     */
    @XmlEnumValue("Not defined")
    NOT_DEFINED("Not defined");
    private final String value;

    ComplianceValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComplianceValues fromValue(String v) {
        for (ComplianceValues c: ComplianceValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
