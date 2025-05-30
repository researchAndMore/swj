
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.ProcessDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QualityValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualityValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Very good"/&gt;
 *     &lt;enumeration value="Good"/&gt;
 *     &lt;enumeration value="Fair"/&gt;
 *     &lt;enumeration value="Poor"/&gt;
 *     &lt;enumeration value="Very poor"/&gt;
 *     &lt;enumeration value="Not evaluated / unknown"/&gt;
 *     &lt;enumeration value="Not applicable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QualityValues", namespace = "http://lca.jrc.it/ILCD/Common")
@XmlEnum
public enum QualityValues {


    /**
     * Meets the criterium to a very high degree, having or no relevant need for improvement. This is to be judged in view of the criterium's
     *                         contribution to the data set's potential overall environmental impact and in comparison to an ideal situation.
     * 
     */
    @XmlEnumValue("Very good")
    VERY_GOOD("Very good"),

    /**
     * Meets the criterium to a high degree, having little yet significant need for improvement. This is to be judged in view of the criterium's
     *                         contribution to the data set's potential overall environmental impact and in comparison to an ideal situation.
     * 
     */
    @XmlEnumValue("Good")
    GOOD("Good"),

    /**
     * Meets the criterium to a still sufficient degree, while having the need for improvement. This is to be judged in view of the criterium's
     *                         contribution to the data set's potential overall environmental impact and in comparison to an ideal situation.
     * 
     */
    @XmlEnumValue("Fair")
    FAIR("Fair"),

    /**
     * Does not meet the criterium to a sufficient degree, having the need for relevant improvement. This is to be judged in view of the criterium's
     *                         contribution to the data set's potential overall environmental impact and in comparison to an ideal situation.
     * 
     */
    @XmlEnumValue("Poor")
    POOR("Poor"),

    /**
     * Does not at all meet the criterium, having the need for very substantial improvement. This is to be judged in view of the criterium's
     *                         contribution to the data set's potential overall environmental impact and in comparison to an ideal situation.
     * 
     */
    @XmlEnumValue("Very poor")
    VERY_POOR("Very poor"),

    /**
     * This criterium was not reviewed or its quality could not be verified.
     * 
     */
    @XmlEnumValue("Not evaluated / unknown")
    NOT_EVALUATED_UNKNOWN("Not evaluated / unknown"),

    /**
     * This criterium is not applicable to this data set, e.g. its geographical representative can not be evaluated as it is a location-unspecific
     *                         technology unit process.
     * 
     */
    @XmlEnumValue("Not applicable")
    NOT_APPLICABLE("Not applicable");
    private final String value;

    QualityValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualityValues fromValue(String v) {
        for (QualityValues c: QualityValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
