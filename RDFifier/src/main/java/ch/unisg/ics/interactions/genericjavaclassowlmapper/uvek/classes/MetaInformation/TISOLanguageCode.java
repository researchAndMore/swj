
package ch.unisg.ics.interactions.genericjavaclassowlmapper.uvek.classes.MetaInformation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TISOLanguageCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TISOLanguageCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="2"/&gt;
 *     &lt;enumeration value="ab"/&gt;
 *     &lt;enumeration value="aa"/&gt;
 *     &lt;enumeration value="af"/&gt;
 *     &lt;enumeration value="sq"/&gt;
 *     &lt;enumeration value="am"/&gt;
 *     &lt;enumeration value="ar"/&gt;
 *     &lt;enumeration value="hy"/&gt;
 *     &lt;enumeration value="as"/&gt;
 *     &lt;enumeration value="ay"/&gt;
 *     &lt;enumeration value="az"/&gt;
 *     &lt;enumeration value="ba"/&gt;
 *     &lt;enumeration value="eu"/&gt;
 *     &lt;enumeration value="bn"/&gt;
 *     &lt;enumeration value="dz"/&gt;
 *     &lt;enumeration value="bh"/&gt;
 *     &lt;enumeration value="bi"/&gt;
 *     &lt;enumeration value="br"/&gt;
 *     &lt;enumeration value="bg"/&gt;
 *     &lt;enumeration value="my"/&gt;
 *     &lt;enumeration value="be"/&gt;
 *     &lt;enumeration value="km"/&gt;
 *     &lt;enumeration value="ca"/&gt;
 *     &lt;enumeration value="zh"/&gt;
 *     &lt;enumeration value="co"/&gt;
 *     &lt;enumeration value="hr"/&gt;
 *     &lt;enumeration value="cs"/&gt;
 *     &lt;enumeration value="da"/&gt;
 *     &lt;enumeration value="nl"/&gt;
 *     &lt;enumeration value="en"/&gt;
 *     &lt;enumeration value="eo"/&gt;
 *     &lt;enumeration value="et"/&gt;
 *     &lt;enumeration value="fo"/&gt;
 *     &lt;enumeration value="fa"/&gt;
 *     &lt;enumeration value="fj"/&gt;
 *     &lt;enumeration value="fi"/&gt;
 *     &lt;enumeration value="fr"/&gt;
 *     &lt;enumeration value="fy"/&gt;
 *     &lt;enumeration value="gl"/&gt;
 *     &lt;enumeration value="ka"/&gt;
 *     &lt;enumeration value="de"/&gt;
 *     &lt;enumeration value="el"/&gt;
 *     &lt;enumeration value="kl"/&gt;
 *     &lt;enumeration value="gn"/&gt;
 *     &lt;enumeration value="gu"/&gt;
 *     &lt;enumeration value="ha"/&gt;
 *     &lt;enumeration value="iw"/&gt;
 *     &lt;enumeration value="he"/&gt;
 *     &lt;enumeration value="hi"/&gt;
 *     &lt;enumeration value="hu"/&gt;
 *     &lt;enumeration value="is"/&gt;
 *     &lt;enumeration value="in"/&gt;
 *     &lt;enumeration value="id"/&gt;
 *     &lt;enumeration value="ia"/&gt;
 *     &lt;enumeration value="ie"/&gt;
 *     &lt;enumeration value="iu"/&gt;
 *     &lt;enumeration value="ik"/&gt;
 *     &lt;enumeration value="ga"/&gt;
 *     &lt;enumeration value="it"/&gt;
 *     &lt;enumeration value="ja"/&gt;
 *     &lt;enumeration value="jw"/&gt;
 *     &lt;enumeration value="kn"/&gt;
 *     &lt;enumeration value="ks"/&gt;
 *     &lt;enumeration value="kk"/&gt;
 *     &lt;enumeration value="rw"/&gt;
 *     &lt;enumeration value="ky"/&gt;
 *     &lt;enumeration value="rn"/&gt;
 *     &lt;enumeration value="ko"/&gt;
 *     &lt;enumeration value="ku"/&gt;
 *     &lt;enumeration value="lo"/&gt;
 *     &lt;enumeration value="la"/&gt;
 *     &lt;enumeration value="lv"/&gt;
 *     &lt;enumeration value="ln"/&gt;
 *     &lt;enumeration value="lt"/&gt;
 *     &lt;enumeration value="mk"/&gt;
 *     &lt;enumeration value="mg"/&gt;
 *     &lt;enumeration value="ms"/&gt;
 *     &lt;enumeration value="ml"/&gt;
 *     &lt;enumeration value="mt"/&gt;
 *     &lt;enumeration value="gv"/&gt;
 *     &lt;enumeration value="mi"/&gt;
 *     &lt;enumeration value="mr"/&gt;
 *     &lt;enumeration value="mo"/&gt;
 *     &lt;enumeration value="mn"/&gt;
 *     &lt;enumeration value="na"/&gt;
 *     &lt;enumeration value="ne"/&gt;
 *     &lt;enumeration value="no"/&gt;
 *     &lt;enumeration value="oc"/&gt;
 *     &lt;enumeration value="or"/&gt;
 *     &lt;enumeration value="om"/&gt;
 *     &lt;enumeration value="ps"/&gt;
 *     &lt;enumeration value="pl"/&gt;
 *     &lt;enumeration value="pt"/&gt;
 *     &lt;enumeration value="pa"/&gt;
 *     &lt;enumeration value="qu"/&gt;
 *     &lt;enumeration value="rm"/&gt;
 *     &lt;enumeration value="ro"/&gt;
 *     &lt;enumeration value="ru"/&gt;
 *     &lt;enumeration value="sm"/&gt;
 *     &lt;enumeration value="sg"/&gt;
 *     &lt;enumeration value="sa"/&gt;
 *     &lt;enumeration value="gd"/&gt;
 *     &lt;enumeration value="sr"/&gt;
 *     &lt;enumeration value="sh"/&gt;
 *     &lt;enumeration value="st"/&gt;
 *     &lt;enumeration value="tn"/&gt;
 *     &lt;enumeration value="sn"/&gt;
 *     &lt;enumeration value="sd"/&gt;
 *     &lt;enumeration value="si"/&gt;
 *     &lt;enumeration value="ss"/&gt;
 *     &lt;enumeration value="sk"/&gt;
 *     &lt;enumeration value="sl"/&gt;
 *     &lt;enumeration value="so"/&gt;
 *     &lt;enumeration value="es"/&gt;
 *     &lt;enumeration value="su"/&gt;
 *     &lt;enumeration value="sw"/&gt;
 *     &lt;enumeration value="sv"/&gt;
 *     &lt;enumeration value="tl"/&gt;
 *     &lt;enumeration value="tg"/&gt;
 *     &lt;enumeration value="ta"/&gt;
 *     &lt;enumeration value="tt"/&gt;
 *     &lt;enumeration value="te"/&gt;
 *     &lt;enumeration value="th"/&gt;
 *     &lt;enumeration value="bo"/&gt;
 *     &lt;enumeration value="ti"/&gt;
 *     &lt;enumeration value="to"/&gt;
 *     &lt;enumeration value="ts"/&gt;
 *     &lt;enumeration value="tr"/&gt;
 *     &lt;enumeration value="tk"/&gt;
 *     &lt;enumeration value="tw"/&gt;
 *     &lt;enumeration value="ug"/&gt;
 *     &lt;enumeration value="uk"/&gt;
 *     &lt;enumeration value="ur"/&gt;
 *     &lt;enumeration value="uz"/&gt;
 *     &lt;enumeration value="vi"/&gt;
 *     &lt;enumeration value="vo"/&gt;
 *     &lt;enumeration value="cy"/&gt;
 *     &lt;enumeration value="wo"/&gt;
 *     &lt;enumeration value="xh"/&gt;
 *     &lt;enumeration value="ji"/&gt;
 *     &lt;enumeration value="yi"/&gt;
 *     &lt;enumeration value="yo"/&gt;
 *     &lt;enumeration value="zu"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TISOLanguageCode")
@XmlEnum
public enum TISOLanguageCode {

    @XmlEnumValue("ab")
    AB("ab"),
    @XmlEnumValue("aa")
    AA("aa"),
    @XmlEnumValue("af")
    AF("af"),
    @XmlEnumValue("sq")
    SQ("sq"),
    @XmlEnumValue("am")
    AM("am"),
    @XmlEnumValue("ar")
    AR("ar"),
    @XmlEnumValue("hy")
    HY("hy"),
    @XmlEnumValue("as")
    AS("as"),
    @XmlEnumValue("ay")
    AY("ay"),
    @XmlEnumValue("az")
    AZ("az"),
    @XmlEnumValue("ba")
    BA("ba"),
    @XmlEnumValue("eu")
    EU("eu"),
    @XmlEnumValue("bn")
    BN("bn"),
    @XmlEnumValue("dz")
    DZ("dz"),
    @XmlEnumValue("bh")
    BH("bh"),
    @XmlEnumValue("bi")
    BI("bi"),
    @XmlEnumValue("br")
    BR("br"),
    @XmlEnumValue("bg")
    BG("bg"),
    @XmlEnumValue("my")
    MY("my"),
    @XmlEnumValue("be")
    BE("be"),
    @XmlEnumValue("km")
    KM("km"),
    @XmlEnumValue("ca")
    CA("ca"),
    @XmlEnumValue("zh")
    ZH("zh"),
    @XmlEnumValue("co")
    CO("co"),
    @XmlEnumValue("hr")
    HR("hr"),
    @XmlEnumValue("cs")
    CS("cs"),
    @XmlEnumValue("da")
    DA("da"),
    @XmlEnumValue("nl")
    NL("nl"),
    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("eo")
    EO("eo"),
    @XmlEnumValue("et")
    ET("et"),
    @XmlEnumValue("fo")
    FO("fo"),
    @XmlEnumValue("fa")
    FA("fa"),
    @XmlEnumValue("fj")
    FJ("fj"),
    @XmlEnumValue("fi")
    FI("fi"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("fy")
    FY("fy"),
    @XmlEnumValue("gl")
    GL("gl"),
    @XmlEnumValue("ka")
    KA("ka"),
    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("el")
    EL("el"),
    @XmlEnumValue("kl")
    KL("kl"),
    @XmlEnumValue("gn")
    GN("gn"),
    @XmlEnumValue("gu")
    GU("gu"),
    @XmlEnumValue("ha")
    HA("ha"),
    @XmlEnumValue("iw")
    IW("iw"),
    @XmlEnumValue("he")
    HE("he"),
    @XmlEnumValue("hi")
    HI("hi"),
    @XmlEnumValue("hu")
    HU("hu"),
    @XmlEnumValue("is")
    IS("is"),
    @XmlEnumValue("in")
    IN("in"),
    @XmlEnumValue("id")
    ID("id"),
    @XmlEnumValue("ia")
    IA("ia"),
    @XmlEnumValue("ie")
    IE("ie"),
    @XmlEnumValue("iu")
    IU("iu"),
    @XmlEnumValue("ik")
    IK("ik"),
    @XmlEnumValue("ga")
    GA("ga"),
    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("ja")
    JA("ja"),
    @XmlEnumValue("jw")
    JW("jw"),
    @XmlEnumValue("kn")
    KN("kn"),
    @XmlEnumValue("ks")
    KS("ks"),
    @XmlEnumValue("kk")
    KK("kk"),
    @XmlEnumValue("rw")
    RW("rw"),
    @XmlEnumValue("ky")
    KY("ky"),
    @XmlEnumValue("rn")
    RN("rn"),
    @XmlEnumValue("ko")
    KO("ko"),
    @XmlEnumValue("ku")
    KU("ku"),
    @XmlEnumValue("lo")
    LO("lo"),
    @XmlEnumValue("la")
    LA("la"),
    @XmlEnumValue("lv")
    LV("lv"),
    @XmlEnumValue("ln")
    LN("ln"),
    @XmlEnumValue("lt")
    LT("lt"),
    @XmlEnumValue("mk")
    MK("mk"),
    @XmlEnumValue("mg")
    MG("mg"),
    @XmlEnumValue("ms")
    MS("ms"),
    @XmlEnumValue("ml")
    ML("ml"),
    @XmlEnumValue("mt")
    MT("mt"),
    @XmlEnumValue("gv")
    GV("gv"),
    @XmlEnumValue("mi")
    MI("mi"),
    @XmlEnumValue("mr")
    MR("mr"),
    @XmlEnumValue("mo")
    MO("mo"),
    @XmlEnumValue("mn")
    MN("mn"),
    @XmlEnumValue("na")
    NA("na"),
    @XmlEnumValue("ne")
    NE("ne"),
    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("oc")
    OC("oc"),
    @XmlEnumValue("or")
    OR("or"),
    @XmlEnumValue("om")
    OM("om"),
    @XmlEnumValue("ps")
    PS("ps"),
    @XmlEnumValue("pl")
    PL("pl"),
    @XmlEnumValue("pt")
    PT("pt"),
    @XmlEnumValue("pa")
    PA("pa"),
    @XmlEnumValue("qu")
    QU("qu"),
    @XmlEnumValue("rm")
    RM("rm"),
    @XmlEnumValue("ro")
    RO("ro"),
    @XmlEnumValue("ru")
    RU("ru"),
    @XmlEnumValue("sm")
    SM("sm"),
    @XmlEnumValue("sg")
    SG("sg"),
    @XmlEnumValue("sa")
    SA("sa"),
    @XmlEnumValue("gd")
    GD("gd"),
    @XmlEnumValue("sr")
    SR("sr"),
    @XmlEnumValue("sh")
    SH("sh"),
    @XmlEnumValue("st")
    ST("st"),
    @XmlEnumValue("tn")
    TN("tn"),
    @XmlEnumValue("sn")
    SN("sn"),
    @XmlEnumValue("sd")
    SD("sd"),
    @XmlEnumValue("si")
    SI("si"),
    @XmlEnumValue("ss")
    SS("ss"),
    @XmlEnumValue("sk")
    SK("sk"),
    @XmlEnumValue("sl")
    SL("sl"),
    @XmlEnumValue("so")
    SO("so"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("su")
    SU("su"),
    @XmlEnumValue("sw")
    SW("sw"),
    @XmlEnumValue("sv")
    SV("sv"),
    @XmlEnumValue("tl")
    TL("tl"),
    @XmlEnumValue("tg")
    TG("tg"),
    @XmlEnumValue("ta")
    TA("ta"),
    @XmlEnumValue("tt")
    TT("tt"),
    @XmlEnumValue("te")
    TE("te"),
    @XmlEnumValue("th")
    TH("th"),
    @XmlEnumValue("bo")
    BO("bo"),
    @XmlEnumValue("ti")
    TI("ti"),
    @XmlEnumValue("to")
    TO("to"),
    @XmlEnumValue("ts")
    TS("ts"),
    @XmlEnumValue("tr")
    TR("tr"),
    @XmlEnumValue("tk")
    TK("tk"),
    @XmlEnumValue("tw")
    TW("tw"),
    @XmlEnumValue("ug")
    UG("ug"),
    @XmlEnumValue("uk")
    UK("uk"),
    @XmlEnumValue("ur")
    UR("ur"),
    @XmlEnumValue("uz")
    UZ("uz"),
    @XmlEnumValue("vi")
    VI("vi"),
    @XmlEnumValue("vo")
    VO("vo"),
    @XmlEnumValue("cy")
    CY("cy"),
    @XmlEnumValue("wo")
    WO("wo"),
    @XmlEnumValue("xh")
    XH("xh"),
    @XmlEnumValue("ji")
    JI("ji"),
    @XmlEnumValue("yi")
    YI("yi"),
    @XmlEnumValue("yo")
    YO("yo"),
    @XmlEnumValue("zu")
    ZU("zu");
    private final String value;

    TISOLanguageCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TISOLanguageCode fromValue(String v) {
        for (TISOLanguageCode c: TISOLanguageCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
