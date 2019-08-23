
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * <p>Java class for RelatedPartyWithContactPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedPartyWithContactPersonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Role" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/>
 *         &lt;element name="ContactPersons" type="{http://group.vodafone.com/schema/common/v1}ContactPeopleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedPartyWithContactPersonType", propOrder = {
    "role",
    "contactPersons"
})
public class RelatedPartyWithContactPersonType
    extends BaseComponentType
{

    @XmlElement(name = "Role", required = true)
    protected TextType role;
    @XmlElement(name = "ContactPersons")
    protected ContactPeopleType contactPersons;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setRole(TextType value) {
        this.role = value;
    }

    /**
     * Gets the value of the contactPersons property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPeopleType }
     *     
     */
    public ContactPeopleType getContactPersons() {
        return contactPersons;
    }

    /**
     * Sets the value of the contactPersons property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPeopleType }
     *     
     */
    public void setContactPersons(ContactPeopleType value) {
        this.contactPersons = value;
    }

}
