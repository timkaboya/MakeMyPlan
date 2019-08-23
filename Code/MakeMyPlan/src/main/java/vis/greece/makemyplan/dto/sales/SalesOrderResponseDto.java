package vis.greece.makemyplan.dto.sales;

import lombok.Data;

@Data
public class SalesOrderResponseDto {

	private String orderNumber;
	private String status;
	private String msisdn;
	private String category;
}
