package vis.greece.makemyplan.dto.sales;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class SalesOrderDto {

	@JsonProperty(value = "source")
	@NotEmpty(message = "source/channelName should be provided in the request body")
	private String channelName;

	@NotEmpty(message = "orderType should be provided in the request body")
	private String orderType;

//	@NotEmpty(message="orderSubType should be provided in the request body")
	private String orderSubType;

	@Valid
	private List<Addon> addons;

	private String version;

	private String channelType;

}
