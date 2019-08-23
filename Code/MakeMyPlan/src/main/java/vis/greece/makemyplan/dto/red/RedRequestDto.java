package vis.greece.makemyplan.dto.red;

import lombok.Data;

@Data
public class RedRequestDto {

	private String parentMSISDN;

	public RedRequestDto(String parentMSISDN) {
		this.parentMSISDN = parentMSISDN;
	}

}
