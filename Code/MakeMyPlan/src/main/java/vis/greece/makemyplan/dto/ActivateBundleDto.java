package vis.greece.makemyplan.dto;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.annotation.Validated;

import lombok.Data;

@Data
@Validated
public class ActivateBundleDto {
	@NotNull
	@NotEmpty
	private List<String> bundleCodes;
	@NotNull
	@NotEmpty
	@NotBlank
	private String msisdn;
}
