
package au.net.electronichealth.ns.hi.xsd.consumercore.consumercoreelements._3;

import javax.xml.namespace.QName;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.TrueFalseType;
import au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3.IHIRecordStatusType;
import au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3.IHIStatusType;
import au.net.electronichealth.ns.hi.xsd.consumercore.consumercoredatatypes._3.SourceOfDeathNotificationType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.consumercore.consumercoreelements._3 package. 
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

    private static final QName _IhiNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", "ihiNumber");
    private static final QName _MedicareCardNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", "medicareCardNumber");
    private static final QName _MedicareIRN_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", "medicareIRN");
    private static final QName _DvaFileNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", "dvaFileNumber");
    private static final QName _History_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", "history");
    private static final QName _IhiRecordStatus_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", "ihiRecordStatus");
    private static final QName _IhiStatus_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", "ihiStatus");
    private static final QName _BirthPlurality_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", "birthPlurality");
    private static final QName _BirthOrder_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", "birthOrder");
    private static final QName _SourceOfDeathNotification_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", "sourceOfDeathNotification");
    private static final QName _PrivacyNotification_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", "privacyNotification");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.consumercore.consumercoreelements._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", name = "ihiNumber")
    public JAXBElement<String> createIhiNumber(String value) {
        return new JAXBElement<>(_IhiNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", name = "medicareCardNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMedicareCardNumber(String value) {
        return new JAXBElement<>(_MedicareCardNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", name = "medicareIRN")
    public JAXBElement<Integer> createMedicareIRN(Integer value) {
        return new JAXBElement<>(_MedicareIRN_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", name = "dvaFileNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDvaFileNumber(String value) {
        return new JAXBElement<>(_DvaFileNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrueFalseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrueFalseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", name = "history")
    public JAXBElement<TrueFalseType> createHistory(TrueFalseType value) {
        return new JAXBElement<>(_History_QNAME, TrueFalseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IHIRecordStatusType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IHIRecordStatusType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", name = "ihiRecordStatus")
    public JAXBElement<IHIRecordStatusType> createIhiRecordStatus(IHIRecordStatusType value) {
        return new JAXBElement<>(_IhiRecordStatus_QNAME, IHIRecordStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IHIStatusType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IHIStatusType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", name = "ihiStatus")
    public JAXBElement<IHIStatusType> createIhiStatus(IHIStatusType value) {
        return new JAXBElement<>(_IhiStatus_QNAME, IHIStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", name = "birthPlurality")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBirthPlurality(String value) {
        return new JAXBElement<>(_BirthPlurality_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", name = "birthOrder")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBirthOrder(String value) {
        return new JAXBElement<>(_BirthOrder_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceOfDeathNotificationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SourceOfDeathNotificationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", name = "sourceOfDeathNotification")
    public JAXBElement<SourceOfDeathNotificationType> createSourceOfDeathNotification(SourceOfDeathNotificationType value) {
        return new JAXBElement<>(_SourceOfDeathNotification_QNAME, SourceOfDeathNotificationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumercore/ConsumerCoreElements/3.0", name = "privacyNotification")
    public JAXBElement<Boolean> createPrivacyNotification(Boolean value) {
        return new JAXBElement<>(_PrivacyNotification_QNAME, Boolean.class, null, value);
    }

}
