
package vis.greece.makemyplan.salesorderbackend.contract.fault;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import vis.greece.makemyplan.salesorderbackend.org.wsrf.BaseFaultType;
import vis.greece.makemyplan.salesorderbackend.schema.common.CharacteristicType;
import vis.greece.makemyplan.salesorderbackend.schema.common.FaultCategoryCodeType;
import vis.greece.makemyplan.salesorderbackend.schema.common.FaultSeverityCodeType;

/**
 * 
 * 				The fault object used to hold in-house Vodafone values for an error occurring
 * 				within a middleware
 * 				component, intended to be used as part of a SOAP:detail
 * 				tag within the fault as
 * 				per the SOAP 1.1 specification.
 * 			
 * 
 * <p>Java class for FaultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/wsrf/bf-2}BaseFaultType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Severity" type="{http://group.vodafone.com/schema/common/v1}FaultSeverityCodeType" minOccurs="0"/>
 *         &lt;element name="Category" type="{http://group.vodafone.com/schema/common/v1}FaultCategoryCodeType" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Specification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Characteristic" type="{http://group.vodafone.com/schema/common/v1}CharacteristicType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Failures" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Failure" type="{http://group.vodafone.com/contract/vfo/fault/v1}FailureType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultType", propOrder = {
    "name",
    "severity",
    "category",
    "reasonCode",
    "message",
    "specification",
    "failures"
})
@XmlRootElement(name="VodafoneFault")
public class FaultType
    extends BaseFaultType
{

    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlElement(name = "Severity")
    @XmlSchemaType(name = "normalizedString")
    protected FaultSeverityCodeType severity;
    @XmlElement(name = "Category")
    @XmlSchemaType(name = "normalizedString")
    protected FaultCategoryCodeType category;
    @XmlElement(name = "ReasonCode")
    protected String reasonCode;
    @XmlElement(name = "Message")
    protected String message;
    @XmlElement(name = "Specification")
    protected FaultType.Specification specification;
    @XmlElement(name = "Failures")
    protected FaultType.Failures failures;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link FaultSeverityCodeType }
     *     
     */
    public FaultSeverityCodeType getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultSeverityCodeType }
     *     
     */
    public void setSeverity(FaultSeverityCodeType value) {
        this.severity = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link FaultCategoryCodeType }
     *     
     */
    public FaultCategoryCodeType getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultCategoryCodeType }
     *     
     */
    public void setCategory(FaultCategoryCodeType value) {
        this.category = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link FaultType.Specification }
     *     
     */
    public FaultType.Specification getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultType.Specification }
     *     
     */
    public void setSpecification(FaultType.Specification value) {
        this.specification = value;
    }

    /**
     * Gets the value of the failures property.
     * 
     * @return
     *     possible object is
     *     {@link FaultType.Failures }
     *     
     */
    public FaultType.Failures getFailures() {
        return failures;
    }

    /**
     * Sets the value of the failures property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultType.Failures }
     *     
     */
    public void setFailures(FaultType.Failures value) {
        this.failures = value;
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
     *         &lt;element name="Failure" type="{http://group.vodafone.com/contract/vfo/fault/v1}FailureType" maxOccurs="unbounded"/>
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
        "failure"
    })
    public static class Failures {

        @XmlElement(name = "Failure", required = true)
        protected List<FailureType> failure;

        /**
         * Gets the value of the failure property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the failure property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFailure().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FailureType }
         * 
         * 
         */
        public List<FailureType> getFailure() {
            if (failure == null) {
                failure = new ArrayList<FailureType>();
            }
            return this.failure;
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
     *         &lt;element name="Characteristic" type="{http://group.vodafone.com/schema/common/v1}CharacteristicType" maxOccurs="unbounded"/>
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
        "characteristic"
    })
    public static class Specification {

        @XmlElement(name = "Characteristic", required = true)
        protected List<CharacteristicType> characteristic;

        /**
         * Gets the value of the characteristic property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the characteristic property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCharacteristic().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CharacteristicType }
         * 
         * 
         */
        public List<CharacteristicType> getCharacteristic() {
            if (characteristic == null) {
                characteristic = new ArrayList<CharacteristicType>();
            }
            return this.characteristic;
        }

    }

}
