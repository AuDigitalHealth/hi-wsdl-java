
package au.net.electronichealth.ns.hi.xsd.consumermessages.searchihibatch._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchResponseStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="BatchResponseStatusType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RECEIVED"/>
 *     <enumeration value="PROCESSING"/>
 *     <enumeration value="COMPLETED"/>
 *     <enumeration value="RETRIEVED"/>
 *     <enumeration value="DELETED"/>
 *     <enumeration value="NOTFOUND"/>
 *     <enumeration value="ERROR"/>
 *   </restriction>
 * </simpleType>
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
