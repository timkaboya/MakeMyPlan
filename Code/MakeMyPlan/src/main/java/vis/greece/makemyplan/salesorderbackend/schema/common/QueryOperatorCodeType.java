
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryOperatorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryOperatorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="NOT_EQUALS"/>
 *     &lt;enumeration value="GREATER_THAN"/>
 *     &lt;enumeration value="GREATER_THAN_EQUALS"/>
 *     &lt;enumeration value="LESS_THAN"/>
 *     &lt;enumeration value="LESS_THAN_EQUALS"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="DOES_NOT_CONTAIN"/>
 *     &lt;enumeration value="LIKE"/>
 *     &lt;enumeration value="NOT_LIKE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryOperatorCodeType")
@XmlEnum
public enum QueryOperatorCodeType {

    EQUALS,
    NOT_EQUALS,
    GREATER_THAN,
    GREATER_THAN_EQUALS,
    LESS_THAN,
    LESS_THAN_EQUALS,
    CONTAINS,
    DOES_NOT_CONTAIN,
    LIKE,
    NOT_LIKE;

    public String value() {
        return name();
    }

    public static QueryOperatorCodeType fromValue(String v) {
        return valueOf(v);
    }

}
