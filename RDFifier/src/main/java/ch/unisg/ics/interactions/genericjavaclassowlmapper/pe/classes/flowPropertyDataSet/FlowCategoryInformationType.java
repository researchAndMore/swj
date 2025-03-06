
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.flowPropertyDataSet;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for FlowCategoryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlowCategoryInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="elementaryFlowCategorization" type="{http://lca.jrc.it/ILCD/Common}FlowCategorizationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="classification" type="{http://lca.jrc.it/ILCD/Common}ClassificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowCategoryInformationType", propOrder = {
    "elementaryFlowCategorization",
    "classification"
})
public class FlowCategoryInformationType {

    protected List<FlowCategorizationType> elementaryFlowCategorization;
    protected List<ClassificationType> classification;

    /**
     * Gets the value of the elementaryFlowCategorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elementaryFlowCategorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElementaryFlowCategorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlowCategorizationType }
     * 
     * 
     */
    public List<FlowCategorizationType> getElementaryFlowCategorization() {
        if (elementaryFlowCategorization == null) {
            elementaryFlowCategorization = new ArrayList<FlowCategorizationType>();
        }
        return this.elementaryFlowCategorization;
    }

    /**
     * Gets the value of the classification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassificationType }
     * 
     * 
     */
    public List<ClassificationType> getClassification() {
        if (classification == null) {
            classification = new ArrayList<ClassificationType>();
        }
        return this.classification;
    }

}
