package vis.greece.makemyplan.dto.sales;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

@Data
@JsonInclude(Include.NON_NULL)
public class IpTv {

	private String color;
	private String message;
	private String stb;
}
