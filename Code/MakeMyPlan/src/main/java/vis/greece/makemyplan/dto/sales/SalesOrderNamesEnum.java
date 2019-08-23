package vis.greece.makemyplan.dto.sales;

import lombok.Getter;

public enum SalesOrderNamesEnum {

	CLI_PATH_GET_ORDER_LIST("CLI"), SALES_ORDER_ID_PATH_GET_ORDER_LIST("Sales Order Id"),
	ERROR_CODE_NODE_NAME("ErrorCode"), ERROR_MSG_NODE_NAME("Name"),
	SALES_ORDER_NUM_PATH_GET_ORDER_LIST("Sales Order Num"), CREATE_ORDER_SUCCESS_STATUS("OK"),
	CREATE_ORDER_SOURCE_SYSTEM("MCARE"), CREATE_ORDER_CONNECTION("Connection"), CREATE_ORDER_MSISDN("MSISDN"),
	CREATE_ORDER_ORDER_SUB_TYPE("OrderSubType"), CREATE_ORDER_ASYNC("Async"),
	CREATE_ORDER_ELECTRONIC_SUBMISSION("Electronic submission"),
	CREATE_ORDER_ASSET_INTEGRATION_ID("AssetIntegrationId"),
	CREATE_ORDER_CUSTOMER_BARRING_REASON("CustomerBarringReason"),
	CREATE_ORDER_SOAP_ACTION("http://group.vodafone.com/contract/vbs/order/sales-order/v2/create"),
	CREATE_ORDER_SOURCE_SYSTEM_HEADER_URL("http://group.vodafone.com/contract/vho/header/v1"),
	GET_ORDER_LIST_SOAP_ACTION("http://group.vodafone.com/contract/vbs/order/sales-order/v2/get-list"),
	UPDATE_ORDER_CATEGORY_LIST_NAME_OLD_THRESHOLD("OldThreshold"),
	UPDATE_ORDER_CATEGORY_LIST_NAME_NEW_THRESHOLD("NewThreshold"),
	CREATE_ORDER_CATEGORY_LIST_NAME_THRESHOLD("Threshold"),
	CATEGORY_TARRIFPLAN_LISTNAME("TariffPlan"),
	CATEGORY_MONTHDURATION_LISTNAME("MonthDuration"),
	CHARACTARISTIC_NAME_DESCRIPTION("Description"),
	CHARACTARISTIC_NAME_MONTH_DURATION("MonthDuration"),
	CREATE_ORDER_DESTINATION_SYSTEM("Mobile"),
	CREATE_ORDER_ORDER_NUMBER_SCHEME_NAME("OrderNumber");

	@Getter
	private String name;

	SalesOrderNamesEnum(String name) {
		this.name = name;
	}

	public static SalesOrderNamesEnum getSalesOrderNamesEnum(String enumName) {
		for (SalesOrderNamesEnum e : SalesOrderNamesEnum.values()) {
			if (e.getName().equalsIgnoreCase(enumName)) {
				return e;
			}
		}
		return null;
	}
}
