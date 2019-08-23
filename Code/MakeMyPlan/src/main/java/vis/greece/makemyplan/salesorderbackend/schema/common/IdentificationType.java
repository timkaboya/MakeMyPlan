
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.DateTimeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;


/**
 * Represents the information used as proof of identity by an individual.
 * 
 * <p>Java class for IdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="IssuingAuthority" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType"/>
 *         &lt;element name="IssuingDate" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}DateTimeType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationType", propOrder = {
    "issuingAuthority",
    "issuingDate"
})
public class IdentificationType
    extends BaseComponentType
{

    @XmlElement(name = "IssuingAuthority", required = true)
    protected TextType issuingAuthority;
    @XmlElement(name = "IssuingDate", required = true)
    protected DateTimeType issuingDate;

    /**
     * Gets the value of the issuingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getIssuingAuthority() {
        return issuingAuthority;
    }

    /**
     * Sets the value of the issuingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setIssuingAuthority(TextType value) {
        this.issuingAuthority = value;
    }

    /**
     * Gets the value of the issuingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getIssuingDate() {
        return issuingDate;
    }

    /**
     * Sets the value of the issuingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setIssuingDate(DateTimeType value) {
        this.issuingDate = value;
    }

}
