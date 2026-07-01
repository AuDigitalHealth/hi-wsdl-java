
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for SexType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="SexType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="I"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;length value="1"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SexType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum SexType {


    /**
     * Female
     * 
     */
    F,

    /**
     * Intersex or indeterminate
     * 
     */
    I,

    /**
     * Male
     * 
     */
    M,

    /**
     * Not stated/inadequately described
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static SexType fromValue(String v) {
        return valueOf(v);
    }

}
