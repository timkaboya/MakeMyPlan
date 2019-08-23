
package vis.greece.makemyplan.model.red;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfHouseHoldMembers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfHouseHoldMembers">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HouseholdMember" type="{http://accenture.com/eai/Red4All}HouseholdMember" maxOccurs="unbounded" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfHouseHoldMembers", propOrder = {
    "householdMember"
})
public class ListOfHouseHoldMembers {

    @XmlElement(name = "HouseholdMember", required = true)
    protected List<HouseholdMember> householdMember;

    /**
     * Gets the value of the householdMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the householdMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouseholdMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HouseholdMember }
     * 
     * 
     */
    public List<HouseholdMember> getHouseholdMember() {
        if (householdMember == null) {
            householdMember = new ArrayList<HouseholdMember>();
        }
        return this.householdMember;
    }

}
