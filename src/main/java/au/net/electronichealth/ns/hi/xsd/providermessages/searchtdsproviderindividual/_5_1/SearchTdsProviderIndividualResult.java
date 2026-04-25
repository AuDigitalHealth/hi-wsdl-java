
package au.net.electronichealth.ns.hi.xsd.providermessages.searchtdsproviderindividual._5_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ServiceMessagesType;


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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/SearchTdsProviderIndividual/5.1.0}providerIndividual" minOccurs="0"/>
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0}serviceMessages" maxOccurs="unbounded" minOccurs="0"/>
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
    "providerIndividual",
    "serviceMessages"
})
@XmlRootElement(name = "searchTdsProviderIndividualResult")
public class SearchTdsProviderIndividualResult {

    protected ProviderIndividual providerIndividual;
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0")
    protected List<ServiceMessagesType> serviceMessages;

    /**
     * Gets the value of the providerIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderIndividual }
     *     
     */
    public ProviderIndividual getProviderIndividual() {
        return providerIndividual;
    }

    /**
     * Sets the value of the providerIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderIndividual }
     *     
     */
    public void setProviderIndividual(ProviderIndividual value) {
        this.providerIndividual = value;
    }

    /**
     * Gets the value of the serviceMessages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceMessages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceMessages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceMessagesType }
     * 
     * 
     */
    public List<ServiceMessagesType> getServiceMessages() {
        if (serviceMessages == null) {
            serviceMessages = new ArrayList<ServiceMessagesType>();
        }
        return this.serviceMessages;
    }

}
