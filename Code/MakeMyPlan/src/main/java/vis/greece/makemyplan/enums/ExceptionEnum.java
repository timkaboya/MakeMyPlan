package vis.greece.makemyplan.enums;

public enum ExceptionEnum {
	
	ERROR_CREATING_UTIL_BEAN(0000,"Error creating Bean : MakeMyPlanUtil"),
	GENERAL_FAILED_CASE(1,"An error has occurred. Please try again."),
	NOT_ENOUGH_CREDITS(1,"You cannot activate the bundle due to low balance."),
	NOT_ALLOWED_TO_ACTIVATE(1,"The selected bundle cannot be activated. Please choose another one!"),
	PARTIAL_FLEX_ACTIVATION_FAILUR(2,"Flex activation failed to complete. BDLFlexV1:ΟΚ|BDLFlexD1:FAILED|BDLFlexS1:PENDING"),
	ALREADY_REGISTERED(6014, "Already Registered"),
	INVALID_PRODUCT_TYPE(6012, "Invalid COS"),
	NOT_REGISTERED(6015,"Not Registered");

	private Integer err_code;
	private String err_msg;

	private ExceptionEnum(Integer code, String msg) {
		this.setErr_code(code);
		this.setErr_msg(msg);
	}

	public Integer getErr_code() {
		return err_code;
	}

	public void setErr_code(Integer err_code) {
		this.err_code = err_code;
	}

	public String getErr_msg() {
		return err_msg;
	}

	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}

	
	
}
