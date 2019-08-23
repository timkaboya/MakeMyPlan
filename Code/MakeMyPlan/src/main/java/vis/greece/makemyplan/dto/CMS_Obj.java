package vis.greece.makemyplan.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="cms")
public class CMS_Obj {

	private List<Order_CMS_Obj> orders;

	public List<Order_CMS_Obj> getOrders() {
		return orders;
	}

	@XmlElement(name = "order")
	public void setOrders(List<Order_CMS_Obj> orders) {
		this.orders = orders;
	}
	
	
}
