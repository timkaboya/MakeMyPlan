
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.CodeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.DateTimeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * A history of the lifecycle state transistions of a VBO. Each transition records the date and time and should record the target lifecycle status.
 * 
 * <p>Java class for StatusHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StateTransition" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *                   &lt;element name="FromStatusCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *                   &lt;element name="ToStatusCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *                   &lt;element name="EffectiveDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
 *                   &lt;element name="ReasonCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *                   &lt;element name="ReasonText" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *                   &lt;element name="SubReasonCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *                   &lt;element name="SubReasonText" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *                   &lt;element name="Description" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *                   &lt;element name="ChangedByUserID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="actionCode" type="{http://group.vodafone.com/schema/common/v1}ActionCodeType" />
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
@XmlType(name = "StatusHistoryType", propOrder = {
    "stateTransition"
})
public class StatusHistoryType {

    @XmlElement(name = "StateTransition", required = true)
    protected List<StatusHistoryType.StateTransition> stateTransition;

    /**
     * Gets the value of the stateTransition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateTransition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateTransition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusHistoryType.StateTransition }
     * 
     * 
     */
    public List<StatusHistoryType.StateTransition> getStateTransition() {
        if (stateTransition == null) {
            stateTransition = new ArrayList<StatusHistoryType.StateTransition>();
        }
        return this.stateTransition;
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
     *         &lt;element name="ID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
     *         &lt;element name="FromStatusCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
     *         &lt;element name="ToStatusCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
     *         &lt;element name="EffectiveDateTime" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType" minOccurs="0"/>
     *         &lt;element name="ReasonCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
     *         &lt;element name="ReasonText" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
     *         &lt;element name="SubReasonCode" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
     *         &lt;element name="SubReasonText" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
     *         &lt;element name="Description" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
     *         &lt;element name="ChangedByUserID" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IDType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="actionCode" type="{http://group.vodafone.com/schema/common/v1}ActionCodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "fromStatusCode",
        "toStatusCode",
        "effectiveDateTime",
        "reasonCode",
        "reasonText",
        "subReasonCode",
        "subReasonText",
        "description",
        "changedByUserID"
    })
    public static class StateTransition {

        @XmlElement(name = "ID")
        protected IDType id;
        @XmlElement(name = "FromStatusCode")
        protected CodeType fromStatusCode;
        @XmlElement(name = "ToStatusCode")
        protected CodeType toStatusCode;
        @XmlElement(name = "EffectiveDateTime")
        protected DateTimeType effectiveDateTime;
        @XmlElement(name = "ReasonCode")
        protected CodeType reasonCode;
        @XmlElement(name = "ReasonText")
        protected TextType reasonText;
        @XmlElement(name = "SubReasonCode")
        protected CodeType subReasonCode;
        @XmlElement(name = "SubReasonText")
        protected TextType subReasonText;
        @XmlElement(name = "Description")
        protected TextType description;
        @XmlElement(name = "ChangedByUserID")
        protected IDType changedByUserID;
        @XmlAttribute(name = "actionCode")
        protected ActionCodeType actionCode;

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link IDType }
         *     
         */
        public IDType getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link IDType }
         *     
         */
        public void setID(IDType value) {
            this.id = value;
        }

        /**
         * Gets the value of the fromStatusCode property.
         * 
         * @return
         *     possible object is
         *     {@link CodeType }
         *     
         */
        public CodeType getFromStatusCode() {
            return fromStatusCode;
        }

        /**
         * Sets the value of the fromStatusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeType }
         *     
         */
        public void setFromStatusCode(CodeType value) {
            this.fromStatusCode = value;
        }

        /**
         * Gets the value of the toStatusCode property.
         * 
         * @return
         *     possible object is
         *     {@link CodeType }
         *     
         */
        public CodeType getToStatusCode() {
            return toStatusCode;
        }

        /**
         * Sets the value of the toStatusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeType }
         *     
         */
        public void setToStatusCode(CodeType value) {
            this.toStatusCode = value;
        }

        /**
         * Gets the value of the effectiveDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimeType }
         *     
         */
        public DateTimeType getEffectiveDateTime() {
            return effectiveDateTime;
        }

        /**
         * Sets the value of the effectiveDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeType }
         *     
         */
        public void setEffectiveDateTime(DateTimeType value) {
            this.effectiveDateTime = value;
        }

        /**
         * Gets the value of the reasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link CodeType }
         *     
         */
        public CodeType getReasonCode() {
            return reasonCode;
        }

        /**
         * Sets the value of the reasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeType }
         *     
         */
        public void setReasonCode(CodeType value) {
            this.reasonCode = value;
        }

        /**
         * Gets the value of the reasonText property.
         * 
         * @return
         *     possible object is
         *     {@link TextType }
         *     
         */
        public TextType getReasonText() {
            return reasonText;
        }

        /**
         * Sets the value of the reasonText property.
         * 
         * @param value
         *     allowed object is
         *     {@link TextType }
         *     
         */
        public void setReasonText(TextType value) {
            this.reasonText = value;
        }

        /**
         * Gets the value of the subReasonCode property.
         * 
         * @return
         *     possible object is
         *     {@link CodeType }
         *     
         */
        public CodeType getSubReasonCode() {
            return subReasonCode;
        }

        /**
         * Sets the value of the subReasonCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodeType }
         *     
         */
        public void setSubReasonCode(CodeType value) {
            this.subReasonCode = value;
        }

        /**
         * Gets the value of the subReasonText property.
         * 
         * @return
         *     possible object is
         *     {@link TextType }
         *     
         */
        public TextType getSubReasonText() {
            return subReasonText;
        }

        /**
         * Sets the value of the subReasonText property.
         * 
         * @param value
         *     allowed object is
         *     {@link TextType }
         *     
         */
        public void setSubReasonText(TextType value) {
            this.subReasonText = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link TextType }
         *     
         */
        public TextType getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link TextType }
         *     
         */
        public void setDescription(TextType value) {
            this.description = value;
        }

        /**
         * Gets the value of the changedByUserID property.
         * 
         * @return
         *     possible object is
         *     {@link IDType }
         *     
         */
        public IDType getChangedByUserID() {
            return changedByUserID;
        }

        /**
         * Sets the value of the changedByUserID property.
         * 
         * @param value
         *     allowed object is
         *     {@link IDType }
         *     
         */
        public void setChangedByUserID(IDType value) {
            this.changedByUserID = value;
        }

        /**
         * Gets the value of the actionCode property.
         * 
         * @return
         *     possible object is
         *     {@link ActionCodeType }
         *     
         */
        public ActionCodeType getActionCode() {
            return actionCode;
        }

        /**
         * Sets the value of the actionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link ActionCodeType }
         *     
         */
        public void setActionCode(ActionCodeType value) {
            this.actionCode = value;
        }

    }

}
