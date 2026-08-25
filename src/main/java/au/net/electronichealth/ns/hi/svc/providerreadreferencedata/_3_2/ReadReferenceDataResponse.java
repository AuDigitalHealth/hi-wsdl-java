
package au.net.electronichealth.ns.hi.svc.providerreadreferencedata._3_2;

import au.net.electronichealth.ns.hi.xsd.providermessages.readreferencedata._3_2.ReadReferenceDataResult;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadReferenceData/3.2.0}readReferenceDataResult"/&gt;
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
    "readReferenceDataResult"
})
@XmlRootElement(name = "readReferenceDataResponse")
public class ReadReferenceDataResponse {

    /**
     * Read Reference Data Response element
     * 
     */
    @XmlElement(namespace = "http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadReferenceData/3.2.0", required = true)
    protected ReadReferenceDataResult readReferenceDataResult;

    /**
     * Read Reference Data Response element
     * 
     * @return
     *     possible object is
     *     {@link ReadReferenceDataResult }
     *     
     */
    public ReadReferenceDataResult getReadReferenceDataResult() {
        return readReferenceDataResult;
    }

    /**
     * Sets the value of the readReferenceDataResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadReferenceDataResult }
     *     
     * @see #getReadReferenceDataResult()
     */
    public void setReadReferenceDataResult(ReadReferenceDataResult value) {
        this.readReferenceDataResult = value;
    }

}
