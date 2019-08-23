
package vis.greece.makemyplan.salesorderbackend.schema.extension;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;
import vis.greece.makemyplan.salesorderbackend.schema.common.ContactPeopleType;


/**
 * <p>Java class for ExtendedSubscriberRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedSubscriberRoleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactPeople" type="{http://group.vodafone.com/schema/common/v1}ContactPeopleType" minOccurs="0"/>
 *         &lt;element name="CostCentre" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="BusinessUnit" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedSubscriberRoleType", propOrder = {
    "contactPeople",
    "costCentre",
    "businessUnit"
})
public class ExtendedSubscriberRoleType {

    @XmlElement(name = "ContactPeople")
    protected ContactPeopleType contactPeople;
    @XmlElement(name = "CostCentre")
    protected TextType costCentre;
    @XmlElement(name = "BusinessUnit")
    protected TextType businessUnit;

    /**
     * Gets the value of the contactPeople property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPeopleType }
     *     
     */
    public ContactPeopleType getContactPeople() {
        return contactPeople;
    }

    /**
     * Sets the value of the contactPeople property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPeopleType }
     *     
     */
    public void setContactPeople(ContactPeopleType value) {
        this.contactPeople = value;
    }

    /**
     * Gets the value of the costCentre property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCostCentre() {
        return costCentre;
    }

    /**
     * Sets the value of the costCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCostCentre(TextType value) {
        this.costCentre = value;
    }

    /**
     * Gets the value of the businessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the value of the businessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setBusinessUnit(TextType value) {
        this.businessUnit = value;
    }

}
