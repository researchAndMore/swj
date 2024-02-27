
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowTypeValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlowTypeValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Elementary flow"/&gt;
 *     &lt;enumeration value="Product flow"/&gt;
 *     &lt;enumeration value="Waste flow"/&gt;
 *     &lt;enumeration value="Other flow"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlowTypeValues", namespace = "http://lca.jrc.it/ILCD/Common")
@XmlEnum
public enum FlowTypeValues {


    /**
     * Exchange between nature (ecosphere) and technosphere, e.g. an emission, resource.
     * 
     */
    @XmlEnumValue("Elementary flow")
    ELEMENTARY_FLOW("Elementary flow"),

    /**
     * Exchange of goods or services within technosphere, with a positive economic/market value.
     * 
     */
    @XmlEnumValue("Product flow")
    PRODUCT_FLOW("Product flow"),

    /**
     * Exchange of matters within the technosphere, with a economic/market value equal or below "0".
     * 
     */
    @XmlEnumValue("Waste flow")
    WASTE_FLOW("Waste flow"),

    /**
     * Exchange of other type, e.g. dummy or modelling support flows.
     * 
     */
    @XmlEnumValue("Other flow")
    OTHER_FLOW("Other flow");
    private final String value;

    FlowTypeValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlowTypeValues fromValue(String v) {
        for (FlowTypeValues c: FlowTypeValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
