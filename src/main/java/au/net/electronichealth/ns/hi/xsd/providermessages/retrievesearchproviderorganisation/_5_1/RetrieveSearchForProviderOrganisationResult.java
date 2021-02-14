
package au.net.electronichealth.ns.hi.xsd.providermessages.retrievesearchproviderorganisation._5_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessagesType;
import au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._5_1.BatchSearchForProviderOrganisationResultType;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0}batchIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/5.1.0}batchSearchForProviderOrganisationResult" maxOccurs="50" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}serviceMessages" minOccurs="0"/>
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
    "batchIdentifier",
    "batchSearchForProviderOrganisationResult",
    "serviceMessages"
})
@XmlRootElement(name = "retrieveSearchForProviderOrganisationResult")
public class RetrieveSearchForProviderOrganisationResult {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0")
    protected String batchIdentifier;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/5.1.0")
    protected List<BatchSearchForProviderOrganisationResultType> batchSearchForProviderOrganisationResult;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected ServiceMessagesType serviceMessages;

    /**
     * Gets the value of the batchIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchIdentifier() {
        return batchIdentifier;
    }

    /**
     * Sets the value of the batchIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchIdentifier(String value) {
        this.batchIdentifier = value;
    }

    /**
     * Gets the value of the batchSearchForProviderOrganisationResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchSearchForProviderOrganisationResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchSearchForProviderOrganisationResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchSearchForProviderOrganisationResultType }
     * 
     * 
     */
    public List<BatchSearchForProviderOrganisationResultType> getBatchSearchForProviderOrganisationResult() {
        if (batchSearchForProviderOrganisationResult == null) {
            batchSearchForProviderOrganisationResult = new ArrayList<BatchSearchForProviderOrganisationResultType>();
        }
        return this.batchSearchForProviderOrganisationResult;
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
