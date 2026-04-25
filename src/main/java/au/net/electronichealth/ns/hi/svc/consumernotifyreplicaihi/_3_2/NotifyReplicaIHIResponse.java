
package au.net.electronichealth.ns.hi.svc.consumernotifyreplicaihi._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.consumermessages.notifyreplicaihi._3_2.NotifyReplicaIHIResult;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/NotifyReplicaIHI/3.2.0}notifyReplicaIHIResult"/>
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
    "notifyReplicaIHIResult"
})
@XmlRootElement(name = "notifyReplicaIHIResponse")
public class NotifyReplicaIHIResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/NotifyReplicaIHI/3.2.0", required = true)
    protected NotifyReplicaIHIResult notifyReplicaIHIResult;

    /**
     * Gets the value of the notifyReplicaIHIResult property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyReplicaIHIResult }
     *     
     */
    public NotifyReplicaIHIResult getNotifyReplicaIHIResult() {
        return notifyReplicaIHIResult;
    }

    /**
     * Sets the value of the notifyReplicaIHIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyReplicaIHIResult }
     *     
     */
    public void setNotifyReplicaIHIResult(NotifyReplicaIHIResult value) {
        this.notifyReplicaIHIResult = value;
    }

}
