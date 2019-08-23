
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.ExtendedBaseComponentType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedSalesOrderVBOType;


/**
 * 
 * 				A Sales Order is the mechanism allowing a customer to order products / services.  These products and services are made available to the customer as Product Offerings.  A Sales Order can also contain an order to stop a Subscription to an existing product or instructions to modify it in some way.  Additionally, things like SIM swap, and service configuration changes may be included on a Sales Order.  A Sales Order line item therefore will have a Create action for Product Offerings and a Delete or Modify action for Products, Resources and Services
 * 			
 * 
 * <p>Java class for SalesOrderVBOType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderVBOType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}ExtendedBaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Details" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesOrderDetailsType" minOccurs="0"/>
 *         &lt;element name="RelatedSalesOrders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelatedSalesOrder" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}RelatedSalesOrderType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Roles" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesOrderRolesType" minOccurs="0"/>
 *         &lt;element name="Parts" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SalesOrderPartsType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedSalesOrderVBOType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderVBOType", propOrder = {
    "details",
    "relatedSalesOrders",
    "roles",
    "parts",
    "extension"
})
public class SalesOrderVBOType
    extends ExtendedBaseComponentType
{

    @XmlElement(name = "Details")
    protected SalesOrderDetailsType details;
    @XmlElement(name = "RelatedSalesOrders")
    protected SalesOrderVBOType.RelatedSalesOrders relatedSalesOrders;
    @XmlElement(name = "Roles")
    protected SalesOrderRolesType roles;
    @XmlElement(name = "Parts")
    protected SalesOrderPartsType parts;
    @XmlElement(name = "Extension")
    protected ExtendedSalesOrderVBOType extension;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderDetailsType }
     *     
     */
    public SalesOrderDetailsType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderDetailsType }
     *     
     */
    public void setDetails(SalesOrderDetailsType value) {
        this.details = value;
    }

    /**
     * Gets the value of the relatedSalesOrders property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderVBOType.RelatedSalesOrders }
     *     
     */
    public SalesOrderVBOType.RelatedSalesOrders getRelatedSalesOrders() {
        return relatedSalesOrders;
    }

    /**
     * Sets the value of the relatedSalesOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderVBOType.RelatedSalesOrders }
     *     
     */
    public void setRelatedSalesOrders(SalesOrderVBOType.RelatedSalesOrders value) {
        this.relatedSalesOrders = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderRolesType }
     *     
     */
    public SalesOrderRolesType getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderRolesType }
     *     
     */
    public void setRoles(SalesOrderRolesType value) {
        this.roles = value;
    }

    /**
     * Gets the value of the parts property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderPartsType }
     *     
     */
    public SalesOrderPartsType getParts() {
        return parts;
    }

    /**
     * Sets the value of the parts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderPartsType }
     *     
     */
    public void setParts(SalesOrderPartsType value) {
        this.parts = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderVBOType }
     *     
     */
    public ExtendedSalesOrderVBOType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderVBOType }
     *     
     */
    public void setExtension(ExtendedSalesOrderVBOType value) {
        this.extension = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RelatedSalesOrder" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}RelatedSalesOrderType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "relatedSalesOrder"
    })
    public static class RelatedSalesOrders {

        @XmlElement(name = "RelatedSalesOrder", required = true)
        protected List<RelatedSalesOrderType> relatedSalesOrder;

        /**
         * Gets the value of the relatedSalesOrder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedSalesOrder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedSalesOrder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RelatedSalesOrderType }
         * 
         * 
         */
        public List<RelatedSalesOrderType> getRelatedSalesOrder() {
            if (relatedSalesOrder == null) {
                relatedSalesOrder = new ArrayList<RelatedSalesOrderType>();
            }
            return this.relatedSalesOrder;
        }

    }

}
