
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.flowDataSet;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataQualityIndicatorValues.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataQualityIndicatorValues"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Technological representativeness"/&gt;
 *     &lt;enumeration value="Time representativeness"/&gt;
 *     &lt;enumeration value="Geographical representativeness"/&gt;
 *     &lt;enumeration value="Completeness"/&gt;
 *     &lt;enumeration value="Precision"/&gt;
 *     &lt;enumeration value="Methodological appropriateness and consistency"/&gt;
 *     &lt;enumeration value="Overall quality"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataQualityIndicatorValues", namespace = "http://lca.jrc.it/ILCD/Common")
@XmlEnum
public enum DataQualityIndicatorValues {


    /**
     * Degree to which the data set reflects the true population of interest regarding technology, including for included background data sets, if
     *                         any.
     * 
     */
    @XmlEnumValue("Technological representativeness")
    TECHNOLOGICAL_REPRESENTATIVENESS("Technological representativeness"),

    /**
     * Degree to which the data set reflects the true population of interest regarding time / age of the data, including for included background data
     *                         sets, if any.
     * 
     */
    @XmlEnumValue("Time representativeness")
    TIME_REPRESENTATIVENESS("Time representativeness"),

    /**
     * Degree to which the data set reflects the true population of interest regarding geography such as e.g. country or site, including for included
     *                         background data sets, if any.
     * 
     */
    @XmlEnumValue("Geographical representativeness")
    GEOGRAPHICAL_REPRESENTATIVENESS("Geographical representativeness"),

    /**
     * Share of (elementary) flows that are quantitatively included in the inventory. Note that also the completeness of interim product and waste
     *                         flows in the product model contributes to the overall completeness of the inventory.
     * 
     */
    @XmlEnumValue("Completeness")
    COMPLETENESS("Completeness"),

    /**
     * Measure of the variability of the data values for each data expressed (e.g. low variance = high precision).
     * 
     */
    @XmlEnumValue("Precision")
    PRECISION("Precision"),

    /**
     * The applied LCI methods and methodological choices (e.g. allocation, substitution, etc.) are in line with the goal and scope of the data set,
     *                         especially its intended applications and decision support context (e.g. monitoring, product-specific decision support, strategic long-term decision
     *                         support). The methods also have been consistently applied across all data including for included processes, if any.
     * 
     */
    @XmlEnumValue("Methodological appropriateness and consistency")
    METHODOLOGICAL_APPROPRIATENESS_AND_CONSISTENCY("Methodological appropriateness and consistency"),

    /**
     * The degree to which the data set’s overall representativeness, completeness, precision as well as methodological appropriateness and
     *                         consistency reflects the reality the data set is representing.
     * 
     */
    @XmlEnumValue("Overall quality")
    OVERALL_QUALITY("Overall quality");
    private final String value;

    DataQualityIndicatorValues(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataQualityIndicatorValues fromValue(String v) {
        for (DataQualityIndicatorValues c: DataQualityIndicatorValues.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
