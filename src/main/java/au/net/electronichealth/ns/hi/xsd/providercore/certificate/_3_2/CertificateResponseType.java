
package au.net.electronichealth.ns.hi.xsd.providercore.certificate._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CertificateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0}raNumber" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providercore/Certificate/3.2.0}distinguishedName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
