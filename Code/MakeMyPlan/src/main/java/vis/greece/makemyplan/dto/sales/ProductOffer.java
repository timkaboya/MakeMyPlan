package vis.greece.makemyplan.dto.sales;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
@Validated
public class ProductOffer {

	private String integrationId;

	@NotNull(message = "action [ADD or DELETE or UPDATE should be provided for each productOffer item")
	private ActionEnum action;

	@NotEmpty(message = "name should be provided for each productOffer item")
	private String name;

	private Integer oldThreshold;

	private Integer newThreshold;

}
