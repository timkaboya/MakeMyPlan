package vis.greece.makemyplan;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.vis.core.errorhandling.exception.BusinessException;

import vis.greece.makemyplan.controller.SalesOrderController;
import vis.greece.makemyplan.dto.sales.ActionEnum;
import vis.greece.makemyplan.dto.sales.Addon;
import vis.greece.makemyplan.dto.sales.ProductOffer;
import vis.greece.makemyplan.dto.sales.SalesOrderDto;
import vis.greece.makemyplan.dto.sales.SalesOrderResponseDto;
import vis.greece.makemyplan.service.ISalesOrderService;

public class SalesOrderControllerTests {

	private MockMvc mockMvc;

	@Mock
	private ISalesOrderService salesOrderService;

	@InjectMocks
	private SalesOrderController salesOrderController;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(salesOrderController).build();
	}

	@Test
	public void whenSalesOrderServiceOkThenExpect204() throws Exception {

		when(salesOrderService.manipulateBundles(any(SalesOrderDto.class), anyList(), anyString()))
				.thenReturn(createSalesOrderResponseDto());

		mockMvc.perform(post("/gr/v1/sales/order").contentType(MediaType.APPLICATION_JSON).content(
				"{\"addons\": [{\"msisdn\": \"6973268024\",\"productOffers\": [{\"action\": \"ADD\",\"name\": \"SPD4G\"}]}],\"orderType\": \"Change Tariff\",\"orderSubType\":\"OrderSubType\",\"source\":\"MCARE\",\"version\":\"ASYNC\"}")
				.header("Authorization", "Bearer ")).andExpect(status().isCreated());
	}

//	@Test
	public void whenNoOauthHeaderThenExpect400() throws Exception {

		mockMvc.perform(post("/gr/v1/sales/order").contentType(MediaType.APPLICATION_JSON).content(
				"{\"addons\": [{\"msisdn\": \"6973268024\",\"productOffers\": [{\"action\": \"ADD\",\"name\": \"SPD4G\"}]}],\"orderType\": \"Change Tariff\",\"orderSubType\":\"OrderSubType\",\"source\":\"MCARE\",\"version\":\"ASYNC\"}"))
				.andExpect(status().isBadRequest());
	}

	@Test(expected = BusinessException.class)
	public void whenSalesOrderServiceThrowsThenExpect500() throws Exception {

		doThrow(new BusinessException()).when(salesOrderService).manipulateBundles(any(SalesOrderDto.class), anyList(),anyString());

//		mockMvc.perform(post("/gr/v1/sales/order").contentType(MediaType.APPLICATION_JSON).content(
//				"{\"addons\": [{\"msisdn\": \"6973268024\",\"productOffers\": [{\"action\": \"ADD\",\"name\": \"SPD4G\"}]}],\"orderType\": \"Change Tariff\",\"orderSubType\":\"OrderSubType\",\"source\":\"MCARE\",\"version\":\"ASYNC\"}")
//				.header("Authorization", "Bearer ")).andExpect(status().isInternalServerError());
		
		salesOrderController.manipulateBundles(getSalesOrderDto(), "Mobile").getStatusCode();
	}

	private SalesOrderDto getSalesOrderDto() {

		ProductOffer productOffer = new ProductOffer();
		productOffer.setAction(ActionEnum.ADD);
		productOffer.setName("SPD4G");
		List<ProductOffer> productOfferList = new ArrayList<>();
		productOfferList.add(productOffer);
		
		Addon addon = new Addon();
		addon.setProductOffers(productOfferList);
		addon.setMsisdn("6973268024");
		addon.setPriority(1);

		List<Addon> addonList = new ArrayList<>();
		addonList.add(addon);
		
		SalesOrderDto salesOrderDto = new SalesOrderDto();
		salesOrderDto.setAddons(addonList);
		salesOrderDto.setOrderSubType("OrderSubType");
		salesOrderDto.setOrderType("Change Tariff");
		salesOrderDto.setVersion("ASYNC");
		salesOrderDto.setChannelName("MCARE");
		return salesOrderDto;
		
	}
	
	private SalesOrderResponseDto createSalesOrderResponseDto() {
		SalesOrderResponseDto responseDto = new SalesOrderResponseDto();
		responseDto.setCategory("category");
		responseDto.setMsisdn("msisdn");
		responseDto.setOrderNumber("order");
		responseDto.setStatus("ok");
		return responseDto;
	}
}