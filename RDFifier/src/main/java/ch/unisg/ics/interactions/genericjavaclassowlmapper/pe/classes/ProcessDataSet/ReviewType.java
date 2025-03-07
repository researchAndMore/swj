
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.ProcessDataSet;

import jakarta.xml.bind.annotation.*;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * <p>Java class for ReviewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviewType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://lca.jrc.it/ILCD/Common}ValidationGroup1"/&gt;
 *         &lt;group ref="{http://lca.jrc.it/ILCD/Common}ValidationGroup3"/&gt;
 *         &lt;element ref="{http://lca.jrc.it/ILCD/Common}other" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{http://lca.jrc.it/ILCD/Common}TypeOfReviewValues" /&gt;
 *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviewType", namespace = "http://lca.jrc.it/ILCD/Process", propOrder = {
    "scope",
    "dataQualityIndicators",
    "reviewDetails",
    "referenceToNameOfReviewerAndInstitution",
    "otherReviewDetails",
    "referenceToCompleteReviewReport",
    "other"
})
public class ReviewType {

    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected List<Scope> scope;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected DataQualityIndicatorsType dataQualityIndicators;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected List<FTMultiLang> reviewDetails;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected List<GlobalReferenceType> referenceToNameOfReviewerAndInstitution;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected List<FTMultiLang> otherReviewDetails;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected GlobalReferenceType referenceToCompleteReviewReport;
    @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
    protected Other other;
    @XmlAttribute(name = "type")
    protected TypeOfReviewValues type;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Scope }
     * 
     * 
     */
    public List<Scope> getScope() {
        if (scope == null) {
            scope = new ArrayList<Scope>();
        }
        return this.scope;
    }

    /**
     * Data quality indicators serve to provide the reviewed key information on the data set in a defined, computer-readable (and hence searchable) form. This
     *             serves to support LCA practitioners to identify/select the highest quality and most appropriate data sets.
     * 
     * @return
     *     possible object is
     *     {@link DataQualityIndicatorsType }
     *     
     */
    public DataQualityIndicatorsType getDataQualityIndicators() {
        return dataQualityIndicators;
    }

    /**
     * Sets the value of the dataQualityIndicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataQualityIndicatorsType }
     *     
     */
    public void setDataQualityIndicators(DataQualityIndicatorsType value) {
        this.dataQualityIndicators = value;
    }

    /**
     * Summary of the review. All the following items should be explicitly addressed: Representativeness, completeness, and precision of Inputs and Outputs for
     *             the process in its documented location, technology and time i.e. both completeness of technical model (product, waste, and elementary flows) and completeness of
     *             coverage of the relevant problem fields (environmental, human health, resource use) for this specific good, service, or process. Plausibility of data. Correctness and
     *             appropriateness of the data set documentation. Appropriateness of system boundaries, cut-off rules, LCI modelling choices such as e.g. allocation, consistency of
     *             included processes and of LCI methodology. If the data set comprises pre-calculated LCIA results, the correspondence of the Input and Output elementary flows (including
     *             their geographical validity) with the applied LCIA method(s) should be addressed by the reviewer. An overall quality statement on the data set may be included
     *             here.Gets the value of the reviewDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviewDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviewDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTMultiLang }
     * 
     * 
     */
    public List<FTMultiLang> getReviewDetails() {
        if (reviewDetails == null) {
            reviewDetails = new ArrayList<FTMultiLang>();
        }
        return this.reviewDetails;
    }

    /**
     * Gets the value of the referenceToNameOfReviewerAndInstitution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceToNameOfReviewerAndInstitution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceToNameOfReviewerAndInstitution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GlobalReferenceType }
     * 
     * 
     */
    public List<GlobalReferenceType> getReferenceToNameOfReviewerAndInstitution() {
        if (referenceToNameOfReviewerAndInstitution == null) {
            referenceToNameOfReviewerAndInstitution = new ArrayList<GlobalReferenceType>();
        }
        return this.referenceToNameOfReviewerAndInstitution;
    }

    /**
     * Gets the value of the otherReviewDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherReviewDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherReviewDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FTMultiLang }
     * 
     * 
     */
    public List<FTMultiLang> getOtherReviewDetails() {
        if (otherReviewDetails == null) {
            otherReviewDetails = new ArrayList<FTMultiLang>();
        }
        return this.otherReviewDetails;
    }

    /**
     * Gets the value of the referenceToCompleteReviewReport property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalReferenceType }
     *     
     */
    public GlobalReferenceType getReferenceToCompleteReviewReport() {
        return referenceToCompleteReviewReport;
    }

    /**
     * Sets the value of the referenceToCompleteReviewReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalReferenceType }
     *     
     */
    public void setReferenceToCompleteReviewReport(GlobalReferenceType value) {
        this.referenceToCompleteReviewReport = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link Other }
     *     
     */
    public Other getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link Other }
     *     
     */
    public void setOther(Other value) {
        this.other = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfReviewValues }
     *     
     */
    public TypeOfReviewValues getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfReviewValues }
     *     
     */
    public void setType(TypeOfReviewValues value) {
        this.type = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="method" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="name" use="required" type="{http://lca.jrc.it/ILCD/Common}MethodOfReviewValues" /&gt;
     *                 &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="name" use="required" type="{http://lca.jrc.it/ILCD/Common}ScopeOfReviewValues" /&gt;
     *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "method"
    })
    public static class Scope {

        @XmlElement(namespace = "http://lca.jrc.it/ILCD/Common")
        protected List<Method> method;
        @XmlAttribute(name = "name", required = true)
        protected ScopeOfReviewValues name;
        @XmlAnyAttribute
        private Map<QName, String> otherAttributes = new HashMap<QName, String>();

        /**
         * Gets the value of the method property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the method property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMethod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Method }
         * 
         * 
         */
        public List<Method> getMethod() {
            if (method == null) {
                method = new ArrayList<Method>();
            }
            return this.method;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link ScopeOfReviewValues }
         *     
         */
        public ScopeOfReviewValues getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link ScopeOfReviewValues }
         *     
         */
        public void setName(ScopeOfReviewValues value) {
            this.name = value;
        }

        /**
         * Gets a map that contains attributes that aren't bound to any typed property on this class.
         * 
         * <p>
         * the map is keyed by the name of the attribute and 
         * the value is the string value of the attribute.
         * 
         * the map returned by this method is live, and you can add new attribute
         * by updating the map directly. Because of this design, there's no setter.
         * 
         * 
         * @return
         *     always non-null
         */
        public Map<QName, String> getOtherAttributes() {
            return otherAttributes;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="name" use="required" type="{http://lca.jrc.it/ILCD/Common}MethodOfReviewValues" /&gt;
         *       &lt;anyAttribute processContents='lax' namespace='##other'/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Method {

            @XmlAttribute(name = "name", required = true)
            protected MethodOfReviewValues name;
            @XmlAnyAttribute
            private Map<QName, String> otherAttributes = new HashMap<QName, String>();

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link MethodOfReviewValues }
             *     
             */
            public MethodOfReviewValues getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link MethodOfReviewValues }
             *     
             */
            public void setName(MethodOfReviewValues value) {
                this.name = value;
            }

            /**
             * Gets a map that contains attributes that aren't bound to any typed property on this class.
             * 
             * <p>
             * the map is keyed by the name of the attribute and 
             * the value is the string value of the attribute.
             * 
             * the map returned by this method is live, and you can add new attribute
             * by updating the map directly. Because of this design, there's no setter.
             * 
             * 
             * @return
             *     always non-null
             */
            public Map<QName, String> getOtherAttributes() {
                return otherAttributes;
            }

        }

    }

}
