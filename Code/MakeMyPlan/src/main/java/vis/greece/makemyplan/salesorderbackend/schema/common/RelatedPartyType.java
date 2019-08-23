
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * <p>Java class for RelatedPartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedPartyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Role" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/>
 *         &lt;element name="ContactPoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContactPoint" type="{http://group.vodafone.com/schema/common/v1}ContactPointType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedPartyType", propOrder = {
    "role",
    "contactPoints"
})
public class RelatedPartyType
    extends BaseComponentType
{

    @XmlElement(name = "Role", required = true)
    protected TextType role;
    @XmlElement(name = "ContactPoints")
    protected RelatedPartyType.ContactPoints contactPoints;

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
     * Gets the value of the contactPoints property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedPartyType.ContactPoints }
     *     
     */
    public RelatedPartyType.ContactPoints getContactPoints() {
        return contactPoints;
    }

    /**
     * Sets the value of the contactPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedPartyType.ContactPoints }
     *     
     */
    public void setContactPoints(RelatedPartyType.ContactPoints value) {
        this.contactPoints = value;
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
     *         &lt;element name="ContactPoint" type="{http://group.vodafone.com/schema/common/v1}ContactPointType" maxOccurs="unbounded"/>
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
        "contactPoint"
    })
    public static class ContactPoints {

        @XmlElement(name = "ContactPoint", required = true)
        protected List<ContactPointType> contactPoint;

        /**
         * Gets the value of the contactPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactPointType }
         * 
         * 
         */
        public List<ContactPointType> getContactPoint() {
            if (contactPoint == null) {
                contactPoint = new ArrayList<ContactPointType>();
            }
            return this.contactPoint;
        }

    }

}
