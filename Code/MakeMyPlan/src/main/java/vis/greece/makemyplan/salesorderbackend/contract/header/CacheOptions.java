
package vis.greece.makemyplan.salesorderbackend.contract.header;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CacheOptions.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CacheOptions">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="yes"/>
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CacheOptions")
@XmlEnum
public enum CacheOptions {


    /**
     * 
     * 						Use cache during queries by default (code may
     * 						override this).
     * 					
     * 
     */
    @XmlEnumValue("yes")
    YES("yes"),

    /**
     * 
     * 						Cache must be ignored, retrieve data from the
     * 						back-end instead
     * 					
     * 
     */
    @XmlEnumValue("no")
    NO("no"),

    /**
     * 
     * 						The service can decide whether or not to use a
     * 						cache
     * 					
     * 
     */
    @XmlEnumValue("default")
    DEFAULT("default");
    private final String value;

    CacheOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CacheOptions fromValue(String v) {
        for (CacheOptions c: CacheOptions.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
