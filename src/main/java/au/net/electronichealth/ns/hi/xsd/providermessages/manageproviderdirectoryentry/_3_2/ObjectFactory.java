
package au.net.electronichealth.ns.hi.xsd.providermessages.manageproviderdirectoryentry._3_2;

import javax.xml.namespace.QName;
import au.net.electronichealth.ns.hi.xsd.providercore.providerdirectoryservice._3_2.ProviderDirectoryIndividualEntryRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.providerdirectoryservice._3_2.ProviderDirectoryOrganisationEntryRecord;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providermessages.manageproviderdirectoryentry._3_2 package. 
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

    private static final QName _QualifiedIdentifier_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", "qualifiedIdentifier");
    private static final QName _OrganisationEntry_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", "organisationEntry");
    private static final QName _IndividualEntry_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", "individualEntry");
    private static final QName _OrganisationDeleteEntry_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", "organisationDeleteEntry");
    private static final QName _IndividualDeleteEntry_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", "individualDeleteEntry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providermessages.manageproviderdirectoryentry._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ManageProviderDirectoryEntryResult }
     * 
     * @return
     *     the new instance of {@link ManageProviderDirectoryEntryResult }
     */
    public ManageProviderDirectoryEntryResult createManageProviderDirectoryEntryResult() {
        return new ManageProviderDirectoryEntryResult();
    }

    /**
     * Create an instance of {@link ManageProviderDirectoryEntry }
     * 
     * @return
     *     the new instance of {@link ManageProviderDirectoryEntry }
     */
    public ManageProviderDirectoryEntry createManageProviderDirectoryEntry() {
        return new ManageProviderDirectoryEntry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", name = "qualifiedIdentifier")
    public JAXBElement<String> createQualifiedIdentifier(String value) {
        return new JAXBElement<>(_QualifiedIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderDirectoryOrganisationEntryRecord }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProviderDirectoryOrganisationEntryRecord }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", name = "organisationEntry")
    public JAXBElement<ProviderDirectoryOrganisationEntryRecord> createOrganisationEntry(ProviderDirectoryOrganisationEntryRecord value) {
        return new JAXBElement<>(_OrganisationEntry_QNAME, ProviderDirectoryOrganisationEntryRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderDirectoryIndividualEntryRecord }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProviderDirectoryIndividualEntryRecord }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", name = "individualEntry")
    public JAXBElement<ProviderDirectoryIndividualEntryRecord> createIndividualEntry(ProviderDirectoryIndividualEntryRecord value) {
        return new JAXBElement<>(_IndividualEntry_QNAME, ProviderDirectoryIndividualEntryRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", name = "organisationDeleteEntry")
    public JAXBElement<Integer> createOrganisationDeleteEntry(Integer value) {
        return new JAXBElement<>(_OrganisationDeleteEntry_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", name = "individualDeleteEntry")
    public JAXBElement<Integer> createIndividualDeleteEntry(Integer value) {
        return new JAXBElement<>(_IndividualDeleteEntry_QNAME, Integer.class, null, value);
    }

}
