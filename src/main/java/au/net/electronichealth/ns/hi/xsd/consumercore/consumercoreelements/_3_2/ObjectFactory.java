
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoreelements._3_2;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.TrueFalseType;
import au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3_2.IHIRecordStatusType;
import au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3_2.IHIStatusType;
import au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3_2.SourceOfDeathNotificationType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.consumercore.consumercoreelements._3_2 package. 
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

    private final static QName _Comment_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", "comment");
    private final static QName _IhiNumberStatusGroup_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", "ihiNumberStatusGroup");
    private final static QName _SourceOfDeathNotification_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", "sourceOfDeathNotification");
    private final static QName _BirthPlurality_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", "birthPlurality");
    private final static QName _MedicareCardNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", "medicareCardNumber");
    private final static QName _History_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", "history");
    private final static QName _DvaFileNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", "dvaFileNumber");
    private final static QName _IhiNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", "ihiNumber");
    private final static QName _MedicareIRN_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", "medicareIRN");
    private final static QName _IhiRecordStatus_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", "ihiRecordStatus");
    private final static QName _IhiStatus_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", "ihiStatus");
    private final static QName _BirthOrder_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", "birthOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.consumercore.consumercoreelements._3_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IHINumberStatusGroupType }
     * 
     */
    public IHINumberStatusGroupType createIHINumberStatusGroupType() {
        return new IHINumberStatusGroupType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", name = "comment")
    public JAXBElement<String> createComment(String value) {
        return new JAXBElement<String>(_Comment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IHINumberStatusGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", name = "ihiNumberStatusGroup")
    public JAXBElement<IHINumberStatusGroupType> createIhiNumberStatusGroup(IHINumberStatusGroupType value) {
        return new JAXBElement<IHINumberStatusGroupType>(_IhiNumberStatusGroup_QNAME, IHINumberStatusGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceOfDeathNotificationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", name = "sourceOfDeathNotification")
    public JAXBElement<SourceOfDeathNotificationType> createSourceOfDeathNotification(SourceOfDeathNotificationType value) {
        return new JAXBElement<SourceOfDeathNotificationType>(_SourceOfDeathNotification_QNAME, SourceOfDeathNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", name = "birthPlurality")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBirthPlurality(String value) {
        return new JAXBElement<String>(_BirthPlurality_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", name = "medicareCardNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMedicareCardNumber(String value) {
        return new JAXBElement<String>(_MedicareCardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrueFalseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", name = "history")
    public JAXBElement<TrueFalseType> createHistory(TrueFalseType value) {
        return new JAXBElement<TrueFalseType>(_History_QNAME, TrueFalseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", name = "dvaFileNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDvaFileNumber(String value) {
        return new JAXBElement<String>(_DvaFileNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", name = "ihiNumber")
    public JAXBElement<String> createIhiNumber(String value) {
        return new JAXBElement<String>(_IhiNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", name = "medicareIRN")
    public JAXBElement<Integer> createMedicareIRN(Integer value) {
        return new JAXBElement<Integer>(_MedicareIRN_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IHIRecordStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", name = "ihiRecordStatus")
    public JAXBElement<IHIRecordStatusType> createIhiRecordStatus(IHIRecordStatusType value) {
        return new JAXBElement<IHIRecordStatusType>(_IhiRecordStatus_QNAME, IHIRecordStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IHIStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", name = "ihiStatus")
    public JAXBElement<IHIStatusType> createIhiStatus(IHIStatusType value) {
        return new JAXBElement<IHIStatusType>(_IhiStatus_QNAME, IHIStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.2.0", name = "birthOrder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBirthOrder(String value) {
        return new JAXBElement<String>(_BirthOrder_QNAME, String.class, null, value);
    }

}
