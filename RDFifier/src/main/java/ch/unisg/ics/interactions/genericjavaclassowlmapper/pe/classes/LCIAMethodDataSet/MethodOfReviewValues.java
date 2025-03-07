
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MethodOfReviewValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MethodOfReviewValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Recollection / Validation of data"/&gt;
 *     &lt;enumeration value="Recalculation"/&gt;
 *     &lt;enumeration value="Cross-check with other source"/&gt;
 *     &lt;enumeration value="Cross-check with other LCIA method(ology)"/&gt;
 *     &lt;enumeration value="Expert judgement"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MethodOfReviewValues", namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
@XmlEnum
public enum MethodOfReviewValues {

    @XmlEnumValue("Recollection / Validation of data")
    RECOLLECTION_VALIDATION_OF_DATA("Recollection / Validation of data"),
    @XmlEnumValue("Recalculation")
    RECALCULATION("Recalculation"),
    @XmlEnumValue("Cross-check with other source")
    CROSS_CHECK_WITH_OTHER_SOURCE("Cross-check with other source"),
    @XmlEnumValue("Cross-check with other LCIA method(ology)")
    CROSS_CHECK_WITH_OTHER_LCIA_METHOD_OLOGY("Cross-check with other LCIA method(ology)"),
    @XmlEnumValue("Expert judgement")
    EXPERT_JUDGEMENT("Expert judgement");
    private final String value;

    MethodOfReviewValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MethodOfReviewValues fromValue(String v) {
        for (MethodOfReviewValues c: MethodOfReviewValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
