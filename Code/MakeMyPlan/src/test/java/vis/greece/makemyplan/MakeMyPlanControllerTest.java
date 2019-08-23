package vis.greece.makemyplan;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import vis.greece.makemyplan.controller.MakeMyPlanController;
import vis.greece.makemyplan.service.MakeMyPlanService;

public class MakeMyPlanControllerTest {

	private MockMvc mockMvc;

	@Mock
	private MakeMyPlanService makeMyPlanService;

	@InjectMocks
	private MakeMyPlanController makeMyPlanController;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(makeMyPlanController).build();
	}

	@Test
	public void testActivateBundle() throws Exception {
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
				.post("/gr/v1/makemyplan/activateBundle").contentType("application/merge-patch+json")
				.header("Authorization", "authToken").header("Accept-Language", "en")
				.content("{\"bundleCodes\":[\"b1\",\"b2\",\"b3\"],\"msisdn\":\"12334\"}");

		mockMvc.perform(builder).andExpect(status().isNoContent());
	}
	
	@Test
	public void testRegister() throws Exception {
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
				.post("/gr/v1/makemyplan/register").contentType("application/merge-patch+json")
				.header("Authorization", "authToken").header("Accept-Language","en")
				.content("{\"service\":\"REWARD\",\"msisdn\":\"6943700662\",\"type\":\"FlexBasic\"}");

		mockMvc.perform(builder).andExpect(status().isNoContent());
	}
	
	@Test
	public void testUnregister() throws Exception {
		MockHttpServletRequestBuilder builder = MockMvcRequestBuilders
				.post("/gr/v1/makemyplan/unregister").contentType("application/merge-patch+json")
				.header("Authorization", "authToken").header("Accept-Language", "en")
				.content("{\"msisdn\":\"12334\",\"type\":\"t1\",\"service\":\"s1\"}");

		mockMvc.perform(builder).andExpect(status().isNoContent());
	}

}
