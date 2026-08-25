
package au.net.electronichealth.ns.hi.xsd.providermessages.managetdsproviderindividual._3_2;

import java.util.ArrayList;
import java.util.List;
import au.gov.medicareaustralia.ns.provider.schema._2013._06._22.elements.DetailsResponseType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessagesType;
import au.net.electronichealth.ns.hi.xsd.providercore.certificate._3_2.CertificateResponseType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for providerIndividualResponse complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="providerIndividualResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hpiiNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}HpiiNumberType" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}StatusType" minOccurs="0"/&gt;
 *         &lt;element name="clientRef" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ClientRefType" minOccurs="0"/&gt;
 *         &lt;element name="individualNameResponses" type="{http://ns.medicareaustralia.gov.au/provider/schema/2013/06/22/elements}DetailsResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addressResponses" type="{http://ns.medicareaustralia.gov.au/provider/schema/2013/06/22/elements}DetailsResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="providerTypeResponses" type="{http://ns.medicareaustralia.gov.au/provider/schema/2013/06/22/elements}DetailsResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="electronicCommunicationResponses" type="{http://ns.medicareaustralia.gov.au/provider/schema/2013/06/22/elements}DetailsResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0}certificateResponse" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}serviceMessages" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerIndividualResponse", propOrder = {
    "hpiiNumber",
    "status",
    "clientRef",
    "individualNameResponses",
    "addressResponses",
    "providerTypeResponses",
    "electronicCommunicationResponses",
    "certificateResponse",
    "serviceMessages"
})
public class ProviderIndividualResponse {

    @XmlSchemaType(name = "anyURI")
    protected String hpiiNumber;
    protected String status;
    protected String clientRef;
    protected List<DetailsResponseType> individualNameResponses;
    protected List<DetailsResponseType> addressResponses;
    protected List<DetailsResponseType> providerTypeResponses;
    protected List<DetailsResponseType> electronicCommunicationResponses;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0")
    protected CertificateResponseType certificateResponse;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected ServiceMessagesType serviceMessages;

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
     * Gets the value of the clientRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRef() {
        return clientRef;
    }

    /**
     * Sets the value of the clientRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRef(String value) {
        this.clientRef = value;
    }

    /**
     * Gets the value of the individualNameResponses property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the individualNameResponses property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIndividualNameResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsResponseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the individualNameResponses property.
     */
    public List<DetailsResponseType> getIndividualNameResponses() {
        if (individualNameResponses == null) {
            individualNameResponses = new ArrayList<>();
        }
        return this.individualNameResponses;
    }

    /**
     * Gets the value of the addressResponses property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addressResponses property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getAddressResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsResponseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the addressResponses property.
     */
    public List<DetailsResponseType> getAddressResponses() {
        if (addressResponses == null) {
            addressResponses = new ArrayList<>();
        }
        return this.addressResponses;
    }

    /**
     * Gets the value of the providerTypeResponses property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the providerTypeResponses property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getProviderTypeResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsResponseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the providerTypeResponses property.
     */
    public List<DetailsResponseType> getProviderTypeResponses() {
        if (providerTypeResponses == null) {
            providerTypeResponses = new ArrayList<>();
        }
        return this.providerTypeResponses;
    }

    /**
     * Gets the value of the electronicCommunicationResponses property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the electronicCommunicationResponses property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getElectronicCommunicationResponses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsResponseType }
     * </p>
     * 
     * 
     * @return
     *     The value of the electronicCommunicationResponses property.
     */
    public List<DetailsResponseType> getElectronicCommunicationResponses() {
        if (electronicCommunicationResponses == null) {
            electronicCommunicationResponses = new ArrayList<>();
        }
        return this.electronicCommunicationResponses;
    }

    /**
     * Gets the value of the certificateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateResponseType }
     *     
     */
    public CertificateResponseType getCertificateResponse() {
        return certificateResponse;
    }

    /**
     * Sets the value of the certificateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateResponseType }
     *     
     */
    public void setCertificateResponse(CertificateResponseType value) {
        this.certificateResponse = value;
    }

    /**
     * Gets the value of the serviceMessages property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceMessagesType }
     *     
     */
    public ServiceMessagesType getServiceMessages() {
        return serviceMessages;
    }

    /**
     * Sets the value of the serviceMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceMessagesType }
     *     
     */
    public void setServiceMessages(ServiceMessagesType value) {
        this.serviceMessages = value;
    }

}
