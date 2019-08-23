
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.NumericType;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.GetSalesOrderListVBMRequestType;


/**
 * A data object that allows simple and complex query criteria to be specified against which a set of business objects can be matched.
 * 
 * <p>Java class for QueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartIndex" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *         &lt;element name="IndexPerPage" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}NumericType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="Criteria">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="QueryExpression">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;choice>
 *                                 &lt;element name="ValueExpression" type="{http://group.vodafone.com/schema/common/v1}ValueExpressionType" maxOccurs="unbounded" minOccurs="0"/>
 *                                 &lt;element name="QueryExpression" type="{http://group.vodafone.com/schema/common/v1}QueryExpressionType" maxOccurs="unbounded" minOccurs="0"/>
 *                               &lt;/choice>
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="SortExpression" type="{http://group.vodafone.com/schema/common/v1}SortExpressionType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element name="Identification" type="{http://group.vodafone.com/schema/common/v1}BaseComponentType"/>
 *         &lt;/choice>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="Fields">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Field" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryType", propOrder = {
    "startIndex",
    "indexPerPage",
    "criteria",
    "sortExpression",
    "identification",
    "fields"
})
@XmlSeeAlso({
    GetSalesOrderListVBMRequestType.class
})
public class QueryType {

    @XmlElement(name = "StartIndex")
    protected NumericType startIndex;
    @XmlElement(name = "IndexPerPage")
    protected NumericType indexPerPage;
    @XmlElement(name = "Criteria")
    protected QueryType.Criteria criteria;
    @XmlElement(name = "SortExpression")
    protected List<SortExpressionType> sortExpression;
    @XmlElement(name = "Identification")
    protected BaseComponentType identification;
    @XmlElement(name = "Fields")
    protected QueryType.Fields fields;

    /**
     * Gets the value of the startIndex property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setStartIndex(NumericType value) {
        this.startIndex = value;
    }

    /**
     * Gets the value of the indexPerPage property.
     * 
     * @return
     *     possible object is
     *     {@link NumericType }
     *     
     */
    public NumericType getIndexPerPage() {
        return indexPerPage;
    }

    /**
     * Sets the value of the indexPerPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericType }
     *     
     */
    public void setIndexPerPage(NumericType value) {
        this.indexPerPage = value;
    }

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType.Criteria }
     *     
     */
    public QueryType.Criteria getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType.Criteria }
     *     
     */
    public void setCriteria(QueryType.Criteria value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the sortExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortExpressionType }
     * 
     * 
     */
    public List<SortExpressionType> getSortExpression() {
        if (sortExpression == null) {
            sortExpression = new ArrayList<SortExpressionType>();
        }
        return this.sortExpression;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link BaseComponentType }
     *     
     */
    public BaseComponentType getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseComponentType }
     *     
     */
    public void setIdentification(BaseComponentType value) {
        this.identification = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType.Fields }
     *     
     */
    public QueryType.Fields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType.Fields }
     *     
     */
    public void setFields(QueryType.Fields value) {
        this.fields = value;
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
     *         &lt;element name="QueryExpression">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="ValueExpression" type="{http://group.vodafone.com/schema/common/v1}ValueExpressionType" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;element name="QueryExpression" type="{http://group.vodafone.com/schema/common/v1}QueryExpressionType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/choice>
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
        "queryExpression"
    })
    public static class Criteria {

        @XmlElement(name = "QueryExpression", required = true)
        protected QueryType.Criteria.QueryExpression queryExpression;

        /**
         * Gets the value of the queryExpression property.
         * 
         * @return
         *     possible object is
         *     {@link QueryType.Criteria.QueryExpression }
         *     
         */
        public QueryType.Criteria.QueryExpression getQueryExpression() {
            return queryExpression;
        }

        /**
         * Sets the value of the queryExpression property.
         * 
         * @param value
         *     allowed object is
         *     {@link QueryType.Criteria.QueryExpression }
         *     
         */
        public void setQueryExpression(QueryType.Criteria.QueryExpression value) {
            this.queryExpression = value;
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
         *       &lt;choice>
         *         &lt;element name="ValueExpression" type="{http://group.vodafone.com/schema/common/v1}ValueExpressionType" maxOccurs="unbounded" minOccurs="0"/>
         *         &lt;element name="QueryExpression" type="{http://group.vodafone.com/schema/common/v1}QueryExpressionType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "valueExpression",
            "queryExpression"
        })
        public static class QueryExpression {

            @XmlElement(name = "ValueExpression")
            protected List<ValueExpressionType> valueExpression;
            @XmlElement(name = "QueryExpression")
            protected List<QueryExpressionType> queryExpression;

            /**
             * Gets the value of the valueExpression property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the valueExpression property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getValueExpression().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ValueExpressionType }
             * 
             * 
             */
            public List<ValueExpressionType> getValueExpression() {
                if (valueExpression == null) {
                    valueExpression = new ArrayList<ValueExpressionType>();
                }
                return this.valueExpression;
            }

            /**
             * Gets the value of the queryExpression property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the queryExpression property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getQueryExpression().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QueryExpressionType }
             * 
             * 
             */
            public List<QueryExpressionType> getQueryExpression() {
                if (queryExpression == null) {
                    queryExpression = new ArrayList<QueryExpressionType>();
                }
                return this.queryExpression;
            }

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
     *         &lt;element name="Field" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded"/>
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
        "field"
    })
    public static class Fields {

        @XmlElement(name = "Field", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected List<String> field;

        /**
         * Gets the value of the field property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the field property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getField() {
            if (field == null) {
                field = new ArrayList<String>();
            }
            return this.field;
        }

    }

}
