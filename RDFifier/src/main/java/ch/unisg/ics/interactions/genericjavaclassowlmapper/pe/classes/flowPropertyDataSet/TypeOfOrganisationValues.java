
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.flowPropertyDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeOfOrganisationValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeOfOrganisationValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Private company"/&gt;
 *     &lt;enumeration value="Governmental"/&gt;
 *     &lt;enumeration value="Non-governmental org."/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TypeOfOrganisationValues")
@XmlEnum
public enum TypeOfOrganisationValues {


    /**
     * Private company
     * 
     */
    @XmlEnumValue("Private company")
    PRIVATE_COMPANY("Private company"),

    /**
     * Governmental organisation
     * 
     */
    @XmlEnumValue("Governmental")
    GOVERNMENTAL("Governmental"),

    /**
     * Non-governmental organisation
     * 
     */
    @XmlEnumValue("Non-governmental org.")
    NON_GOVERNMENTAL_ORG("Non-governmental org."),

    /**
     * Other, e.g. a project consortium or network
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeOfOrganisationValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfOrganisationValues fromValue(String v) {
        for (TypeOfOrganisationValues c: TypeOfOrganisationValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
