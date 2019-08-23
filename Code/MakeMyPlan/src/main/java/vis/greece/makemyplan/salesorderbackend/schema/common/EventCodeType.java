
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EventCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString">
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Updated"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EventCodeType")
@XmlEnum
public enum EventCodeType {

    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Updated")
    UPDATED("Updated"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    EventCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EventCodeType fromValue(String v) {
        for (EventCodeType c: EventCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
