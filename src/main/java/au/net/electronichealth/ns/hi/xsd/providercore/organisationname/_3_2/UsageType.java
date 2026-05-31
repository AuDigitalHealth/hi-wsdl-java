
package au.net.electronichealth.ns.hi.xsd.providercore.organisationname._3_2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="UsageType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="U"/>
 *     <enumeration value="S"/>
 *     <enumeration value="B"/>
 *     <enumeration value="L"/>
 *     <enumeration value="A"/>
 *     <enumeration value="E"/>
 *     <enumeration value="X"/>
 *     <enumeration value="Y"/>
 *   </restriction>
 * </simpleType>
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
