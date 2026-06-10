
package au.net.electronichealth.ns.hi.xsd.providermessages.retrievesearchproviderindividual._5_1;

import java.util.ArrayList;
import java.util.List;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessagesType;
import au.net.electronichealth.ns.hi.xsd.providercore.providertype._5_1.BatchSearchForProviderIndividualResultType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0}batchIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.1.0}batchSearchForProviderIndividualResult" maxOccurs="50" minOccurs="0"/&gt;
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
    "batchIdentifier",
    "batchSearchForProviderIndividualResult",
    "serviceMessages"
})
@XmlRootElement(name = "retrieveSearchForProviderIndividualResult")
public class RetrieveSearchForProviderIndividualResult {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0")
    protected String batchIdentifier;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/5.1.0")
    protected List<BatchSearchForProviderIndividualResultType> batchSearchForProviderIndividualResult;
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
     * Gets the value of the batchSearchForProviderIndividualResult property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the batchSearchForProviderIndividualResult property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBatchSearchForProviderIndividualResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchSearchForProviderIndividualResultType }
     * </p>
     * 
     * 
     * @return
     *     The value of the batchSearchForProviderIndividualResult property.
     */
    public List<BatchSearchForProviderIndividualResultType> getBatchSearchForProviderIndividualResult() {
        if (batchSearchForProviderIndividualResult == null) {
            batchSearchForProviderIndividualResult = new ArrayList<>();
        }
        return this.batchSearchForProviderIndividualResult;
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
