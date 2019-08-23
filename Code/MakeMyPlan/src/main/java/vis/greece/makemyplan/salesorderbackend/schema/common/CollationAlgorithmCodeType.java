
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollationAlgorithmCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CollationAlgorithmCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="UTS#10"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CollationAlgorithmCodeType")
@XmlEnum
public enum CollationAlgorithmCodeType {

    @XmlEnumValue("UTS#10")
    UTS_10("UTS#10");
    private final String value;

    CollationAlgorithmCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollationAlgorithmCodeType fromValue(String v) {
        for (CollationAlgorithmCodeType c: CollationAlgorithmCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
