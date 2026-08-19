
package au.net.electronichealth.ns.hi.xsd.providercore.individualname._5_1;

import au.net.electronichealth.ns.hi.xsd.providercore.individualname._3_2.IndividualName;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for IndividualNameRecord complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="IndividualNameRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientRef" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}ClientRefType" minOccurs="0"/&gt;
 *         &lt;element name="tdsReference" type="{http://ns.medicareaustralia.gov.au/provider/schema/2013/06/22/elements}TdsReferenceIdentifierType"/&gt;
 *         &lt;element name="individualName" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/3.2.0}IndividualName"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualNameRecord", propOrder = {
    "clientRef",
    "tdsReference",
    "individualName"
})
public class IndividualNameRecord {

    protected String clientRef;
    @XmlElement(required = true)
    protected String tdsReference;
    @XmlElement(required = true)
    protected IndividualName individualName;

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
     * Gets the value of the individualName property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualName }
     *     
     */
    public IndividualName getIndividualName() {
        return individualName;
    }

    /**
     * Sets the value of the individualName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualName }
     *     
     */
    public void setIndividualName(IndividualName value) {
        this.individualName = value;
    }

}
