
package au.net.electronichealth.ns.hi.xsd.providermessages.readorganisation._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadOrganisation/3.2.0}hpioNumber"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadOrganisation/3.2.0}linkSearchType" minOccurs="0"/&gt;
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
    "hpioNumber",
    "linkSearchType"
})
@XmlRootElement(name = "readProviderOrganisation")
public class ReadProviderOrganisation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
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
