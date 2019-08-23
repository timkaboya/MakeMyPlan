
package vis.greece.makemyplan.salesorderbackend.schema.common;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A component holding the specification of the sorting required on the query.
 * 
 * <p>Java class for SortExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SortExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PathText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sortOrderCode" type="{http://group.vodafone.com/schema/common/v1}SortOrderCodeType" />
 *       &lt;attribute name="collationAlgorithmCode" type="{http://group.vodafone.com/schema/common/v1}CollationAlgorithmCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SortExpressionType", propOrder = {
    "pathText"
})
public class SortExpressionType {

    @XmlElement(name = "PathText", required = true)
    protected List<String> pathText;
    @XmlAttribute(name = "sortOrderCode")
    protected SortOrderCodeType sortOrderCode;
    @XmlAttribute(name = "collationAlgorithmCode")
    protected CollationAlgorithmCodeType collationAlgorithmCode;

    /**
     * Gets the value of the pathText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pathText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPathText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPathText() {
        if (pathText == null) {
            pathText = new ArrayList<String>();
        }
        return this.pathText;
    }

    /**
     * Gets the value of the sortOrderCode property.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderCodeType }
     *     
     */
    public SortOrderCodeType getSortOrderCode() {
        return sortOrderCode;
    }

    /**
     * Sets the value of the sortOrderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderCodeType }
     *     
     */
    public void setSortOrderCode(SortOrderCodeType value) {
        this.sortOrderCode = value;
    }

    /**
     * Gets the value of the collationAlgorithmCode property.
     * 
     * @return
     *     possible object is
     *     {@link CollationAlgorithmCodeType }
     *     
     */
    public CollationAlgorithmCodeType getCollationAlgorithmCode() {
        return collationAlgorithmCode;
    }

    /**
     * Sets the value of the collationAlgorithmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollationAlgorithmCodeType }
     *     
     */
    public void setCollationAlgorithmCode(CollationAlgorithmCodeType value) {
        this.collationAlgorithmCode = value;
    }

}
