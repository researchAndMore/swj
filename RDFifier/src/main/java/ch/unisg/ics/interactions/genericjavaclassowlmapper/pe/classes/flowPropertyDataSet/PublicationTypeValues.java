
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.flowPropertyDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicationTypeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PublicationTypeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Undefined"/&gt;
 *     &lt;enumeration value="Article in periodical"/&gt;
 *     &lt;enumeration value="Chapter in anthology"/&gt;
 *     &lt;enumeration value="Monograph"/&gt;
 *     &lt;enumeration value="Direct measurement"/&gt;
 *     &lt;enumeration value="Oral communication"/&gt;
 *     &lt;enumeration value="Personal written communication"/&gt;
 *     &lt;enumeration value="Questionnaire"/&gt;
 *     &lt;enumeration value="Software or database"/&gt;
 *     &lt;enumeration value="Other unpublished and grey literature"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PublicationTypeValues")
@XmlEnum
public enum PublicationTypeValues {


    /**
     * Mixed, unclear or not defined publication type.
     * 
     */
    @XmlEnumValue("Undefined")
    UNDEFINED("Undefined"),

    /**
     * Printed article in periodical e.g. a journal paper
     * 
     */
    @XmlEnumValue("Article in periodical")
    ARTICLE_IN_PERIODICAL("Article in periodical"),

    /**
     * Chapter with distinct author in monograph with own editor.
     * 
     */
    @XmlEnumValue("Chapter in anthology")
    CHAPTER_IN_ANTHOLOGY("Chapter in anthology"),

    /**
     * Non-serial publication complete in one volume or a finite number of volumes. Including patents.
     * 
     */
    @XmlEnumValue("Monograph")
    MONOGRAPH("Monograph"),

    /**
     * Measured directly from the process to be represented.
     * 
     */
    @XmlEnumValue("Direct measurement")
    DIRECT_MEASUREMENT("Direct measurement"),

    /**
     * Direct or remote/phone oral information.
     * 
     */
    @XmlEnumValue("Oral communication")
    ORAL_COMMUNICATION("Oral communication"),

    /**
     * By individual to individual via letter, fax, email etc.
     * 
     */
    @XmlEnumValue("Personal written communication")
    PERSONAL_WRITTEN_COMMUNICATION("Personal written communication"),

    /**
     * Data received by a questionnaire targeting to data input for LCA use. Including existing data previously measured on site by process owner or
     *                         operator and provided officially in written form for LCA purposes. Excludes data transferred from elsewhere published data.
     * 
     */
    @XmlEnumValue("Questionnaire")
    QUESTIONNAIRE("Questionnaire"),

    /**
     * Software tools or databases, based on mixed sources, e.g. LCA databases.
     * 
     */
    @XmlEnumValue("Software or database")
    SOFTWARE_OR_DATABASE("Software or database"),

    /**
     * Including internal reports for other purposes than LCA, confidential LCA studies, master theses, etc. Includes also
     *                         websites.
     * 
     */
    @XmlEnumValue("Other unpublished and grey literature")
    OTHER_UNPUBLISHED_AND_GREY_LITERATURE("Other unpublished and grey literature");
    private final String value;

    PublicationTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PublicationTypeValues fromValue(String v) {
        for (PublicationTypeValues c: PublicationTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
