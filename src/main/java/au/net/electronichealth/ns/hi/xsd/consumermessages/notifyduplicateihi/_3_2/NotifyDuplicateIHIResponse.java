
package au.net.electronichealth.ns.hi.xsd.consumermessages.notifyduplicateihi._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/NotifyDuplicateIHI/3.2.0}notifyDuplicateIHIResult"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
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
