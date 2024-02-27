
package com.example.sub_example.section.genericjavaclassowlmapper.pe.classes.LCIAMethodDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ScopeOfReviewValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ScopeOfReviewValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Substance properties, physical and chemical"/&gt;
 *     &lt;enumeration value="Substance properties, biological"/&gt;
 *     &lt;enumeration value="Model for Transport and Fate"/&gt;
 *     &lt;enumeration value="Model for Exposure"/&gt;
 *     &lt;enumeration value="Model for Effect"/&gt;
 *     &lt;enumeration value="Model for Damage"/&gt;
 *     &lt;enumeration value="Characterisation factors"/&gt;
 *     &lt;enumeration value="Application of model"/&gt;
 *     &lt;enumeration value="Normalisation"/&gt;
 *     &lt;enumeration value="Weighting"/&gt;
 *     &lt;enumeration value="Documentation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ScopeOfReviewValues", namespace = "http://lca.jrc.it/ILCD/LCIAMethod")
@XmlEnum
public enum ScopeOfReviewValues {


    /**
     * Considered physical and chemical properties used for the model.
     * 
     */
    @XmlEnumValue("Substance properties, physical and chemical")
    SUBSTANCE_PROPERTIES_PHYSICAL_AND_CHEMICAL("Substance properties, physical and chemical"),

    /**
     * Considered biological properties of substances used for the model.
     * 
     */
    @XmlEnumValue("Substance properties, biological")
    SUBSTANCE_PROPERTIES_BIOLOGICAL("Substance properties, biological"),

    /**
     * Model for transport and fate of substances in the environment.
     * 
     */
    @XmlEnumValue("Model for Transport and Fate")
    MODEL_FOR_TRANSPORT_AND_FATE("Model for Transport and Fate"),

    /**
     * Model for exposure of included protection targets.
     * 
     */
    @XmlEnumValue("Model for Exposure")
    MODEL_FOR_EXPOSURE("Model for Exposure"),

    /**
     * Model for effect to included protection targets.
     * 
     */
    @XmlEnumValue("Model for Effect")
    MODEL_FOR_EFFECT("Model for Effect"),

    /**
     * Model for calculation of damage effects to included protection targets.
     * 
     */
    @XmlEnumValue("Model for Damage")
    MODEL_FOR_DAMAGE("Model for Damage"),

    /**
     * Review of calculation and results of single characterisation factors resulting from the model as a whole.
     * 
     */
    @XmlEnumValue("Characterisation factors")
    CHARACTERISATION_FACTORS("Characterisation factors"),

    /**
     * Review of the general application of the model to the LCIA method.
     * 
     */
    @XmlEnumValue("Application of model")
    APPLICATION_OF_MODEL("Application of model"),

    /**
     * Included normalisation, if any.
     * 
     */
    @XmlEnumValue("Normalisation")
    NORMALISATION("Normalisation"),

    /**
     * Included weighting scheme, if any.
     * 
     */
    @XmlEnumValue("Weighting")
    WEIGHTING("Weighting"),

    /**
     * Verification of the appropriateness and correctness of the documentation.
     * 
     */
    @XmlEnumValue("Documentation")
    DOCUMENTATION("Documentation");
    private final String value;

    ScopeOfReviewValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScopeOfReviewValues fromValue(String v) {
        for (ScopeOfReviewValues c: ScopeOfReviewValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
