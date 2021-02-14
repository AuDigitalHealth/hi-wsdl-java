
package au.net.electronichealth.ns.hi.xsd.providercore.certificate._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0}linkCertificateRequest" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0}newCertificateRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateType", propOrder = {
    "linkCertificateRequest",
    "newCertificateRequest"
})
public class CertificateType {

    protected LinkCertificateRequestType linkCertificateRequest;
    protected NewCertificateRequestType newCertificateRequest;

    /**
     * Gets the value of the linkCertificateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LinkCertificateRequestType }
     *     
     */
    public LinkCertificateRequestType getLinkCertificateRequest() {
        return linkCertificateRequest;
    }

    /**
     * Sets the value of the linkCertificateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkCertificateRequestType }
     *     
     */
    public void setLinkCertificateRequest(LinkCertificateRequestType value) {
        this.linkCertificateRequest = value;
    }

    /**
     * Gets the value of the newCertificateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link NewCertificateRequestType }
     *     
     */
    public NewCertificateRequestType getNewCertificateRequest() {
        return newCertificateRequest;
    }

    /**
     * Sets the value of the newCertificateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewCertificateRequestType }
     *     
     */
    public void setNewCertificateRequest(NewCertificateRequestType value) {
        this.newCertificateRequest = value;
    }

}
