
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MediumType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MediumType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="1"/>
 *     &lt;maxLength value="1"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="U"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
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
