
package au.net.electronichealth.ns.hi.xsd.providermessages.searchtdsproviderindividual._5_1;

import java.util.ArrayList;
import java.util.List;
import au.net.electronichealth.ns.hi.xsd.providercore.address._5_1.AddressRecordResponse;
import au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._5_1.ElectronicCommunicationRecordResponse;
import au.net.electronichealth.ns.hi.xsd.providercore.individualname._5_1.IndividualNameRecordResponse;
import au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2.PersonalDetails;
import au.net.electronichealth.ns.hi.xsd.providercore.providertype._5_1.ProviderTypeRecordResponse;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hpiiNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}HpiiNumberType"/&gt;
 *         &lt;element name="status" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}StatusType"/&gt;
 *         &lt;element name="personalDetails" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0}PersonalDetails"/&gt;
 *         &lt;element name="individualNameRecord" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/5.1.0}IndividualNameRecordResponse" maxOccurs="unbounded"/&gt;
 *         &lt;element name="addressRecord" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/5.1.0}AddressRecordResponse" maxOccurs="unbounded"/&gt;
 *         &lt;element name="electronicCommunicationRecord" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/5.1.0}ElectronicCommunicationRecordResponse" maxOccurs="unbounded"/&gt;
 *         &lt;element name="providerTypeRecord" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.1.1}ProviderTypeRecordResponse" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hpiiNumber",
    "status",
    "personalDetails",
    "individualNameRecord",
    "addressRecord",
    "electronicCommunicationRecord",
    "providerTypeRecord"
})
@XmlRootElement(name = "providerIndividual")
public class ProviderIndividual {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String hpiiNumber;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected PersonalDetails personalDetails;
    @XmlElement(required = true)
    protected List<IndividualNameRecordResponse> individualNameRecord;
    @XmlElement(required = true)
    protected List<AddressRecordResponse> addressRecord;
    @XmlElement(required = true)
    protected List<ElectronicCommunicationRecordResponse> electronicCommunicationRecord;
    @XmlElement(required = true)
    protected List<ProviderTypeRecordResponse> providerTypeRecord;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the personalDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalDetails }
     *     
     */
    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    /**
     * Sets the value of the personalDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalDetails }
     *     
     */
    public void setPersonalDetails(PersonalDetails value) {
        this.personalDetails = value;
    }

    /**
     * Gets the value of the individualNameRecord property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the individualNameRecord property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIndividualNameRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualNameRecordResponse }
     * </p>
     * 
     * 
     * @return
     *     The value of the individualNameRecord property.
     */
    public List<IndividualNameRecordResponse> getIndividualNameRecord() {
        if (individualNameRecord == null) {
            individualNameRecord = new ArrayList<>();
        }
        return this.individualNameRecord;
    }

    /**
     * Gets the value of the addressRecord property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addressRecord property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddressRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressRecordResponse }
     * </p>
     * 
     * 
     * @return
     *     The value of the addressRecord property.
     */
    public List<AddressRecordResponse> getAddressRecord() {
        if (addressRecord == null) {
            addressRecord = new ArrayList<>();
        }
        return this.addressRecord;
    }

    /**
     * Gets the value of the electronicCommunicationRecord property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the electronicCommunicationRecord property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getElectronicCommunicationRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicCommunicationRecordResponse }
     * </p>
     * 
     * 
     * @return
     *     The value of the electronicCommunicationRecord property.
     */
    public List<ElectronicCommunicationRecordResponse> getElectronicCommunicationRecord() {
        if (electronicCommunicationRecord == null) {
            electronicCommunicationRecord = new ArrayList<>();
        }
        return this.electronicCommunicationRecord;
    }

    /**
     * Gets the value of the providerTypeRecord property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the providerTypeRecord property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProviderTypeRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderTypeRecordResponse }
     * </p>
     * 
     * 
     * @return
     *     The value of the providerTypeRecord property.
     */
    public List<ProviderTypeRecordResponse> getProviderTypeRecord() {
        if (providerTypeRecord == null) {
            providerTypeRecord = new ArrayList<>();
        }
        return this.providerTypeRecord;
    }

}
