package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for NameSuffixType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NameSuffixType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BM"/>
 *     &lt;enumeration value="BEM"/>
 *     &lt;enumeration value="COMDC"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="DCMG"/>
 *     &lt;enumeration value="DCB"/>
 *     &lt;enumeration value="DBE"/>
 *     &lt;enumeration value="DCVO"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="DFM"/>
 *     &lt;enumeration value="DSC"/>
 *     &lt;enumeration value="DSM"/>
 *     &lt;enumeration value="VIII"/>
 *     &lt;enumeration value="ESQ"/>
 *     &lt;enumeration value="V"/>
 *     &lt;enumeration value="I"/>
 *     &lt;enumeration value="IV"/>
 *     &lt;enumeration value="GC"/>
 *     &lt;enumeration value="JNR"/>
 *     &lt;enumeration value="JP"/>
 *     &lt;enumeration value="KB"/>
 *     &lt;enumeration value="KCMG"/>
 *     &lt;enumeration value="KCB"/>
 *     &lt;enumeration value="KBE"/>
 *     &lt;enumeration value="KCVO"/>
 *     &lt;enumeration value="AK"/>
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="KT"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="OAM"/>
 *     &lt;enumeration value="MP"/>
 *     &lt;enumeration value="MHA"/>
 *     &lt;enumeration value="MHR"/>
 *     &lt;enumeration value="MLA"/>
 *     &lt;enumeration value="MLC"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="MBE"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="IX"/>
 *     &lt;enumeration value="OC"/>
 *     &lt;enumeration value="AO"/>
 *     &lt;enumeration value="OBE"/>
 *     &lt;enumeration value="OM"/>
 *     &lt;enumeration value="QC"/>
 *     &lt;enumeration value="II"/>
 *     &lt;enumeration value="SNR"/>
 *     &lt;enumeration value="VII"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="X"/>
 *     &lt;enumeration value="III"/>
 *     &lt;enumeration value="VC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */
@XmlType(name = "NameSuffixType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum NameSuffixType {


    /**
     * Bravery Medal
     */
    BM,

    /**
     * British Empire Medal
     */
    BEM,

    /**
     * Commissioner of Declarations
     */
    COMDC,

    /**
     * Companion of Honour
     */
    CH,

    /**
     * Companion of the Order of Australia
     */
    AC,

    /**
     * Cross of Valour
     */
    CV,

    /**
     * Dame Commander of the Order of Saint Michael and Saint George
     */
    DCMG,

    /**
     * Dame Commander of the Order of the Bath
     */
    DCB,

    /**
     * Dame Commander of the Order of the British Empire
     */
    DBE,

    /**
     * Dame Commander of the Royal Victorian Order
     */
    DCVO,

    /**
     * Dame of the Order of Australia
     */
    AD,

    /**
     * Distinguished Flying Medal
     */
    DFM,

    /**
     * Distinguished Service Cross
     */
    DSC,

    /**
     * Distinguished Service Medal
     */
    DSM,

    /**
     * Eighth
     */
    VIII,

    /**
     * Esquire
     */
    ESQ,

    /**
     * Fifth
     */
    V,

    /**
     * First
     */
    I,

    /**
     * Fourth
     */
    IV,

    /**
     * George Cross
     */
    GC,

    /**
     * Junior
     */
    JNR,

    /**
     * Justice of the Peace
     */
    JP,

    /**
     * Knight Bachelor
     */
    KB,

    /**
     * Knight Commander of the Order of Saint Michael and Saint George
     */
    KCMG,

    /**
     * Knight Commander of the Order of the Bath
     */
    KCB,

    /**
     * Knight Commander of the Order of the British Empire
     */
    KBE,

    /**
     * Knight Commander of the Royal Victorian Order
     */
    KCVO,

    /**
     * Knight of the Order of Australia
     */
    AK,

    /**
     * Knight of the Garter
     */
    KG,

    /**
     * Knight of the Thistle
     */
    KT,

    /**
     * MD
     */
    MD,

    /**
     * Medal of the Order of Australia
     */
    OAM,

    /**
     * Member of Parliament
     */
    MP,

    /**
     * Member of the House of Assembly
     */
    MHA,

    /**
     * Member of the House of Representatives
     */
    MHR,

    /**
     * Member of the Legislative Assembly
     */
    MLA,

    /**
     * Member of the Legislative Council
     */
    MLC,

    /**
     * Member of the Order of Australia
     */
    AM,

    /**
     * Member of the Order of the British Empire
     */
    MBE,

    /**
     * Military Cross
     */
    MC,

    /**
     * Ninth
     */
    IX,

    /**
     * Officer Commanding
     */
    OC,

    /**
     * Officer of the Order of Australia
     */
    AO,

    /**
     * Officer of the Order of the British Empire
     */
    OBE,

    /**
     * Order of Merit
     */
    OM,

    /**
     * Queens Counsel
     */
    QC,

    /**
     * Second
     */
    II,

    /**
     * Senior
     */
    SNR,

    /**
     * Seventh
     */
    VII,

    /**
     * Sixth
     */
    VI,

    /**
     * Star of Courage
     */
    SC,

    /**
     * Tenth
     */
    X,

    /**
     * Third
     */
    III,

    /**
     * Victoria Cross
     */
    VC;

    public String value() {
        return name();
    }

    public static NameSuffixType fromValue(String v) {
        return valueOf(v);
    }
}
