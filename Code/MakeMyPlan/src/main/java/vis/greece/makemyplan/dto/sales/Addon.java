package vis.greece.makemyplan.dto.sales;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
@Validated
public class Addon {

	private String description;

	private Integer priority;

	@Valid
	private List<ProductOffer> productOffers;

	// @Valid
	List<OneOffPriceDto> oneOffPrices;

	List<RecurringPricesDto> recurringPrices;

	@NotEmpty(message = "msisdn should be provided within every Addon item")
	private String msisdn;

	private ActionEnum subscriptionAction;

	private String ctegoryTarrifPlanl;

	private String ctegoryMonthDuration;

}
