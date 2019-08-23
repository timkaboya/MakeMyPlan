
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortOrderCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortOrderCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="ASC"/>
 *     &lt;enumeration value="DSC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortOrderCodeType")
@XmlEnum
public enum SortOrderCodeType {

    ASC,
    DSC;

    public String value() {
        return name();
    }

    public static SortOrderCodeType fromValue(String v) {
        return valueOf(v);
    }

}
