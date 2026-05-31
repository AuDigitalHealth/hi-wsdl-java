
package au.net.electronichealth.ns.hi.xsd.consumercore.name._3_2;

import java.util.ArrayList;
import java.util.List;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.IndividualNameUsageType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.NameSuffixType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.TrueFalseType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for NameType complex type&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * 
 * &lt;pre&gt;{&#064;code
 * &lt;complexType name="NameType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}nameTitle" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}familyName"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}givenName" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}nameSuffix" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0}usage"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}preferred" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/consumercore/Name/3.2.0}conditionalUse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * }&lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType", propOrder = {
    "nameTitle",
    "familyName",
    "givenName",
    "nameSuffix",
    "usage",
    "preferred",
    "conditionalUse"
})
public class NameType {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected String nameTitle;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", required = true)
    protected String familyName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    protected List<String> givenName;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0")
    @XmlSchemaType(name = "string")
    protected NameSuffixType nameSuffix;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/IndividualNameCore/3.0", required = true)
    @XmlSchemaType(name = "string")
    protected IndividualNameUsageType usage;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    @XmlSchemaType(name = "string")
    protected TrueFalseType preferred;
    protected String conditionalUse;

    /**
     * Gets the value of the nameTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameTitle() {
        return nameTitle;
    }

    /**
     * Sets the value of the nameTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameTitle(String value) {
        this.nameTitle = value;
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
     * Gets the value of the nameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link NameSuffixType }
     *     
     */
    public NameSuffixType getNameSuffix() {
        return nameSuffix;
    }

    /**
     * Sets the value of the nameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameSuffixType }
     *     
     */
    public void setNameSuffix(NameSuffixType value) {
        this.nameSuffix = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameUsageType }
     *     
     */
    public IndividualNameUsageType getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameUsageType }
     *     
     */
    public void setUsage(IndividualNameUsageType value) {
        this.usage = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link TrueFalseType }
     *     
     */
    public TrueFalseType getPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueFalseType }
     *     
     */
    public void setPreferred(TrueFalseType value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the conditionalUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionalUse() {
        return conditionalUse;
    }

    /**
     * Sets the value of the conditionalUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionalUse(String value) {
        this.conditionalUse = value;
    }

}
