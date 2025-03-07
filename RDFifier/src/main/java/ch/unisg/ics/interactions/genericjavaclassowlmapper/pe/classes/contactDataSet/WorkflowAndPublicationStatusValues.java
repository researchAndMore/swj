
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.contactDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WorkflowAndPublicationStatusValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkflowAndPublicationStatusValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Working draft"/&gt;
 *     &lt;enumeration value="Final draft for internal review"/&gt;
 *     &lt;enumeration value="Final draft for external review"/&gt;
 *     &lt;enumeration value="Data set finalised; unpublished"/&gt;
 *     &lt;enumeration value="Under revision"/&gt;
 *     &lt;enumeration value="Withdrawn"/&gt;
 *     &lt;enumeration value="Data set finalised; subsystems published"/&gt;
 *     &lt;enumeration value="Data set finalised; entirely published"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WorkflowAndPublicationStatusValues", namespace = "http://lca.jrc.it/ILCD/Common")
@XmlEnum
public enum WorkflowAndPublicationStatusValues {


    /**
     * Data set is in preliminary status of on-going development.
     * 
     */
    @XmlEnumValue("Working draft")
    WORKING_DRAFT("Working draft"),

    /**
     * Data set is finished and ready for internal review.
     * 
     */
    @XmlEnumValue("Final draft for internal review")
    FINAL_DRAFT_FOR_INTERNAL_REVIEW("Final draft for internal review"),

    /**
     * Data set is ready for an external review (after a potential internal review and correction if required).
     * 
     */
    @XmlEnumValue("Final draft for external review")
    FINAL_DRAFT_FOR_EXTERNAL_REVIEW("Final draft for external review"),

    /**
     * Data set is finalised (with or without an internal and/or external review and correction if required), but it is not or not yet
     *                         published.
     * 
     */
    @XmlEnumValue("Data set finalised; unpublished")
    DATA_SET_FINALISED_UNPUBLISHED("Data set finalised; unpublished"),

    /**
     * Data set is under revision and the publication of the revised data set is foreseen.
     * 
     */
    @XmlEnumValue("Under revision")
    UNDER_REVISION("Under revision"),

    /**
     * Data set has been withdrawn and must not be used anymore. For details contact the "Data set owner".
     * 
     */
    @XmlEnumValue("Withdrawn")
    WITHDRAWN("Withdrawn"),

    /**
     * Data set is finalised (with or without an internal and/or external review and correction if required), and sub-system(s) / included processes
     *                         have been published.
     * 
     */
    @XmlEnumValue("Data set finalised; subsystems published")
    DATA_SET_FINALISED_SUBSYSTEMS_PUBLISHED("Data set finalised; subsystems published"),

    /**
     * Data set is finalised (with or without an internal and/or external review and correction if required), and was entirely
     *                         published.
     * 
     */
    @XmlEnumValue("Data set finalised; entirely published")
    DATA_SET_FINALISED_ENTIRELY_PUBLISHED("Data set finalised; entirely published");
    private final String value;

    WorkflowAndPublicationStatusValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkflowAndPublicationStatusValues fromValue(String v) {
        for (WorkflowAndPublicationStatusValues c: WorkflowAndPublicationStatusValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
