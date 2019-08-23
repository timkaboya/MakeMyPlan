package vis.greece.makemyplan;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import javax.security.auth.login.FailedLoginException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

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
import vis.greece.makemyplan.service.impl.MakeMyPlanServiceImpl;
import vis.greece.makemyplan.utils.MakeMyPlanUtil;
import vis.greece.model.UserModel;

@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class MakeMyPlanSerivceTest {

	@InjectMocks
	private MakeMyPlanServiceImpl makeMyPlanService;

//	@Mock
//	private UserModelContextService userContextService;

	@Mock
	private MakeMyPlanUtil makeMyPlanUtil;

	@Before
	public void init() throws FailedLoginException {
		MockitoAnnotations.initMocks(MakeMyPlanServiceImpl.class);
	}

	@Test
	public void testActivateBundle() throws BusinessException, FailedLoginException {
//		when(userContextService.getCurrentUser()).thenReturn(getCurrentUser());
		when(makeMyPlanUtil.activateBundle(anyString(),any(ActivateBundle.class))).thenReturn(getActivateBundleResponse());
		ActivateBundleDto dto = new ActivateBundleDto();
		dto.setBundleCodes(new ArrayList<String>());
		dto.getBundleCodes().add("b1");
//		dto.setChannel("c1");
		dto.setMsisdn("1234");
		makeMyPlanService.activateBundle("al", dto);

	}

	@Test
	public void testRegister() throws BusinessException, FailedLoginException {
//		when(userContextService.getCurrentUser()).thenReturn(getCurrentUser());
		when(makeMyPlanUtil.register(anyString(),any(Register.class))).thenReturn(getRegisterResponse());

		RegisterDto dto = new RegisterDto();
//		dto.setChannel("c1");
		dto.setMsisdn("1234");
		dto.setService("s1");
		dto.setType("t1");
		makeMyPlanService.register("al",dto);
	}

	@Test
	public void testUnregister() throws BusinessException, FailedLoginException {
//		when(userContextService.getCurrentUser()).thenReturn(getCurrentUser());
		when(makeMyPlanUtil.unregister(anyString(),any(Unregister.class))).thenReturn(getUnregisterResponse());

		UnregisterDto dto = new UnregisterDto();
//		dto.setChannel("c1");
		dto.setMsisdn("1234");
		dto.setService("s1");
		dto.setType("t1");
		makeMyPlanService.unregister("al",dto);
	}

	@Test(expected = BusinessException.class)
	public void testFail() throws BusinessException, FailedLoginException {
//		when(userContextService.getCurrentUser()).thenReturn(getCurrentUser());
		when(makeMyPlanUtil.unregister(anyString(),any(Unregister.class))).thenReturn(getUnregisterResponseFail());

		UnregisterDto dto = new UnregisterDto();
//		dto.setChannel("c1");
		dto.setMsisdn("1234");
		dto.setService("s1");
		dto.setType("t1");
		makeMyPlanService.unregister("el",dto);
	}


	private UserModel getCurrentUser() {
		UserModel model = new UserModel();
		model.setSec("new Password");
		model.setPrimaryMsisdn("1234");
		return model;
	}

	private ActivateBundleResponse getActivateBundleResponse() {
		ActivateBundleResponse res = new ActivateBundleResponse();
		BackResult backResult = new BackResult();
		backResult.setErrorCode("0");
		backResult.setErrorDescription("Success");
		res.setReturn(backResult);
		return res;
	}

	private RegisterResponse getRegisterResponse() {
		RegisterResponse res = new RegisterResponse();
		BackResult backResult = new BackResult();
		backResult.setErrorCode("0");
		backResult.setErrorDescription("Success");
		res.setReturn(backResult);
		return res;
	}

	private UnregisterResponse getUnregisterResponse() {
		UnregisterResponse res = new UnregisterResponse();
		BackResult backResult = new BackResult();
		backResult.setErrorCode("0");
		backResult.setErrorDescription("Success");
		res.setReturn(backResult);
		return res;
	}

	private UnregisterResponse getUnregisterResponseFail() {
		UnregisterResponse res = new UnregisterResponse();
		BackResult backResult = new BackResult();
		backResult.setErrorCode("1");
		backResult.setErrorDescription("Fail");
		res.setReturn(backResult);
		return res;
	}
}