
package au.net.electronichealth.ns.hi.xsd.providercore.providertype._3_2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for ProviderTypeRecord complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="ProviderTypeRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderType/3.2.0}ProviderType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientRef" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ClientRefType" minOccurs="0"/&gt;
 *         &lt;element name="externalIdentifier" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ExternalIdentifierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderTypeRecord", propOrder = {
    "clientRef",
    "externalIdentifier"
})
public class ProviderTypeRecord
    extends ProviderType
{

    protected String clientRef;
    protected Integer externalIdentifier;

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
     * Gets the value of the externalIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExternalIdentifier() {
        return externalIdentifier;
    }

    /**
     * Sets the value of the externalIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExternalIdentifier(Integer value) {
        this.externalIdentifier = value;
    }

}
