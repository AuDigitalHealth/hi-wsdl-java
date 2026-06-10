
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for NameTitleType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="NameTitleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ABBOT"/&gt;
 *     &lt;enumeration value="AB"/&gt;
 *     &lt;enumeration value="ADML"/&gt;
 *     &lt;enumeration value="ACM"/&gt;
 *     &lt;enumeration value="AIRCDRE"/&gt;
 *     &lt;enumeration value="AM"/&gt;
 *     &lt;enumeration value="AVM"/&gt;
 *     &lt;enumeration value="AC"/&gt;
 *     &lt;enumeration value="ACW"/&gt;
 *     &lt;enumeration value="ALD"/&gt;
 *     &lt;enumeration value="AMBSR"/&gt;
 *     &lt;enumeration value="ARCHBISHOP"/&gt;
 *     &lt;enumeration value="ARCHDEACON"/&gt;
 *     &lt;enumeration value="ASSOC PROF"/&gt;
 *     &lt;enumeration value="BARON"/&gt;
 *     &lt;enumeration value="BARONESS"/&gt;
 *     &lt;enumeration value="BISHOP"/&gt;
 *     &lt;enumeration value="BDR"/&gt;
 *     &lt;enumeration value="BRIG"/&gt;
 *     &lt;enumeration value="BR"/&gt;
 *     &lt;enumeration value="CDT"/&gt;
 *     &lt;enumeration value="CANON"/&gt;
 *     &lt;enumeration value="CAPT"/&gt;
 *     &lt;enumeration value="CAPT, RAN"/&gt;
 *     &lt;enumeration value="CARDNL"/&gt;
 *     &lt;enumeration value="CHAP"/&gt;
 *     &lt;enumeration value="CPO"/&gt;
 *     &lt;enumeration value="COL"/&gt;
 *     &lt;enumeration value="CMDR"/&gt;
 *     &lt;enumeration value="CMM"/&gt;
 *     &lt;enumeration value="CDRE"/&gt;
 *     &lt;enumeration value="CONST"/&gt;
 *     &lt;enumeration value="CONSUL"/&gt;
 *     &lt;enumeration value="CPL"/&gt;
 *     &lt;enumeration value="COUNT"/&gt;
 *     &lt;enumeration value="COUNTESS"/&gt;
 *     &lt;enumeration value="DAME"/&gt;
 *     &lt;enumeration value="DEACON"/&gt;
 *     &lt;enumeration value="DEACONESS"/&gt;
 *     &lt;enumeration value="DEAN"/&gt;
 *     &lt;enumeration value="DEPUTY SUPT"/&gt;
 *     &lt;enumeration value="DIRECTOR"/&gt;
 *     &lt;enumeration value="DR"/&gt;
 *     &lt;enumeration value="EARL"/&gt;
 *     &lt;enumeration value="ENGR"/&gt;
 *     &lt;enumeration value="FR"/&gt;
 *     &lt;enumeration value="FLTLT"/&gt;
 *     &lt;enumeration value="FSGT"/&gt;
 *     &lt;enumeration value="FLGOFF"/&gt;
 *     &lt;enumeration value="GEN"/&gt;
 *     &lt;enumeration value="GOV"/&gt;
 *     &lt;enumeration value="GP CAPT"/&gt;
 *     &lt;enumeration value="HON"/&gt;
 *     &lt;enumeration value="JUDGE"/&gt;
 *     &lt;enumeration value="JUSTICE"/&gt;
 *     &lt;enumeration value="LADY"/&gt;
 *     &lt;enumeration value="LBDR"/&gt;
 *     &lt;enumeration value="LCPL"/&gt;
 *     &lt;enumeration value="LAC"/&gt;
 *     &lt;enumeration value="LACW"/&gt;
 *     &lt;enumeration value="LS"/&gt;
 *     &lt;enumeration value="(ARMY) LT"/&gt;
 *     &lt;enumeration value="LEUT"/&gt;
 *     &lt;enumeration value="LTCOL"/&gt;
 *     &lt;enumeration value="LCDR"/&gt;
 *     &lt;enumeration value="LTGEN"/&gt;
 *     &lt;enumeration value="LTGOV"/&gt;
 *     &lt;enumeration value="LORD"/&gt;
 *     &lt;enumeration value="MADAM"/&gt;
 *     &lt;enumeration value="MADAME"/&gt;
 *     &lt;enumeration value="MAJ"/&gt;
 *     &lt;enumeration value="MAJGEN"/&gt;
 *     &lt;enumeration value="MGR"/&gt;
 *     &lt;enumeration value="MSTR"/&gt;
 *     &lt;enumeration value="MAYOR"/&gt;
 *     &lt;enumeration value="MAYORESS"/&gt;
 *     &lt;enumeration value="MIDN"/&gt;
 *     &lt;enumeration value="MISS"/&gt;
 *     &lt;enumeration value="MR"/&gt;
 *     &lt;enumeration value="MON"/&gt;
 *     &lt;enumeration value="MOST REV"/&gt;
 *     &lt;enumeration value="MTHR"/&gt;
 *     &lt;enumeration value="MRS"/&gt;
 *     &lt;enumeration value="MS"/&gt;
 *     &lt;enumeration value="NURSE"/&gt;
 *     &lt;enumeration value="OCDT"/&gt;
 *     &lt;enumeration value="PASTOR"/&gt;
 *     &lt;enumeration value="PO"/&gt;
 *     &lt;enumeration value="PLTOFF"/&gt;
 *     &lt;enumeration value="PTE"/&gt;
 *     &lt;enumeration value="PROF"/&gt;
 *     &lt;enumeration value="RABBI"/&gt;
 *     &lt;enumeration value="RADM"/&gt;
 *     &lt;enumeration value="RECTOR"/&gt;
 *     &lt;enumeration value="RSM"/&gt;
 *     &lt;enumeration value="RSM-A"/&gt;
 *     &lt;enumeration value="REV"/&gt;
 *     &lt;enumeration value="RTHON"/&gt;
 *     &lt;enumeration value="RT REV"/&gt;
 *     &lt;enumeration value="SMN"/&gt;
 *     &lt;enumeration value="2LT"/&gt;
 *     &lt;enumeration value="SEN"/&gt;
 *     &lt;enumeration value="SNR"/&gt;
 *     &lt;enumeration value="SGT"/&gt;
 *     &lt;enumeration value="SIR"/&gt;
 *     &lt;enumeration value="SR"/&gt;
 *     &lt;enumeration value="SISTER SUP"/&gt;
 *     &lt;enumeration value="SQNLDR"/&gt;
 *     &lt;enumeration value="SCDT"/&gt;
 *     &lt;enumeration value="SSGT"/&gt;
 *     &lt;enumeration value="SM"/&gt;
 *     &lt;enumeration value="SBLT"/&gt;
 *     &lt;enumeration value="SUPT"/&gt;
 *     &lt;enumeration value="SWAMI"/&gt;
 *     &lt;enumeration value="VADM"/&gt;
 *     &lt;enumeration value="VCE CMNDR"/&gt;
 *     &lt;enumeration value="VISCOUNT"/&gt;
 *     &lt;enumeration value="WOFF"/&gt;
 *     &lt;enumeration value="WO"/&gt;
 *     &lt;enumeration value="WO1"/&gt;
 *     &lt;enumeration value="WO2"/&gt;
 *     &lt;enumeration value="WOFF-AF"/&gt;
 *     &lt;enumeration value="WO-N"/&gt;
 *     &lt;enumeration value="WCDR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "NameTitleType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum NameTitleType {


    /**
     * Abbot
     * 
     */
    @XmlEnumValue("ABBOT")
    VALUE_1("ABBOT"),

    /**
     * Able Seaman
     * 
     */
    @XmlEnumValue("AB")
    VALUE_2("AB"),

    /**
     * Admiral
     * 
     */
    @XmlEnumValue("ADML")
    VALUE_3("ADML"),

    /**
     * Air Chief Marshal
     * 
     */
    @XmlEnumValue("ACM")
    VALUE_4("ACM"),

    /**
     * Air Commodore
     * 
     */
    @XmlEnumValue("AIRCDRE")
    VALUE_5("AIRCDRE"),

    /**
     * Air Marshal
     * 
     */
    @XmlEnumValue("AM")
    VALUE_6("AM"),

    /**
     * Air Vice Marshal
     * 
     */
    @XmlEnumValue("AVM")
    VALUE_7("AVM"),

    /**
     * Aircraftman
     * 
     */
    @XmlEnumValue("AC")
    VALUE_8("AC"),

    /**
     * Aircraftwoman
     * 
     */
    @XmlEnumValue("ACW")
    VALUE_9("ACW"),

    /**
     * Alderman
     * 
     */
    @XmlEnumValue("ALD")
    VALUE_10("ALD"),

    /**
     * Ambassador
     * 
     */
    @XmlEnumValue("AMBSR")
    VALUE_11("AMBSR"),

    /**
     * Archbishop
     * 
     */
    @XmlEnumValue("ARCHBISHOP")
    VALUE_12("ARCHBISHOP"),

    /**
     * Archdeacon
     * 
     */
    @XmlEnumValue("ARCHDEACON")
    VALUE_13("ARCHDEACON"),

    /**
     * Associate Professor
     * 
     */
    @XmlEnumValue("ASSOC PROF")
    VALUE_14("ASSOC PROF"),

    /**
     * Baron
     * 
     */
    @XmlEnumValue("BARON")
    VALUE_15("BARON"),

    /**
     * Baroness
     * 
     */
    @XmlEnumValue("BARONESS")
    VALUE_16("BARONESS"),

    /**
     * Bishop
     * 
     */
    @XmlEnumValue("BISHOP")
    VALUE_17("BISHOP"),

    /**
     * Bombardier
     * 
     */
    @XmlEnumValue("BDR")
    VALUE_18("BDR"),

    /**
     * Brigadier
     * 
     */
    @XmlEnumValue("BRIG")
    VALUE_19("BRIG"),

    /**
     * Brother
     * 
     */
    @XmlEnumValue("BR")
    VALUE_20("BR"),

    /**
     * Cadet
     * 
     */
    @XmlEnumValue("CDT")
    VALUE_21("CDT"),

    /**
     * Canon
     * 
     */
    @XmlEnumValue("CANON")
    VALUE_22("CANON"),

    /**
     * Captain (Army)
     * 
     */
    @XmlEnumValue("CAPT")
    VALUE_23("CAPT"),

    /**
     * Captain (Navy)
     * 
     */
    @XmlEnumValue("CAPT, RAN")
    VALUE_24("CAPT, RAN"),

    /**
     * Cardinal
     * 
     */
    @XmlEnumValue("CARDNL")
    VALUE_25("CARDNL"),

    /**
     * Chaplain
     * 
     */
    @XmlEnumValue("CHAP")
    VALUE_26("CHAP"),

    /**
     * Chief Petty Officer
     * 
     */
    @XmlEnumValue("CPO")
    VALUE_27("CPO"),

    /**
     * Colonel
     * 
     */
    @XmlEnumValue("COL")
    VALUE_28("COL"),

    /**
     * Commander
     * 
     */
    @XmlEnumValue("CMDR")
    VALUE_29("CMDR"),

    /**
     * Commissioner
     * 
     */
    @XmlEnumValue("CMM")
    VALUE_30("CMM"),

    /**
     * Commodore
     * 
     */
    @XmlEnumValue("CDRE")
    VALUE_31("CDRE"),

    /**
     * Constable
     * 
     */
    @XmlEnumValue("CONST")
    VALUE_32("CONST"),

    /**
     * Consul
     * 
     */
    @XmlEnumValue("CONSUL")
    VALUE_33("CONSUL"),

    /**
     * Corporal
     * 
     */
    @XmlEnumValue("CPL")
    VALUE_34("CPL"),

    /**
     * Count
     * 
     */
    @XmlEnumValue("COUNT")
    VALUE_35("COUNT"),

    /**
     * Countess
     * 
     */
    @XmlEnumValue("COUNTESS")
    VALUE_36("COUNTESS"),

    /**
     * Dame
     * 
     */
    @XmlEnumValue("DAME")
    VALUE_37("DAME"),

    /**
     * Deacon
     * 
     */
    @XmlEnumValue("DEACON")
    VALUE_38("DEACON"),

    /**
     * Deaconess
     * 
     */
    @XmlEnumValue("DEACONESS")
    VALUE_39("DEACONESS"),

    /**
     * Dean
     * 
     */
    @XmlEnumValue("DEAN")
    VALUE_40("DEAN"),

    /**
     * Deputy Superintendent
     * 
     */
    @XmlEnumValue("DEPUTY SUPT")
    VALUE_41("DEPUTY SUPT"),

    /**
     * Director
     * 
     */
    @XmlEnumValue("DIRECTOR")
    VALUE_42("DIRECTOR"),

    /**
     * Doctor
     * 
     */
    @XmlEnumValue("DR")
    VALUE_43("DR"),

    /**
     * Earl
     * 
     */
    @XmlEnumValue("EARL")
    VALUE_44("EARL"),

    /**
     * Engineer
     * 
     */
    @XmlEnumValue("ENGR")
    VALUE_45("ENGR"),

    /**
     * Father
     * 
     */
    @XmlEnumValue("FR")
    VALUE_46("FR"),

    /**
     * Flight Lieutenant
     * 
     */
    @XmlEnumValue("FLTLT")
    VALUE_47("FLTLT"),

    /**
     * Flight Sergeant
     * 
     */
    @XmlEnumValue("FSGT")
    VALUE_48("FSGT"),

    /**
     * Flying Officer
     * 
     */
    @XmlEnumValue("FLGOFF")
    VALUE_49("FLGOFF"),

    /**
     * General
     * 
     */
    @XmlEnumValue("GEN")
    VALUE_50("GEN"),

    /**
     * Governor
     * 
     */
    @XmlEnumValue("GOV")
    VALUE_51("GOV"),

    /**
     * Group Captain
     * 
     */
    @XmlEnumValue("GP CAPT")
    VALUE_52("GP CAPT"),

    /**
     * Honourable
     * 
     */
    @XmlEnumValue("HON")
    VALUE_53("HON"),

    /**
     * Judge
     * 
     */
    @XmlEnumValue("JUDGE")
    VALUE_54("JUDGE"),

    /**
     * Justice
     * 
     */
    @XmlEnumValue("JUSTICE")
    VALUE_55("JUSTICE"),

    /**
     * Lady
     * 
     */
    @XmlEnumValue("LADY")
    VALUE_56("LADY"),

    /**
     * Lance Bombardier
     * 
     */
    @XmlEnumValue("LBDR")
    VALUE_57("LBDR"),

    /**
     * Lance Corporal
     * 
     */
    @XmlEnumValue("LCPL")
    VALUE_58("LCPL"),

    /**
     * Leading Aircraftman
     * 
     */
    @XmlEnumValue("LAC")
    VALUE_59("LAC"),

    /**
     * Leading Aircraftwoman
     * 
     */
    @XmlEnumValue("LACW")
    VALUE_60("LACW"),

    /**
     * Leading Seaman
     * 
     */
    @XmlEnumValue("LS")
    VALUE_61("LS"),

    /**
     * Lieutenant
     * 
     */
    @XmlEnumValue("(ARMY) LT")
    VALUE_62("(ARMY) LT"),

    /**
     * Lieutenant (NAVY)
     * 
     */
    @XmlEnumValue("LEUT")
    VALUE_63("LEUT"),

    /**
     * Lieutenant Colonel
     * 
     */
    @XmlEnumValue("LTCOL")
    VALUE_64("LTCOL"),

    /**
     * Lieutenant Commander
     * 
     */
    @XmlEnumValue("LCDR")
    VALUE_65("LCDR"),

    /**
     * Lieutenant General
     * 
     */
    @XmlEnumValue("LTGEN")
    VALUE_66("LTGEN"),

    /**
     * Lieutenant Governor
     * 
     */
    @XmlEnumValue("LTGOV")
    VALUE_67("LTGOV"),

    /**
     * Lord
     * 
     */
    @XmlEnumValue("LORD")
    VALUE_68("LORD"),

    /**
     * Madam
     * 
     */
    @XmlEnumValue("MADAM")
    VALUE_69("MADAM"),

    /**
     * Madame
     * 
     */
    @XmlEnumValue("MADAME")
    VALUE_70("MADAME"),

    /**
     * Major
     * 
     */
    @XmlEnumValue("MAJ")
    VALUE_71("MAJ"),

    /**
     * Major General
     * 
     */
    @XmlEnumValue("MAJGEN")
    VALUE_72("MAJGEN"),

    /**
     * Manager
     * 
     */
    @XmlEnumValue("MGR")
    VALUE_73("MGR"),

    /**
     * Master
     * 
     */
    @XmlEnumValue("MSTR")
    VALUE_74("MSTR"),

    /**
     * Mayor
     * 
     */
    @XmlEnumValue("MAYOR")
    VALUE_75("MAYOR"),

    /**
     * Mayoress
     * 
     */
    @XmlEnumValue("MAYORESS")
    VALUE_76("MAYORESS"),

    /**
     * Midshipman
     * 
     */
    @XmlEnumValue("MIDN")
    VALUE_77("MIDN"),

    /**
     * Miss
     * 
     */
    @XmlEnumValue("MISS")
    VALUE_78("MISS"),

    /**
     * Mister
     * 
     */
    @XmlEnumValue("MR")
    VALUE_79("MR"),

    /**
     * Monsignor
     * 
     */
    @XmlEnumValue("MON")
    VALUE_80("MON"),

    /**
     * Most Reverend
     * 
     */
    @XmlEnumValue("MOST REV")
    VALUE_81("MOST REV"),

    /**
     * Mother
     * 
     */
    @XmlEnumValue("MTHR")
    VALUE_82("MTHR"),

    /**
     * Mrs
     * 
     */
    @XmlEnumValue("MRS")
    VALUE_83("MRS"),

    /**
     * Ms
     * 
     */
    @XmlEnumValue("MS")
    VALUE_84("MS"),

    /**
     * Nurse
     * 
     */
    @XmlEnumValue("NURSE")
    VALUE_85("NURSE"),

    /**
     * Officer Cadet
     * 
     */
    @XmlEnumValue("OCDT")
    VALUE_86("OCDT"),

    /**
     * Pastor
     * 
     */
    @XmlEnumValue("PASTOR")
    VALUE_87("PASTOR"),

    /**
     * Petty Officer
     * 
     */
    @XmlEnumValue("PO")
    VALUE_88("PO"),

    /**
     * Pilot Officer
     * 
     */
    @XmlEnumValue("PLTOFF")
    VALUE_89("PLTOFF"),

    /**
     * Private
     * 
     */
    @XmlEnumValue("PTE")
    VALUE_90("PTE"),

    /**
     * Professor
     * 
     */
    @XmlEnumValue("PROF")
    VALUE_91("PROF"),

    /**
     * Rabbi
     * 
     */
    @XmlEnumValue("RABBI")
    VALUE_92("RABBI"),

    /**
     * Rear Admiral
     * 
     */
    @XmlEnumValue("RADM")
    VALUE_93("RADM"),

    /**
     * Rector
     * 
     */
    @XmlEnumValue("RECTOR")
    VALUE_94("RECTOR"),

    /**
     * Regimental Sergeant Major
     * 
     */
    @XmlEnumValue("RSM")
    VALUE_95("RSM"),

    /**
     * Regimental Sergeant Major of the Army
     * 
     */
    @XmlEnumValue("RSM-A")
    VALUE_96("RSM-A"),

    /**
     * Reverend
     * 
     */
    @XmlEnumValue("REV")
    VALUE_97("REV"),

    /**
     * Right Honourable
     * 
     */
    @XmlEnumValue("RTHON")
    VALUE_98("RTHON"),

    /**
     * Right Reverend
     * 
     */
    @XmlEnumValue("RT REV")
    VALUE_99("RT REV"),

    /**
     * Seaman
     * 
     */
    @XmlEnumValue("SMN")
    VALUE_100("SMN"),

    /**
     * Second Lieutenant
     * 
     */
    @XmlEnumValue("2LT")
    VALUE_101("2LT"),

    /**
     * Senator
     * 
     */
    @XmlEnumValue("SEN")
    VALUE_102("SEN"),

    /**
     * Senior
     * 
     */
    @XmlEnumValue("SNR")
    VALUE_103("SNR"),

    /**
     * Sergeant
     * 
     */
    @XmlEnumValue("SGT")
    VALUE_104("SGT"),

    /**
     * Sir
     * 
     */
    @XmlEnumValue("SIR")
    VALUE_105("SIR"),

    /**
     * Sister
     * 
     */
    @XmlEnumValue("SR")
    VALUE_106("SR"),

    /**
     * Sister Superior
     * 
     */
    @XmlEnumValue("SISTER SUP")
    VALUE_107("SISTER SUP"),

    /**
     * Squadron Leader
     * 
     */
    @XmlEnumValue("SQNLDR")
    VALUE_108("SQNLDR"),

    /**
     * Staff Cadet
     * 
     */
    @XmlEnumValue("SCDT")
    VALUE_109("SCDT"),

    /**
     * Staff Sergeant
     * 
     */
    @XmlEnumValue("SSGT")
    VALUE_110("SSGT"),

    /**
     * Station Master
     * 
     */
    @XmlEnumValue("SM")
    VALUE_111("SM"),

    /**
     * Sub lieutenant
     * 
     */
    @XmlEnumValue("SBLT")
    VALUE_112("SBLT"),

    /**
     * Superintendent
     * 
     */
    @XmlEnumValue("SUPT")
    VALUE_113("SUPT"),

    /**
     * Swami
     * 
     */
    @XmlEnumValue("SWAMI")
    VALUE_114("SWAMI"),

    /**
     * Vice Admiral
     * 
     */
    @XmlEnumValue("VADM")
    VALUE_115("VADM"),

    /**
     * Vice Commander
     * 
     */
    @XmlEnumValue("VCE CMNDR")
    VALUE_116("VCE CMNDR"),

    /**
     * Viscount
     * 
     */
    @XmlEnumValue("VISCOUNT")
    VALUE_117("VISCOUNT"),

    /**
     * Warrant Officer (AIR FORCE)
     * 
     */
    @XmlEnumValue("WOFF")
    VALUE_118("WOFF"),

    /**
     * Warrant Officer (NAVY)
     * 
     */
    @XmlEnumValue("WO")
    VALUE_119("WO"),

    /**
     * Warrant Officer Class 1
     * 
     */
    @XmlEnumValue("WO1")
    VALUE_120("WO1"),

    /**
     * Warrant Officer Class 2
     * 
     */
    @XmlEnumValue("WO2")
    VALUE_121("WO2"),

    /**
     * Warrant Officer of the Air Force
     * 
     */
    @XmlEnumValue("WOFF-AF")
    VALUE_122("WOFF-AF"),

    /**
     * Warrant Officer of the Navy
     * 
     */
    @XmlEnumValue("WO-N")
    VALUE_123("WO-N"),

    /**
     * Wing Commander
     * 
     */
    @XmlEnumValue("WCDR")
    VALUE_124("WCDR");
    private final String value;

    NameTitleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NameTitleType fromValue(String v) {
        for (NameTitleType c: NameTitleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
