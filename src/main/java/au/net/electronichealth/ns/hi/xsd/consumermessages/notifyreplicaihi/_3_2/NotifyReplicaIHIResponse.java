
package au.net.electronichealth.ns.hi.xsd.consumermessages.notifyreplicaihi._3_2;

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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/NotifyReplicaIHI/3.2.0}notifyReplicaIHIResult"/&gt;
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
    "notifyReplicaIHIResult"
})
@XmlRootElement(name = "notifyReplicaIHIResponse")
public class NotifyReplicaIHIResponse {

    @XmlElement(required = true)
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
