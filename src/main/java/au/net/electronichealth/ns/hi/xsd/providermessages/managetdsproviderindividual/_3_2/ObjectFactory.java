
package au.net.electronichealth.ns.hi.xsd.providermessages.managetdsproviderindividual._3_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providermessages.managetdsproviderindividual._3_2 package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ProviderIndividuals_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageTdsProviderIndividual/3.2.0", "providerIndividuals");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providermessages.managetdsproviderindividual._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProviderIndividual }
     * 
     * @return
     *     the new instance of {@link ProviderIndividual }
     */
    public ProviderIndividual createProviderIndividual() {
        return new ProviderIndividual();
    }

    /**
     * Create an instance of {@link ManageTdsProviderIndividualResult }
     * 
     * @return
     *     the new instance of {@link ManageTdsProviderIndividualResult }
     */
    public ManageTdsProviderIndividualResult createManageTdsProviderIndividualResult() {
        return new ManageTdsProviderIndividualResult();
    }

    /**
     * Create an instance of {@link ProviderIndividualResponse }
     * 
     * @return
     *     the new instance of {@link ProviderIndividualResponse }
     */
    public ProviderIndividualResponse createProviderIndividualResponse() {
        return new ProviderIndividualResponse();
    }

    /**
     * Create an instance of {@link ManageTdsProviderIndividual }
     * 
     * @return
     *     the new instance of {@link ManageTdsProviderIndividual }
     */
    public ManageTdsProviderIndividual createManageTdsProviderIndividual() {
        return new ManageTdsProviderIndividual();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderIndividual }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProviderIndividual }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageTdsProviderIndividual/3.2.0", name = "providerIndividuals")
    public JAXBElement<ProviderIndividual> createProviderIndividuals(ProviderIndividual value) {
        return new JAXBElement<>(_ProviderIndividuals_QNAME, ProviderIndividual.class, null, value);
    }

}
