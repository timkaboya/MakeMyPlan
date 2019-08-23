
package vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderVBOType;


/**
 *  Type definition for the UpdateSalesOrder response payload.
 * 
 * <p>Java class for UpdateSalesOrderVBMResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSalesOrderVBMResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderVBO" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesOrderVBOType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSalesOrderVBMResponseType", propOrder = {
    "salesOrderVBO"
})
public class UpdateSalesOrderVBMResponseType {

    @XmlElement(name = "SalesOrderVBO", required = true)
    protected SalesOrderVBOType salesOrderVBO;

    /**
     * Gets the value of the salesOrderVBO property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderVBOType }
     *     
     */
    public SalesOrderVBOType getSalesOrderVBO() {
        return salesOrderVBO;
    }

    /**
     * Sets the value of the salesOrderVBO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderVBOType }
     *     
     */
    public void setSalesOrderVBO(SalesOrderVBOType value) {
        this.salesOrderVBO = value;
    }

}
