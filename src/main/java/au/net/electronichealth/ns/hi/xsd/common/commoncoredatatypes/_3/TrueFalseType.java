
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for TrueFalseType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="TrueFalseType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TrueFalseType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum TrueFalseType {


    /**
     * False
     * 
     */
    F,

    /**
     * True
     * 
     */
    T;

    public String value() {
        return name();
    }

    public static TrueFalseType fromValue(String v) {
        return valueOf(v);
    }

}
