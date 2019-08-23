package vis.greece.makemyplan.service;

import javax.security.auth.login.FailedLoginException;

import com.vis.core.errorhandling.exception.BusinessException;

import vis.greece.makemyplan.dto.ActivateBundleDto;
import vis.greece.makemyplan.dto.RegisterDto;
import vis.greece.makemyplan.dto.UnregisterDto;

public interface MakeMyPlanService {

	public String activateBundle(String acceptLanguage, ActivateBundleDto activateBundleDto)
			throws FailedLoginException, BusinessException;

	public void register(String acceptLanguage, RegisterDto registerDto) throws FailedLoginException, BusinessException;

	public void unregister(String acceptLanguage, UnregisterDto unregisterDto)
			throws FailedLoginException, BusinessException;


}
