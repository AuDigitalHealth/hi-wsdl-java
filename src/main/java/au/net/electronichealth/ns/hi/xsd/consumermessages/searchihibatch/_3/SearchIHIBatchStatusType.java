
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessageType;


/**
 * <p>Java class for SearchIHIBatchStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchIHIBatchStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}batchIdentifier"/>
 *         &lt;element name="status" type="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/SearchIHIBatch/3.0}BatchResponseStatusType"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}serviceMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
