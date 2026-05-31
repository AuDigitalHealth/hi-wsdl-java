
package au.net.electronichealth.ns.hi.xsd.providercore.providercoreelements._5_1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for BatchStatusType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="BatchStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECEIVED"/&gt;
 *     &lt;enumeration value="PROCESSING"/&gt;
 *     &lt;enumeration value="COMPLETED"/&gt;
 *     &lt;enumeration value="RETRIEVED"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "BatchStatusType", namespace = "http://ns.electronichealth.net.au/hi/xsd/providercore/ProviderCoreElements/5.1.0")
@XmlEnum
public enum BatchStatusType {


    /**
     * RECEIVED
     * 
     */
    RECEIVED,

    /**
     * PROCESSING
     * 
     */
    PROCESSING,

    /**
     * COMPLETED
     * 
     */
    COMPLETED,

    /**
     * RETRIEVED
     * 
     */
    RETRIEVED,

    /**
     * ERROR
     * 
     */
    ERROR;

    public String value() {
        return name();
    }

    public static BatchStatusType fromValue(String v) {
        return valueOf(v);
    }

}
