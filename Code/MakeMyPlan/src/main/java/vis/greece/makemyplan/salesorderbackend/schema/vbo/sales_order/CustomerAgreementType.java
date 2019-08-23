
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IndicatorType;
import vis.greece.makemyplan.salesorderbackend.schema.common.BaseComponentType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedCustomerAgreementType;


/**
 * <p>Java class for CustomerAgreementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAgreementType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="AcceptedByCustomer" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedCustomerAgreementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAgreementType", propOrder = {
    "acceptedByCustomer",
    "extension"
})
public class CustomerAgreementType
    extends BaseComponentType
{

    @XmlElement(name = "AcceptedByCustomer")
    protected IndicatorType acceptedByCustomer;
    @XmlElement(name = "Extension")
    protected ExtendedCustomerAgreementType extension;

    /**
     * Gets the value of the acceptedByCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getAcceptedByCustomer() {
        return acceptedByCustomer;
    }

    /**
     * Sets the value of the acceptedByCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setAcceptedByCustomer(IndicatorType value) {
        this.acceptedByCustomer = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedCustomerAgreementType }
     *     
     */
    public ExtendedCustomerAgreementType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedCustomerAgreementType }
     *     
     */
    public void setExtension(ExtendedCustomerAgreementType value) {
        this.extension = value;
    }

}
