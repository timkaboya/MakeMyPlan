
package vis.greece.makemyplan.salesorderbackend.schema.extension;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.NoteType;
import vis.greece.makemyplan.salesorderbackend.schema.common.OneOffPriceType;
import vis.greece.makemyplan.salesorderbackend.schema.common.RecurringPriceType;
import vis.greece.makemyplan.salesorderbackend.schema.common.RelatedPartyType;
import vis.greece.makemyplan.salesorderbackend.schema.common.StatusHistoryType;


/**
 * <p>Java class for ExtendedSalesOrderPartsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedSalesOrderPartsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OneOffPrices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OneOffPrice" type="{http://group.vodafone.com/schema/common/v1}OneOffPriceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TotalOneOffPrice" type="{http://group.vodafone.com/schema/common/v1}OneOffPriceType" minOccurs="0"/>
 *         &lt;element name="RecurringPrices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RecurringPrice" type="{http://group.vodafone.com/schema/common/v1}RecurringPriceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Specification" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}SpecificationType" minOccurs="0"/>
 *         &lt;element name="StatusHistory" type="{http://group.vodafone.com/schema/common/v1}StatusHistoryType" minOccurs="0"/>
 *         &lt;element name="ExternalReferences" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ExternalReference" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExternalReferenceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustomerCreditRating" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}CustomerCreditRatingType" minOccurs="0"/>
 *         &lt;element name="RelatedObjects" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelatedObject" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}RelatedObjectType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vouchers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Voucher" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}VoucherType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketingCampaigns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MarketingCampaign" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}MarketingCampaignType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Notes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Note" type="{http://group.vodafone.com/schema/common/v1}NoteType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelatedParties" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RelatedParty" type="{http://group.vodafone.com/schema/common/v1}RelatedPartyType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Attachments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Attachment" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}AttachmentsType" maxOccurs="unbounded"/>
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
@XmlType(name = "ExtendedSalesOrderPartsType", propOrder = {
    "oneOffPrices",
    "totalOneOffPrice",
    "recurringPrices",
    "specification",
    "statusHistory",
    "externalReferences",
    "customerCreditRating",
    "relatedObjects",
    "vouchers",
    "marketingCampaigns",
    "notes",
    "relatedParties",
    "attachments"
})
public class ExtendedSalesOrderPartsType {

    @XmlElement(name = "OneOffPrices")
    protected ExtendedSalesOrderPartsType.OneOffPrices oneOffPrices;
    @XmlElement(name = "TotalOneOffPrice")
    protected OneOffPriceType totalOneOffPrice;
    @XmlElement(name = "RecurringPrices")
    protected ExtendedSalesOrderPartsType.RecurringPrices recurringPrices;
    @XmlElement(name = "Specification")
    protected SpecificationType specification;
    @XmlElement(name = "StatusHistory")
    protected StatusHistoryType statusHistory;
    @XmlElement(name = "ExternalReferences")
    protected ExtendedSalesOrderPartsType.ExternalReferences externalReferences;
    @XmlElement(name = "CustomerCreditRating")
    protected CustomerCreditRatingType customerCreditRating;
    @XmlElement(name = "RelatedObjects")
    protected ExtendedSalesOrderPartsType.RelatedObjects relatedObjects;
    @XmlElement(name = "Vouchers")
    protected ExtendedSalesOrderPartsType.Vouchers vouchers;
    @XmlElement(name = "MarketingCampaigns")
    protected ExtendedSalesOrderPartsType.MarketingCampaigns marketingCampaigns;
    @XmlElement(name = "Notes")
    protected ExtendedSalesOrderPartsType.Notes notes;
    @XmlElement(name = "RelatedParties")
    protected ExtendedSalesOrderPartsType.RelatedParties relatedParties;
    @XmlElement(name = "Attachments")
    protected ExtendedSalesOrderPartsType.Attachments attachments;

    /**
     * Gets the value of the oneOffPrices property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderPartsType.OneOffPrices }
     *     
     */
    public ExtendedSalesOrderPartsType.OneOffPrices getOneOffPrices() {
        return oneOffPrices;
    }

    /**
     * Sets the value of the oneOffPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderPartsType.OneOffPrices }
     *     
     */
    public void setOneOffPrices(ExtendedSalesOrderPartsType.OneOffPrices value) {
        this.oneOffPrices = value;
    }

    /**
     * Gets the value of the totalOneOffPrice property.
     * 
     * @return
     *     possible object is
     *     {@link OneOffPriceType }
     *     
     */
    public OneOffPriceType getTotalOneOffPrice() {
        return totalOneOffPrice;
    }

    /**
     * Sets the value of the totalOneOffPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link OneOffPriceType }
     *     
     */
    public void setTotalOneOffPrice(OneOffPriceType value) {
        this.totalOneOffPrice = value;
    }

    /**
     * Gets the value of the recurringPrices property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderPartsType.RecurringPrices }
     *     
     */
    public ExtendedSalesOrderPartsType.RecurringPrices getRecurringPrices() {
        return recurringPrices;
    }

    /**
     * Sets the value of the recurringPrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderPartsType.RecurringPrices }
     *     
     */
    public void setRecurringPrices(ExtendedSalesOrderPartsType.RecurringPrices value) {
        this.recurringPrices = value;
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificationType }
     *     
     */
    public SpecificationType getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificationType }
     *     
     */
    public void setSpecification(SpecificationType value) {
        this.specification = value;
    }

    /**
     * Gets the value of the statusHistory property.
     * 
     * @return
     *     possible object is
     *     {@link StatusHistoryType }
     *     
     */
    public StatusHistoryType getStatusHistory() {
        return statusHistory;
    }

    /**
     * Sets the value of the statusHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusHistoryType }
     *     
     */
    public void setStatusHistory(StatusHistoryType value) {
        this.statusHistory = value;
    }

    /**
     * Gets the value of the externalReferences property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderPartsType.ExternalReferences }
     *     
     */
    public ExtendedSalesOrderPartsType.ExternalReferences getExternalReferences() {
        return externalReferences;
    }

    /**
     * Sets the value of the externalReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderPartsType.ExternalReferences }
     *     
     */
    public void setExternalReferences(ExtendedSalesOrderPartsType.ExternalReferences value) {
        this.externalReferences = value;
    }

    /**
     * Gets the value of the customerCreditRating property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerCreditRatingType }
     *     
     */
    public CustomerCreditRatingType getCustomerCreditRating() {
        return customerCreditRating;
    }

    /**
     * Sets the value of the customerCreditRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCreditRatingType }
     *     
     */
    public void setCustomerCreditRating(CustomerCreditRatingType value) {
        this.customerCreditRating = value;
    }

    /**
     * Gets the value of the relatedObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderPartsType.RelatedObjects }
     *     
     */
    public ExtendedSalesOrderPartsType.RelatedObjects getRelatedObjects() {
        return relatedObjects;
    }

    /**
     * Sets the value of the relatedObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderPartsType.RelatedObjects }
     *     
     */
    public void setRelatedObjects(ExtendedSalesOrderPartsType.RelatedObjects value) {
        this.relatedObjects = value;
    }

    /**
     * Gets the value of the vouchers property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderPartsType.Vouchers }
     *     
     */
    public ExtendedSalesOrderPartsType.Vouchers getVouchers() {
        return vouchers;
    }

    /**
     * Sets the value of the vouchers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderPartsType.Vouchers }
     *     
     */
    public void setVouchers(ExtendedSalesOrderPartsType.Vouchers value) {
        this.vouchers = value;
    }

    /**
     * Gets the value of the marketingCampaigns property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderPartsType.MarketingCampaigns }
     *     
     */
    public ExtendedSalesOrderPartsType.MarketingCampaigns getMarketingCampaigns() {
        return marketingCampaigns;
    }

    /**
     * Sets the value of the marketingCampaigns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderPartsType.MarketingCampaigns }
     *     
     */
    public void setMarketingCampaigns(ExtendedSalesOrderPartsType.MarketingCampaigns value) {
        this.marketingCampaigns = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderPartsType.Notes }
     *     
     */
    public ExtendedSalesOrderPartsType.Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderPartsType.Notes }
     *     
     */
    public void setNotes(ExtendedSalesOrderPartsType.Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the relatedParties property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderPartsType.RelatedParties }
     *     
     */
    public ExtendedSalesOrderPartsType.RelatedParties getRelatedParties() {
        return relatedParties;
    }

    /**
     * Sets the value of the relatedParties property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderPartsType.RelatedParties }
     *     
     */
    public void setRelatedParties(ExtendedSalesOrderPartsType.RelatedParties value) {
        this.relatedParties = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSalesOrderPartsType.Attachments }
     *     
     */
    public ExtendedSalesOrderPartsType.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSalesOrderPartsType.Attachments }
     *     
     */
    public void setAttachments(ExtendedSalesOrderPartsType.Attachments value) {
        this.attachments = value;
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
     *         &lt;element name="Attachment" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}AttachmentsType" maxOccurs="unbounded"/>
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
        "attachment"
    })
    public static class Attachments {

        @XmlElement(name = "Attachment", required = true)
        protected List<AttachmentsType> attachment;

        /**
         * Gets the value of the attachment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttachmentsType }
         * 
         * 
         */
        public List<AttachmentsType> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<AttachmentsType>();
            }
            return this.attachment;
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
     *         &lt;element name="ExternalReference" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExternalReferenceType" maxOccurs="unbounded"/>
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
        "externalReference"
    })
    public static class ExternalReferences {

        @XmlElement(name = "ExternalReference", required = true)
        protected List<ExternalReferenceType> externalReference;

        /**
         * Gets the value of the externalReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the externalReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExternalReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExternalReferenceType }
         * 
         * 
         */
        public List<ExternalReferenceType> getExternalReference() {
            if (externalReference == null) {
                externalReference = new ArrayList<ExternalReferenceType>();
            }
            return this.externalReference;
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
     *         &lt;element name="MarketingCampaign" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}MarketingCampaignType" maxOccurs="unbounded"/>
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
        "marketingCampaign"
    })
    public static class MarketingCampaigns {

        @XmlElement(name = "MarketingCampaign", required = true)
        protected List<MarketingCampaignType> marketingCampaign;

        /**
         * Gets the value of the marketingCampaign property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the marketingCampaign property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMarketingCampaign().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MarketingCampaignType }
         * 
         * 
         */
        public List<MarketingCampaignType> getMarketingCampaign() {
            if (marketingCampaign == null) {
                marketingCampaign = new ArrayList<MarketingCampaignType>();
            }
            return this.marketingCampaign;
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
     *         &lt;element name="Note" type="{http://group.vodafone.com/schema/common/v1}NoteType" maxOccurs="unbounded"/>
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
        "note"
    })
    public static class Notes {

        @XmlElement(name = "Note", required = true)
        protected List<NoteType> note;

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NoteType }
         * 
         * 
         */
        public List<NoteType> getNote() {
            if (note == null) {
                note = new ArrayList<NoteType>();
            }
            return this.note;
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
     *         &lt;element name="OneOffPrice" type="{http://group.vodafone.com/schema/common/v1}OneOffPriceType" maxOccurs="unbounded"/>
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
        "oneOffPrice"
    })
    public static class OneOffPrices {

        @XmlElement(name = "OneOffPrice", required = true)
        protected List<OneOffPriceType> oneOffPrice;

        /**
         * Gets the value of the oneOffPrice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneOffPrice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneOffPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OneOffPriceType }
         * 
         * 
         */
        public List<OneOffPriceType> getOneOffPrice() {
            if (oneOffPrice == null) {
                oneOffPrice = new ArrayList<OneOffPriceType>();
            }
            return this.oneOffPrice;
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
     *         &lt;element name="RecurringPrice" type="{http://group.vodafone.com/schema/common/v1}RecurringPriceType" maxOccurs="unbounded"/>
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
        "recurringPrice"
    })
    public static class RecurringPrices {

        @XmlElement(name = "RecurringPrice", required = true)
        protected List<RecurringPriceType> recurringPrice;

        /**
         * Gets the value of the recurringPrice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recurringPrice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecurringPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RecurringPriceType }
         * 
         * 
         */
        public List<RecurringPriceType> getRecurringPrice() {
            if (recurringPrice == null) {
                recurringPrice = new ArrayList<RecurringPriceType>();
            }
            return this.recurringPrice;
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
     *         &lt;element name="RelatedObject" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}RelatedObjectType" maxOccurs="unbounded"/>
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
        "relatedObject"
    })
    public static class RelatedObjects {

        @XmlElement(name = "RelatedObject", required = true)
        protected List<RelatedObjectType> relatedObject;

        /**
         * Gets the value of the relatedObject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedObject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedObject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RelatedObjectType }
         * 
         * 
         */
        public List<RelatedObjectType> getRelatedObject() {
            if (relatedObject == null) {
                relatedObject = new ArrayList<RelatedObjectType>();
            }
            return this.relatedObject;
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
     *         &lt;element name="RelatedParty" type="{http://group.vodafone.com/schema/common/v1}RelatedPartyType" maxOccurs="unbounded"/>
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
        "relatedParty"
    })
    public static class RelatedParties {

        @XmlElement(name = "RelatedParty", required = true)
        protected List<RelatedPartyType> relatedParty;

        /**
         * Gets the value of the relatedParty property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the relatedParty property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRelatedParty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RelatedPartyType }
         * 
         * 
         */
        public List<RelatedPartyType> getRelatedParty() {
            if (relatedParty == null) {
                relatedParty = new ArrayList<RelatedPartyType>();
            }
            return this.relatedParty;
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
     *         &lt;element name="Voucher" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}VoucherType" maxOccurs="unbounded"/>
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
        "voucher"
    })
    public static class Vouchers {

        @XmlElement(name = "Voucher", required = true)
        protected List<VoucherType> voucher;

        /**
         * Gets the value of the voucher property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the voucher property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVoucher().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VoucherType }
         * 
         * 
         */
        public List<VoucherType> getVoucher() {
            if (voucher == null) {
                voucher = new ArrayList<VoucherType>();
            }
            return this.voucher;
        }

    }

}
