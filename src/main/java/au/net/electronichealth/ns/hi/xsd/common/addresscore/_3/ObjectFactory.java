
package au.net.electronichealth.ns.hi.xsd.common.addresscore._3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.AddressPurposeType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.CountryType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.LevelType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.PostalDeliveryType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.StateType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.StreetSuffixType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.StreetType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.UnitType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the au.net.electronichealth.ns.hi.xsd.common.addresscore._3 package. 
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

    private final static QName _AddressSiteName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "addressSiteName");
    private final static QName _StreetSuffix_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "streetSuffix");
    private final static QName _InternationalPostcode_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "internationalPostcode");
    private final static QName _PostalDeliveryGroup_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "postalDeliveryGroup");
    private final static QName _UnitGroup_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "unitGroup");
    private final static QName _InternationalAddressLine_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "internationalAddressLine");
    private final static QName _Postcode_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "postcode");
    private final static QName _Country_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "country");
    private final static QName _UnitType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "unitType");
    private final static QName _InternationalStateProvince_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "internationalStateProvince");
    private final static QName _StreetNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "streetNumber");
    private final static QName _StreetType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "streetType");
    private final static QName _LevelType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "levelType");
    private final static QName _Suburb_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "suburb");
    private final static QName _UnitNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "unitNumber");
    private final static QName _State_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "state");
    private final static QName _PostalDeliveryNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "postalDeliveryNumber");
    private final static QName _Purpose_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "purpose");
    private final static QName _PostalDeliveryType_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "postalDeliveryType");
    private final static QName _StreetName_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "streetName");
    private final static QName _LotNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "lotNumber");
    private final static QName _LevelNumber_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "levelNumber");
    private final static QName _LevelGroup_QNAME = new QName("http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", "levelGroup");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: au.net.electronichealth.ns.hi.xsd.common.addresscore._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LevelGroupType }
     * 
     */
    public LevelGroupType createLevelGroupType() {
        return new LevelGroupType();
    }

    /**
     * Create an instance of {@link PostalDeliveryGroupType }
     * 
     */
    public PostalDeliveryGroupType createPostalDeliveryGroupType() {
        return new PostalDeliveryGroupType();
    }

    /**
     * Create an instance of {@link UnitGroupType }
     * 
     */
    public UnitGroupType createUnitGroupType() {
        return new UnitGroupType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "addressSiteName")
    public JAXBElement<String> createAddressSiteName(String value) {
        return new JAXBElement<String>(_AddressSiteName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreetSuffixType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "streetSuffix")
    public JAXBElement<StreetSuffixType> createStreetSuffix(StreetSuffixType value) {
        return new JAXBElement<StreetSuffixType>(_StreetSuffix_QNAME, StreetSuffixType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "internationalPostcode")
    public JAXBElement<String> createInternationalPostcode(String value) {
        return new JAXBElement<String>(_InternationalPostcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalDeliveryGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "postalDeliveryGroup")
    public JAXBElement<PostalDeliveryGroupType> createPostalDeliveryGroup(PostalDeliveryGroupType value) {
        return new JAXBElement<PostalDeliveryGroupType>(_PostalDeliveryGroup_QNAME, PostalDeliveryGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "unitGroup")
    public JAXBElement<UnitGroupType> createUnitGroup(UnitGroupType value) {
        return new JAXBElement<UnitGroupType>(_UnitGroup_QNAME, UnitGroupType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "internationalAddressLine")
    public JAXBElement<String> createInternationalAddressLine(String value) {
        return new JAXBElement<String>(_InternationalAddressLine_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "postcode")
    public JAXBElement<String> createPostcode(String value) {
        return new JAXBElement<String>(_Postcode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "country")
    public JAXBElement<CountryType> createCountry(CountryType value) {
        return new JAXBElement<CountryType>(_Country_QNAME, CountryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "unitType")
    public JAXBElement<UnitType> createUnitType(UnitType value) {
        return new JAXBElement<UnitType>(_UnitType_QNAME, UnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "internationalStateProvince")
    public JAXBElement<String> createInternationalStateProvince(String value) {
        return new JAXBElement<String>(_InternationalStateProvince_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "streetNumber")
    public JAXBElement<String> createStreetNumber(String value) {
        return new JAXBElement<String>(_StreetNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StreetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "streetType")
    public JAXBElement<StreetType> createStreetType(StreetType value) {
        return new JAXBElement<StreetType>(_StreetType_QNAME, StreetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "levelType")
    public JAXBElement<LevelType> createLevelType(LevelType value) {
        return new JAXBElement<LevelType>(_LevelType_QNAME, LevelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "suburb")
    public JAXBElement<String> createSuburb(String value) {
        return new JAXBElement<String>(_Suburb_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "unitNumber")
    public JAXBElement<String> createUnitNumber(String value) {
        return new JAXBElement<String>(_UnitNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "state")
    public JAXBElement<StateType> createState(StateType value) {
        return new JAXBElement<StateType>(_State_QNAME, StateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "postalDeliveryNumber")
    public JAXBElement<String> createPostalDeliveryNumber(String value) {
        return new JAXBElement<String>(_PostalDeliveryNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressPurposeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "purpose")
    public JAXBElement<AddressPurposeType> createPurpose(AddressPurposeType value) {
        return new JAXBElement<AddressPurposeType>(_Purpose_QNAME, AddressPurposeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostalDeliveryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "postalDeliveryType")
    public JAXBElement<PostalDeliveryType> createPostalDeliveryType(PostalDeliveryType value) {
        return new JAXBElement<PostalDeliveryType>(_PostalDeliveryType_QNAME, PostalDeliveryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "streetName")
    public JAXBElement<String> createStreetName(String value) {
        return new JAXBElement<String>(_StreetName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "lotNumber")
    public JAXBElement<String> createLotNumber(String value) {
        return new JAXBElement<String>(_LotNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "levelNumber")
    public JAXBElement<String> createLevelNumber(String value) {
        return new JAXBElement<String>(_LevelNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LevelGroupType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0", name = "levelGroup")
    public JAXBElement<LevelGroupType> createLevelGroup(LevelGroupType value) {
        return new JAXBElement<LevelGroupType>(_LevelGroup_QNAME, LevelGroupType.class, null, value);
    }

}
