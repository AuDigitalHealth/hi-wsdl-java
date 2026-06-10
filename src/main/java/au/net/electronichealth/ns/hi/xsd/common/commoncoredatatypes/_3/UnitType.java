
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * &lt;p&gt;Java class for UnitType&lt;/p&gt;.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.&lt;/p&gt;
 * &lt;pre&gt;{&#064;code
 * &lt;simpleType name="UnitType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ANT"/&gt;
 *     &lt;enumeration value="APT"/&gt;
 *     &lt;enumeration value="ATM"/&gt;
 *     &lt;enumeration value="BBQ"/&gt;
 *     &lt;enumeration value="BTSD"/&gt;
 *     &lt;enumeration value="BLDG"/&gt;
 *     &lt;enumeration value="BNGW"/&gt;
 *     &lt;enumeration value="CAGE"/&gt;
 *     &lt;enumeration value="CARP"/&gt;
 *     &lt;enumeration value="CARS"/&gt;
 *     &lt;enumeration value="CLUB"/&gt;
 *     &lt;enumeration value="COOL"/&gt;
 *     &lt;enumeration value="CTGE"/&gt;
 *     &lt;enumeration value="DUP"/&gt;
 *     &lt;enumeration value="FY"/&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="GRGE"/&gt;
 *     &lt;enumeration value="HALL"/&gt;
 *     &lt;enumeration value="HSE"/&gt;
 *     &lt;enumeration value="KSK"/&gt;
 *     &lt;enumeration value="LSE"/&gt;
 *     &lt;enumeration value="LBBY"/&gt;
 *     &lt;enumeration value="LOFT"/&gt;
 *     &lt;enumeration value="LOT"/&gt;
 *     &lt;enumeration value="MSNT"/&gt;
 *     &lt;enumeration value="MB"/&gt;
 *     &lt;enumeration value="OFF"/&gt;
 *     &lt;enumeration value="PTHS"/&gt;
 *     &lt;enumeration value="RESV"/&gt;
 *     &lt;enumeration value="RM"/&gt;
 *     &lt;enumeration value="SHED"/&gt;
 *     &lt;enumeration value="SHOP"/&gt;
 *     &lt;enumeration value="SIGN"/&gt;
 *     &lt;enumeration value="SITE"/&gt;
 *     &lt;enumeration value="SL"/&gt;
 *     &lt;enumeration value="STOR"/&gt;
 *     &lt;enumeration value="STR"/&gt;
 *     &lt;enumeration value="STU"/&gt;
 *     &lt;enumeration value="SUBS"/&gt;
 *     &lt;enumeration value="SE"/&gt;
 *     &lt;enumeration value="TNCY"/&gt;
 *     &lt;enumeration value="TWR"/&gt;
 *     &lt;enumeration value="TNHS"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="VLLA"/&gt;
 *     &lt;enumeration value="WARD"/&gt;
 *     &lt;enumeration value="WE"/&gt;
 *     &lt;enumeration value="WKSH"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * }&lt;/pre&gt;
 * 
 */
@XmlType(name = "UnitType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum UnitType {


    /**
     * Antenna
     * 
     */
    ANT,

    /**
     * Apartment
     * 
     */
    APT,

    /**
     * Automated Teller Machine
     * 
     */
    ATM,

    /**
     * Barbeque
     * 
     */
    BBQ,

    /**
     * Boatshed
     * 
     */
    BTSD,

    /**
     * Building
     * 
     */
    BLDG,

    /**
     * Bungalow
     * 
     */
    BNGW,

    /**
     * Cage
     * 
     */
    CAGE,

    /**
     * Carpark
     * 
     */
    CARP,

    /**
     * Carspace
     * 
     */
    CARS,

    /**
     * Club
     * 
     */
    CLUB,

    /**
     * Coolroom
     * 
     */
    COOL,

    /**
     * Cottage
     * 
     */
    CTGE,

    /**
     * Duplex
     * 
     */
    DUP,

    /**
     * Factory
     * 
     */
    FY,

    /**
     * Flat
     * 
     */
    F,

    /**
     * Garage
     * 
     */
    GRGE,

    /**
     * Hall
     * 
     */
    HALL,

    /**
     * House
     * 
     */
    HSE,

    /**
     * Kiosk
     * 
     */
    KSK,

    /**
     * Lease
     * 
     */
    LSE,

    /**
     * Lobby
     * 
     */
    LBBY,

    /**
     * Loft
     * 
     */
    LOFT,

    /**
     * Lot
     * 
     */
    LOT,

    /**
     * Maisonette
     * 
     */
    MSNT,

    /**
     * Marine berth
     * 
     */
    MB,

    /**
     * Office
     * 
     */
    OFF,

    /**
     * Penthouse
     * 
     */
    PTHS,

    /**
     * Reserve
     * 
     */
    RESV,

    /**
     * Room
     * 
     */
    RM,

    /**
     * Shed
     * 
     */
    SHED,

    /**
     * Shop
     * 
     */
    SHOP,

    /**
     * Sign
     * 
     */
    SIGN,

    /**
     * Site
     * 
     */
    SITE,

    /**
     * Stall
     * 
     */
    SL,

    /**
     * Store
     * 
     */
    STOR,

    /**
     * Strata Unit
     * 
     */
    STR,

    /**
     * Studio
     * 
     */
    STU,

    /**
     * Substation
     * 
     */
    SUBS,

    /**
     * Suite
     * 
     */
    SE,

    /**
     * Tenancy
     * 
     */
    TNCY,

    /**
     * Tower
     * 
     */
    TWR,

    /**
     * Townhouse
     * 
     */
    TNHS,

    /**
     * Unit
     * 
     */
    U,

    /**
     * Villa
     * 
     */
    VLLA,

    /**
     * Ward
     * 
     */
    WARD,

    /**
     * Warehouse
     * 
     */
    WE,

    /**
     * Workshop
     * 
     */
    WKSH;

    public String value() {
        return name();
    }

    public static UnitType fromValue(String v) {
        return valueOf(v);
    }

}
