
package vis.greece.makemyplan.salesorderbackend.contract.header;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;description xmlns:cmn="http://group.vodafone.com/schema/common/v1" xmlns:tns="http://group.vodafone.com/contract/vho/header/v1" xmlns:vfo="http://group.vodafone.com/contract/vfo/fault/v1" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"&gt;A header providing meta-data about the result of a query.&lt;/description&gt;
 * </pre>
 * 
 * 
 * <p>Java class for QueryResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="CollationAlgorithmCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryResultType", propOrder = {
    "totalQuantity",
    "collationAlgorithmCode"
})
public class QueryResultType {

    @XmlElement(name = "TotalQuantity", required = true)
    protected BigInteger totalQuantity;
    @XmlElement(name = "CollationAlgorithmCode", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String collationAlgorithmCode;

    /**
     * Gets the value of the totalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Sets the value of the totalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalQuantity(BigInteger value) {
        this.totalQuantity = value;
    }

    /**
     * Gets the value of the collationAlgorithmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollationAlgorithmCode() {
        return collationAlgorithmCode;
    }

    /**
     * Sets the value of the collationAlgorithmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollationAlgorithmCode(String value) {
        this.collationAlgorithmCode = value;
    }

}
