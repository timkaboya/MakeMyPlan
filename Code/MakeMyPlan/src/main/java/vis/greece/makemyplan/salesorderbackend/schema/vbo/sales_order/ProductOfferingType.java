
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.BaseComponentType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedProductOfferingType;


/**
 * <p>Java class for ProductOfferingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductOfferingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedProductOfferingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductOfferingType", propOrder = {
    "extension"
})
public class ProductOfferingType
    extends BaseComponentType
{

    @XmlElement(name = "Extension")
    protected ExtendedProductOfferingType extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedProductOfferingType }
     *     
     */
    public ExtendedProductOfferingType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedProductOfferingType }
     *     
     */
    public void setExtension(ExtendedProductOfferingType value) {
        this.extension = value;
    }

}
