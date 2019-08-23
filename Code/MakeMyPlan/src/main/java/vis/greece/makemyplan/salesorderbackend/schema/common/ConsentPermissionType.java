
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * <p>Java class for ConsentPermissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsentPermissionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Details" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="User" type="{http://group.vodafone.com/schema/common/v1}UserType" minOccurs="0"/>
 *         &lt;element name="SubscribedService" type="{http://group.vodafone.com/schema/common/v1}SubscribedServiceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsentPermissionType", propOrder = {
    "details",
    "user",
    "subscribedService"
})
public class ConsentPermissionType
    extends BaseComponentType
{

    @XmlElement(name = "Details")
    protected TextType details;
    @XmlElement(name = "User")
    protected UserType user;
    @XmlElement(name = "SubscribedService")
    protected SubscribedServiceType subscribedService;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDetails(TextType value) {
        this.details = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserType }
     *     
     */
    public UserType getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserType }
     *     
     */
    public void setUser(UserType value) {
        this.user = value;
    }

    /**
     * Gets the value of the subscribedService property.
     * 
     * @return
     *     possible object is
     *     {@link SubscribedServiceType }
     *     
     */
    public SubscribedServiceType getSubscribedService() {
        return subscribedService;
    }

    /**
     * Sets the value of the subscribedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscribedServiceType }
     *     
     */
    public void setSubscribedService(SubscribedServiceType value) {
        this.subscribedService = value;
    }

}
