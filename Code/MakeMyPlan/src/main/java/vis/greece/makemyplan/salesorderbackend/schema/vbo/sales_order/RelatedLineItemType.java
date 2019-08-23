
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.BaseComponentType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedRelatedLineItemType;


/**
 * <p>Java class for RelatedLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedLineItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedRelatedLineItemType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedLineItemType", propOrder = {
    "extension"
})
public class RelatedLineItemType
    extends BaseComponentType
{

    @XmlElement(name = "Extension")
    protected ExtendedRelatedLineItemType extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedRelatedLineItemType }
     *     
     */
    public ExtendedRelatedLineItemType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedRelatedLineItemType }
     *     
     */
    public void setExtension(ExtendedRelatedLineItemType value) {
        this.extension = value;
    }

}
