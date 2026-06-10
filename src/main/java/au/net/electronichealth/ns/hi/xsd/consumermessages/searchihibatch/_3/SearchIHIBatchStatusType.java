
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessageType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for SearchIHIBatchStatusType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="SearchIHIBatchStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}batchIdentifier"/&gt;
 *         &lt;element name="status" type="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}BatchResponseStatusType"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}serviceMessage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchIHIBatchStatusType", propOrder = {
    "batchIdentifier",
    "status",
    "serviceMessage"
})
public class SearchIHIBatchStatusType {

    @XmlElement(required = true)
    protected String batchIdentifier;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected BatchResponseStatusType status;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected ServiceMessageType serviceMessage;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link BatchResponseStatusType }
     *     
     */
    public BatchResponseStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchResponseStatusType }
     *     
     */
    public void setStatus(BatchResponseStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the serviceMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceMessageType }
     *     
     */
    public ServiceMessageType getServiceMessage() {
        return serviceMessage;
    }

    /**
     * Sets the value of the serviceMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceMessageType }
     *     
     */
    public void setServiceMessage(ServiceMessageType value) {
        this.serviceMessage = value;
    }

}
