
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.ProcessDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UncertaintyDistributionTypeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UncertaintyDistributionTypeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="log-normal"/&gt;
 *     &lt;enumeration value="normal"/&gt;
 *     &lt;enumeration value="triangular"/&gt;
 *     &lt;enumeration value="uniform"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UncertaintyDistributionTypeValues", namespace = "http://lca.jrc.it/ILCD/Common")
@XmlEnum
public enum UncertaintyDistributionTypeValues {


    /**
     * Probability distribution information not available.
     * 
     */
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),

    /**
     * Probability distribution of any random parameter whose logarithm is normally distributed.
     * 
     */
    @XmlEnumValue("log-normal")
    LOG_NORMAL("log-normal"),

    /**
     * Probability distribution of any random parameter whose value is normally distributed around the mean of zero.
     * 
     */
    @XmlEnumValue("normal")
    NORMAL("normal"),

    /**
     * Probability distribution of any random parameter between minimum value and maximum value with the highest probability at the average value of
     *                         minimum plus maximum value. Linear change of probability between minimum, maximum and average value.
     * 
     */
    @XmlEnumValue("triangular")
    TRIANGULAR("triangular"),

    /**
     * Continuous uniform probability distribution between minimum value and maximum value and "0" probability beyond these.
     * 
     */
    @XmlEnumValue("uniform")
    UNIFORM("uniform");
    private final String value;

    UncertaintyDistributionTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UncertaintyDistributionTypeValues fromValue(String v) {
        for (UncertaintyDistributionTypeValues c: UncertaintyDistributionTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
