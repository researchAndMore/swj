
package ch.unisg.ics.interactions.genericjavaclassowlmapper.pe.classes.ProcessDataSet;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ProcessDataSet package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ProcessDataSet_QNAME = new QName("http://lca.jrc.it/ILCD/Process", "processDataSet");
    private final static QName _AccessRestrictions_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "accessRestrictions");
    private final static QName _CommissionerAndGoal_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "commissionerAndGoal");
    private final static QName _Copyright_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "copyright");
    private final static QName _DataQualityIndicators_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "dataQualityIndicators");
    private final static QName _DateOfLastRevision_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "dateOfLastRevision");
    private final static QName _DocumentationCompliance_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "documentationCompliance");
    private final static QName _GeneralComment_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "generalComment");
    private final static QName _MethodologicalCompliance_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "methodologicalCompliance");
    private final static QName _Name_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "name");
    private final static QName _NomenclatureCompliance_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "nomenclatureCompliance");
    private final static QName _QualityCompliance_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "qualityCompliance");
    private final static QName _ReferenceToConvertedOriginalDataSetFrom_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "referenceToConvertedOriginalDataSetFrom");
    private final static QName _ReferenceToDataSetUseApproval_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "referenceToDataSetUseApproval");
    private final static QName _ReferenceToOwnershipOfDataSet_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "referenceToOwnershipOfDataSet");
    private final static QName _ReferenceToPersonOrEntityGeneratingTheDataSet_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "referenceToPersonOrEntityGeneratingTheDataSet");
    private final static QName _ReferenceToRawDataDocumentation_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "referenceToRawDataDocumentation");
    private final static QName _ReferenceToRegistrationAuthority_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "referenceToRegistrationAuthority");
    private final static QName _RegistrationNumber_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "registrationNumber");
    private final static QName _ReviewCompliance_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "reviewCompliance");
    private final static QName _ReviewDetails_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "reviewDetails");
    private final static QName _ShortName_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "shortName");
    private final static QName _Synonyms_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "synonyms");
    private final static QName _UUID_QNAME = new QName("http://lca.jrc.it/ILCD/Common", "UUID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ProcessDataSet
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReviewType }
     * 
     */
    public ReviewType createReviewType() {
        return new ReviewType();
    }

    /**
     * Create an instance of {@link ReviewType.Scope }
     * 
     */
    public ReviewType.Scope createReviewTypeScope() {
        return new ReviewType.Scope();
    }

    /**
     * Create an instance of {@link ProcessDataSetType }
     * 
     */
    public ProcessDataSetType createProcessDataSetType() {
        return new ProcessDataSetType();
    }

    /**
     * Create an instance of {@link AdministrativeInformationType }
     * 
     */
    public AdministrativeInformationType createAdministrativeInformationType() {
        return new AdministrativeInformationType();
    }

    /**
     * Create an instance of {@link AllocationsType }
     * 
     */
    public AllocationsType createAllocationsType() {
        return new AllocationsType();
    }

    /**
     * Create an instance of {@link AllocationType }
     * 
     */
    public AllocationType createAllocationType() {
        return new AllocationType();
    }

    /**
     * Create an instance of {@link ComplementingProcessesType }
     * 
     */
    public ComplementingProcessesType createComplementingProcessesType() {
        return new ComplementingProcessesType();
    }

    /**
     * Create an instance of {@link CompletenessElementaryFlowsType }
     * 
     */
    public CompletenessElementaryFlowsType createCompletenessElementaryFlowsType() {
        return new CompletenessElementaryFlowsType();
    }

    /**
     * Create an instance of {@link CompletenessType }
     * 
     */
    public CompletenessType createCompletenessType() {
        return new CompletenessType();
    }

    /**
     * Create an instance of {@link ComplianceDeclarationsType }
     * 
     */
    public ComplianceDeclarationsType createComplianceDeclarationsType() {
        return new ComplianceDeclarationsType();
    }

    /**
     * Create an instance of {@link ComplianceType }
     * 
     */
    public ComplianceType createComplianceType() {
        return new ComplianceType();
    }

    /**
     * Create an instance of {@link DataEntryByType }
     * 
     */
    public DataEntryByType createDataEntryByType() {
        return new DataEntryByType();
    }

    /**
     * Create an instance of {@link DataGeneratorType }
     * 
     */
    public DataGeneratorType createDataGeneratorType() {
        return new DataGeneratorType();
    }

    /**
     * Create an instance of {@link DataSetInformationType }
     * 
     */
    public DataSetInformationType createDataSetInformationType() {
        return new DataSetInformationType();
    }

    /**
     * Create an instance of {@link DataSourcesTreatmentAndRepresentativenessType }
     * 
     */
    public DataSourcesTreatmentAndRepresentativenessType createDataSourcesTreatmentAndRepresentativenessType() {
        return new DataSourcesTreatmentAndRepresentativenessType();
    }

    /**
     * Create an instance of {@link ExchangesType }
     * 
     */
    public ExchangesType createExchangesType() {
        return new ExchangesType();
    }

    /**
     * Create an instance of {@link ExchangeType }
     * 
     */
    public ExchangeType createExchangeType() {
        return new ExchangeType();
    }

    /**
     * Create an instance of {@link GeographyType }
     * 
     */
    public GeographyType createGeographyType() {
        return new GeographyType();
    }

    /**
     * Create an instance of {@link LCIAResultsType }
     * 
     */
    public LCIAResultsType createLCIAResultsType() {
        return new LCIAResultsType();
    }

    /**
     * Create an instance of {@link LCIAResultType }
     * 
     */
    public LCIAResultType createLCIAResultType() {
        return new LCIAResultType();
    }

    /**
     * Create an instance of {@link LCIMethodAndAllocationType }
     * 
     */
    public LCIMethodAndAllocationType createLCIMethodAndAllocationType() {
        return new LCIMethodAndAllocationType();
    }

    /**
     * Create an instance of {@link LocationOfOperationSupplyOrProductionType }
     * 
     */
    public LocationOfOperationSupplyOrProductionType createLocationOfOperationSupplyOrProductionType() {
        return new LocationOfOperationSupplyOrProductionType();
    }

    /**
     * Create an instance of {@link MathematicalRelationsType }
     * 
     */
    public MathematicalRelationsType createMathematicalRelationsType() {
        return new MathematicalRelationsType();
    }

    /**
     * Create an instance of {@link ModellingAndValidationType }
     * 
     */
    public ModellingAndValidationType createModellingAndValidationType() {
        return new ModellingAndValidationType();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link ProcessInformationType }
     * 
     */
    public ProcessInformationType createProcessInformationType() {
        return new ProcessInformationType();
    }

    /**
     * Create an instance of {@link PublicationAndOwnershipType }
     * 
     */
    public PublicationAndOwnershipType createPublicationAndOwnershipType() {
        return new PublicationAndOwnershipType();
    }

    /**
     * Create an instance of {@link QuantitativeReferenceType }
     * 
     */
    public QuantitativeReferenceType createQuantitativeReferenceType() {
        return new QuantitativeReferenceType();
    }

    /**
     * Create an instance of {@link ReferencesToDataSourceType }
     * 
     */
    public ReferencesToDataSourceType createReferencesToDataSourceType() {
        return new ReferencesToDataSourceType();
    }

    /**
     * Create an instance of {@link SubLocationOfOperationSupplyOrProductionType }
     * 
     */
    public SubLocationOfOperationSupplyOrProductionType createSubLocationOfOperationSupplyOrProductionType() {
        return new SubLocationOfOperationSupplyOrProductionType();
    }

    /**
     * Create an instance of {@link TechnologyType }
     * 
     */
    public TechnologyType createTechnologyType() {
        return new TechnologyType();
    }

    /**
     * Create an instance of {@link ValidationType }
     * 
     */
    public ValidationType createValidationType() {
        return new ValidationType();
    }

    /**
     * Create an instance of {@link VariableParameterType }
     * 
     */
    public VariableParameterType createVariableParameterType() {
        return new VariableParameterType();
    }

    /**
     * Create an instance of {@link FTMultiLang }
     * 
     */
    public FTMultiLang createFTMultiLang() {
        return new FTMultiLang();
    }

    /**
     * Create an instance of {@link CommissionerAndGoalType }
     * 
     */
    public CommissionerAndGoalType createCommissionerAndGoalType() {
        return new CommissionerAndGoalType();
    }

    /**
     * Create an instance of {@link DataQualityIndicatorsType }
     * 
     */
    public DataQualityIndicatorsType createDataQualityIndicatorsType() {
        return new DataQualityIndicatorsType();
    }

    /**
     * Create an instance of {@link StringMultiLang }
     * 
     */
    public StringMultiLang createStringMultiLang() {
        return new StringMultiLang();
    }

    /**
     * Create an instance of {@link Other }
     * 
     */
    public Other createOther() {
        return new Other();
    }

    /**
     * Create an instance of {@link GlobalReferenceType }
     * 
     */
    public GlobalReferenceType createGlobalReferenceType() {
        return new GlobalReferenceType();
    }

    /**
     * Create an instance of {@link STMultiLang }
     * 
     */
    public STMultiLang createSTMultiLang() {
        return new STMultiLang();
    }

    /**
     * Create an instance of {@link CategoryType }
     * 
     */
    public CategoryType createCategoryType() {
        return new CategoryType();
    }

    /**
     * Create an instance of {@link ClassificationInformationType }
     * 
     */
    public ClassificationInformationType createClassificationInformationType() {
        return new ClassificationInformationType();
    }

    /**
     * Create an instance of {@link ClassificationType }
     * 
     */
    public ClassificationType createClassificationType() {
        return new ClassificationType();
    }

    /**
     * Create an instance of {@link ClassType }
     * 
     */
    public ClassType createClassType() {
        return new ClassType();
    }

    /**
     * Create an instance of {@link DataQualityIndicatorType }
     * 
     */
    public DataQualityIndicatorType createDataQualityIndicatorType() {
        return new DataQualityIndicatorType();
    }

    /**
     * Create an instance of {@link FlowCategorizationType }
     * 
     */
    public FlowCategorizationType createFlowCategorizationType() {
        return new FlowCategorizationType();
    }

    /**
     * Create an instance of {@link FlowCategoryInformationType }
     * 
     */
    public FlowCategoryInformationType createFlowCategoryInformationType() {
        return new FlowCategoryInformationType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link TimeType }
     * 
     */
    public TimeType createTimeType() {
        return new TimeType();
    }

    /**
     * Create an instance of {@link ReviewType.Scope.Method }
     * 
     */
    public ReviewType.Scope.Method createReviewTypeScopeMethod() {
        return new ReviewType.Scope.Method();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessDataSetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessDataSetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Process", name = "processDataSet")
    public JAXBElement<ProcessDataSetType> createProcessDataSet(ProcessDataSetType value) {
        return new JAXBElement<ProcessDataSetType>(_ProcessDataSet_QNAME, ProcessDataSetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FTMultiLang }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FTMultiLang }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "accessRestrictions")
    public JAXBElement<FTMultiLang> createAccessRestrictions(FTMultiLang value) {
        return new JAXBElement<FTMultiLang>(_AccessRestrictions_QNAME, FTMultiLang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommissionerAndGoalType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommissionerAndGoalType }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "commissionerAndGoal")
    public JAXBElement<CommissionerAndGoalType> createCommissionerAndGoal(CommissionerAndGoalType value) {
        return new JAXBElement<CommissionerAndGoalType>(_CommissionerAndGoal_QNAME, CommissionerAndGoalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "copyright")
    public JAXBElement<Boolean> createCopyright(Boolean value) {
        return new JAXBElement<Boolean>(_Copyright_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataQualityIndicatorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DataQualityIndicatorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "dataQualityIndicators")
    public JAXBElement<DataQualityIndicatorsType> createDataQualityIndicators(DataQualityIndicatorsType value) {
        return new JAXBElement<DataQualityIndicatorsType>(_DataQualityIndicators_QNAME, DataQualityIndicatorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "dateOfLastRevision")
    public JAXBElement<XMLGregorianCalendar> createDateOfLastRevision(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateOfLastRevision_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplianceValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ComplianceValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "documentationCompliance")
    public JAXBElement<ComplianceValues> createDocumentationCompliance(ComplianceValues value) {
        return new JAXBElement<ComplianceValues>(_DocumentationCompliance_QNAME, ComplianceValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FTMultiLang }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FTMultiLang }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "generalComment")
    public JAXBElement<FTMultiLang> createGeneralComment(FTMultiLang value) {
        return new JAXBElement<FTMultiLang>(_GeneralComment_QNAME, FTMultiLang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplianceValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ComplianceValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "methodologicalCompliance")
    public JAXBElement<ComplianceValues> createMethodologicalCompliance(ComplianceValues value) {
        return new JAXBElement<ComplianceValues>(_MethodologicalCompliance_QNAME, ComplianceValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringMultiLang }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringMultiLang }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "name")
    public JAXBElement<StringMultiLang> createName(StringMultiLang value) {
        return new JAXBElement<StringMultiLang>(_Name_QNAME, StringMultiLang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplianceValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ComplianceValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "nomenclatureCompliance")
    public JAXBElement<ComplianceValues> createNomenclatureCompliance(ComplianceValues value) {
        return new JAXBElement<ComplianceValues>(_NomenclatureCompliance_QNAME, ComplianceValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplianceValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ComplianceValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "qualityCompliance")
    public JAXBElement<ComplianceValues> createQualityCompliance(ComplianceValues value) {
        return new JAXBElement<ComplianceValues>(_QualityCompliance_QNAME, ComplianceValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GlobalReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "referenceToConvertedOriginalDataSetFrom")
    public JAXBElement<GlobalReferenceType> createReferenceToConvertedOriginalDataSetFrom(GlobalReferenceType value) {
        return new JAXBElement<GlobalReferenceType>(_ReferenceToConvertedOriginalDataSetFrom_QNAME, GlobalReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GlobalReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "referenceToDataSetUseApproval")
    public JAXBElement<GlobalReferenceType> createReferenceToDataSetUseApproval(GlobalReferenceType value) {
        return new JAXBElement<GlobalReferenceType>(_ReferenceToDataSetUseApproval_QNAME, GlobalReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GlobalReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "referenceToOwnershipOfDataSet")
    public JAXBElement<GlobalReferenceType> createReferenceToOwnershipOfDataSet(GlobalReferenceType value) {
        return new JAXBElement<GlobalReferenceType>(_ReferenceToOwnershipOfDataSet_QNAME, GlobalReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GlobalReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "referenceToPersonOrEntityGeneratingTheDataSet")
    public JAXBElement<GlobalReferenceType> createReferenceToPersonOrEntityGeneratingTheDataSet(GlobalReferenceType value) {
        return new JAXBElement<GlobalReferenceType>(_ReferenceToPersonOrEntityGeneratingTheDataSet_QNAME, GlobalReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GlobalReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "referenceToRawDataDocumentation")
    public JAXBElement<GlobalReferenceType> createReferenceToRawDataDocumentation(GlobalReferenceType value) {
        return new JAXBElement<GlobalReferenceType>(_ReferenceToRawDataDocumentation_QNAME, GlobalReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GlobalReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GlobalReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "referenceToRegistrationAuthority")
    public JAXBElement<GlobalReferenceType> createReferenceToRegistrationAuthority(GlobalReferenceType value) {
        return new JAXBElement<GlobalReferenceType>(_ReferenceToRegistrationAuthority_QNAME, GlobalReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "registrationNumber")
    public JAXBElement<String> createRegistrationNumber(String value) {
        return new JAXBElement<String>(_RegistrationNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComplianceValues }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ComplianceValues }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "reviewCompliance")
    public JAXBElement<ComplianceValues> createReviewCompliance(ComplianceValues value) {
        return new JAXBElement<ComplianceValues>(_ReviewCompliance_QNAME, ComplianceValues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FTMultiLang }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FTMultiLang }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "reviewDetails")
    public JAXBElement<FTMultiLang> createReviewDetails(FTMultiLang value) {
        return new JAXBElement<FTMultiLang>(_ReviewDetails_QNAME, FTMultiLang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringMultiLang }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringMultiLang }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "shortName")
    public JAXBElement<StringMultiLang> createShortName(StringMultiLang value) {
        return new JAXBElement<StringMultiLang>(_ShortName_QNAME, StringMultiLang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FTMultiLang }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FTMultiLang }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "synonyms")
    public JAXBElement<FTMultiLang> createSynonyms(FTMultiLang value) {
        return new JAXBElement<FTMultiLang>(_Synonyms_QNAME, FTMultiLang.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://lca.jrc.it/ILCD/Common", name = "UUID")
    public JAXBElement<String> createUUID(String value) {
        return new JAXBElement<String>(_UUID_QNAME, String.class, null, value);
    }

}
