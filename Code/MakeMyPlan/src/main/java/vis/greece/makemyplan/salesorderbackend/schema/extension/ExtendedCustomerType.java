
package vis.greece.makemyplan.salesorderbackend.schema.extension;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;
import vis.greece.makemyplan.salesorderbackend.schema.common.ContactPeopleType;


/**
 * <p>Java class for ExtendedCustomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedCustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactPeople" type="{http://group.vodafone.com/schema/common/v1}ContactPeopleType" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Identifications" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Identification" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}IdentificationType" maxOccurs="unbounded"/>
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
@XmlType(name = "ExtendedCustomerType", propOrder = {
    "contactPeople",
    "countryCode",
    "identifications"
})
public class ExtendedCustomerType {

    @XmlElement(name = "ContactPeople")
    protected ContactPeopleType contactPeople;
    @XmlElement(name = "CountryCode")
    protected TextType countryCode;
    @XmlElement(name = "Identifications")
    protected ExtendedCustomerType.Identifications identifications;

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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCountryCode(TextType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the identifications property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCustomerType.Identifications }
     *     
     */
    public ExtendedCustomerType.Identifications getIdentifications() {
        return identifications;
    }

    /**
     * Sets the value of the identifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCustomerType.Identifications }
     *     
     */
    public void setIdentifications(ExtendedCustomerType.Identifications value) {
        this.identifications = value;
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
     *         &lt;element name="Identification" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}IdentificationType" maxOccurs="unbounded"/>
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
        "identification"
    })
    public static class Identifications {

        @XmlElement(name = "Identification", required = true)
        protected List<IdentificationType> identification;

        /**
         * Gets the value of the identification property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identification property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentification().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IdentificationType }
         * 
         * 
         */
        public List<IdentificationType> getIdentification() {
            if (identification == null) {
                identification = new ArrayList<IdentificationType>();
            }
            return this.identification;
        }

    }

}
