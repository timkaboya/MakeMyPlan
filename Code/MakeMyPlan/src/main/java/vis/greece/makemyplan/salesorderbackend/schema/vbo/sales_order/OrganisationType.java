
package vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import vis.greece.makemyplan.salesorderbackend.schema.common.OrganisationPartyType;
import vis.greece.makemyplan.salesorderbackend.schema.extension.ExtendedOrganisationType;


/**
 * Organisation Role Type definition
 * 
 * <p>Java class for OrganisationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}OrganisationPartyType">
 *       &lt;sequence>
 *         &lt;element name="Preferences" type="{http://group.vodafone.com/schema/vbo/order/sales-order/v2}PreferencesType" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://group.vodafone.com/schema/extension/vbo/order/sales-order/v2}ExtendedOrganisationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationType", propOrder = {
    "preferences",
    "extension"
})
public class OrganisationType
    extends OrganisationPartyType
{

    @XmlElement(name = "Preferences")
    protected PreferencesType preferences;
    @XmlElement(name = "Extension")
    protected ExtendedOrganisationType extension;

    /**
     * Gets the value of the preferences property.
     * 
     * @return
     *     possible object is
     *     {@link PreferencesType }
     *     
     */
    public PreferencesType getPreferences() {
        return preferences;
    }

    /**
     * Sets the value of the preferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferencesType }
     *     
     */
    public void setPreferences(PreferencesType value) {
        this.preferences = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedOrganisationType }
     *     
     */
    public ExtendedOrganisationType getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedOrganisationType }
     *     
     */
    public void setExtension(ExtendedOrganisationType value) {
        this.extension = value;
    }

}
