
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.DateTimeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IndicatorType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * <p>Java class for CredentialsGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CredentialsGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="PasswordText" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="PasswordHintText" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="UsernameText" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="PINs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PIN" type="{http://group.vodafone.com/schema/common/v1}PINType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PasswordExpireDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PasswordWarningDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *         &lt;element name="PasswordExpired" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="PasswordWarned" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialsGroupType", propOrder = {
    "passwordText",
    "passwordHintText",
    "usernameText",
    "piNs",
    "passwordExpireDate",
    "passwordWarningDate",
    "passwordExpired",
    "passwordWarned"
})
public class CredentialsGroupType
    extends BaseComponentType
{

    @XmlElement(name = "PasswordText")
    protected TextType passwordText;
    @XmlElement(name = "PasswordHintText")
    protected TextType passwordHintText;
    @XmlElement(name = "UsernameText")
    protected TextType usernameText;
    @XmlElement(name = "PINs")
    protected CredentialsGroupType.PINs piNs;
    @XmlElement(name = "PasswordExpireDate")
    protected DateTimeType passwordExpireDate;
    @XmlElement(name = "PasswordWarningDate")
    protected DateTimeType passwordWarningDate;
    @XmlElement(name = "PasswordExpired")
    protected IndicatorType passwordExpired;
    @XmlElement(name = "PasswordWarned")
    protected IndicatorType passwordWarned;

    /**
     * Gets the value of the passwordText property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPasswordText() {
        return passwordText;
    }

    /**
     * Sets the value of the passwordText property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPasswordText(TextType value) {
        this.passwordText = value;
    }

    /**
     * Gets the value of the passwordHintText property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPasswordHintText() {
        return passwordHintText;
    }

    /**
     * Sets the value of the passwordHintText property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPasswordHintText(TextType value) {
        this.passwordHintText = value;
    }

    /**
     * Gets the value of the usernameText property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getUsernameText() {
        return usernameText;
    }

    /**
     * Sets the value of the usernameText property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setUsernameText(TextType value) {
        this.usernameText = value;
    }

    /**
     * Gets the value of the piNs property.
     * 
     * @return
     *     possible object is
     *     {@link CredentialsGroupType.PINs }
     *     
     */
    public CredentialsGroupType.PINs getPINs() {
        return piNs;
    }

    /**
     * Sets the value of the piNs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CredentialsGroupType.PINs }
     *     
     */
    public void setPINs(CredentialsGroupType.PINs value) {
        this.piNs = value;
    }

    /**
     * Gets the value of the passwordExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPasswordExpireDate() {
        return passwordExpireDate;
    }

    /**
     * Sets the value of the passwordExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPasswordExpireDate(DateTimeType value) {
        this.passwordExpireDate = value;
    }

    /**
     * Gets the value of the passwordWarningDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPasswordWarningDate() {
        return passwordWarningDate;
    }

    /**
     * Sets the value of the passwordWarningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPasswordWarningDate(DateTimeType value) {
        this.passwordWarningDate = value;
    }

    /**
     * Gets the value of the passwordExpired property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getPasswordExpired() {
        return passwordExpired;
    }

    /**
     * Sets the value of the passwordExpired property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setPasswordExpired(IndicatorType value) {
        this.passwordExpired = value;
    }

    /**
     * Gets the value of the passwordWarned property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getPasswordWarned() {
        return passwordWarned;
    }

    /**
     * Sets the value of the passwordWarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setPasswordWarned(IndicatorType value) {
        this.passwordWarned = value;
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
     *         &lt;element name="PIN" type="{http://group.vodafone.com/schema/common/v1}PINType" maxOccurs="unbounded"/>
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
        "pin"
    })
    public static class PINs {

        @XmlElement(name = "PIN", required = true)
        protected List<PINType> pin;

        /**
         * Gets the value of the pin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPIN().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PINType }
         * 
         * 
         */
        public List<PINType> getPIN() {
            if (pin == null) {
                pin = new ArrayList<PINType>();
            }
            return this.pin;
        }

    }

}
