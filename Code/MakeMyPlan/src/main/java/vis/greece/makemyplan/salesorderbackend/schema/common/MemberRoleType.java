
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * <p>Java class for MemberRoleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MemberRoleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}PartyReferenceType">
 *       &lt;sequence>
 *         &lt;element name="Role" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *         &lt;element name="Influence" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *         &lt;element name="Opinion" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="ReportsTold" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *         &lt;element name="Urgency" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="BusinessGoals" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="DecisionCriteria" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="PersonalGoals" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemberRoleType", propOrder = {
    "role",
    "influence",
    "opinion",
    "reportsTold",
    "urgency",
    "businessGoals",
    "decisionCriteria",
    "personalGoals"
})
public class MemberRoleType
    extends PartyReferenceType
{

    @XmlElement(name = "Role")
    protected IDType role;
    @XmlElement(name = "Influence")
    protected IDType influence;
    @XmlElement(name = "Opinion")
    protected TextType opinion;
    @XmlElement(name = "ReportsTold")
    protected IDType reportsTold;
    @XmlElement(name = "Urgency")
    protected TextType urgency;
    @XmlElement(name = "BusinessGoals")
    protected TextType businessGoals;
    @XmlElement(name = "DecisionCriteria")
    protected TextType decisionCriteria;
    @XmlElement(name = "PersonalGoals")
    protected TextType personalGoals;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setRole(IDType value) {
        this.role = value;
    }

    /**
     * Gets the value of the influence property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getInfluence() {
        return influence;
    }

    /**
     * Sets the value of the influence property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setInfluence(IDType value) {
        this.influence = value;
    }

    /**
     * Gets the value of the opinion property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getOpinion() {
        return opinion;
    }

    /**
     * Sets the value of the opinion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setOpinion(TextType value) {
        this.opinion = value;
    }

    /**
     * Gets the value of the reportsTold property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getReportsTold() {
        return reportsTold;
    }

    /**
     * Sets the value of the reportsTold property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setReportsTold(IDType value) {
        this.reportsTold = value;
    }

    /**
     * Gets the value of the urgency property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getUrgency() {
        return urgency;
    }

    /**
     * Sets the value of the urgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setUrgency(TextType value) {
        this.urgency = value;
    }

    /**
     * Gets the value of the businessGoals property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getBusinessGoals() {
        return businessGoals;
    }

    /**
     * Sets the value of the businessGoals property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setBusinessGoals(TextType value) {
        this.businessGoals = value;
    }

    /**
     * Gets the value of the decisionCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDecisionCriteria() {
        return decisionCriteria;
    }

    /**
     * Sets the value of the decisionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDecisionCriteria(TextType value) {
        this.decisionCriteria = value;
    }

    /**
     * Gets the value of the personalGoals property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPersonalGoals() {
        return personalGoals;
    }

    /**
     * Sets the value of the personalGoals property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPersonalGoals(TextType value) {
        this.personalGoals = value;
    }

}
