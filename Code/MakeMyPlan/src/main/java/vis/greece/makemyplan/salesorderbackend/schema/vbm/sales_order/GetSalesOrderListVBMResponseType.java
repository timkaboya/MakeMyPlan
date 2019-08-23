
package vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderVBOType;


/**
 *  Type definition for the GetSalesOrderList response payload.
 * 
 * <p>Java class for GetSalesOrderListVBMResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSalesOrderListVBMResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderVBO" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesOrderVBOType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSalesOrderListVBMResponseType", propOrder = {
    "salesOrderVBO"
})
@XmlRootElement(name="GetSalesOrderListVBMResponse")
public class GetSalesOrderListVBMResponseType {

    @XmlElement(name = "SalesOrderVBO")
    protected List<SalesOrderVBOType> salesOrderVBO;

    /**
     * Gets the value of the salesOrderVBO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderVBO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderVBO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOrderVBOType }
     * 
     * 
     */
    public List<SalesOrderVBOType> getSalesOrderVBO() {
        if (salesOrderVBO == null) {
            salesOrderVBO = new ArrayList<SalesOrderVBOType>();
        }
        return this.salesOrderVBO;
    }

}
