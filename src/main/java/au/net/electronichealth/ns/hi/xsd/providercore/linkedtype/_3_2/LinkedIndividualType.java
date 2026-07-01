
package au.net.electronichealth.ns.hi.xsd.providercore.linkedtype._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedIndividualType complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType name="LinkedIndividualType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qualifiedIdentifier" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}QualifiedIdentifierType"/&gt;
 *         &lt;element name="role" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}RoleType" minOccurs="0"/&gt;
 *         &lt;element name="familyName" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}FamilyNameType" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/Elements/3.2.0}GivenNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedIndividualType", propOrder = {
    "qualifiedIdentifier",
    "role",
    "familyName",
    "givenName"
})
public class LinkedIndividualType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String qualifiedIdentifier;
    protected String role;
    protected String familyName;
    protected String givenName;

    /**
     * Gets the value of the qualifiedIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifiedIdentifier() {
        return qualifiedIdentifier;
    }

    /**
     * Sets the value of the qualifiedIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifiedIdentifier(String value) {
        this.qualifiedIdentifier = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the familyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Sets the value of the familyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Sets the value of the givenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

}
