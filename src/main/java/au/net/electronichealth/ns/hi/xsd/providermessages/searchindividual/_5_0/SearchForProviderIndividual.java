
package au.net.electronichealth.ns.hi.xsd.providermessages.searchindividual._5_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import au.net.electronichealth.ns.hi.xsd.common.addresscore._5_0.SearchAustralianAddressType;
import au.net.electronichealth.ns.hi.xsd.common.addresscore._5_0.SearchInternationalAddressType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.SexType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.StateType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0}hpiiNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.0.0}registrationId" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}familyName"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/5.0.0}onlyNameIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}givenName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/5.0.0}dateOfBirth" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}sex" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}state" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0}postcode" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/5.0.0}searchAustralianAddress" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/5.0.0}searchInternationalAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hpiiNumber",
    "registrationId",
    "familyName",
    "onlyNameIndicator",
    "givenName",
    "dateOfBirth",
    "sex",
    "state",
    "postcode",
    "searchAustralianAddress",
    "searchInternationalAddress"
})
@XmlRootElement(name = "searchForProviderIndividual")
public class SearchForProviderIndividual {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.0.0")
    protected String hpiiNumber;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.0.0")
    protected String registrationId;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", required = true)
    protected String familyName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/5.0.0")
    protected Boolean onlyNameIndicator;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected List<String> givenName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/5.0.0")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected SexType sex;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0")
    protected StateType state;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/3.0")
    protected String postcode;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/5.0.0")
    protected SearchAustralianAddressType searchAustralianAddress;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/AddressCore/5.0.0")
    protected SearchInternationalAddressType searchInternationalAddress;

    /**
     * Gets the value of the hpiiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpiiNumber() {
        return hpiiNumber;
    }

    /**
     * Sets the value of the hpiiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpiiNumber(String value) {
        this.hpiiNumber = value;
    }

    /**
     * Gets the value of the registrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Sets the value of the registrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationId(String value) {
        this.registrationId = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the onlyNameIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlyNameIndicator() {
        return onlyNameIndicator;
    }

    /**
     * Sets the value of the onlyNameIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlyNameIndicator(Boolean value) {
        this.onlyNameIndicator = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<String>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link SexType }
     *     
     */
    public SexType getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link SexType }
     *     
     */
    public void setSex(SexType value) {
        this.sex = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setState(StateType value) {
        this.state = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the searchAustralianAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SearchAustralianAddressType }
     *     
     */
    public SearchAustralianAddressType getSearchAustralianAddress() {
        return searchAustralianAddress;
    }

    /**
     * Sets the value of the searchAustralianAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchAustralianAddressType }
     *     
     */
    public void setSearchAustralianAddress(SearchAustralianAddressType value) {
        this.searchAustralianAddress = value;
    }

    /**
     * Gets the value of the searchInternationalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SearchInternationalAddressType }
     *     
     */
    public SearchInternationalAddressType getSearchInternationalAddress() {
        return searchInternationalAddress;
    }

    /**
     * Sets the value of the searchInternationalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchInternationalAddressType }
     *     
     */
    public void setSearchInternationalAddress(SearchInternationalAddressType value) {
        this.searchInternationalAddress = value;
    }

}
