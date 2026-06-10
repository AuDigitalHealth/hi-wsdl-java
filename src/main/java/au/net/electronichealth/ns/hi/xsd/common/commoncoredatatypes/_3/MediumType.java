
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for MediumType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>
 * &lt;simpleType name="MediumType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;minLength value="1"/&gt;
 *     &lt;maxLength value="1"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MediumType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum MediumType {


    /**
     * Email
     * 
     */
    E,

    /**
     * Facsimile machine
     * 
     */
    F,

    /**
     * Mobile (cellular) telephone
     * 
     */
    M,

    /**
     * Other
     * 
     */
    O,

    /**
     * Pager
     * 
     */
    P,

    /**
     * Telephone (excluding Mobile)
     * 
     */
    T,

    /**
     * URL
     * 
     */
    U;

    public String value() {
        return name();
    }

    public static MediumType fromValue(String v) {
        return valueOf(v);
    }

}
