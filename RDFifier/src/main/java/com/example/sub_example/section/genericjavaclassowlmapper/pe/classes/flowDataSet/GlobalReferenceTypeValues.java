
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.flowDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GlobalReferenceTypeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GlobalReferenceTypeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="source data set"/&gt;
 *     &lt;enumeration value="process data set"/&gt;
 *     &lt;enumeration value="flow data set"/&gt;
 *     &lt;enumeration value="flow property data set"/&gt;
 *     &lt;enumeration value="unit group data set"/&gt;
 *     &lt;enumeration value="contact data set"/&gt;
 *     &lt;enumeration value="LCIA method data set"/&gt;
 *     &lt;enumeration value="other external file"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GlobalReferenceTypeValues", namespace = "http://lca.jrc.it/ILCD/Common")
@XmlEnum
public enum GlobalReferenceTypeValues {

    @XmlEnumValue("source data set")
    SOURCE_DATA_SET("source data set"),
    @XmlEnumValue("process data set")
    PROCESS_DATA_SET("process data set"),
    @XmlEnumValue("flow data set")
    FLOW_DATA_SET("flow data set"),
    @XmlEnumValue("flow property data set")
    FLOW_PROPERTY_DATA_SET("flow property data set"),
    @XmlEnumValue("unit group data set")
    UNIT_GROUP_DATA_SET("unit group data set"),
    @XmlEnumValue("contact data set")
    CONTACT_DATA_SET("contact data set"),
    @XmlEnumValue("LCIA method data set")
    LCIA_METHOD_DATA_SET("LCIA method data set"),
    @XmlEnumValue("other external file")
    OTHER_EXTERNAL_FILE("other external file");
    private final String value;

    GlobalReferenceTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalReferenceTypeValues fromValue(String v) {
        for (GlobalReferenceTypeValues c: GlobalReferenceTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
