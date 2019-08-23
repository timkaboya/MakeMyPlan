
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Party reference object used to refer a party.
 * 
 * <p>Java class for PartyReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyReferenceType")
@XmlSeeAlso({
    OrganisationPartyType.class,
    IndividualOrOrganisationPartyRoleReferenceType.class,
    IndividualAndOrganisationPartyRoleReferenceType.class,
    MemberRoleType.class,
    IndividualRoleType.class,
    OrganisationRoleType.class
})
public class PartyReferenceType
    extends BaseComponentType
{


}
