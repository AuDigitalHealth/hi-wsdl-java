
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for UsageType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="UsageType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;length value="1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UsageType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum UsageType {


    /**
     * Both business and personal use
     * 
     */
    A,

    /**
     * Business
     * 
     */
    B,

    /**
     * Personal
     * 
     */
    P;

    public String value() {
        return name();
    }

    public static UsageType fromValue(String v) {
        return valueOf(v);
    }

}
