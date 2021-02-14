
package au.net.electronichealth.ns.hi.xsd.providermessages.readorganisation._3_2;

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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadOrganisation/3.2.0}hpioNumber"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadOrganisation/3.2.0}linkSearchType" minOccurs="0"/>
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
    "hpioNumber",
    "linkSearchType"
})
@XmlRootElement(name = "readProviderOrganisation")
public class ReadProviderOrganisation {

    @XmlElement(required = true)
    protected String hpioNumber;
    protected String linkSearchType;

    /**
     * Gets the value of the hpioNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpioNumber() {
        return hpioNumber;
    }

    /**
     * Sets the value of the hpioNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpioNumber(String value) {
        this.hpioNumber = value;
    }

    /**
     * Gets the value of the linkSearchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkSearchType() {
        return linkSearchType;
    }

    /**
     * Sets the value of the linkSearchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkSearchType(String value) {
        this.linkSearchType = value;
    }

}
