package vis.greece.makemyplan.dto.red;

import java.util.List;

import lombok.Data;

@Data
public class RedResponseDto {

	private String responseCode;
	private String responseMessage;
	private List<RedHouseholdMemberDto> houseHoldMembers;
}
