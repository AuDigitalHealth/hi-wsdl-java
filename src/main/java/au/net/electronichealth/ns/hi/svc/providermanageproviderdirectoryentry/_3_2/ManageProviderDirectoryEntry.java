
package au.net.electronichealth.ns.hi.svc.providermanageproviderdirectoryentry._3_2;

import java.util.ArrayList;
import java.util.List;
import au.net.electronichealth.ns.hi.xsd.providercore.providerdirectoryservice._3_2.ProviderDirectoryIndividualEntryRecord;
import au.net.electronichealth.ns.hi.xsd.providercore.providerdirectoryservice._3_2.ProviderDirectoryOrganisationEntryRecord;
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
    @XmlSchemaType(name = "anyURI")
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
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the organisationEntry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrganisationEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderDirectoryOrganisationEntryRecord }
     * </p>
     * 
     * 
     * @return
     *     The value of the organisationEntry property.
     */
    public List<ProviderDirectoryOrganisationEntryRecord> getOrganisationEntry() {
        if (organisationEntry == null) {
            organisationEntry = new ArrayList<>();
        }
        return this.organisationEntry;
    }

    /**
     * Gets the value of the individualEntry property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the individualEntry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIndividualEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderDirectoryIndividualEntryRecord }
     * </p>
     * 
     * 
     * @return
     *     The value of the individualEntry property.
     */
    public List<ProviderDirectoryIndividualEntryRecord> getIndividualEntry() {
        if (individualEntry == null) {
            individualEntry = new ArrayList<>();
        }
        return this.individualEntry;
    }

    /**
     * Gets the value of the organisationDeleteEntry property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the organisationDeleteEntry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOrganisationDeleteEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the organisationDeleteEntry property.
     */
    public List<Integer> getOrganisationDeleteEntry() {
        if (organisationDeleteEntry == null) {
            organisationDeleteEntry = new ArrayList<>();
        }
        return this.organisationDeleteEntry;
    }

    /**
     * Gets the value of the individualDeleteEntry property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the individualDeleteEntry property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getIndividualDeleteEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the individualDeleteEntry property.
     */
    public List<Integer> getIndividualDeleteEntry() {
        if (individualDeleteEntry == null) {
            individualDeleteEntry = new ArrayList<>();
        }
        return this.individualDeleteEntry;
    }

}
