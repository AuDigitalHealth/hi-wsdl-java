
package au.net.electronichealth.ns.hi.xsd.providermessages.manageprovideradministrativeindividual._3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessagesType;
import au.net.electronichealth.ns.hi.xsd.providercore.certificate._3_2.CertificateResponseType;
import au.net.electronichealth.ns.hi.xsd.providercore.elements._3_2.DetailsResponseType;


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
 *         &lt;element name="qualifiedIdentifier" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}QualifiedIdentifierType"/&gt;
 *         &lt;element name="status" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}StatusType"/&gt;
 *         &lt;element name="individualNameResponses" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DetailsResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="addressResponses" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DetailsResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="electronicCommunicationResponses" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}DetailsResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "", propOrder = {
    "qualifiedIdentifier",
    "status",
    "individualNameResponses",
    "addressResponses",
    "electronicCommunicationResponses",
    "certificateResponse",
    "serviceMessages"
})
@XmlRootElement(name = "manageProviderAdministrativeIndividualResult")
public class ManageProviderAdministrativeIndividualResult {

    @XmlElement(required = true)
    protected String qualifiedIdentifier;
    @XmlElement(required = true)
    protected String status;
    protected List<DetailsResponseType> individualNameResponses;
    protected List<DetailsResponseType> addressResponses;
    protected List<DetailsResponseType> electronicCommunicationResponses;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0")
    protected CertificateResponseType certificateResponse;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected ServiceMessagesType serviceMessages;

    /**
     * Gets the value of the qualifiedIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifiedIdentifier() {
        return qualifiedIdentifier;
    }

    /**
     * Sets the value of the qualifiedIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifiedIdentifier(String value) {
        this.qualifiedIdentifier = value;
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
     * Gets the value of the individualNameResponses property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualNameResponses property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getIndividualNameResponses().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsResponseType }
     * 
     * 
     */
    public List<DetailsResponseType> getIndividualNameResponses() {
        if (individualNameResponses == null) {
            individualNameResponses = new ArrayList<DetailsResponseType>();
        }
        return this.individualNameResponses;
    }

    /**
     * Gets the value of the addressResponses property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressResponses property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getAddressResponses().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsResponseType }
     * 
     * 
     */
    public List<DetailsResponseType> getAddressResponses() {
        if (addressResponses == null) {
            addressResponses = new ArrayList<DetailsResponseType>();
        }
        return this.addressResponses;
    }

    /**
     * Gets the value of the electronicCommunicationResponses property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the electronicCommunicationResponses property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getElectronicCommunicationResponses().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link DetailsResponseType }
     * 
     * 
     */
    public List<DetailsResponseType> getElectronicCommunicationResponses() {
        if (electronicCommunicationResponses == null) {
            electronicCommunicationResponses = new ArrayList<DetailsResponseType>();
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
