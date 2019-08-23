package vis.greece.makemyplan.dto.sales;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class AddonOrdersDto {

	private int ordersCount;
	
	private List<Order> orders;
}
