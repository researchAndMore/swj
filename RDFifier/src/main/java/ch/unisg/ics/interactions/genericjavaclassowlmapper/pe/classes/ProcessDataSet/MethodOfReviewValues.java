
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.ProcessDataSet;

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
 *   &lt;restriction base="{http://lca.jrc.it/ILCD/Process}MethodOfReviewValues"&gt;
 *     &lt;enumeration value="Validation of data sources"/&gt;
 *     &lt;enumeration value="Sample tests on calculations"/&gt;
 *     &lt;enumeration value="Energy balance"/&gt;
 *     &lt;enumeration value="Element balance"/&gt;
 *     &lt;enumeration value="Cross-check with other source"/&gt;
 *     &lt;enumeration value="Cross-check with other data set"/&gt;
 *     &lt;enumeration value="Expert judgement"/&gt;
 *     &lt;enumeration value="Mass balance"/&gt;
 *     &lt;enumeration value="Compliance with legal limits"/&gt;
 *     &lt;enumeration value="Compliance with ISO 14040 to 14044"/&gt;
 *     &lt;enumeration value="Documentation"/&gt;
 *     &lt;enumeration value="Evidence collection by means of plant visits and/or interviews"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MethodOfReviewValues", namespace = "http://lca.jrc.it/ILCD/Process")
@XmlEnum
public enum MethodOfReviewValues {

    @XmlEnumValue("Validation of data sources")
    VALIDATION_OF_DATA_SOURCES("Validation of data sources"),
    @XmlEnumValue("Sample tests on calculations")
    SAMPLE_TESTS_ON_CALCULATIONS("Sample tests on calculations"),
    @XmlEnumValue("Energy balance")
    ENERGY_BALANCE("Energy balance"),
    @XmlEnumValue("Element balance")
    ELEMENT_BALANCE("Element balance"),
    @XmlEnumValue("Cross-check with other source")
    CROSS_CHECK_WITH_OTHER_SOURCE("Cross-check with other source"),
    @XmlEnumValue("Cross-check with other data set")
    CROSS_CHECK_WITH_OTHER_DATA_SET("Cross-check with other data set"),
    @XmlEnumValue("Expert judgement")
    EXPERT_JUDGEMENT("Expert judgement"),
    @XmlEnumValue("Mass balance")
    MASS_BALANCE("Mass balance"),
    @XmlEnumValue("Compliance with legal limits")
    COMPLIANCE_WITH_LEGAL_LIMITS("Compliance with legal limits"),
    @XmlEnumValue("Compliance with ISO 14040 to 14044")
    COMPLIANCE_WITH_ISO_14040_TO_14044("Compliance with ISO 14040 to 14044"),
    @XmlEnumValue("Documentation")
    DOCUMENTATION("Documentation"),
    @XmlEnumValue("Evidence collection by means of plant visits and/or interviews")
    EVIDENCE_COLLECTION_BY_MEANS_OF_PLANT_VISITS_AND_OR_INTERVIEWS("Evidence collection by means of plant visits and/or interviews");
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
