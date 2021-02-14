
package au.net.electronichealth.ns.hi.xsd.providercore.certificate._3_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.providercore.certificate._3_2 package. 
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

    private final static QName _RequestCertificate_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", "requestCertificate");
    private final static QName _RaNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", "raNumber");
    private final static QName _Token_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", "token");
    private final static QName _NewCertificateRequest_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", "newCertificateRequest");
    private final static QName _CertificateResponse_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", "certificateResponse");
    private final static QName _OperatingSystem_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", "operatingSystem");
    private final static QName _DistinguishedName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", "distinguishedName");
    private final static QName _Certificate_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", "certificate");
    private final static QName _OtherOperatingSystem_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", "otherOperatingSystem");
    private final static QName _LinkCertificateRequest_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", "linkCertificateRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.providercore.certificate._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CertificateResponseType }
     * 
     */
    public CertificateResponseType createCertificateResponseType() {
        return new CertificateResponseType();
    }

    /**
     * Create an instance of {@link CertificateType }
     * 
     */
    public CertificateType createCertificateType() {
        return new CertificateType();
    }

    /**
     * Create an instance of {@link NewCertificateRequestType }
     * 
     */
    public NewCertificateRequestType createNewCertificateRequestType() {
        return new NewCertificateRequestType();
    }

    /**
     * Create an instance of {@link LinkCertificateRequestType }
     * 
     */
    public LinkCertificateRequestType createLinkCertificateRequestType() {
        return new LinkCertificateRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", name = "requestCertificate")
    public JAXBElement<Boolean> createRequestCertificate(Boolean value) {
        return new JAXBElement<Boolean>(_RequestCertificate_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", name = "raNumber")
    public JAXBElement<String> createRaNumber(String value) {
        return new JAXBElement<String>(_RaNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", name = "token")
    public JAXBElement<String> createToken(String value) {
        return new JAXBElement<String>(_Token_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewCertificateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", name = "newCertificateRequest")
    public JAXBElement<NewCertificateRequestType> createNewCertificateRequest(NewCertificateRequestType value) {
        return new JAXBElement<NewCertificateRequestType>(_NewCertificateRequest_QNAME, NewCertificateRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", name = "certificateResponse")
    public JAXBElement<CertificateResponseType> createCertificateResponse(CertificateResponseType value) {
        return new JAXBElement<CertificateResponseType>(_CertificateResponse_QNAME, CertificateResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", name = "operatingSystem")
    public JAXBElement<String> createOperatingSystem(String value) {
        return new JAXBElement<String>(_OperatingSystem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", name = "distinguishedName")
    public JAXBElement<String> createDistinguishedName(String value) {
        return new JAXBElement<String>(_DistinguishedName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", name = "certificate")
    public JAXBElement<CertificateType> createCertificate(CertificateType value) {
        return new JAXBElement<CertificateType>(_Certificate_QNAME, CertificateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", name = "otherOperatingSystem")
    public JAXBElement<String> createOtherOperatingSystem(String value) {
        return new JAXBElement<String>(_OtherOperatingSystem_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkCertificateRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0", name = "linkCertificateRequest")
    public JAXBElement<LinkCertificateRequestType> createLinkCertificateRequest(LinkCertificateRequestType value) {
        return new JAXBElement<LinkCertificateRequestType>(_LinkCertificateRequest_QNAME, LinkCertificateRequestType.class, null, value);
    }

}
