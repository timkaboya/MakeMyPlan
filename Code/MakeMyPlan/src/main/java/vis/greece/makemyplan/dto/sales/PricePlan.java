package vis.greece.makemyplan.dto.sales;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class PricePlan {

	private String title;
	private String speed;
	private String description;
}
