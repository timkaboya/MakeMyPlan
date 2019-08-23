
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedSalesOrderRolesType;


/**
 * <p>Java class for SalesOrderRolesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOrderRolesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Agent" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}AgentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Requestor" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}RequestorType" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}CustomerType" minOccurs="0"/>
 *         &lt;element name="BillToParty" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}CommonPartyType" minOccurs="0"/>
 *         &lt;element name="ShipToParty" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}CommonPartyType" minOccurs="0"/>
 *         &lt;element name="Subscriber" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}SubscriberRoleType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedSalesOrderRolesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesOrderRolesType", propOrder = {
    "agents",
    "requestor",
    "customer",
    "billToParty",
    "shipToParty",
    "subscriber",
    "extension"
})
public class SalesOrderRolesType {

    @XmlElement(name = "Agents")
    protected SalesOrderRolesType.Agents agents;
    @XmlElement(name = "Requestor")
    protected RequestorType requestor;
    @XmlElement(name = "Customer")
    protected CustomerType customer;
    @XmlElement(name = "BillToParty")
    protected CommonPartyType billToParty;
    @XmlElement(name = "ShipToParty")
    protected CommonPartyType shipToParty;
    @XmlElement(name = "Subscriber")
    protected SubscriberRoleType subscriber;
    @XmlElement(name = "Extension")
    protected ExtendedSalesOrderRolesType extension;

    /**
     * Gets the value of the agents property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOrderRolesType.Agents }
     *     
     */
    public SalesOrderRolesType.Agents getAgents() {
        return agents;
    }

    /**
     * Sets the value of the agents property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOrderRolesType.Agents }
     *     
     */
    public void setAgents(SalesOrderRolesType.Agents value) {
        this.agents = value;
    }

    /**
     * Gets the value of the requestor property.
     * 
     * @return
     *     possible object is
     *     {@link RequestorType }
     *     
     */
    public RequestorType getRequestor() {
        return requestor;
    }

    /**
     * Sets the value of the requestor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestorType }
     *     
     */
    public void setRequestor(RequestorType value) {
        this.requestor = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomer(CustomerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the billToParty property.
     * 
     * @return
     *     possible object is
     *     {@link CommonPartyType }
     *     
     */
    public CommonPartyType getBillToParty() {
        return billToParty;
    }

    /**
     * Sets the value of the billToParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonPartyType }
     *     
     */
    public void setBillToParty(CommonPartyType value) {
        this.billToParty = value;
    }

    /**
     * Gets the value of the shipToParty property.
     * 
     * @return
     *     possible object is
     *     {@link CommonPartyType }
     *     
     */
    public CommonPartyType getShipToParty() {
        return shipToParty;
    }

    /**
     * Sets the value of the shipToParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonPartyType }
     *     
     */
    public void setShipToParty(CommonPartyType value) {
        this.shipToParty = value;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriberRoleType }
     *     
     */
    public SubscriberRoleType getSubscriber() {
        return subscriber;
    }

    /**
     * Sets the value of the subscriber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriberRoleType }
     *     
     */
    public void setSubscriber(SubscriberRoleType value) {
        this.subscriber = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderRolesType }
     *     
     */
    public ExtendedSalesOrderRolesType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderRolesType }
     *     
     */
    public void setExtension(ExtendedSalesOrderRolesType value) {
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
     *         &lt;element name="Agent" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}AgentType" maxOccurs="unbounded" minOccurs="0"/>
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
        "agent"
    })
    public static class Agents {

        @XmlElement(name = "Agent")
        protected List<AgentType> agent;

        /**
         * Gets the value of the agent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the agent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AgentType }
         * 
         * 
         */
        public List<AgentType> getAgent() {
            if (agent == null) {
                agent = new ArrayList<AgentType>();
            }
            return this.agent;
        }

    }

}
