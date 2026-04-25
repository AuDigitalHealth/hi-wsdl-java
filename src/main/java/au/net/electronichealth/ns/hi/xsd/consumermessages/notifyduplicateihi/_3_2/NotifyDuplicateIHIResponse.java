
package au.net.electronichealth.ns.hi.xsd.consumermessages.notifyduplicateihi._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/NotifyDuplicateIHI/3.2.0}notifyDuplicateIHIResult"/>
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
    "notifyDuplicateIHIResult"
})
@XmlRootElement(name = "notifyDuplicateIHIResponse")
public class NotifyDuplicateIHIResponse {

    @XmlElement(required = true)
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
