
package au.net.electronichealth.ns.hi.xsd.providercore.providercoreelements._5_1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RECEIVED"/>
 *     &lt;enumeration value="PROCESSING"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="RETRIEVED"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
