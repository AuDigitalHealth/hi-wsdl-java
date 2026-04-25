
package au.net.electronichealth.ns.hi.xsd.providercore.address._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.address._3_2.Address;


/**
 * <p>Java class for AddressRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientRef" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ClientRefType" minOccurs="0"/>
 *         &lt;element name="tdsReference" type="{http://ns.medicareaustralia.gov.au/provider/schema/2013/06/22/elements}TdsReferenceIdentifierType"/>
 *         &lt;element name="address" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Address/3.2.0}Address"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressRecord", propOrder = {
    "clientRef",
    "tdsReference",
    "address"
})
public class AddressRecord {

    protected String clientRef;
    @XmlElement(required = true)
    protected String tdsReference;
    @XmlElement(required = true)
    protected Address address;

    /**
     * Gets the value of the clientRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRef() {
        return clientRef;
    }

    /**
     * Sets the value of the clientRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRef(String value) {
        this.clientRef = value;
    }

    /**
     * Gets the value of the tdsReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdsReference() {
        return tdsReference;
    }

    /**
     * Sets the value of the tdsReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdsReference(String value) {
        this.tdsReference = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

}
