
package au.net.electronichealth.ns.hi.xsd.providermessages.searchtdsproviderindividual._5_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.SexType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.StateType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for anonymous complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0}hpiiNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0}registrationId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0}familyName"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0}givenName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0}providerTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0}dateOfBirth"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0}sex" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0}postcode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0}state" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hpiiNumber",
    "registrationId",
    "familyName",
    "givenName",
    "providerTypeCode",
    "dateOfBirth",
    "sex",
    "postcode",
    "state"
})
@XmlRootElement(name = "searchTdsProviderIndividual")
public class SearchTdsProviderIndividual {

    @XmlSchemaType(name = "anyURI")
    protected String hpiiNumber;
    protected String registrationId;
    @XmlElement(required = true)
    protected String familyName;
    protected List<String> givenName;
    protected String providerTypeCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfBirth;
    @XmlSchemaType(name = "string")
    protected SexType sex;
    protected String postcode;
    @XmlSchemaType(name = "string")
    protected StateType state;

    /**
     * Gets the value of the hpiiNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHpiiNumber() {
        return hpiiNumber;
    }

    /**
     * Sets the value of the hpiiNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHpiiNumber(String value) {
        this.hpiiNumber = value;
    }

    /**
     * Gets the value of the registrationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationId() {
        return registrationId;
    }

    /**
     * Sets the value of the registrationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationId(String value) {
        this.registrationId = value;
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
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the givenName property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * </p>
     * 
     * 
     * @return
     *     The value of the givenName property.
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the providerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderTypeCode() {
        return providerTypeCode;
    }

    /**
     * Sets the value of the providerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderTypeCode(String value) {
        this.providerTypeCode = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link SexType }
     *     
     */
    public SexType getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link SexType }
     *     
     */
    public void setSex(SexType value) {
        this.sex = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StateType }
     *     
     */
    public StateType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateType }
     *     
     */
    public void setState(StateType value) {
        this.state = value;
    }

}
