
package au.net.electronichealth.ns.hi.svc.consumernotifyduplicateihi._3_2;

import au.net.electronichealth.ns.hi.xsd.consumermessages.notifyduplicateihi._3_2.NotifyDuplicateIHIResult;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/NotifyDuplicateIHI/3.2.0}notifyDuplicateIHIResult"/&gt;
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
    "notifyDuplicateIHIResult"
})
@XmlRootElement(name = "notifyDuplicateIHIResponse")
public class NotifyDuplicateIHIResponse {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/consumermessages/NotifyDuplicateIHI/3.2.0", required = true)
    protected NotifyDuplicateIHIResult notifyDuplicateIHIResult;

    /**
     * Gets the value of the notifyDuplicateIHIResult property.
     * 
     * @return
     *     possible object is
     *     {@link NotifyDuplicateIHIResult }
     *     
     */
    public NotifyDuplicateIHIResult getNotifyDuplicateIHIResult() {
        return notifyDuplicateIHIResult;
    }

    /**
     * Sets the value of the notifyDuplicateIHIResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotifyDuplicateIHIResult }
     *     
     */
    public void setNotifyDuplicateIHIResult(NotifyDuplicateIHIResult value) {
        this.notifyDuplicateIHIResult = value;
    }

}
