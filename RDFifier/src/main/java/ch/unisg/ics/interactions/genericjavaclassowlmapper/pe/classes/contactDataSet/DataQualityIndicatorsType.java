
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.contactDataSet;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for DataQualityIndicatorsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataQualityIndicatorsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataQualityIndicator" type="{http://lca.jrc.it/ILCD/Common}DataQualityIndicatorType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataQualityIndicatorsType", namespace = "http://lca.jrc.it/ILCD/Common", propOrder = {
    "dataQualityIndicator"
})
public class DataQualityIndicatorsType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common", required = true)
    protected List<DataQualityIndicatorType> dataQualityIndicator;

    /**
     * Gets the value of the dataQualityIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataQualityIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataQualityIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataQualityIndicatorType }
     * 
     * 
     */
    public List<DataQualityIndicatorType> getDataQualityIndicator() {
        if (dataQualityIndicator == null) {
            dataQualityIndicator = new ArrayList<DataQualityIndicatorType>();
        }
        return this.dataQualityIndicator;
    }

}
