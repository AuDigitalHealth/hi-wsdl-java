
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchResponseStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchResponseStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RECEIVED"/>
 *     &lt;enumeration value="PROCESSING"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="RETRIEVED"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="NOTFOUND"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
