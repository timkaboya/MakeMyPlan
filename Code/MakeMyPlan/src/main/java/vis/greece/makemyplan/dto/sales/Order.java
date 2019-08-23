package vis.greece.makemyplan.dto.sales;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class Order {

	private String id;

	private String status;
	
	private String message;

	private String color;
	
	private String cpe;

	private List<PricePlan> pricePlans;

	private List<IpTv> ipTvs;
	
	private String enableDate;

	private Double percentage;

	private Double step;

}