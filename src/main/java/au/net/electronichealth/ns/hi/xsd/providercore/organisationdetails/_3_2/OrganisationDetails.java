
package au.net.electronichealth.ns.hi.xsd.providercore.organisationdetails._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="australianBusinessNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/3.2.0}AustralianBusinessNumberType" minOccurs="0"/>
 *         &lt;element name="australianCompanyNumber" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/OrganisationDetails/3.2.0}AustralianCompanyNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationDetails", propOrder = {
    "australianBusinessNumber",
    "australianCompanyNumber"
})
public class OrganisationDetails {

    protected String australianBusinessNumber;
    protected String australianCompanyNumber;

    /**
     * Gets the value of the australianBusinessNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAustralianBusinessNumber() {
        return australianBusinessNumber;
    }

    /**
     * Sets the value of the australianBusinessNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAustralianBusinessNumber(String value) {
        this.australianBusinessNumber = value;
    }

    /**
     * Gets the value of the australianCompanyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAustralianCompanyNumber() {
        return australianCompanyNumber;
    }

    /**
     * Sets the value of the australianCompanyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAustralianCompanyNumber(String value) {
        this.australianCompanyNumber = value;
    }

}
