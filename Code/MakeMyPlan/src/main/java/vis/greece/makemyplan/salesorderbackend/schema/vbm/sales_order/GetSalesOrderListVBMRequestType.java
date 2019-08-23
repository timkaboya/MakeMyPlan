
package vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.QueryType;


/**
 *  Type definition for the GetSalesOrderList request payload.
 * 
 * <p>Java class for GetSalesOrderListVBMRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSalesOrderListVBMRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}QueryType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSalesOrderListVBMRequestType")
@XmlRootElement(name = "GetSalesOrderListVBMRequest")
public class GetSalesOrderListVBMRequestType
    extends QueryType
{


}
