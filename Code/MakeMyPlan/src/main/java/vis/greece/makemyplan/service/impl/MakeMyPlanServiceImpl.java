package vis.greece.makemyplan.service.impl;

import javax.security.auth.login.FailedLoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.vis.core.errorhandling.exception.BusinessException;

import vis.greece.makemyplan.dto.ActivateBundleDto;
import vis.greece.makemyplan.dto.RegisterDto;
import vis.greece.makemyplan.dto.UnregisterDto;
import vis.greece.makemyplan.model.ActivateBundle;
import vis.greece.makemyplan.model.ActivateBundleResponse;
import vis.greece.makemyplan.model.BackResult;
import vis.greece.makemyplan.model.Register;
import vis.greece.makemyplan.model.RegisterResponse;
import vis.greece.makemyplan.model.Unregister;
import vis.greece.makemyplan.model.UnregisterResponse;
import vis.greece.makemyplan.service.MakeMyPlanService;
import vis.greece.makemyplan.utils.MakeMyPlanUtil;

@Service
public class MakeMyPlanServiceImpl implements MakeMyPlanService {

	@Autowired
	MakeMyPlanUtil makeMyPlanUtil;

	@Value("${countryCodeMobile}")
	private String countryCodeMobile;

	private static final String channel = "mcare";

	@Override
	@Cacheable(value = channel, key = "(#acceptLanguage)")
//	@PreAuthorize("@userContextService.isValidPriMsisdn(#activateBundleDto.msisdn) and @userContextService.makeMyPlanAuthorized()")
	public String activateBundle(String acceptLanguage, ActivateBundleDto activateBundleDto)
			throws FailedLoginException, BusinessException {
		return "sucess";
//		ActivateBundle request = new ActivateBundle();
//		request.setChannel(channel);
//		for (String bundleCde : activateBundleDto.getBundleCodes()) {
//			request.getBundleCode().add(bundleCde);
//		}
//		// BeanUtils.copyProperties(activateBundleDto, request);
//		request.setMsisdn(activateBundleDto.getMsisdn());
//		ActivateBundleResponse activateBundleResponse = makeMyPlanUtil.activateBundle(acceptLanguage, request);
//		handleMakeMyPlanResponse(activateBundleResponse.getReturn());
	}

	@Override
	@PreAuthorize("@userContextService.isValidPriMsisdn(#registerDto.msisdn) and @userContextService.makeMyPlanAuthorized()")
	public void register(String acceptLanguage, RegisterDto registerDto)
			throws FailedLoginException, BusinessException {
		Register request = new Register();
		request.setChannel(channel);
		request.setService(registerDto.getService());
		request.setType(registerDto.getType());
		// BeanUtils.copyProperties(registerDto, request);
		request.setMsisdn(registerDto.getMsisdn());
		RegisterResponse registerResponse = makeMyPlanUtil.register(acceptLanguage, request);
		handleMakeMyPlanResponse(registerResponse.getReturn());
	}

	@Override
	@PreAuthorize("@userContextService.isValidPriMsisdn(#unregisterDto.msisdn) and @userContextService.makeMyPlanAuthorized()")
	public void unregister(String acceptLanguage, UnregisterDto unregisterDto)
			throws FailedLoginException, BusinessException {
		Unregister request = new Unregister();
		request.setChannel(channel);
		request.setService(unregisterDto.getService());
		request.setType(unregisterDto.getType());
		// BeanUtils.copyProperties(registerDto, request);
		request.setMsisdn(unregisterDto.getMsisdn());
		UnregisterResponse unregisterResponse = makeMyPlanUtil.unregister(acceptLanguage, request);
		handleMakeMyPlanResponse(unregisterResponse.getReturn());
	}

	private void handleMakeMyPlanResponse(BackResult result) throws NumberFormatException, BusinessException {
		if (!result.getErrorCode().equals("0")) {
			throw new BusinessException(Integer.parseInt(result.getErrorCode()),
					!result.getErrorDescription().isEmpty() ? result.getErrorDescription()
							: "Error from Greece BackEnd",
					HttpStatus.BAD_REQUEST);
		}
	}

}
