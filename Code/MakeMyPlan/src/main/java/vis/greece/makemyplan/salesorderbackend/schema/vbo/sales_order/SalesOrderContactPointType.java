
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.ContactPointType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedSalesOrderContactPointType;


/**
 * <p>Java class for SalesOrderContactPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderContactPointType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}ContactPointType">
 *       &lt;sequence>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedSalesOrderContactPointType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderContactPointType", propOrder = {
    "extension"
})
public class SalesOrderContactPointType
    extends ContactPointType
{

    @XmlElement(name = "Extension")
    protected ExtendedSalesOrderContactPointType extension;

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderContactPointType }
     *     
     */
    public ExtendedSalesOrderContactPointType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderContactPointType }
     *     
     */
    public void setExtension(ExtendedSalesOrderContactPointType value) {
        this.extension = value;
    }

}
