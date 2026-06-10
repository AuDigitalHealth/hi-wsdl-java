
package au.net.electronichealth.ns.hi.xsd.providercore.individualname._3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.NameSuffixType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.NameTitleType;


/**
 * &lt;p&gt;Java class for IndividualName complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="IndividualName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}nameTitle" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}givenName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}familyName"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}nameSuffix" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nameUsage" type="{http://ns.electronichealth.net.au/hi/xsd/providercore/IndividualName/3.2.0}NameUsageType"/&gt;
 *         &lt;element name="preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualName", propOrder = {
    "nameTitle",
    "givenName",
    "familyName",
    "nameSuffix",
    "nameUsage",
    "preferred"
})
@XmlSeeAlso({
    IndividualNameRecord.class
})
public class IndividualName {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected List<NameTitleType> nameTitle;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected List<String> givenName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", required = true)
    protected String familyName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected List<NameSuffixType> nameSuffix;
    @XmlElement(required = true)
    protected NameUsageType nameUsage;
    protected Boolean preferred;

    /**
     * Gets the value of the nameTitle property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameTitle property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getNameTitle().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link NameTitleType }
     * 
     * 
     */
    public List<NameTitleType> getNameTitle() {
        if (nameTitle == null) {
            nameTitle = new ArrayList<NameTitleType>();
        }
        return this.nameTitle;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getGivenName().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<String>();
        }
        return this.givenName;
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
     * Gets the value of the nameSuffix property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameSuffix property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getNameSuffix().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link NameSuffixType }
     * 
     * 
     */
    public List<NameSuffixType> getNameSuffix() {
        if (nameSuffix == null) {
            nameSuffix = new ArrayList<NameSuffixType>();
        }
        return this.nameSuffix;
    }

    /**
     * Gets the value of the nameUsage property.
     * 
     * @return
     *     possible object is
     *     {@link NameUsageType }
     *     
     */
    public NameUsageType getNameUsage() {
        return nameUsage;
    }

    /**
     * Sets the value of the nameUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameUsageType }
     *     
     */
    public void setNameUsage(NameUsageType value) {
        this.nameUsage = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferred(Boolean value) {
        this.preferred = value;
    }

}
