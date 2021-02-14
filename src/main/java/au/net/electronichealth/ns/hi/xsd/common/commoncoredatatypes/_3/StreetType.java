
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StreetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StreetType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCS"/>
 *     &lt;enumeration value="ALLY"/>
 *     &lt;enumeration value="ALWY"/>
 *     &lt;enumeration value="AMBL"/>
 *     &lt;enumeration value="ANCG"/>
 *     &lt;enumeration value="APP"/>
 *     &lt;enumeration value="ARC"/>
 *     &lt;enumeration value="ART"/>
 *     &lt;enumeration value="AVE"/>
 *     &lt;enumeration value="BASN"/>
 *     &lt;enumeration value="BCH"/>
 *     &lt;enumeration value="BEND"/>
 *     &lt;enumeration value="BLK"/>
 *     &lt;enumeration value="BWLK"/>
 *     &lt;enumeration value="BVD"/>
 *     &lt;enumeration value="BRCE"/>
 *     &lt;enumeration value="BRAE"/>
 *     &lt;enumeration value="BRK"/>
 *     &lt;enumeration value="BDGE"/>
 *     &lt;enumeration value="BDWY"/>
 *     &lt;enumeration value="BROW"/>
 *     &lt;enumeration value="BYPA"/>
 *     &lt;enumeration value="BYWY"/>
 *     &lt;enumeration value="CAUS"/>
 *     &lt;enumeration value="CTR"/>
 *     &lt;enumeration value="CNWY"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="CIR"/>
 *     &lt;enumeration value="CLT"/>
 *     &lt;enumeration value="CCT"/>
 *     &lt;enumeration value="CRCS"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="CLDE"/>
 *     &lt;enumeration value="CMMN"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="CPS"/>
 *     &lt;enumeration value="CNR"/>
 *     &lt;enumeration value="CSO"/>
 *     &lt;enumeration value="CT"/>
 *     &lt;enumeration value="CTYD"/>
 *     &lt;enumeration value="COVE"/>
 *     &lt;enumeration value="CRES"/>
 *     &lt;enumeration value="CRST"/>
 *     &lt;enumeration value="CRSS"/>
 *     &lt;enumeration value="CRSG"/>
 *     &lt;enumeration value="CRD"/>
 *     &lt;enumeration value="COWY"/>
 *     &lt;enumeration value="CUWY"/>
 *     &lt;enumeration value="CDS"/>
 *     &lt;enumeration value="CTTG"/>
 *     &lt;enumeration value="DALE"/>
 *     &lt;enumeration value="DELL"/>
 *     &lt;enumeration value="DEVN"/>
 *     &lt;enumeration value="DIP"/>
 *     &lt;enumeration value="DSTR"/>
 *     &lt;enumeration value="DR"/>
 *     &lt;enumeration value="DRWY"/>
 *     &lt;enumeration value="EDGE"/>
 *     &lt;enumeration value="ELB"/>
 *     &lt;enumeration value="END"/>
 *     &lt;enumeration value="ENT"/>
 *     &lt;enumeration value="ESP"/>
 *     &lt;enumeration value="EST"/>
 *     &lt;enumeration value="EXP"/>
 *     &lt;enumeration value="EXTN"/>
 *     &lt;enumeration value="FAWY"/>
 *     &lt;enumeration value="FTRK"/>
 *     &lt;enumeration value="FITR"/>
 *     &lt;enumeration value="FLAT"/>
 *     &lt;enumeration value="FOLW"/>
 *     &lt;enumeration value="FTWY"/>
 *     &lt;enumeration value="FSHR"/>
 *     &lt;enumeration value="FORM"/>
 *     &lt;enumeration value="FWY"/>
 *     &lt;enumeration value="FRNT"/>
 *     &lt;enumeration value="FRTG"/>
 *     &lt;enumeration value="GAP"/>
 *     &lt;enumeration value="GDN"/>
 *     &lt;enumeration value="GDNS"/>
 *     &lt;enumeration value="GTE"/>
 *     &lt;enumeration value="GTES"/>
 *     &lt;enumeration value="GLD"/>
 *     &lt;enumeration value="GLEN"/>
 *     &lt;enumeration value="GRA"/>
 *     &lt;enumeration value="GRN"/>
 *     &lt;enumeration value="GRND"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="GLY"/>
 *     &lt;enumeration value="HTS"/>
 *     &lt;enumeration value="HRD"/>
 *     &lt;enumeration value="HWY"/>
 *     &lt;enumeration value="HILL"/>
 *     &lt;enumeration value="INTG"/>
 *     &lt;enumeration value="INTN"/>
 *     &lt;enumeration value="JNC"/>
 *     &lt;enumeration value="KEY"/>
 *     &lt;enumeration value="LDG"/>
 *     &lt;enumeration value="LANE"/>
 *     &lt;enumeration value="LNWY"/>
 *     &lt;enumeration value="LEES"/>
 *     &lt;enumeration value="LINE"/>
 *     &lt;enumeration value="LINK"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LKT"/>
 *     &lt;enumeration value="LOOP"/>
 *     &lt;enumeration value="LWR"/>
 *     &lt;enumeration value="MALL"/>
 *     &lt;enumeration value="MNDR"/>
 *     &lt;enumeration value="MEW"/>
 *     &lt;enumeration value="MEWS"/>
 *     &lt;enumeration value="MWY"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="NOOK"/>
 *     &lt;enumeration value="OTLK"/>
 *     &lt;enumeration value="PDE"/>
 *     &lt;enumeration value="PARK"/>
 *     &lt;enumeration value="PKLD"/>
 *     &lt;enumeration value="PKWY"/>
 *     &lt;enumeration value="PART"/>
 *     &lt;enumeration value="PASS"/>
 *     &lt;enumeration value="PATH"/>
 *     &lt;enumeration value="PHWY"/>
 *     &lt;enumeration value="PIAZ"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PLAT"/>
 *     &lt;enumeration value="PLZA"/>
 *     &lt;enumeration value="PKT"/>
 *     &lt;enumeration value="PNT"/>
 *     &lt;enumeration value="PORT"/>
 *     &lt;enumeration value="PROM"/>
 *     &lt;enumeration value="QUAD"/>
 *     &lt;enumeration value="QDGL"/>
 *     &lt;enumeration value="QDRT"/>
 *     &lt;enumeration value="QY"/>
 *     &lt;enumeration value="QYS"/>
 *     &lt;enumeration value="RMBL"/>
 *     &lt;enumeration value="RAMP"/>
 *     &lt;enumeration value="RNGE"/>
 *     &lt;enumeration value="RCH"/>
 *     &lt;enumeration value="RES"/>
 *     &lt;enumeration value="REST"/>
 *     &lt;enumeration value="RTT"/>
 *     &lt;enumeration value="RIDE"/>
 *     &lt;enumeration value="RDGE"/>
 *     &lt;enumeration value="RGWY"/>
 *     &lt;enumeration value="ROWY"/>
 *     &lt;enumeration value="RING"/>
 *     &lt;enumeration value="RISE"/>
 *     &lt;enumeration value="RVR"/>
 *     &lt;enumeration value="RVWY"/>
 *     &lt;enumeration value="RVRA"/>
 *     &lt;enumeration value="RD"/>
 *     &lt;enumeration value="RDS"/>
 *     &lt;enumeration value="RDSD"/>
 *     &lt;enumeration value="RDWY"/>
 *     &lt;enumeration value="RNDE"/>
 *     &lt;enumeration value="RSBL"/>
 *     &lt;enumeration value="RTY"/>
 *     &lt;enumeration value="RND"/>
 *     &lt;enumeration value="RTE"/>
 *     &lt;enumeration value="ROW"/>
 *     &lt;enumeration value="RUE"/>
 *     &lt;enumeration value="RUN"/>
 *     &lt;enumeration value="SWY"/>
 *     &lt;enumeration value="SHUN"/>
 *     &lt;enumeration value="SDNG"/>
 *     &lt;enumeration value="SLPE"/>
 *     &lt;enumeration value="SND"/>
 *     &lt;enumeration value="SPUR"/>
 *     &lt;enumeration value="SQ"/>
 *     &lt;enumeration value="STRS"/>
 *     &lt;enumeration value="SHWY"/>
 *     &lt;enumeration value="STPS"/>
 *     &lt;enumeration value="STRA"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="STRP"/>
 *     &lt;enumeration value="SBWY"/>
 *     &lt;enumeration value="TARN"/>
 *     &lt;enumeration value="TCE"/>
 *     &lt;enumeration value="THOR"/>
 *     &lt;enumeration value="TLWY"/>
 *     &lt;enumeration value="TOP"/>
 *     &lt;enumeration value="TOR"/>
 *     &lt;enumeration value="TWRS"/>
 *     &lt;enumeration value="TRK"/>
 *     &lt;enumeration value="TRL"/>
 *     &lt;enumeration value="TRLR"/>
 *     &lt;enumeration value="TRI"/>
 *     &lt;enumeration value="TKWY"/>
 *     &lt;enumeration value="TURN"/>
 *     &lt;enumeration value="UPAS"/>
 *     &lt;enumeration value="UPR"/>
 *     &lt;enumeration value="VALE"/>
 *     &lt;enumeration value="VDCT"/>
 *     &lt;enumeration value="VIEW"/>
 *     &lt;enumeration value="VLLS"/>
 *     &lt;enumeration value="VSTA"/>
 *     &lt;enumeration value="WADE"/>
 *     &lt;enumeration value="WALK"/>
 *     &lt;enumeration value="WKWY"/>
 *     &lt;enumeration value="WAY"/>
 *     &lt;enumeration value="WHRF"/>
 *     &lt;enumeration value="WYND"/>
 *     &lt;enumeration value="YARD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StreetType", namespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreDatatypes/3.0")
@XmlEnum
public enum StreetType {


    /**
     * ACCESS
     * 
     */
    ACCS,

    /**
     * ALLEY
     * 
     */
    ALLY,

    /**
     * ALLEYWAY
     * 
     */
    ALWY,

    /**
     * AMBLE
     * 
     */
    AMBL,

    /**
     * ANCHORAGE
     * 
     */
    ANCG,

    /**
     * APPROACH
     * 
     */
    APP,

    /**
     * ARCADE
     * 
     */
    ARC,

    /**
     * ARTERY
     * 
     */
    ART,

    /**
     * AVENUE
     * 
     */
    AVE,

    /**
     * BASIN
     * 
     */
    BASN,

    /**
     * BEACH
     * 
     */
    BCH,

    /**
     * BEND
     * 
     */
    BEND,

    /**
     * BLOCK
     * 
     */
    BLK,

    /**
     * BOARDWALK
     * 
     */
    BWLK,

    /**
     * BOULEVARD
     * 
     */
    BVD,

    /**
     * BRACE
     * 
     */
    BRCE,

    /**
     * BRAE
     * 
     */
    BRAE,

    /**
     * BREAK
     * 
     */
    BRK,

    /**
     * BRIDGE
     * 
     */
    BDGE,

    /**
     * BROADWAY
     * 
     */
    BDWY,

    /**
     * BROW
     * 
     */
    BROW,

    /**
     * BYPASS
     * 
     */
    BYPA,

    /**
     * BYWAY
     * 
     */
    BYWY,

    /**
     * CAUSEWAY
     * 
     */
    CAUS,

    /**
     * CENTRE
     * 
     */
    CTR,

    /**
     * CENTREWAY
     * 
     */
    CNWY,

    /**
     * CHASE
     * 
     */
    CH,

    /**
     * CIRCLE
     * 
     */
    CIR,

    /**
     * CIRCLET
     * 
     */
    CLT,

    /**
     * CIRCUIT
     * 
     */
    CCT,

    /**
     * CIRCUS
     * 
     */
    CRCS,

    /**
     * CLOSE
     * 
     */
    CL,

    /**
     * COLONNADE
     * 
     */
    CLDE,

    /**
     * COMMON
     * 
     */
    CMMN,

    /**
     * CONCOURSE
     * 
     */
    CON,

    /**
     * COPSE
     * 
     */
    CPS,

    /**
     * CORNER
     * 
     */
    CNR,

    /**
     * CORSO
     * 
     */
    CSO,

    /**
     * COURT
     * 
     */
    CT,

    /**
     * COURTYARD
     * 
     */
    CTYD,

    /**
     * COVE
     * 
     */
    COVE,

    /**
     * CRESCENT
     * 
     */
    CRES,

    /**
     * CREST
     * 
     */
    CRST,

    /**
     * CROSS
     * 
     */
    CRSS,

    /**
     * CROSSING
     * 
     */
    CRSG,

    /**
     * CROSSROAD
     * 
     */
    CRD,

    /**
     * CROSSWAY
     * 
     */
    COWY,

    /**
     * CRUISEWAY
     * 
     */
    CUWY,

    /**
     * CUL-DE-SAC
     * 
     */
    CDS,

    /**
     * CUTTING
     * 
     */
    CTTG,

    /**
     * DALE
     * 
     */
    DALE,

    /**
     * DELL
     * 
     */
    DELL,

    /**
     * DEVIATION
     * 
     */
    DEVN,

    /**
     * DIP
     * 
     */
    DIP,

    /**
     * DISTRIBUTOR
     * 
     */
    DSTR,

    /**
     * DRIVE
     * 
     */
    DR,

    /**
     * DRIVEWAY
     * 
     */
    DRWY,

    /**
     * EDGE
     * 
     */
    EDGE,

    /**
     * ELBOW
     * 
     */
    ELB,

    /**
     * END
     * 
     */
    END,

    /**
     * ENTRANCE
     * 
     */
    ENT,

    /**
     * ESPLANADE
     * 
     */
    ESP,

    /**
     * ESTATE
     * 
     */
    EST,

    /**
     * EXPRESSWAY
     * 
     */
    EXP,

    /**
     * EXTENSION
     * 
     */
    EXTN,

    /**
     * FAIRWAY
     * 
     */
    FAWY,

    /**
     * FIRE TRACK
     * 
     */
    FTRK,

    /**
     * FIRETRAIL
     * 
     */
    FITR,

    /**
     * FLAT
     * 
     */
    FLAT,

    /**
     * FOLLOW
     * 
     */
    FOLW,

    /**
     * FOOTWAY
     * 
     */
    FTWY,

    /**
     * FORESHORE
     * 
     */
    FSHR,

    /**
     * FORMATION
     * 
     */
    FORM,

    /**
     * FREEWAY
     * 
     */
    FWY,

    /**
     * FRONT
     * 
     */
    FRNT,

    /**
     * FRONTAGE
     * 
     */
    FRTG,

    /**
     * GAP
     * 
     */
    GAP,

    /**
     * GARDEN
     * 
     */
    GDN,

    /**
     * GARDENS
     * 
     */
    GDNS,

    /**
     * GATE
     * 
     */
    GTE,

    /**
     * GATES
     * 
     */
    GTES,

    /**
     * GLADE
     * 
     */
    GLD,

    /**
     * GLEN
     * 
     */
    GLEN,

    /**
     * GRANGE
     * 
     */
    GRA,

    /**
     * GREEN
     * 
     */
    GRN,

    /**
     * GROUND
     * 
     */
    GRND,

    /**
     * GROVE
     * 
     */
    GR,

    /**
     * GULLY
     * 
     */
    GLY,

    /**
     * HEIGHTS
     * 
     */
    HTS,

    /**
     * HIGHROAD
     * 
     */
    HRD,

    /**
     * HIGHWAY
     * 
     */
    HWY,

    /**
     * HILL
     * 
     */
    HILL,

    /**
     * INTERCHANGE
     * 
     */
    INTG,

    /**
     * INTERSECTION
     * 
     */
    INTN,

    /**
     * JUNCTION
     * 
     */
    JNC,

    /**
     * KEY
     * 
     */
    KEY,

    /**
     * LANDING
     * 
     */
    LDG,

    /**
     * LANE
     * 
     */
    LANE,

    /**
     * LANEWAY
     * 
     */
    LNWY,

    /**
     * LEES
     * 
     */
    LEES,

    /**
     * LINE
     * 
     */
    LINE,

    /**
     * LINK
     * 
     */
    LINK,

    /**
     * LITTLE
     * 
     */
    LT,

    /**
     * LOOKOUT
     * 
     */
    LKT,

    /**
     * LOOP
     * 
     */
    LOOP,

    /**
     * LOWER
     * 
     */
    LWR,

    /**
     * MALL
     * 
     */
    MALL,

    /**
     * MEANDER
     * 
     */
    MNDR,

    /**
     * MEW
     * 
     */
    MEW,

    /**
     * MEWS
     * 
     */
    MEWS,

    /**
     * MOTORWAY
     * 
     */
    MWY,

    /**
     * MOUNT
     * 
     */
    MT,

    /**
     * NOOK
     * 
     */
    NOOK,

    /**
     * OUTLOOK
     * 
     */
    OTLK,

    /**
     * PARADE
     * 
     */
    PDE,

    /**
     * PARK
     * 
     */
    PARK,

    /**
     * PARKLANDS
     * 
     */
    PKLD,

    /**
     * PARKWAY
     * 
     */
    PKWY,

    /**
     * PART
     * 
     */
    PART,

    /**
     * PASS
     * 
     */
    PASS,

    /**
     * PATH
     * 
     */
    PATH,

    /**
     * PATHWAY
     * 
     */
    PHWY,

    /**
     * PIAZZA
     * 
     */
    PIAZ,

    /**
     * PLACE
     * 
     */
    PL,

    /**
     * PLATEAU
     * 
     */
    PLAT,

    /**
     * PLAZA
     * 
     */
    PLZA,

    /**
     * POCKET
     * 
     */
    PKT,

    /**
     * POINT
     * 
     */
    PNT,

    /**
     * PORT
     * 
     */
    PORT,

    /**
     * PROMENADE
     * 
     */
    PROM,

    /**
     * QUAD
     * 
     */
    QUAD,

    /**
     * QUADRANGLE
     * 
     */
    QDGL,

    /**
     * QUADRANT
     * 
     */
    QDRT,

    /**
     * QUAY
     * 
     */
    QY,

    /**
     * QUAYS
     * 
     */
    QYS,

    /**
     * RAMBLE
     * 
     */
    RMBL,

    /**
     * RAMP
     * 
     */
    RAMP,

    /**
     * RANGE
     * 
     */
    RNGE,

    /**
     * REACH
     * 
     */
    RCH,

    /**
     * RESERVE
     * 
     */
    RES,

    /**
     * REST
     * 
     */
    REST,

    /**
     * RETREAT
     * 
     */
    RTT,

    /**
     * RIDE
     * 
     */
    RIDE,

    /**
     * RIDGE
     * 
     */
    RDGE,

    /**
     * RIDGEWAY
     * 
     */
    RGWY,

    /**
     * RIGHT OF WAY
     * 
     */
    ROWY,

    /**
     * RING
     * 
     */
    RING,

    /**
     * RISE
     * 
     */
    RISE,

    /**
     * RIVER
     * 
     */
    RVR,

    /**
     * RIVERWAY
     * 
     */
    RVWY,

    /**
     * RIVIERA
     * 
     */
    RVRA,

    /**
     * ROAD
     * 
     */
    RD,

    /**
     * ROADS
     * 
     */
    RDS,

    /**
     * ROADSIDE
     * 
     */
    RDSD,

    /**
     * ROADWAY
     * 
     */
    RDWY,

    /**
     * RONDE
     * 
     */
    RNDE,

    /**
     * ROSEBOWL
     * 
     */
    RSBL,

    /**
     * ROTARY
     * 
     */
    RTY,

    /**
     * ROUND
     * 
     */
    RND,

    /**
     * ROUTE
     * 
     */
    RTE,

    /**
     * ROW
     * 
     */
    ROW,

    /**
     * RUE
     * 
     */
    RUE,

    /**
     * RUN
     * 
     */
    RUN,

    /**
     * SERVICE WAY
     * 
     */
    SWY,

    /**
     * SHUNT
     * 
     */
    SHUN,

    /**
     * SIDING
     * 
     */
    SDNG,

    /**
     * SLOPE
     * 
     */
    SLPE,

    /**
     * SOUND
     * 
     */
    SND,

    /**
     * SPUR
     * 
     */
    SPUR,

    /**
     * SQUARE
     * 
     */
    SQ,

    /**
     * STAIRS
     * 
     */
    STRS,

    /**
     * STATE HIGHWAY
     * 
     */
    SHWY,

    /**
     * STEPS
     * 
     */
    STPS,

    /**
     * STRAND
     * 
     */
    STRA,

    /**
     * STREET
     * 
     */
    ST,

    /**
     * STRIP
     * 
     */
    STRP,

    /**
     * SUBWAY
     * 
     */
    SBWY,

    /**
     * TARN
     * 
     */
    TARN,

    /**
     * TERRACE
     * 
     */
    TCE,

    /**
     * THOROUGHFARE
     * 
     */
    THOR,

    /**
     * TOLLWAY
     * 
     */
    TLWY,

    /**
     * TOP
     * 
     */
    TOP,

    /**
     * TOR
     * 
     */
    TOR,

    /**
     * TOWERS
     * 
     */
    TWRS,

    /**
     * TRACK
     * 
     */
    TRK,

    /**
     * TRAIL
     * 
     */
    TRL,

    /**
     * TRAILER
     * 
     */
    TRLR,

    /**
     * TRIANGLE
     * 
     */
    TRI,

    /**
     * TRUNKWAY
     * 
     */
    TKWY,

    /**
     * TURN
     * 
     */
    TURN,

    /**
     * UNDERPASS
     * 
     */
    UPAS,

    /**
     * UPPER
     * 
     */
    UPR,

    /**
     * VALE
     * 
     */
    VALE,

    /**
     * VIADUCT
     * 
     */
    VDCT,

    /**
     * VIEW
     * 
     */
    VIEW,

    /**
     * VILLAS
     * 
     */
    VLLS,

    /**
     * VISTA
     * 
     */
    VSTA,

    /**
     * WADE
     * 
     */
    WADE,

    /**
     * WALK
     * 
     */
    WALK,

    /**
     * WALKWAY
     * 
     */
    WKWY,

    /**
     * WAY
     * 
     */
    WAY,

    /**
     * WHARF
     * 
     */
    WHRF,

    /**
     * WYND
     * 
     */
    WYND,

    /**
     * YARD
     * 
     */
    YARD;

    public String value() {
        return name();
    }

    public static StreetType fromValue(String v) {
        return valueOf(v);
    }

}
