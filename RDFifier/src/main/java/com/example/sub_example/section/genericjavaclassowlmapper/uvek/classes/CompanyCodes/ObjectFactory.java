
package com.example.sub_example.section.genericjavaclassowlmapper.uvek.classes.CompanyCodes;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the CompanyCodes package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: CompanyCodes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompanyCodes }
     * 
     */
    public CompanyCodes createCompanyCodes() {
        return new CompanyCodes();
    }

    /**
     * Create an instance of {@link CompanyCodes.CountryCode }
     * 
     */
    public CompanyCodes.CountryCode createCompanyCodesCountryCode() {
        return new CompanyCodes.CountryCode();
    }

    /**
     * Create an instance of {@link TPerson }
     * 
     */
    public TPerson createTPerson() {
        return new TPerson();
    }

    /**
     * Create an instance of {@link CompanyCodes.CountryCode.CompanyCode }
     * 
     */
    public CompanyCodes.CountryCode.CompanyCode createCompanyCodesCountryCodeCompanyCode() {
        return new CompanyCodes.CountryCode.CompanyCode();
    }

}
