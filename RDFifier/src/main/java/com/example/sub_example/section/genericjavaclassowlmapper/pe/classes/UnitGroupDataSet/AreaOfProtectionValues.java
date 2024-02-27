
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.UnitGroupDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaOfProtectionValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AreaOfProtectionValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Natural resources"/&gt;
 *     &lt;enumeration value="Natural environment"/&gt;
 *     &lt;enumeration value="Human health"/&gt;
 *     &lt;enumeration value="Man-made environment"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AreaOfProtectionValues", namespace = "http://lca.jrc.it/ILCD/Common")
@XmlEnum
public enum AreaOfProtectionValues {

    @XmlEnumValue("Natural resources")
    NATURAL_RESOURCES("Natural resources"),
    @XmlEnumValue("Natural environment")
    NATURAL_ENVIRONMENT("Natural environment"),
    @XmlEnumValue("Human health")
    HUMAN_HEALTH("Human health"),
    @XmlEnumValue("Man-made environment")
    MAN_MADE_ENVIRONMENT("Man-made environment"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    AreaOfProtectionValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaOfProtectionValues fromValue(String v) {
        for (AreaOfProtectionValues c: AreaOfProtectionValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
