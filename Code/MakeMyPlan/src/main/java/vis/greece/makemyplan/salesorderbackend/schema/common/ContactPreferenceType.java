
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type definition of Customer Contact Preference Reference Type
 * 
 * <p>Java class for ContactPreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactPreferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Contact" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PeriodOfTime" type="{http://group.vodafone.com/schema/common/v1}ValidityPeriodType" minOccurs="0"/>
 *                   &lt;element name="Timing" type="{http://group.vodafone.com/schema/common/v1}TimingType" minOccurs="0"/>
 *                   &lt;element name="Content" type="{http://group.vodafone.com/schema/common/v1}ContentReferenceType" minOccurs="0"/>
 *                   &lt;element name="ContactPoints" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ContactPoint" type="{http://group.vodafone.com/schema/common/v1}ContactPointReferenceType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Alternatives" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Contact" type="{http://group.vodafone.com/schema/common/v1}ContactReferenceType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "ContactPreferenceType", propOrder = {
    "contact",
    "user",
    "subscribedService"
})
public class ContactPreferenceType
    extends BaseComponentType
{

    @XmlElement(name = "Contact")
    protected ContactPreferenceType.Contact contact;
    @XmlElement(name = "User")
    protected UserType user;
    @XmlElement(name = "SubscribedService")
    protected SubscribedServiceType subscribedService;

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPreferenceType.Contact }
     *     
     */
    public ContactPreferenceType.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPreferenceType.Contact }
     *     
     */
    public void setContact(ContactPreferenceType.Contact value) {
        this.contact = value;
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
     *         &lt;element name="PeriodOfTime" type="{http://group.vodafone.com/schema/common/v1}ValidityPeriodType" minOccurs="0"/>
     *         &lt;element name="Timing" type="{http://group.vodafone.com/schema/common/v1}TimingType" minOccurs="0"/>
     *         &lt;element name="Content" type="{http://group.vodafone.com/schema/common/v1}ContentReferenceType" minOccurs="0"/>
     *         &lt;element name="ContactPoints" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ContactPoint" type="{http://group.vodafone.com/schema/common/v1}ContactPointReferenceType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Alternatives" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Contact" type="{http://group.vodafone.com/schema/common/v1}ContactReferenceType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
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
    @XmlType(name = "", propOrder = {
        "periodOfTime",
        "timing",
        "content",
        "contactPoints",
        "alternatives"
    })
    public static class Contact {

        @XmlElement(name = "PeriodOfTime")
        protected ValidityPeriodType periodOfTime;
        @XmlElement(name = "Timing")
        protected TimingType timing;
        @XmlElement(name = "Content")
        protected ContentReferenceType content;
        @XmlElement(name = "ContactPoints")
        protected ContactPreferenceType.Contact.ContactPoints contactPoints;
        @XmlElement(name = "Alternatives")
        protected ContactPreferenceType.Contact.Alternatives alternatives;

        /**
         * Gets the value of the periodOfTime property.
         * 
         * @return
         *     possible object is
         *     {@link ValidityPeriodType }
         *     
         */
        public ValidityPeriodType getPeriodOfTime() {
            return periodOfTime;
        }

        /**
         * Sets the value of the periodOfTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link ValidityPeriodType }
         *     
         */
        public void setPeriodOfTime(ValidityPeriodType value) {
            this.periodOfTime = value;
        }

        /**
         * Gets the value of the timing property.
         * 
         * @return
         *     possible object is
         *     {@link TimingType }
         *     
         */
        public TimingType getTiming() {
            return timing;
        }

        /**
         * Sets the value of the timing property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimingType }
         *     
         */
        public void setTiming(TimingType value) {
            this.timing = value;
        }

        /**
         * Gets the value of the content property.
         * 
         * @return
         *     possible object is
         *     {@link ContentReferenceType }
         *     
         */
        public ContentReferenceType getContent() {
            return content;
        }

        /**
         * Sets the value of the content property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContentReferenceType }
         *     
         */
        public void setContent(ContentReferenceType value) {
            this.content = value;
        }

        /**
         * Gets the value of the contactPoints property.
         * 
         * @return
         *     possible object is
         *     {@link ContactPreferenceType.Contact.ContactPoints }
         *     
         */
        public ContactPreferenceType.Contact.ContactPoints getContactPoints() {
            return contactPoints;
        }

        /**
         * Sets the value of the contactPoints property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContactPreferenceType.Contact.ContactPoints }
         *     
         */
        public void setContactPoints(ContactPreferenceType.Contact.ContactPoints value) {
            this.contactPoints = value;
        }

        /**
         * Gets the value of the alternatives property.
         * 
         * @return
         *     possible object is
         *     {@link ContactPreferenceType.Contact.Alternatives }
         *     
         */
        public ContactPreferenceType.Contact.Alternatives getAlternatives() {
            return alternatives;
        }

        /**
         * Sets the value of the alternatives property.
         * 
         * @param value
         *     allowed object is
         *     {@link ContactPreferenceType.Contact.Alternatives }
         *     
         */
        public void setAlternatives(ContactPreferenceType.Contact.Alternatives value) {
            this.alternatives = value;
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
         *         &lt;element name="Contact" type="{http://group.vodafone.com/schema/common/v1}ContactReferenceType" minOccurs="0"/>
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
            "contact"
        })
        public static class Alternatives {

            @XmlElement(name = "Contact")
            protected ContactReferenceType contact;

            /**
             * Gets the value of the contact property.
             * 
             * @return
             *     possible object is
             *     {@link ContactReferenceType }
             *     
             */
            public ContactReferenceType getContact() {
                return contact;
            }

            /**
             * Sets the value of the contact property.
             * 
             * @param value
             *     allowed object is
             *     {@link ContactReferenceType }
             *     
             */
            public void setContact(ContactReferenceType value) {
                this.contact = value;
            }

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
         *         &lt;element name="ContactPoint" type="{http://group.vodafone.com/schema/common/v1}ContactPointReferenceType" maxOccurs="unbounded"/>
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
            protected List<ContactPointReferenceType> contactPoint;

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
             * {@link ContactPointReferenceType }
             * 
             * 
             */
            public List<ContactPointReferenceType> getContactPoint() {
                if (contactPoint == null) {
                    contactPoint = new ArrayList<ContactPointReferenceType>();
                }
                return this.contactPoint;
            }

        }

    }

}
