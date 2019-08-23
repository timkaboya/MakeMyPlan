package vis.greece.makemyplan.dto.sales;

import vis.greece.makemyplan.salesorderbackend.schema.common.ActionCodeType;

import lombok.Getter;

public enum ActionEnum {

	ADD("ADD",ActionCodeType.ADD),DELETE("DELETE",ActionCodeType.DELETE),UPDATE("UPDATE",ActionCodeType.UPDATE);
	
	ActionEnum(String frontEndValue,ActionCodeType actionCodeType){
		this.frontendValue = frontEndValue;
		this.actionCodeType = actionCodeType;
	}
	@Getter
	private String frontendValue;
	
	@Getter
	private ActionCodeType actionCodeType;
	
	ActionCodeType getActionCodeType(ActionEnum actionEnum) {
		
		for(ActionEnum targetActionEnum :ActionEnum.values()) {
			if(targetActionEnum.getFrontendValue().equals(actionEnum.getFrontendValue())) {
				return targetActionEnum.getActionCodeType();
			}
		}
		return null;
	}
}
