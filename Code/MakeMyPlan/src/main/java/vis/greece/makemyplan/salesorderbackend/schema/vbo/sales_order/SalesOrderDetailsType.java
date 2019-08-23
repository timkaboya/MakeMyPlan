
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedSalesOrderDetailsType;


/**
 *  A type definition for SalesOrder Details
 * 
 * <p>Java class for SalesOrderDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderDetailsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesOrderCommonDetailsType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedSalesOrderDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderDetailsType", propOrder = {
    "extension"
})
public class SalesOrderDetailsType
    extends SalesOrderCommonDetailsType
{

    @XmlElement(name = "Extension")
    protected ExtendedSalesOrderDetailsType extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderDetailsType }
     *     
     */
    public ExtendedSalesOrderDetailsType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderDetailsType }
     *     
     */
    public void setExtension(ExtendedSalesOrderDetailsType value) {
        this.extension = value;
    }

}
