
package au.net.electronichealth.ns.hi.xsd.providercore.certificate._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewCertificateRequestType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="NewCertificateRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0}token"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0}operatingSystem"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0}otherOperatingSystem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewCertificateRequestType", propOrder = {
    "token",
    "operatingSystem",
    "otherOperatingSystem"
})
public class NewCertificateRequestType {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected String operatingSystem;
    protected String otherOperatingSystem;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * Sets the value of the operatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingSystem(String value) {
        this.operatingSystem = value;
    }

    /**
     * Gets the value of the otherOperatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherOperatingSystem() {
        return otherOperatingSystem;
    }

    /**
     * Sets the value of the otherOperatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherOperatingSystem(String value) {
        this.otherOperatingSystem = value;
    }

}
