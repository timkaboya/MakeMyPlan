
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IndicatorType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderContactPointType;


/**
 * <p>Java class for ContactPointType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactPointType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *         &lt;element name="Preferred" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Email" type="{http://group.vodafone.com/schema/common/v1}EmailType"/>
 *           &lt;element name="Telephone" type="{http://group.vodafone.com/schema/common/v1}TelephoneType"/>
 *           &lt;element name="Postal" type="{http://group.vodafone.com/schema/common/v1}PostalAddressType"/>
 *           &lt;element name="SMS" type="{http://group.vodafone.com/schema/common/v1}SMSType"/>
 *           &lt;element name="Fax" type="{http://group.vodafone.com/schema/common/v1}FaxType"/>
 *           &lt;element name="PushNotification" type="{http://group.vodafone.com/schema/common/v1}PushNotificationType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="actionCode" type="{http://group.vodafone.com/schema/common/v1}ActionCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactPointType", propOrder = {
    "id",
    "preferred",
    "email",
    "telephone",
    "postal",
    "sms",
    "fax",
    "pushNotification"
})
@XmlSeeAlso({
    SalesOrderContactPointType.class
})
public class ContactPointType {

    @XmlElement(name = "ID")
    protected IDType id;
    @XmlElement(name = "Preferred")
    protected IndicatorType preferred;
    @XmlElement(name = "Email")
    protected EmailType email;
    @XmlElement(name = "Telephone")
    protected TelephoneType telephone;
    @XmlElement(name = "Postal")
    protected PostalAddressType postal;
    @XmlElement(name = "SMS")
    protected SMSType sms;
    @XmlElement(name = "Fax")
    protected FaxType fax;
    @XmlElement(name = "PushNotification")
    protected PushNotificationType pushNotification;
    @XmlAttribute(name = "actionCode")
    protected ActionCodeType actionCode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setPreferred(IndicatorType value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link EmailType }
     *     
     */
    public EmailType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *     
     */
    public void setEmail(EmailType value) {
        this.email = value;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * @return
     *     possible object is
     *     {@link TelephoneType }
     *     
     */
    public TelephoneType getTelephone() {
        return telephone;
    }

    /**
     * Sets the value of the telephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelephoneType }
     *     
     */
    public void setTelephone(TelephoneType value) {
        this.telephone = value;
    }

    /**
     * Gets the value of the postal property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    public PostalAddressType getPostal() {
        return postal;
    }

    /**
     * Sets the value of the postal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     */
    public void setPostal(PostalAddressType value) {
        this.postal = value;
    }

    /**
     * Gets the value of the sms property.
     * 
     * @return
     *     possible object is
     *     {@link SMSType }
     *     
     */
    public SMSType getSMS() {
        return sms;
    }

    /**
     * Sets the value of the sms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SMSType }
     *     
     */
    public void setSMS(SMSType value) {
        this.sms = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link FaxType }
     *     
     */
    public FaxType getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaxType }
     *     
     */
    public void setFax(FaxType value) {
        this.fax = value;
    }

    /**
     * Gets the value of the pushNotification property.
     * 
     * @return
     *     possible object is
     *     {@link PushNotificationType }
     *     
     */
    public PushNotificationType getPushNotification() {
        return pushNotification;
    }

    /**
     * Sets the value of the pushNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PushNotificationType }
     *     
     */
    public void setPushNotification(PushNotificationType value) {
        this.pushNotification = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCodeType }
     *     
     */
    public ActionCodeType getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCodeType }
     *     
     */
    public void setActionCode(ActionCodeType value) {
        this.actionCode = value;
    }

}
