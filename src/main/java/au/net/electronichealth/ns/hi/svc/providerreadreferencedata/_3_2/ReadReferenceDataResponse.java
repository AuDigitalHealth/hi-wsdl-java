
package au.net.electronichealth.ns.hi.svc.providerreadreferencedata._3_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import au.net.electronichealth.ns.hi.xsd.providermessages.readreferencedata._3_2.ReadReferenceDataResult;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://ns.electronichealth.net.au/hi/xsd/providermessages/ReadReferenceData/3.2.0}readReferenceDataResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
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
