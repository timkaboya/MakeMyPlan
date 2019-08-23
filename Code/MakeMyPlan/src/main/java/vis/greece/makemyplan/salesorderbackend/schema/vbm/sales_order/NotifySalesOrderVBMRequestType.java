
package vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.EventCodeType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderVBOType;


/**
 *  Type definition for the NotifySalesOrder request payload.
 * 
 * <p>Java class for NotifySalesOrderVBMRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifySalesOrderVBMRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesOrderVBO" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesOrderVBOType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="eventCode" type="{http://group.vodafone.com/schema/common/v1}EventCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifySalesOrderVBMRequestType", propOrder = {
    "salesOrderVBO"
})
public class NotifySalesOrderVBMRequestType {

    @XmlElement(name = "SalesOrderVBO", required = true)
    protected SalesOrderVBOType salesOrderVBO;
    @XmlAttribute(name = "eventCode")
    protected EventCodeType eventCode;

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

    /**
     * Gets the value of the eventCode property.
     * 
     * @return
     *     possible object is
     *     {@link EventCodeType }
     *     
     */
    public EventCodeType getEventCode() {
        return eventCode;
    }

    /**
     * Sets the value of the eventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCodeType }
     *     
     */
    public void setEventCode(EventCodeType value) {
        this.eventCode = value;
    }

}
