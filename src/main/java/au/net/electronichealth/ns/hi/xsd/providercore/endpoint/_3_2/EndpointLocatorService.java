
package au.net.electronichealth.ns.hi.xsd.providercore.endpoint._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for EndpointLocatorService complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="EndpointLocatorService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceIdentity" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/EndPoint/3.2.0}ServiceIdentityType" minOccurs="0"/&gt;
 *         &lt;element name="serviceAddress" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/EndPoint/3.2.0}ServiceAddressType" minOccurs="0"/&gt;
 *         &lt;element name="securityCertificateReference" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/EndPoint/3.2.0}SecurityCertificateReferenceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndpointLocatorService", propOrder = {
    "serviceIdentity",
    "serviceAddress",
    "securityCertificateReference"
})
@XmlSeeAlso({
    EndpointLocatorServiceRecord.class
})
public class EndpointLocatorService {

    protected String serviceIdentity;
    protected String serviceAddress;
    protected String securityCertificateReference;

    /**
     * Gets the value of the serviceIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceIdentity() {
        return serviceIdentity;
    }

    /**
     * Sets the value of the serviceIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceIdentity(String value) {
        this.serviceIdentity = value;
    }

    /**
     * Gets the value of the serviceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceAddress() {
        return serviceAddress;
    }

    /**
     * Sets the value of the serviceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceAddress(String value) {
        this.serviceAddress = value;
    }

    /**
     * Gets the value of the securityCertificateReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityCertificateReference() {
        return securityCertificateReference;
    }

    /**
     * Sets the value of the securityCertificateReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityCertificateReference(String value) {
        this.securityCertificateReference = value;
    }

}
