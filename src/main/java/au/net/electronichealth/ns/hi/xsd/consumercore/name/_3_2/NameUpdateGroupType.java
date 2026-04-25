
package au.net.electronichealth.ns.hi.xsd.consumercore.name._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameUpdateGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameUpdateGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0}currentName"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0}updateName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
