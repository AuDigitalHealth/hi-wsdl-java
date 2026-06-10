
package au.net.electronichealth.ns.hi.svc.providermanageproviderdirectoryentry._3_2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.providerdirectoryservice._3_2.ProviderDirectoryIndividualEntryRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.providerdirectoryservice._3_2.ProviderDirectoryOrganisationEntryRecord;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0}qualifiedIdentifier"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0}organisationEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0}individualEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0}organisationDeleteEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0}individualDeleteEntry" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "qualifiedIdentifier",
    "organisationEntry",
    "individualEntry",
    "organisationDeleteEntry",
    "individualDeleteEntry"
})
@XmlRootElement(name = "manageProviderDirectoryEntry")
public class ManageProviderDirectoryEntry {

    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", required = true)
    protected String qualifiedIdentifier;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0")
    protected List<ProviderDirectoryOrganisationEntryRecord> organisationEntry;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0")
    protected List<ProviderDirectoryIndividualEntryRecord> individualEntry;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", type = Integer.class)
    protected List<Integer> organisationDeleteEntry;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0", type = Integer.class)
    protected List<Integer> individualDeleteEntry;

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
     * Gets the value of the organisationEntry property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationEntry property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getOrganisationEntry().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderDirectoryOrganisationEntryRecord }
     * 
     * 
     */
    public List<ProviderDirectoryOrganisationEntryRecord> getOrganisationEntry() {
        if (organisationEntry == null) {
            organisationEntry = new ArrayList<ProviderDirectoryOrganisationEntryRecord>();
        }
        return this.organisationEntry;
    }

    /**
     * Gets the value of the individualEntry property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualEntry property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getIndividualEntry().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderDirectoryIndividualEntryRecord }
     * 
     * 
     */
    public List<ProviderDirectoryIndividualEntryRecord> getIndividualEntry() {
        if (individualEntry == null) {
            individualEntry = new ArrayList<ProviderDirectoryIndividualEntryRecord>();
        }
        return this.individualEntry;
    }

    /**
     * Gets the value of the organisationDeleteEntry property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationDeleteEntry property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getOrganisationDeleteEntry().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getOrganisationDeleteEntry() {
        if (organisationDeleteEntry == null) {
            organisationDeleteEntry = new ArrayList<Integer>();
        }
        return this.organisationDeleteEntry;
    }

    /**
     * Gets the value of the individualDeleteEntry property.
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualDeleteEntry property.
     * 
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;{&#064;code
     *    getIndividualDeleteEntry().add(newItem);
     * }&lt;/pre&gt;
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIndividualDeleteEntry() {
        if (individualDeleteEntry == null) {
            individualDeleteEntry = new ArrayList<Integer>();
        }
        return this.individualDeleteEntry;
    }

}
