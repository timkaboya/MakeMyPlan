
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IndicatorType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.NumericType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * <p>Java class for PreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferencesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Details" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ValidityPeriod" type="{http://group.vodafone.com/schema/common/v1}ValidityPeriodType" minOccurs="0"/>
 *                   &lt;element name="Explicit" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *                   &lt;element name="ConfidenceRating" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *                   &lt;element name="Default" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *                   &lt;element name="Instructions" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *                   &lt;element name="InferredScore" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *                   &lt;element name="VolunteeredScore" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
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
@XmlType(name = "PreferencesType", propOrder = {
    "details",
    "user",
    "subscribedService"
})
public class PreferencesType
    extends BaseComponentType
{

    @XmlElement(name = "Details")
    protected PreferencesType.Details details;
    @XmlElement(name = "User")
    protected UserType user;
    @XmlElement(name = "SubscribedService")
    protected SubscribedServiceType subscribedService;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link PreferencesType.Details }
     *     
     */
    public PreferencesType.Details getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferencesType.Details }
     *     
     */
    public void setDetails(PreferencesType.Details value) {
        this.details = value;
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
     *         &lt;element name="ValidityPeriod" type="{http://group.vodafone.com/schema/common/v1}ValidityPeriodType" minOccurs="0"/>
     *         &lt;element name="Explicit" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
     *         &lt;element name="ConfidenceRating" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
     *         &lt;element name="Default" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
     *         &lt;element name="Instructions" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
     *         &lt;element name="InferredScore" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
     *         &lt;element name="VolunteeredScore" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
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
        "validityPeriod",
        "explicit",
        "confidenceRating",
        "_default",
        "instructions",
        "inferredScore",
        "volunteeredScore"
    })
    public static class Details {

        @XmlElement(name = "ValidityPeriod")
        protected ValidityPeriodType validityPeriod;
        @XmlElement(name = "Explicit")
        protected IndicatorType explicit;
        @XmlElement(name = "ConfidenceRating")
        protected NumericType confidenceRating;
        @XmlElement(name = "Default")
        protected TextType _default;
        @XmlElement(name = "Instructions")
        protected TextType instructions;
        @XmlElement(name = "InferredScore")
        protected NumericType inferredScore;
        @XmlElement(name = "VolunteeredScore")
        protected NumericType volunteeredScore;

        /**
         * Gets the value of the validityPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link ValidityPeriodType }
         *     
         */
        public ValidityPeriodType getValidityPeriod() {
            return validityPeriod;
        }

        /**
         * Sets the value of the validityPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link ValidityPeriodType }
         *     
         */
        public void setValidityPeriod(ValidityPeriodType value) {
            this.validityPeriod = value;
        }

        /**
         * Gets the value of the explicit property.
         * 
         * @return
         *     possible object is
         *     {@link IndicatorType }
         *     
         */
        public IndicatorType getExplicit() {
            return explicit;
        }

        /**
         * Sets the value of the explicit property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndicatorType }
         *     
         */
        public void setExplicit(IndicatorType value) {
            this.explicit = value;
        }

        /**
         * Gets the value of the confidenceRating property.
         * 
         * @return
         *     possible object is
         *     {@link NumericType }
         *     
         */
        public NumericType getConfidenceRating() {
            return confidenceRating;
        }

        /**
         * Sets the value of the confidenceRating property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericType }
         *     
         */
        public void setConfidenceRating(NumericType value) {
            this.confidenceRating = value;
        }

        /**
         * Gets the value of the default property.
         * 
         * @return
         *     possible object is
         *     {@link TextType }
         *     
         */
        public TextType getDefault() {
            return _default;
        }

        /**
         * Sets the value of the default property.
         * 
         * @param value
         *     allowed object is
         *     {@link TextType }
         *     
         */
        public void setDefault(TextType value) {
            this._default = value;
        }

        /**
         * Gets the value of the instructions property.
         * 
         * @return
         *     possible object is
         *     {@link TextType }
         *     
         */
        public TextType getInstructions() {
            return instructions;
        }

        /**
         * Sets the value of the instructions property.
         * 
         * @param value
         *     allowed object is
         *     {@link TextType }
         *     
         */
        public void setInstructions(TextType value) {
            this.instructions = value;
        }

        /**
         * Gets the value of the inferredScore property.
         * 
         * @return
         *     possible object is
         *     {@link NumericType }
         *     
         */
        public NumericType getInferredScore() {
            return inferredScore;
        }

        /**
         * Sets the value of the inferredScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericType }
         *     
         */
        public void setInferredScore(NumericType value) {
            this.inferredScore = value;
        }

        /**
         * Gets the value of the volunteeredScore property.
         * 
         * @return
         *     possible object is
         *     {@link NumericType }
         *     
         */
        public NumericType getVolunteeredScore() {
            return volunteeredScore;
        }

        /**
         * Sets the value of the volunteeredScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumericType }
         *     
         */
        public void setVolunteeredScore(NumericType value) {
            this.volunteeredScore = value;
        }

    }

}
