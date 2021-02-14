
package au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.DateAccuracyIndicatorType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.SexType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.TrueFalseType;
import au.net.electronichealth.ns.hi.xsd.common.qualifiedidentifier._3.QualifiedId;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3 package. 
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

    private final static QName _ServiceMessages_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "serviceMessages");
    private final static QName _Hpio_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "hpio");
    private final static QName _User_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "user");
    private final static QName _ServiceMessage_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "serviceMessage");
    private final static QName _Product_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "product");
    private final static QName _DateOfDeathAccuracyIndicator_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "dateOfDeathAccuracyIndicator");
    private final static QName _DateOfDeath_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "dateOfDeath");
    private final static QName _DateOfBirth_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "dateOfBirth");
    private final static QName _StartDate_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "startDate");
    private final static QName _Sex_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "sex");
    private final static QName _DateOfBirthAccuracyIndicator_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "dateOfBirthAccuracyIndicator");
    private final static QName _Timestamp_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "timestamp");
    private final static QName _Preferred_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "preferred");
    private final static QName _EndDate_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "endDate");
    private final static QName _Signature_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", "signature");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceMessagesType }
     * 
     */
    public ServiceMessagesType createServiceMessagesType() {
        return new ServiceMessagesType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link TimestampType }
     * 
     */
    public TimestampType createTimestampType() {
        return new TimestampType();
    }

    /**
     * Create an instance of {@link ServiceMessageType }
     * 
     */
    public ServiceMessageType createServiceMessageType() {
        return new ServiceMessageType();
    }

    /**
     * Create an instance of {@link SignatureContainerType }
     * 
     */
    public SignatureContainerType createSignatureContainerType() {
        return new SignatureContainerType();
    }

    /**
     * Create an instance of {@link Detail }
     * 
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMessagesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "serviceMessages")
    public JAXBElement<ServiceMessagesType> createServiceMessages(ServiceMessagesType value) {
        return new JAXBElement<ServiceMessagesType>(_ServiceMessages_QNAME, ServiceMessagesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifiedId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "hpio")
    public JAXBElement<QualifiedId> createHpio(QualifiedId value) {
        return new JAXBElement<QualifiedId>(_Hpio_QNAME, QualifiedId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QualifiedId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "user")
    public JAXBElement<QualifiedId> createUser(QualifiedId value) {
        return new JAXBElement<QualifiedId>(_User_QNAME, QualifiedId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "serviceMessage")
    public JAXBElement<ServiceMessageType> createServiceMessage(ServiceMessageType value) {
        return new JAXBElement<ServiceMessageType>(_ServiceMessage_QNAME, ServiceMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "product")
    public JAXBElement<ProductType> createProduct(ProductType value) {
        return new JAXBElement<ProductType>(_Product_QNAME, ProductType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateAccuracyIndicatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "dateOfDeathAccuracyIndicator")
    public JAXBElement<DateAccuracyIndicatorType> createDateOfDeathAccuracyIndicator(DateAccuracyIndicatorType value) {
        return new JAXBElement<DateAccuracyIndicatorType>(_DateOfDeathAccuracyIndicator_QNAME, DateAccuracyIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "dateOfDeath")
    public JAXBElement<XMLGregorianCalendar> createDateOfDeath(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateOfDeath_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "dateOfBirth")
    public JAXBElement<XMLGregorianCalendar> createDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateOfBirth_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "startDate")
    public JAXBElement<XMLGregorianCalendar> createStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StartDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SexType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "sex")
    public JAXBElement<SexType> createSex(SexType value) {
        return new JAXBElement<SexType>(_Sex_QNAME, SexType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateAccuracyIndicatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "dateOfBirthAccuracyIndicator")
    public JAXBElement<DateAccuracyIndicatorType> createDateOfBirthAccuracyIndicator(DateAccuracyIndicatorType value) {
        return new JAXBElement<DateAccuracyIndicatorType>(_DateOfBirthAccuracyIndicator_QNAME, DateAccuracyIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimestampType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "timestamp")
    public JAXBElement<TimestampType> createTimestamp(TimestampType value) {
        return new JAXBElement<TimestampType>(_Timestamp_QNAME, TimestampType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrueFalseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "preferred")
    public JAXBElement<TrueFalseType> createPreferred(TrueFalseType value) {
        return new JAXBElement<TrueFalseType>(_Preferred_QNAME, TrueFalseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "endDate")
    public JAXBElement<XMLGregorianCalendar> createEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", name = "signature")
    public JAXBElement<SignatureContainerType> createSignature(SignatureContainerType value) {
        return new JAXBElement<SignatureContainerType>(_Signature_QNAME, SignatureContainerType.class, null, value);
    }

}
