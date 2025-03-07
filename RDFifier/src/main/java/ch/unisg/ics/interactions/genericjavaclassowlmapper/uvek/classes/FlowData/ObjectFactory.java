
package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.FlowData;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the FlowData package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: FlowData
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TPerson }
     * 
     */
    public TPerson createTPerson() {
        return new TPerson();
    }

    /**
     * Create an instance of {@link TExchange }
     * 
     */
    public TExchange createTExchange() {
        return new TExchange();
    }

    /**
     * Create an instance of {@link TAllocation }
     * 
     */
    public TAllocation createTAllocation() {
        return new TAllocation();
    }

}
