package vis.greece.makemyplan.dto.sales;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class RecurringPricesDto {

	@NotNull(message = "action [ADD or DELETE or UPDATE should be provided for each productOffer item")
	private ActionEnum action;

	private String idSchemeName;

	private String idValue;

	private Integer discountPercent;

	private Integer frequencyIntervalQuantity;

	private String characteristicsValueDescription;
}
