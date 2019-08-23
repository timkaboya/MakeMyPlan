
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.BaseComponentType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedSubscriberRoleType;


/**
 * <p>Java class for SubscriberRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberRoleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedSubscriberRoleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberRoleType", propOrder = {
    "extension"
})
public class SubscriberRoleType
    extends BaseComponentType
{

    @XmlElement(name = "Extension")
    protected ExtendedSubscriberRoleType extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSubscriberRoleType }
     *     
     */
    public ExtendedSubscriberRoleType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSubscriberRoleType }
     *     
     */
    public void setExtension(ExtendedSubscriberRoleType value) {
        this.extension = value;
    }

}
