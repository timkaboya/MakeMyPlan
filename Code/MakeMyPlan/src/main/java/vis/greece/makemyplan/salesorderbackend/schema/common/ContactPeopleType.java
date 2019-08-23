
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactPeopleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactPeopleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactPerson" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://group.vodafone.com/schema/common/v1}ContactPersonType">
 *                 &lt;sequence>
 *                   &lt;element name="ContactPoints" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ContactPoint" type="{http://group.vodafone.com/schema/common/v1}ContactPointType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactPeopleType", propOrder = {
    "contactPerson"
})
public class ContactPeopleType {

    @XmlElement(name = "ContactPerson")
    protected List<ContactPeopleType.ContactPerson> contactPerson;

    /**
     * Gets the value of the contactPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPeopleType.ContactPerson }
     * 
     * 
     */
    public List<ContactPeopleType.ContactPerson> getContactPerson() {
        if (contactPerson == null) {
            contactPerson = new ArrayList<ContactPeopleType.ContactPerson>();
        }
        return this.contactPerson;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}ContactPersonType">
     *       &lt;sequence>
     *         &lt;element name="ContactPoints" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ContactPoint" type="{http://group.vodafone.com/schema/common/v1}ContactPointType" maxOccurs="unbounded" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "contactPoints"
    })
    public static class ContactPerson
        extends ContactPersonType
    {

        @XmlElement(name = "ContactPoints")
        protected ContactPeopleType.ContactPerson.ContactPoints contactPoints;

        /**
         * Gets the value of the contactPoints property.
         * 
         * @return
         *     possible object is
         *     {@link ContactPeopleType.ContactPerson.ContactPoints }
         *     
         */
        public ContactPeopleType.ContactPerson.ContactPoints getContactPoints() {
            return contactPoints;
        }

        /**
         * Sets the value of the contactPoints property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContactPeopleType.ContactPerson.ContactPoints }
         *     
         */
        public void setContactPoints(ContactPeopleType.ContactPerson.ContactPoints value) {
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
         *         &lt;element name="ContactPoint" type="{http://group.vodafone.com/schema/common/v1}ContactPointType" maxOccurs="unbounded" minOccurs="0"/>
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

            @XmlElement(name = "ContactPoint")
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

}
