
package au.net.electronichealth.ns.hi.xsd.consumercore.name._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for NameUpdateGroupType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="NameUpdateGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0}currentName"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0}updateName"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameUpdateGroupType", propOrder = {
    "currentName",
    "updateName"
})
public class NameUpdateGroupType {

    @XmlElement(required = true)
    protected CurrentNameType currentName;
    @XmlElement(required = true)
    protected NameType updateName;

    /**
     * Gets the value of the currentName property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentNameType }
     *     
     */
    public CurrentNameType getCurrentName() {
        return currentName;
    }

    /**
     * Sets the value of the currentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentNameType }
     *     
     */
    public void setCurrentName(CurrentNameType value) {
        this.currentName = value;
    }

    /**
     * Gets the value of the updateName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getUpdateName() {
        return updateName;
    }

    /**
     * Sets the value of the updateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setUpdateName(NameType value) {
        this.updateName = value;
    }

}
