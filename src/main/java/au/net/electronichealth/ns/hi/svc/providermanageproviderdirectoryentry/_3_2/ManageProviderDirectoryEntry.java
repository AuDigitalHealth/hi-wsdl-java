
package au.net.electronichealth.ns.hi.svc.providermanageproviderdirectoryentry._3_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providercore.providerdirectoryservice._3_2.ProviderDirectoryIndividualEntryRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.providerdirectoryservice._3_2.ProviderDirectoryOrganisationEntryRecord;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0}qualifiedIdentifier"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0}organisationEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0}individualEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0}organisationDeleteEntry" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ManageProviderDirectoryEntry/3.2.0}individualDeleteEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organisationDeleteEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganisationDeleteEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individualDeleteEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividualDeleteEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
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
