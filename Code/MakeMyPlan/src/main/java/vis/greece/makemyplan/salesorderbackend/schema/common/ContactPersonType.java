
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.CodeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.DateType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IndicatorType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * <p>Java class for ContactPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactPersonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="JobFunctions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JobFunction" type="{http://group.vodafone.com/schema/common/v1}JobFunctionType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="JobTitle" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Seniority" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *         &lt;element name="ContactPreferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContactPreference" type="{http://group.vodafone.com/schema/common/v1}ContactPersonContactPreferenceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IndividualName" type="{http://group.vodafone.com/schema/common/v1}IndividualNameType" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateType" minOccurs="0"/>
 *         &lt;element name="BloodType" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="DeathDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateType" minOccurs="0"/>
 *         &lt;element name="DeathIndicator" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="Ethnicity" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Gender" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="Nationality" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *         &lt;element name="DesignatedIndicator" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="TPSRegistration" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="FamilyGeneration" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactPersonType", propOrder = {
    "jobFunctions",
    "jobTitle",
    "seniority",
    "contactPreferences",
    "individualName",
    "birthDate",
    "bloodType",
    "deathDate",
    "deathIndicator",
    "ethnicity",
    "gender",
    "language",
    "maritalStatus",
    "nationality",
    "designatedIndicator",
    "tpsRegistration",
    "familyGeneration"
})
@XmlSeeAlso({
    vis.greece.makemyplan.salesorderbackend.schema.common.ContactPeopleType.ContactPerson.class
})
public class ContactPersonType
    extends BaseComponentType
{

    @XmlElement(name = "JobFunctions")
    protected ContactPersonType.JobFunctions jobFunctions;
    @XmlElement(name = "JobTitle")
    protected TextType jobTitle;
    @XmlElement(name = "Seniority")
    protected IDType seniority;
    @XmlElement(name = "ContactPreferences")
    protected ContactPersonType.ContactPreferences contactPreferences;
    @XmlElement(name = "IndividualName")
    protected IndividualNameType individualName;
    @XmlElement(name = "BirthDate")
    protected DateType birthDate;
    @XmlElement(name = "BloodType")
    protected TextType bloodType;
    @XmlElement(name = "DeathDate")
    protected DateType deathDate;
    @XmlElement(name = "DeathIndicator")
    protected IndicatorType deathIndicator;
    @XmlElement(name = "Ethnicity")
    protected TextType ethnicity;
    @XmlElement(name = "Gender")
    protected TextType gender;
    @XmlElement(name = "Language")
    protected TextType language;
    @XmlElement(name = "MaritalStatus")
    protected TextType maritalStatus;
    @XmlElement(name = "Nationality")
    protected TextType nationality;
    @XmlElement(name = "DesignatedIndicator")
    protected IndicatorType designatedIndicator;
    @XmlElement(name = "TPSRegistration")
    protected IndicatorType tpsRegistration;
    @XmlElement(name = "FamilyGeneration")
    protected CodeType familyGeneration;

    /**
     * Gets the value of the jobFunctions property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType.JobFunctions }
     *     
     */
    public ContactPersonType.JobFunctions getJobFunctions() {
        return jobFunctions;
    }

    /**
     * Sets the value of the jobFunctions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType.JobFunctions }
     *     
     */
    public void setJobFunctions(ContactPersonType.JobFunctions value) {
        this.jobFunctions = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setJobTitle(TextType value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the seniority property.
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getSeniority() {
        return seniority;
    }

    /**
     * Sets the value of the seniority property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setSeniority(IDType value) {
        this.seniority = value;
    }

    /**
     * Gets the value of the contactPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType.ContactPreferences }
     *     
     */
    public ContactPersonType.ContactPreferences getContactPreferences() {
        return contactPreferences;
    }

    /**
     * Sets the value of the contactPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType.ContactPreferences }
     *     
     */
    public void setContactPreferences(ContactPersonType.ContactPreferences value) {
        this.contactPreferences = value;
    }

    /**
     * Gets the value of the individualName property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualNameType }
     *     
     */
    public IndividualNameType getIndividualName() {
        return individualName;
    }

    /**
     * Sets the value of the individualName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualNameType }
     *     
     */
    public void setIndividualName(IndividualNameType value) {
        this.individualName = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setBirthDate(DateType value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the bloodType property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getBloodType() {
        return bloodType;
    }

    /**
     * Sets the value of the bloodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setBloodType(TextType value) {
        this.bloodType = value;
    }

    /**
     * Gets the value of the deathDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDeathDate() {
        return deathDate;
    }

    /**
     * Sets the value of the deathDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDeathDate(DateType value) {
        this.deathDate = value;
    }

    /**
     * Gets the value of the deathIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getDeathIndicator() {
        return deathIndicator;
    }

    /**
     * Sets the value of the deathIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setDeathIndicator(IndicatorType value) {
        this.deathIndicator = value;
    }

    /**
     * Gets the value of the ethnicity property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getEthnicity() {
        return ethnicity;
    }

    /**
     * Sets the value of the ethnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setEthnicity(TextType value) {
        this.ethnicity = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setGender(TextType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLanguage(TextType value) {
        this.language = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setMaritalStatus(TextType value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setNationality(TextType value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the designatedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getDesignatedIndicator() {
        return designatedIndicator;
    }

    /**
     * Sets the value of the designatedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setDesignatedIndicator(IndicatorType value) {
        this.designatedIndicator = value;
    }

    /**
     * Gets the value of the tpsRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getTPSRegistration() {
        return tpsRegistration;
    }

    /**
     * Sets the value of the tpsRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setTPSRegistration(IndicatorType value) {
        this.tpsRegistration = value;
    }

    /**
     * Gets the value of the familyGeneration property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getFamilyGeneration() {
        return familyGeneration;
    }

    /**
     * Sets the value of the familyGeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setFamilyGeneration(CodeType value) {
        this.familyGeneration = value;
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
     *         &lt;element name="ContactPreference" type="{http://group.vodafone.com/schema/common/v1}ContactPersonContactPreferenceType" maxOccurs="unbounded"/>
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
        "contactPreference"
    })
    public static class ContactPreferences {

        @XmlElement(name = "ContactPreference", required = true)
        protected List<ContactPersonContactPreferenceType> contactPreference;

        /**
         * Gets the value of the contactPreference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactPreference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactPreference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactPersonContactPreferenceType }
         * 
         * 
         */
        public List<ContactPersonContactPreferenceType> getContactPreference() {
            if (contactPreference == null) {
                contactPreference = new ArrayList<ContactPersonContactPreferenceType>();
            }
            return this.contactPreference;
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
     *         &lt;element name="JobFunction" type="{http://group.vodafone.com/schema/common/v1}JobFunctionType" maxOccurs="unbounded"/>
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
        "jobFunction"
    })
    public static class JobFunctions {

        @XmlElement(name = "JobFunction", required = true)
        protected List<JobFunctionType> jobFunction;

        /**
         * Gets the value of the jobFunction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jobFunction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJobFunction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JobFunctionType }
         * 
         * 
         */
        public List<JobFunctionType> getJobFunction() {
            if (jobFunction == null) {
                jobFunction = new ArrayList<JobFunctionType>();
            }
            return this.jobFunction;
        }

    }

}
