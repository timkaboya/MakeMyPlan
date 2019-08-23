package vis.greece.makemyplan.dto.red;

import lombok.Data;

@Data
public class RedHouseholdMemberDto {

	private String memberMSISDN;
	private String tariffPlan;
	private RedAddonDto addon;
	
}
