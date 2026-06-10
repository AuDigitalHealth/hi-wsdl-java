
package au.net.electronichealth.ns.hi.xsd.providercore.organisationname._3_2;

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
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="B"/&gt;
 *     &lt;enumeration value="L"/&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
     */
    L,

    /**
     * Abbreviated name
     * 
     */
    A,

    /**
     * Enterprise name
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
