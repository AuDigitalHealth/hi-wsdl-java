
package au.net.electronichealth.ns.hi.xsd.consumermessages.notifyreplicaihi._3_2;

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
 *         <element ref="{http://ns.electronichealth.net.au/hi/xsd/consumermessages/NotifyReplicaIHI/3.2.0}notifyReplicaIHIResult"/>
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
