
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for PostalDeliveryType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="PostalDeliveryType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Care PO"/&gt;
 *     &lt;enumeration value="CMA"/&gt;
 *     &lt;enumeration value="CMB"/&gt;
 *     &lt;enumeration value="GPO Box"/&gt;
 *     &lt;enumeration value="Locked Bag"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="PO Box"/&gt;
 *     &lt;enumeration value="POR"/&gt;
 *     &lt;enumeration value="Private Bag"/&gt;
 *     &lt;enumeration value="RSD"/&gt;
 *     &lt;enumeration value="RMB"/&gt;
 *     &lt;enumeration value="RMS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "PostalDeliveryType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum PostalDeliveryType {


    /**
     * Care-of Post Office (also known as Poste Restante)
     * 
     */
    @XmlEnumValue("Care PO")
    CARE_PO("Care PO"),

    /**
     * Community Mail Agent
     * 
     */
    CMA("CMA"),

    /**
     * Community Mail Bag
     * 
     */
    CMB("CMB"),

    /**
     * General Post Office Box
     * 
     */
    @XmlEnumValue("GPO Box")
    GPO_BOX("GPO Box"),

    /**
     * Locked Mail Bag Service
     * 
     */
    @XmlEnumValue("Locked Bag")
    LOCKED_BAG("Locked Bag"),

    /**
     * Mail Service
     * 
     */
    MS("MS"),

    /**
     * Post Office Box
     * 
     */
    @XmlEnumValue("PO Box")
    PO_BOX("PO Box"),

    /**
     * Post Restante (also known as Care-of Post Office)
     * 
     */
    POR("POR"),

    /**
     * Private Mail Bag Service
     * 
     */
    @XmlEnumValue("Private Bag")
    PRIVATE_BAG("Private Bag"),

    /**
     * Roadside Delivery
     * 
     */
    RSD("RSD"),

    /**
     * Roadside Mail Box/Bag
     * 
     */
    RMB("RMB"),

    /**
     * Roadside Mail Service
     * 
     */
    RMS("RMS");
    private final String value;

    PostalDeliveryType(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static PostalDeliveryType fromValue(String v) {
        for (PostalDeliveryType c: PostalDeliveryType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
