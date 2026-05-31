
package au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StreetType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * <simpleType name="StreetType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCS"/>
 *     <enumeration value="ALLY"/>
 *     <enumeration value="ALWY"/>
 *     <enumeration value="AMBL"/>
 *     <enumeration value="ANCG"/>
 *     <enumeration value="APP"/>
 *     <enumeration value="ARC"/>
 *     <enumeration value="ART"/>
 *     <enumeration value="AVE"/>
 *     <enumeration value="BASN"/>
 *     <enumeration value="BCH"/>
 *     <enumeration value="BEND"/>
 *     <enumeration value="BLK"/>
 *     <enumeration value="BWLK"/>
 *     <enumeration value="BVD"/>
 *     <enumeration value="BRCE"/>
 *     <enumeration value="BRAE"/>
 *     <enumeration value="BRK"/>
 *     <enumeration value="BDGE"/>
 *     <enumeration value="BDWY"/>
 *     <enumeration value="BROW"/>
 *     <enumeration value="BYPA"/>
 *     <enumeration value="BYWY"/>
 *     <enumeration value="CAUS"/>
 *     <enumeration value="CTR"/>
 *     <enumeration value="CNWY"/>
 *     <enumeration value="CH"/>
 *     <enumeration value="CIR"/>
 *     <enumeration value="CLT"/>
 *     <enumeration value="CCT"/>
 *     <enumeration value="CRCS"/>
 *     <enumeration value="CL"/>
 *     <enumeration value="CLDE"/>
 *     <enumeration value="CMMN"/>
 *     <enumeration value="CON"/>
 *     <enumeration value="CPS"/>
 *     <enumeration value="CNR"/>
 *     <enumeration value="CSO"/>
 *     <enumeration value="CT"/>
 *     <enumeration value="CTYD"/>
 *     <enumeration value="COVE"/>
 *     <enumeration value="CRES"/>
 *     <enumeration value="CRST"/>
 *     <enumeration value="CRSS"/>
 *     <enumeration value="CRSG"/>
 *     <enumeration value="CRD"/>
 *     <enumeration value="COWY"/>
 *     <enumeration value="CUWY"/>
 *     <enumeration value="CDS"/>
 *     <enumeration value="CTTG"/>
 *     <enumeration value="DALE"/>
 *     <enumeration value="DELL"/>
 *     <enumeration value="DEVN"/>
 *     <enumeration value="DIP"/>
 *     <enumeration value="DSTR"/>
 *     <enumeration value="DR"/>
 *     <enumeration value="DRWY"/>
 *     <enumeration value="EDGE"/>
 *     <enumeration value="ELB"/>
 *     <enumeration value="END"/>
 *     <enumeration value="ENT"/>
 *     <enumeration value="ESP"/>
 *     <enumeration value="EST"/>
 *     <enumeration value="EXP"/>
 *     <enumeration value="EXTN"/>
 *     <enumeration value="FAWY"/>
 *     <enumeration value="FTRK"/>
 *     <enumeration value="FITR"/>
 *     <enumeration value="FLAT"/>
 *     <enumeration value="FOLW"/>
 *     <enumeration value="FTWY"/>
 *     <enumeration value="FSHR"/>
 *     <enumeration value="FORM"/>
 *     <enumeration value="FWY"/>
 *     <enumeration value="FRNT"/>
 *     <enumeration value="FRTG"/>
 *     <enumeration value="GAP"/>
 *     <enumeration value="GDN"/>
 *     <enumeration value="GDNS"/>
 *     <enumeration value="GTE"/>
 *     <enumeration value="GTES"/>
 *     <enumeration value="GLD"/>
 *     <enumeration value="GLEN"/>
 *     <enumeration value="GRA"/>
 *     <enumeration value="GRN"/>
 *     <enumeration value="GRND"/>
 *     <enumeration value="GR"/>
 *     <enumeration value="GLY"/>
 *     <enumeration value="HTS"/>
 *     <enumeration value="HRD"/>
 *     <enumeration value="HWY"/>
 *     <enumeration value="HILL"/>
 *     <enumeration value="INTG"/>
 *     <enumeration value="INTN"/>
 *     <enumeration value="JNC"/>
 *     <enumeration value="KEY"/>
 *     <enumeration value="LDG"/>
 *     <enumeration value="LANE"/>
 *     <enumeration value="LNWY"/>
 *     <enumeration value="LEES"/>
 *     <enumeration value="LINE"/>
 *     <enumeration value="LINK"/>
 *     <enumeration value="LT"/>
 *     <enumeration value="LKT"/>
 *     <enumeration value="LOOP"/>
 *     <enumeration value="LWR"/>
 *     <enumeration value="MALL"/>
 *     <enumeration value="MNDR"/>
 *     <enumeration value="MEW"/>
 *     <enumeration value="MEWS"/>
 *     <enumeration value="MWY"/>
 *     <enumeration value="MT"/>
 *     <enumeration value="NOOK"/>
 *     <enumeration value="OTLK"/>
 *     <enumeration value="PDE"/>
 *     <enumeration value="PARK"/>
 *     <enumeration value="PKLD"/>
 *     <enumeration value="PKWY"/>
 *     <enumeration value="PART"/>
 *     <enumeration value="PASS"/>
 *     <enumeration value="PATH"/>
 *     <enumeration value="PHWY"/>
 *     <enumeration value="PIAZ"/>
 *     <enumeration value="PL"/>
 *     <enumeration value="PLAT"/>
 *     <enumeration value="PLZA"/>
 *     <enumeration value="PKT"/>
 *     <enumeration value="PNT"/>
 *     <enumeration value="PORT"/>
 *     <enumeration value="PROM"/>
 *     <enumeration value="QUAD"/>
 *     <enumeration value="QDGL"/>
 *     <enumeration value="QDRT"/>
 *     <enumeration value="QY"/>
 *     <enumeration value="QYS"/>
 *     <enumeration value="RMBL"/>
 *     <enumeration value="RAMP"/>
 *     <enumeration value="RNGE"/>
 *     <enumeration value="RCH"/>
 *     <enumeration value="RES"/>
 *     <enumeration value="REST"/>
 *     <enumeration value="RTT"/>
 *     <enumeration value="RIDE"/>
 *     <enumeration value="RDGE"/>
 *     <enumeration value="RGWY"/>
 *     <enumeration value="ROWY"/>
 *     <enumeration value="RING"/>
 *     <enumeration value="RISE"/>
 *     <enumeration value="RVR"/>
 *     <enumeration value="RVWY"/>
 *     <enumeration value="RVRA"/>
 *     <enumeration value="RD"/>
 *     <enumeration value="RDS"/>
 *     <enumeration value="RDSD"/>
 *     <enumeration value="RDWY"/>
 *     <enumeration value="RNDE"/>
 *     <enumeration value="RSBL"/>
 *     <enumeration value="RTY"/>
 *     <enumeration value="RND"/>
 *     <enumeration value="RTE"/>
 *     <enumeration value="ROW"/>
 *     <enumeration value="RUE"/>
 *     <enumeration value="RUN"/>
 *     <enumeration value="SWY"/>
 *     <enumeration value="SHUN"/>
 *     <enumeration value="SDNG"/>
 *     <enumeration value="SLPE"/>
 *     <enumeration value="SND"/>
 *     <enumeration value="SPUR"/>
 *     <enumeration value="SQ"/>
 *     <enumeration value="STRS"/>
 *     <enumeration value="SHWY"/>
 *     <enumeration value="STPS"/>
 *     <enumeration value="STRA"/>
 *     <enumeration value="ST"/>
 *     <enumeration value="STRP"/>
 *     <enumeration value="SBWY"/>
 *     <enumeration value="TARN"/>
 *     <enumeration value="TCE"/>
 *     <enumeration value="THOR"/>
 *     <enumeration value="TLWY"/>
 *     <enumeration value="TOP"/>
 *     <enumeration value="TOR"/>
 *     <enumeration value="TWRS"/>
 *     <enumeration value="TRK"/>
 *     <enumeration value="TRL"/>
 *     <enumeration value="TRLR"/>
 *     <enumeration value="TRI"/>
 *     <enumeration value="TKWY"/>
 *     <enumeration value="TURN"/>
 *     <enumeration value="UPAS"/>
 *     <enumeration value="UPR"/>
 *     <enumeration value="VALE"/>
 *     <enumeration value="VDCT"/>
 *     <enumeration value="VIEW"/>
 *     <enumeration value="VLLS"/>
 *     <enumeration value="VSTA"/>
 *     <enumeration value="WADE"/>
 *     <enumeration value="WALK"/>
 *     <enumeration value="WKWY"/>
 *     <enumeration value="WAY"/>
 *     <enumeration value="WHRF"/>
 *     <enumeration value="WYND"/>
 *     <enumeration value="YARD"/>
 *   </restriction>
 * </simpleType>
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
