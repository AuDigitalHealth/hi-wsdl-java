
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for StateType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="StateType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="NSW"/&gt;
 *     &lt;enumeration value="NT"/&gt;
 *     &lt;enumeration value="QLD"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="TAS"/&gt;
 *     &lt;enumeration value="VIC"/&gt;
 *     &lt;enumeration value="WA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "StateType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum StateType {


    /**
     * Australian Capital Territory
     * 
     */
    ACT,

    /**
     * New South Wales
     * 
     */
    NSW,

    /**
     * Northern Territory
     * 
     */
    NT,

    /**
     * Queensland
     * 
     */
    QLD,

    /**
     * South Australia
     * 
     */
    SA,

    /**
     * Tasmania
     * 
     */
    TAS,

    /**
     * Victoria
     * 
     */
    VIC,

    /**
     * Western Australia
     * 
     */
    WA;

    public String value() {
        return name();
    }

    public static StateType fromValue(String v) {
        return valueOf(v);
    }

}
