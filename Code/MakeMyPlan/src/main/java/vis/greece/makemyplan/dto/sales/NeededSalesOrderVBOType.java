package vis.greece.makemyplan.dto.sales;

import java.util.List;

import lombok.Data;

@Data
public class NeededSalesOrderVBOType {

	private String status;
	private String reasonCodeListName;
	private String reasonCodeValue;
	private String speed;
	//The price plan AIOS code which means there is only one speed status in lineItems
	private String salesQuoteId;
	private List<String> iptvCodes;
}
