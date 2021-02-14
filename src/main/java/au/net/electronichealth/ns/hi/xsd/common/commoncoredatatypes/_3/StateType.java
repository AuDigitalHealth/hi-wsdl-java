
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACT"/>
 *     &lt;enumeration value="NSW"/>
 *     &lt;enumeration value="NT"/>
 *     &lt;enumeration value="QLD"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="TAS"/>
 *     &lt;enumeration value="VIC"/>
 *     &lt;enumeration value="WA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
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
