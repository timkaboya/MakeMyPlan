
package vis.greece.makemyplan.salesorderbackend.schema.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining a reference to an Account, whether that be a Service Account, Loyalty Account or Product Stock.
 * 
 * <p>Java class for AccountReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountReferenceType")
@XmlSeeAlso({
    vis.greece.makemyplan.salesorderbackend.schema.common.AdjustmentPartsType.TransferFrom.class
})
public class AccountReferenceType
    extends BaseComponentType
{


}
