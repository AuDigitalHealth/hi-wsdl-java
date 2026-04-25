
package au.net.electronichealth.ns.hi.xsd.providercore.providertype._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.providertype._3_2.ProviderType;


/**
 * <p>Java class for ProviderTypeRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProviderTypeRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientRef" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ClientRefType" minOccurs="0"/>
 *         &lt;element name="tdsReference" type="{http://ns.medicareaustralia.gov.au/provider/schema/2013/06/22/elements}TdsReferenceIdentifierType"/>
 *         &lt;element name="providerType" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0}ProviderType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderTypeRecord", propOrder = {
    "clientRef",
    "tdsReference",
    "providerType"
})
public class ProviderTypeRecord {

    protected String clientRef;
    @XmlElement(required = true)
    protected String tdsReference;
    @XmlElement(required = true)
    protected ProviderType providerType;

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
     * Gets the value of the providerType property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderType }
     *     
     */
    public ProviderType getProviderType() {
        return providerType;
    }

    /**
     * Sets the value of the providerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderType }
     *     
     */
    public void setProviderType(ProviderType value) {
        this.providerType = value;
    }

}
