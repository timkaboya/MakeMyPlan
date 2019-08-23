
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.NumericType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * Type definition of Customer Language Preference Reference
 * 
 * <p>Java class for LanguagePreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguagePreferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Spoken" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Written" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Confidence" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *         &lt;element name="InferredScore" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *         &lt;element name="VolunteeredScore" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *         &lt;element name="User" type="{http://group.vodafone.com/schema/common/v1}UserType" minOccurs="0"/>
 *         &lt;element name="SubscribedService" type="{http://group.vodafone.com/schema/common/v1}SubscribedServiceType" minOccurs="0"/>
 *         &lt;element name="Languages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Language" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AlphabetName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/>
 *                             &lt;element name="DialectName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguagePreferenceType", propOrder = {
    "spoken",
    "written",
    "confidence",
    "inferredScore",
    "volunteeredScore",
    "user",
    "subscribedService",
    "languages"
})
public class LanguagePreferenceType
    extends BaseComponentType
{

    @XmlElement(name = "Spoken")
    protected TextType spoken;
    @XmlElement(name = "Written")
    protected TextType written;
    @XmlElement(name = "Confidence")
    protected NumericType confidence;
    @XmlElement(name = "InferredScore")
    protected NumericType inferredScore;
    @XmlElement(name = "VolunteeredScore")
    protected NumericType volunteeredScore;
    @XmlElement(name = "User")
    protected UserType user;
    @XmlElement(name = "SubscribedService")
    protected SubscribedServiceType subscribedService;
    @XmlElement(name = "Languages")
    protected LanguagePreferenceType.Languages languages;

    /**
     * Gets the value of the spoken property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSpoken() {
        return spoken;
    }

    /**
     * Sets the value of the spoken property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSpoken(TextType value) {
        this.spoken = value;
    }

    /**
     * Gets the value of the written property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getWritten() {
        return written;
    }

    /**
     * Sets the value of the written property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setWritten(TextType value) {
        this.written = value;
    }

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setConfidence(NumericType value) {
        this.confidence = value;
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
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link LanguagePreferenceType.Languages }
     *     
     */
    public LanguagePreferenceType.Languages getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguagePreferenceType.Languages }
     *     
     */
    public void setLanguages(LanguagePreferenceType.Languages value) {
        this.languages = value;
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
     *         &lt;element name="Language" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AlphabetName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/>
     *                   &lt;element name="DialectName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/>
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
        "language"
    })
    public static class Languages {

        @XmlElement(name = "Language", required = true)
        protected List<LanguagePreferenceType.Languages.Language> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LanguagePreferenceType.Languages.Language }
         * 
         * 
         */
        public List<LanguagePreferenceType.Languages.Language> getLanguage() {
            if (language == null) {
                language = new ArrayList<LanguagePreferenceType.Languages.Language>();
            }
            return this.language;
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
         *         &lt;element name="AlphabetName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/>
         *         &lt;element name="DialectName" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/>
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
            "alphabetName",
            "dialectName"
        })
        public static class Language {

            @XmlElement(name = "AlphabetName", required = true)
            protected TextType alphabetName;
            @XmlElement(name = "DialectName", required = true)
            protected TextType dialectName;

            /**
             * Gets the value of the alphabetName property.
             * 
             * @return
             *     possible object is
             *     {@link TextType }
             *     
             */
            public TextType getAlphabetName() {
                return alphabetName;
            }

            /**
             * Sets the value of the alphabetName property.
             * 
             * @param value
             *     allowed object is
             *     {@link TextType }
             *     
             */
            public void setAlphabetName(TextType value) {
                this.alphabetName = value;
            }

            /**
             * Gets the value of the dialectName property.
             * 
             * @return
             *     possible object is
             *     {@link TextType }
             *     
             */
            public TextType getDialectName() {
                return dialectName;
            }

            /**
             * Sets the value of the dialectName property.
             * 
             * @param value
             *     allowed object is
             *     {@link TextType }
             *     
             */
            public void setDialectName(TextType value) {
                this.dialectName = value;
            }

        }

    }

}
