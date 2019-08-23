package vis.greece.makemyplan.controller;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vis.core.errorhandling.exception.BusinessException;

import vis.greece.makemyplan.dto.red.RedRequestDto;
import vis.greece.makemyplan.dto.red.RedResponseDto;
import vis.greece.makemyplan.service.RedFamilyService;

@RestController
@RequestMapping("/gr/v1/redFamily")
@Validated
public class RedFamilyController {

	@Autowired
	private RedFamilyService redFamilyService;

	@RequestMapping(value = "/houseHoldMembers", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
	public ResponseEntity<RedResponseDto> getRedFamilyHouseHold(
			@NotBlank @RequestHeader(value = "parentMSISDN", required = true) String parentMSISDN
			, @NotBlank @RequestHeader(value = "Authorization") String authorization
				)	throws BusinessException {
		RedResponseDto redResponseDto = redFamilyService.getRedFamilyResponse(new RedRequestDto(parentMSISDN));
		return new ResponseEntity<RedResponseDto>(redResponseDto, HttpStatus.OK);
	}
}
