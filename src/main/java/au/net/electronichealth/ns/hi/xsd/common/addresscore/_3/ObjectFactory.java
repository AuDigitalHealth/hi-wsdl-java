
package au.net.electronichealth.ns.hi.xsd.common.addresscore._3;

import javax.xml.namespace.QName;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.AddressPurposeType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.LevelType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.PostalDeliveryType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.StateType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.StreetSuffixType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.StreetType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.UnitType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.common.addresscore._3 package. 
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

    private static final QName _AddressSiteName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "addressSiteName");
    private static final QName _UnitGroup_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "unitGroup");
    private static final QName _UnitType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "unitType");
    private static final QName _UnitNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "unitNumber");
    private static final QName _LevelGroup_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "levelGroup");
    private static final QName _LevelType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "levelType");
    private static final QName _LevelNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "levelNumber");
    private static final QName _LotNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "lotNumber");
    private static final QName _StreetNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "streetNumber");
    private static final QName _StreetName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "streetName");
    private static final QName _StreetType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "streetType");
    private static final QName _StreetSuffix_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "streetSuffix");
    private static final QName _Suburb_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "suburb");
    private static final QName _Postcode_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "postcode");
    private static final QName _State_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "state");
    private static final QName _InternationalStateProvince_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "internationalStateProvince");
    private static final QName _Country_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "country");
    private static final QName _InternationalPostcode_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "internationalPostcode");
    private static final QName _InternationalAddressLine_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "internationalAddressLine");
    private static final QName _PostalDeliveryType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "postalDeliveryType");
    private static final QName _PostalDeliveryNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "postalDeliveryNumber");
    private static final QName _PostalDeliveryGroup_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "postalDeliveryGroup");
    private static final QName _Purpose_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "purpose");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.common.addresscore._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnitGroupType }
     * 
     * @return
     *     the new instance of {@link UnitGroupType }
     */
    public UnitGroupType createUnitGroupType() {
        return new UnitGroupType();
    }

    /**
     * Create an instance of {@link LevelGroupType }
     * 
     * @return
     *     the new instance of {@link LevelGroupType }
     */
    public LevelGroupType createLevelGroupType() {
        return new LevelGroupType();
    }

    /**
     * Create an instance of {@link PostalDeliveryGroupType }
     * 
     * @return
     *     the new instance of {@link PostalDeliveryGroupType }
     */
    public PostalDeliveryGroupType createPostalDeliveryGroupType() {
        return new PostalDeliveryGroupType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "addressSiteName")
    public JAXBElement<String> createAddressSiteName(String value) {
        return new JAXBElement<>(_AddressSiteName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitGroupType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnitGroupType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "unitGroup")
    public JAXBElement<UnitGroupType> createUnitGroup(UnitGroupType value) {
        return new JAXBElement<>(_UnitGroup_QNAME, UnitGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "unitType")
    public JAXBElement<UnitType> createUnitType(UnitType value) {
        return new JAXBElement<>(_UnitType_QNAME, UnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "unitNumber")
    public JAXBElement<String> createUnitNumber(String value) {
        return new JAXBElement<>(_UnitNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LevelGroupType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LevelGroupType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "levelGroup")
    public JAXBElement<LevelGroupType> createLevelGroup(LevelGroupType value) {
        return new JAXBElement<>(_LevelGroup_QNAME, LevelGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LevelType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LevelType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "levelType")
    public JAXBElement<LevelType> createLevelType(LevelType value) {
        return new JAXBElement<>(_LevelType_QNAME, LevelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "levelNumber")
    public JAXBElement<String> createLevelNumber(String value) {
        return new JAXBElement<>(_LevelNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "lotNumber")
    public JAXBElement<String> createLotNumber(String value) {
        return new JAXBElement<>(_LotNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "streetNumber")
    public JAXBElement<String> createStreetNumber(String value) {
        return new JAXBElement<>(_StreetNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "streetName")
    public JAXBElement<String> createStreetName(String value) {
        return new JAXBElement<>(_StreetName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StreetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "streetType")
    public JAXBElement<StreetType> createStreetType(StreetType value) {
        return new JAXBElement<>(_StreetType_QNAME, StreetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreetSuffixType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StreetSuffixType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "streetSuffix")
    public JAXBElement<StreetSuffixType> createStreetSuffix(StreetSuffixType value) {
        return new JAXBElement<>(_StreetSuffix_QNAME, StreetSuffixType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "suburb")
    public JAXBElement<String> createSuburb(String value) {
        return new JAXBElement<>(_Suburb_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "postcode")
    public JAXBElement<String> createPostcode(String value) {
        return new JAXBElement<>(_Postcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StateType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "state")
    public JAXBElement<StateType> createState(StateType value) {
        return new JAXBElement<>(_State_QNAME, StateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "internationalStateProvince")
    public JAXBElement<String> createInternationalStateProvince(String value) {
        return new JAXBElement<>(_InternationalStateProvince_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "country")
    public JAXBElement<String> createCountry(String value) {
        return new JAXBElement<>(_Country_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "internationalPostcode")
    public JAXBElement<String> createInternationalPostcode(String value) {
        return new JAXBElement<>(_InternationalPostcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "internationalAddressLine")
    public JAXBElement<String> createInternationalAddressLine(String value) {
        return new JAXBElement<>(_InternationalAddressLine_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalDeliveryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PostalDeliveryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "postalDeliveryType")
    public JAXBElement<PostalDeliveryType> createPostalDeliveryType(PostalDeliveryType value) {
        return new JAXBElement<>(_PostalDeliveryType_QNAME, PostalDeliveryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "postalDeliveryNumber")
    public JAXBElement<String> createPostalDeliveryNumber(String value) {
        return new JAXBElement<>(_PostalDeliveryNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalDeliveryGroupType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PostalDeliveryGroupType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "postalDeliveryGroup")
    public JAXBElement<PostalDeliveryGroupType> createPostalDeliveryGroup(PostalDeliveryGroupType value) {
        return new JAXBElement<>(_PostalDeliveryGroup_QNAME, PostalDeliveryGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressPurposeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressPurposeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "purpose")
    public JAXBElement<AddressPurposeType> createPurpose(AddressPurposeType value) {
        return new JAXBElement<>(_Purpose_QNAME, AddressPurposeType.class, null, value);
    }

}
