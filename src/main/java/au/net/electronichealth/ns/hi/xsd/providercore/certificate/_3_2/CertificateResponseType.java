
package au.net.electronichealth.ns.hi.xsd.providercore.certificate._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for CertificateResponseType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="CertificateResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0}raNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0}distinguishedName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateResponseType", propOrder = {
    "raNumber",
    "distinguishedName"
})
public class CertificateResponseType {

    protected String raNumber;
    protected String distinguishedName;

    /**
     * Gets the value of the raNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaNumber() {
        return raNumber;
    }

    /**
     * Sets the value of the raNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaNumber(String value) {
        this.raNumber = value;
    }

    /**
     * Gets the value of the distinguishedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistinguishedName() {
        return distinguishedName;
    }

    /**
     * Sets the value of the distinguishedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistinguishedName(String value) {
        this.distinguishedName = value;
    }

}
