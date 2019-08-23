package vis.greece.makemyplan.dto.sales;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public enum SalesOrderListConstants {

	K_STATUS_ALL_MATCHED("K Status"), AWAITING_APPROVAL_STATUS("Awaiting Approval"), CMS_SPEED("Speed"),
	CANCELLED_STATUS("Auto-Cancelled"), CMS_TV_STATUS_TYPE("TV_Status"), CMS_PRICE_PLAN_TYPE("PricePlan"),
	COMPLETED_STATUS_ALL_MATCHED("Completed"), SUBMITTED_STATUS_ALL_MATCHED("Submitted"), PRODUCT_OFFERING_STATUS_TV("TV Status"),
	PRODUCT_OFFERING_STATUS_SPEED("Speed"),SALES_QUOTE_ID_PRICE_PLAN("PricePlan");

	@Getter
	private String value;

	SalesOrderListConstants(String value) {
		this.value = value;
	}

	public static SalesOrderListConstants getSalesOrderListConstants(String value) {

		if (value != null) {
			for (SalesOrderListConstants salesOrderListConstants : SalesOrderListConstants.values()) {
				if (salesOrderListConstants.getValue().equals(value)) {
					log.error("For the given status value {}, there is match found with {}", value,
							salesOrderListConstants.getValue());
					return salesOrderListConstants;
				} else if (value.equalsIgnoreCase("Complete")) {
					log.error("For the given status value {}, there is match found with {}", value,
							SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue());
					return SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED;
				} else if (value.equalsIgnoreCase("Submited")) {
					log.error("For the given status value {}, there is match found with {}", value,
							SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue());
					return SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED;
				} else if (value.equalsIgnoreCase("K_status")) {
					log.error("For the given status value {}, there is match found with {}", value,
							SalesOrderListConstants.K_STATUS_ALL_MATCHED.getValue());
					return SalesOrderListConstants.K_STATUS_ALL_MATCHED;
				}
			}
		}
		log.error("No SalesOrderListConstants found for status value {}", value);
		return null;
	}

}
