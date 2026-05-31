
package au.net.electronichealth.ns.hi.xsd.providermessages.searchtdsproviderindividual._5_1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._5_1.AddressRecordResponse;
import au.net.electronichealth.ns.hi.xsd.providercore.electroniccommunication._5_1.ElectronicCommunicationRecordResponse;
import au.net.electronichealth.ns.hi.xsd.providercore.individualname._5_1.IndividualNameRecordResponse;
import au.net.electronichealth.ns.hi.xsd.providercore.personaldetails._3_2.PersonalDetails;
import au.net.electronichealth.ns.hi.xsd.providercore.providertype._5_1.ProviderTypeRecordResponse;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="hpiiNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}HpiiNumberType"/>
 *         <element name="status" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}StatusType"/>
 *         <element name="personalDetails" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/PersonalDetails/3.2.0}PersonalDetails"/>
 *         <element name="individualNameRecord" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/5.1.0}IndividualNameRecordResponse" maxOccurs="unbounded"/>
 *         <element name="addressRecord" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/5.1.0}AddressRecordResponse" maxOccurs="unbounded"/>
 *         <element name="electronicCommunicationRecord" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ElectronicCommunication/5.1.0}ElectronicCommunicationRecordResponse" maxOccurs="unbounded"/>
 *         <element name="providerTypeRecord" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.1.1}ProviderTypeRecordResponse" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * </pre>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualNameRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualNameRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualNameRecordResponse }
     * 
     * 
     */
    public List<IndividualNameRecordResponse> getIndividualNameRecord() {
        if (individualNameRecord == null) {
            individualNameRecord = new ArrayList<IndividualNameRecordResponse>();
        }
        return this.individualNameRecord;
    }

    /**
     * Gets the value of the addressRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressRecordResponse }
     * 
     * 
     */
    public List<AddressRecordResponse> getAddressRecord() {
        if (addressRecord == null) {
            addressRecord = new ArrayList<AddressRecordResponse>();
        }
        return this.addressRecord;
    }

    /**
     * Gets the value of the electronicCommunicationRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicCommunicationRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElectronicCommunicationRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElectronicCommunicationRecordResponse }
     * 
     * 
     */
    public List<ElectronicCommunicationRecordResponse> getElectronicCommunicationRecord() {
        if (electronicCommunicationRecord == null) {
            electronicCommunicationRecord = new ArrayList<ElectronicCommunicationRecordResponse>();
        }
        return this.electronicCommunicationRecord;
    }

    /**
     * Gets the value of the providerTypeRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerTypeRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderTypeRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderTypeRecordResponse }
     * 
     * 
     */
    public List<ProviderTypeRecordResponse> getProviderTypeRecord() {
        if (providerTypeRecord == null) {
            providerTypeRecord = new ArrayList<ProviderTypeRecordResponse>();
        }
        return this.providerTypeRecord;
    }

}
