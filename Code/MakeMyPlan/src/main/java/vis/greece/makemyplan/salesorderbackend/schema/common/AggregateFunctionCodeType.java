
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregateFunctionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AggregateFunctionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="COUNT"/>
 *     &lt;enumeration value="SUM"/>
 *     &lt;enumeration value="MIN"/>
 *     &lt;enumeration value="MAX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AggregateFunctionCodeType")
@XmlEnum
public enum AggregateFunctionCodeType {

    COUNT,
    SUM,
    MIN,
    MAX;

    public String value() {
        return name();
    }

    public static AggregateFunctionCodeType fromValue(String v) {
        return valueOf(v);
    }

}
