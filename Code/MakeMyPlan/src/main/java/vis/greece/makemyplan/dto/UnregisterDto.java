package vis.greece.makemyplan.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

import lombok.Data;

@Data
@Validated
public class UnregisterDto {
	@NotNull
	@NotEmpty
	@NotBlank
	private String msisdn, service, type;
}
