
package au.net.electronichealth.ns.hi.xsd.providercore.elements._3_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for RequestType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="RequestType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RequestType")
@XmlEnum
public enum RequestType {


    /**
     * Add
     * 
     */
    A,

    /**
     * Remove
     * 
     */
    R;

    public String value() {
        return name();
    }

    public static RequestType fromValue(String v) {
        return valueOf(v);
    }

}
