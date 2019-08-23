
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The reference to an individual and organisation with contact points for those parties as well as further contact people.
 * 
 * <p>Java class for IndividualAndOrganisationWithContactPartyRoleReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualAndOrganisationWithContactPartyRoleReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}IndividualAndOrganisationPartyRoleReferenceType">
 *       &lt;sequence>
 *         &lt;element name="ContactPoints" type="{http://group.vodafone.com/schema/common/v1}ContactPointsType" minOccurs="0"/>
 *         &lt;element name="ContactPeople" type="{http://group.vodafone.com/schema/common/v1}ContactPeopleType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualAndOrganisationWithContactPartyRoleReferenceType", propOrder = {
    "contactPoints",
    "contactPeople"
})
public class IndividualAndOrganisationWithContactPartyRoleReferenceType
    extends IndividualAndOrganisationPartyRoleReferenceType
{

    @XmlElement(name = "ContactPoints")
    protected ContactPointsType contactPoints;
    @XmlElement(name = "ContactPeople")
    protected ContactPeopleType contactPeople;

    /**
     * Gets the value of the contactPoints property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPointsType }
     *     
     */
    public ContactPointsType getContactPoints() {
        return contactPoints;
    }

    /**
     * Sets the value of the contactPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPointsType }
     *     
     */
    public void setContactPoints(ContactPointsType value) {
        this.contactPoints = value;
    }

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

}
