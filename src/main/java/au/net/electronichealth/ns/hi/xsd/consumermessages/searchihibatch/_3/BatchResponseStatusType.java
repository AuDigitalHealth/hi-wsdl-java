
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for BatchResponseStatusType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="BatchResponseStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RECEIVED"/&gt;
 *     &lt;enumeration value="PROCESSING"/&gt;
 *     &lt;enumeration value="COMPLETED"/&gt;
 *     &lt;enumeration value="RETRIEVED"/&gt;
 *     &lt;enumeration value="DELETED"/&gt;
 *     &lt;enumeration value="NOTFOUND"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "BatchResponseStatusType")
@XmlEnum
public enum BatchResponseStatusType {


    /**
     * Batch is received.
     * 
     */
    RECEIVED,

    /**
     * Batch is being processed.
     * 
     */
    PROCESSING,

    /**
     * Batch has been processed.
     * 
     */
    COMPLETED,

    /**
     * Batch is retrieved
     * 
     */
    RETRIEVED,

    /**
     * Provided Batch is deleted
     * 
     */
    DELETED,

    /**
     * Provided Batch identifier is not found
     * 
     */
    NOTFOUND,

    /**
     * An error status
     * 
     */
    ERROR;

    public String value() {
        return name();
    }

    public static BatchResponseStatusType fromValue(String v) {
        return valueOf(v);
    }

}
