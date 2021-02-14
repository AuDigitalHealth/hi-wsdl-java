
package au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.SeverityType;


/**
 * <p>Java class for ServiceMessagesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceMessagesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="highestSeverity" type="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0}SeverityType"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}serviceMessage" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceMessagesType", propOrder = {
    "highestSeverity",
    "serviceMessage"
})
public class ServiceMessagesType {

    @XmlElement(required = true)
    protected SeverityType highestSeverity;
    @XmlElement(required = true)
    protected List<ServiceMessageType> serviceMessage;

    /**
     * Gets the value of the highestSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityType }
     *     
     */
    public SeverityType getHighestSeverity() {
        return highestSeverity;
    }

    /**
     * Sets the value of the highestSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityType }
     *     
     */
    public void setHighestSeverity(SeverityType value) {
        this.highestSeverity = value;
    }

    /**
     * Gets the value of the serviceMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceMessageType }
     * 
     * 
     */
    public List<ServiceMessageType> getServiceMessage() {
        if (serviceMessage == null) {
            serviceMessage = new ArrayList<ServiceMessageType>();
        }
        return this.serviceMessage;
    }

}
