package vis.greece.makemyplan.controller;

import javax.security.auth.login.FailedLoginException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vis.core.errorhandling.annotations.AcceptLang;
import com.vis.core.errorhandling.exception.BusinessException;

import vis.greece.makemyplan.dto.ActivateBundleDto;
import vis.greece.makemyplan.dto.RegisterDto;
import vis.greece.makemyplan.dto.UnregisterDto;
import vis.greece.makemyplan.model.UnregisterResponse;
import vis.greece.makemyplan.service.MakeMyPlanService;

/**/
/**
 * Rest Controller that provides all MakeMyPlan APIs: 1- activate-bundle API 2-
 * register API 3- unregister API
 * 
 */
@RestController
@RequestMapping("/gr/v1/makemyplan")
@Validated
public class MakeMyPlanController {

	@Autowired
	private MakeMyPlanService makeMyPlanService;

	/**
	 * 
	 * @param activateBundleDto
	 * @param authorization
	 * @return
	 * @throws BusinessException
	 * @throws FailedLoginException
	 */
	@RequestMapping(value = "/activateBundle", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
	public ResponseEntity<?> activateBundle(@AcceptLang(locales = { "en",
			"el" }) @RequestHeader(value = "Accept-Language", required = false, defaultValue = "en") String acceptLanguage,
			@Valid @RequestBody ActivateBundleDto activateBundleDto) throws BusinessException, FailedLoginException {

		makeMyPlanService.activateBundle(acceptLanguage, activateBundleDto);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	/**
	 * 
	 * @param registerDto
	 * @param authorization
	 * @return
	 * @throws BusinessException
	 * @throws FailedLoginException
	 */
	@RequestMapping(value = "/register", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
	public ResponseEntity<?> register(@AcceptLang(locales = { "en",
			"el" }) @RequestHeader(value = "Accept-Language", required = false, defaultValue = "en") String acceptLanguage,
			@Valid @RequestBody RegisterDto registerDto) throws BusinessException, FailedLoginException {

		makeMyPlanService.register(acceptLanguage, registerDto);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	/**
	 * 
	 * @param unregisterDto
	 * @param authorization
	 * @return
	 * @throws BusinessException
	 * @throws FailedLoginException
	 */
	@RequestMapping(value = "/unregister", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
	public ResponseEntity<UnregisterResponse> unregister(@AcceptLang(locales = { "en",
			"el" }) @RequestHeader(value = "Accept-Language", required = false, defaultValue = "en") String acceptLanguage,
			@Valid @RequestBody UnregisterDto unregisterDto)
			throws BusinessException, FailedLoginException {

		makeMyPlanService.unregister(acceptLanguage, unregisterDto);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}