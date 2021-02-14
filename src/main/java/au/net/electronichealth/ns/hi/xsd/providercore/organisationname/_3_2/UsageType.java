
package au.net.electronichealth.ns.hi.xsd.providercore.organisationname._3_2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UsageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UsageType")
@XmlEnum
public enum UsageType {


    /**
     * Organisational
     *                         unit/section/division name
     * 
     */
    U,

    /**
     * Service location name
     *                     
     * 
     */
    S,

    /**
     * Business name
     * 
     */
    B,

    /**
     * Locally used name
     *                     
     * 
     */
    L,

    /**
     * Abbreviated name
     *                     
     * 
     */
    A,

    /**
     * Enterprise name
     *                     
     * 
     */
    E,

    /**
     * Other
     * 
     */
    X,

    /**
     * Unknown
     * 
     */
    Y;

    public String value() {
        return name();
    }

    public static UsageType fromValue(String v) {
        return valueOf(v);
    }

}
