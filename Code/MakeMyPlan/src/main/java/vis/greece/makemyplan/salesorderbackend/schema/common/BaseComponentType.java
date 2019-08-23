
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.CodeType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.ConditionType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.CustomerCreditRatingType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.MarketingCampaignType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.RelatedObjectType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.SubscriberType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.VoucherType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.WorkforceAppointmentSlotType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.AgentType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.ChannelType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.CustomerAccountType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.CustomerAgreementType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.CustomerType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.FulfilmentOrderType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.LineItemDetailsType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.ProductOfferingType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.RelatedLineItemType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.RelatedSalesOrderType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.RequestorType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesQuoteLineItemType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesQuoteType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SubscriberRoleType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SubscriptionType;


/**
 * Base type for all business objects and some components.
 * 
 * <p>Java class for BaseComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}InfoComponentType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *         &lt;element name="Categories" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Category" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;urn:un:unece:uncefact:documentation:standard:CoreComponentType:2>CodeType">
 *                           &lt;attribute name="listHierarchyID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Status" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseComponentType", propOrder = {
    "type",
    "categories",
    "status"
})
@XmlSeeAlso({
    RequestorType.class,
    LineItemDetailsType.class,
    SalesQuoteType.class,
    SubscriptionType.class,
    RelatedLineItemType.class,
    RelatedSalesOrderType.class,
    SalesQuoteLineItemType.class,
    CustomerType.class,
    AgentType.class,
    CustomerAgreementType.class,
    ProductOfferingType.class,
    FulfilmentOrderType.class,
    ChannelType.class,
    CustomerAccountType.class,
    SubscriberRoleType.class,
    ContentReferenceType.class,
    SolutionOfferingReferenceType.class,
    MarketSegmentReferenceType.class,
    ProductOfferingReferenceType.class,
    ProductCatalogueReferenceType.class,
    SalesAccountReferenceType.class,
    RelatedPartyWithContactPersonType.class,
    SalesOrderReferenceType.class,
    CustomerAgreementReferenceType.class,
    UserType.class,
    PermissionType.class,
    ContactPointReferenceType.class,
    vis.greece.makemyplan.salesorderbackend.schema.common.AdjustmentPartsType.TriggeredBy.class,
    ApprovalReferenceType.class,
    MarketingPreferenceType.class,
    DocumentsReferenceType.class,
    ConditionReferenceType.class,
    CustomerAccountReferenceType.class,
    PreferencesType.class,
    NoteType.class,
    ScheduleType.class,
    EventType.class,
    ContactReferenceType.class,
    LanguagePreferenceType.class,
    InterestPreferenceType.class,
    AccountReferenceType.class,
    ActorReferenceType.class,
    MarketingCampaignReferenceType.class,
    RelatedPartyType.class,
    ChannelPreferenceType.class,
    ContactPreferenceType.class,
    ChannelReferenceType.class,
    ExtendedBaseComponentType.class,
    OrganisationRelationshipType.class,
    SalesLeadReferenceType.class,
    PreferenceReferenceType.class,
    PartyReferenceType.class,
    SalesOpportunityReferenceType.class,
    ArtefactReferenceType.class,
    CredentialsGroupType.class,
    ConsentPermissionType.class,
    SubscribedServiceType.class,
    IdentificationType.class,
    SalesPartnerAccountReferenceType.class,
    ContactPersonType.class,
    CustomerCreditRatingType.class,
    ConditionType.class,
    VoucherType.class,
    SpecificationType.class,
    RelatedObjectType.class,
    SubscriberType.class,
    AttachmentType.class,
    MarketingCampaignType.class,
    WorkforceAppointmentSlotType.class
})
public class BaseComponentType
    extends InfoComponentType
{

    @XmlElement(name = "Type")
    protected CodeType type;
    @XmlElement(name = "Categories")
    protected BaseComponentType.Categories categories;
    @XmlElement(name = "Status")
    protected CodeType status;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setType(CodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link BaseComponentType.Categories }
     *     
     */
    public BaseComponentType.Categories getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseComponentType.Categories }
     *     
     */
    public void setCategories(BaseComponentType.Categories value) {
        this.categories = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setStatus(CodeType value) {
        this.status = value;
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
     *         &lt;element name="Category" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;urn:un:unece:uncefact:documentation:standard:CoreComponentType:2>CodeType">
     *                 &lt;attribute name="listHierarchyID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "category"
    })
    public static class Categories {

        @XmlElement(name = "Category", required = true)
        protected List<BaseComponentType.Categories.Category> category;

        /**
         * Gets the value of the category property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the category property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaseComponentType.Categories.Category }
         * 
         * 
         */
        public List<BaseComponentType.Categories.Category> getCategory() {
            if (category == null) {
                category = new ArrayList<BaseComponentType.Categories.Category>();
            }
            return this.category;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;urn:un:unece:uncefact:documentation:standard:CoreComponentType:2>CodeType">
         *       &lt;attribute name="listHierarchyID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Category
            extends CodeType
        {

            @XmlAttribute(name = "listHierarchyID")
            protected String listHierarchyID;

            /**
             * Gets the value of the listHierarchyID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getListHierarchyID() {
                return listHierarchyID;
            }

            /**
             * Sets the value of the listHierarchyID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setListHierarchyID(String value) {
                this.listHierarchyID = value;
            }

        }

    }

}
