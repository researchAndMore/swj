/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.JAXBElement
 *  jakarta.xml.bind.annotation.XmlElementDecl
 *  jakarta.xml.bind.annotation.XmlRegistry
 */
package ch.unisg.ics.interactions.genericjavaclassowlmapper.ecospold02.classes.datasets;


import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;

import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory {
    private static final QName _EcoSpold_QNAME = new QName("http://www.EcoInvent.org/EcoSpold02", "ecoSpold");
    private static final QName _TTextAndImageText_QNAME = new QName("http://www.EcoInvent.org/EcoSpold02", "text");
    private static final QName _TTextAndImageImageUrl_QNAME = new QName("http://www.EcoInvent.org/EcoSpold02", "imageUrl");
    private static final QName _TTextAndImageVariable_QNAME = new QName("http://www.EcoInvent.org/EcoSpold02", "variable");
    private static final QName _TEcoSpoldActivityDataset_QNAME = new QName("http://www.EcoInvent.org/EcoSpold02", "activityDataset");
    private static final QName _TEcoSpoldChildActivityDataset_QNAME = new QName("http://www.EcoInvent.org/EcoSpold02", "childActivityDataset");

    public TTextAndImage createTTextAndImage() {
        return new TTextAndImage();
    }

    public TUncertainty createTUncertainty() {
        return new TUncertainty();
    }

    public TEcoSpold createTEcoSpold() {
        return new TEcoSpold();
    }

    public TProperty createTProperty() {
        return new TProperty();
    }

    public TCompartmentName createTCompartmentName() {
        return new TCompartmentName();
    }

    public TString20 createTString20() {
        return new TString20();
    }

    public TString30 createTString30() {
        return new TString30();
    }

    public TString40 createTString40() {
        return new TString40();
    }

    public TString80 createTString80() {
        return new TString80();
    }

    public TString120 createTString120() {
        return new TString120();
    }

    public TString255 createTString255() {
        return new TString255();
    }

    public TString32000 createTString32000() {
        return new TString32000();
    }

    public TIndexedString32000 createTIndexedString32000() {
        return new TIndexedString32000();
    }

    public TNamedString32000 createTNamedString32000() {
        return new TNamedString32000();
    }

    public TClassification createTClassification() {
        return new TClassification();
    }

    public TCompartment createTCompartment() {
        return new TCompartment();
    }

    public TSynonym createTSynonym() {
        return new TSynonym();
    }

    public TTag createTTag() {
        return new TTag();
    }

    public TRequiredContextReference createTRequiredContextReference() {
        return new TRequiredContextReference();
    }

    public TDataEntryBy createTDataEntryBy() {
        return new TDataEntryBy();
    }

    public TTimePeriod createTTimePeriod() {
        return new TTimePeriod();
    }

    public TGeography createTGeography() {
        return new TGeography();
    }

    public TTechnology createTTechnology() {
        return new TTechnology();
    }

    public TRepresentativeness createTRepresentativeness() {
        return new TRepresentativeness();
    }

    public TDataGeneratorAndPublication createTDataGeneratorAndPublication() {
        return new TDataGeneratorAndPublication();
    }

    public TReview createTReview() {
        return new TReview();
    }

    public TActivity createTActivity() {
        return new TActivity();
    }

    public TFileAttributes createTFileAttributes() {
        return new TFileAttributes();
    }

    public TMacroEconomicScenario createTMacroEconomicScenario() {
        return new TMacroEconomicScenario();
    }

    public TCustomExchange createTCustomExchange() {
        return new TCustomExchange();
    }

    public TIntermediateExchange createTIntermediateExchange() {
        return new TIntermediateExchange();
    }

    public TElementaryExchange createTElementaryExchange() {
        return new TElementaryExchange();
    }

    public TParameter createTParameter() {
        return new TParameter();
    }

    public TTransferCoefficient createTTransferCoefficient() {
        return new TTransferCoefficient();
    }

    public TImpactIndicatorResult createTImpactIndicatorResult() {
        return new TImpactIndicatorResult();
    }

    public TActivityDescription createTActivityDescription() {
        return new TActivityDescription();
    }

    public TModellingAndValidation createTModellingAndValidation() {
        return new TModellingAndValidation();
    }

    public TAdministrativeInformation createTAdministrativeInformation() {
        return new TAdministrativeInformation();
    }

    public TFlowData createTFlowData() {
        return new TFlowData();
    }

    public TActivityDataset createTActivityDataset() {
        return new TActivityDataset();
    }

    public TTextAndImage.ImageUrl createTTextAndImageImageUrl() {
        return new TTextAndImage.ImageUrl();
    }

    public TUncertainty.Lognormal createTUncertaintyLognormal() {
        return new TUncertainty.Lognormal();
    }

    public TUncertainty.Normal createTUncertaintyNormal() {
        return new TUncertainty.Normal();
    }

    public TUncertainty.Triangular createTUncertaintyTriangular() {
        return new TUncertainty.Triangular();
    }

    public TUncertainty.Uniform createTUncertaintyUniform() {
        return new TUncertainty.Uniform();
    }

    public TUncertainty.Beta createTUncertaintyBeta() {
        return new TUncertainty.Beta();
    }

    public TUncertainty.Gamma createTUncertaintyGamma() {
        return new TUncertainty.Gamma();
    }

    public TUncertainty.Binomial createTUncertaintyBinomial() {
        return new TUncertainty.Binomial();
    }

    public TUncertainty.Undefined createTUncertaintyUndefined() {
        return new TUncertainty.Undefined();
    }

    public TUncertainty.PedigreeMatrix createTUncertaintyPedigreeMatrix() {
        return new TUncertainty.PedigreeMatrix();
    }

    @XmlElementDecl(namespace="http://www.EcoInvent.org/EcoSpold02", name="ecoSpold")
    public JAXBElement<TEcoSpold> createEcoSpold(TEcoSpold value) {
        return new JAXBElement(_EcoSpold_QNAME, TEcoSpold.class, null, (Object)value);
    }

    @XmlElementDecl(namespace="http://www.EcoInvent.org/EcoSpold02", name="text", scope=TTextAndImage.class)
    public JAXBElement<TIndexedString32000> createTTextAndImageText(TIndexedString32000 value) {
        return new JAXBElement(_TTextAndImageText_QNAME, TIndexedString32000.class, TTextAndImage.class, (Object)value);
    }

    @XmlElementDecl(namespace="http://www.EcoInvent.org/EcoSpold02", name="imageUrl", scope=TTextAndImage.class)
    public JAXBElement<TTextAndImage.ImageUrl> createTTextAndImageImageUrl(TTextAndImage.ImageUrl value) {
        return new JAXBElement(_TTextAndImageImageUrl_QNAME, TTextAndImage.ImageUrl.class, TTextAndImage.class, (Object)value);
    }

    @XmlElementDecl(namespace="http://www.EcoInvent.org/EcoSpold02", name="variable", scope=TTextAndImage.class)
    public JAXBElement<TNamedString32000> createTTextAndImageVariable(TNamedString32000 value) {
        return new JAXBElement(_TTextAndImageVariable_QNAME, TNamedString32000.class, TTextAndImage.class, (Object)value);
    }

    @XmlElementDecl(namespace="http://www.EcoInvent.org/EcoSpold02", name="activityDataset", scope=TEcoSpold.class)
    public JAXBElement<TActivityDataset> createTEcoSpoldActivityDataset(TActivityDataset value) {
        return new JAXBElement(_TEcoSpoldActivityDataset_QNAME, TActivityDataset.class, TEcoSpold.class, (Object)value);
    }

    @XmlElementDecl(namespace="http://www.EcoInvent.org/EcoSpold02", name="childActivityDataset", scope=TEcoSpold.class)
    public JAXBElement<TActivityDataset> createTEcoSpoldChildActivityDataset(TActivityDataset value) {
        return new JAXBElement(_TEcoSpoldChildActivityDataset_QNAME, TActivityDataset.class, TEcoSpold.class, (Object)value);
    }
}
