package vis.greece.makemyplan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.doThrow;

import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.TransformerException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.vis.core.errorhandling.exception.BusinessException;
import com.vis.core.logging.interceptor.SoapIntercpetor;
import com.vis.core.logging.model.SoapErrorHeader;
import com.vis.core.security.service.UserContextService;

import vis.greece.makemyplan.dto.sales.ActionEnum;
import vis.greece.makemyplan.dto.sales.Addon;
import vis.greece.makemyplan.dto.sales.ProductOffer;
import vis.greece.makemyplan.dto.sales.SalesOrderDto;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.CodeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.schema.common.BaseComponentType.Categories;
import vis.greece.makemyplan.salesorderbackend.schema.common.BaseComponentType.Categories.Category;
import vis.greece.makemyplan.salesorderbackend.schema.common.InfoComponentType.IDs;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.CreateSalesOrderVBMRequestType;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.CreateSalesOrderVBMResponseType;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.ObjectFactory;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.LineItemType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderPartsType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderPartsType.LineItems;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderVBOType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SubscriptionType;
import vis.greece.makemyplan.service.impl.SalesOrderServiceImpl;
import vis.greece.makemyplan.utils.SalesOrderDao;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class SalesOrderServiceImpl_CreateOrderTest {

	@Mock
	private UserContextService userContextService;

	@Mock
	private SalesOrderDao salesOrderDao;

	@Mock
	private SoapIntercpetor soapInterceptor;

	@InjectMocks
	private SalesOrderServiceImpl salesOrderServiceImpl;

	private static final String MSISDN_1 = "6973268024";
	private static final int ERROR_CODE = 102;
	private static final String ERROR_MSG = "Invalid request data";

	@Before
	public void init() {

	}

	@Test
	public void testSuccess() throws BusinessException, TransformerException {

		doReturn(getCreateSalesOrderVBMResponseType()).when(salesOrderDao)
				.createSalesOrder(any(CreateSalesOrderVBMRequestType.class), anyString(), anyString());

		List<String> assets = new ArrayList<>();
		assets.add(MSISDN_1);

		salesOrderServiceImpl.manipulateBundles(getSalesOrderDto(), assets, "Mobile");
	}

	@Test
	public void testFailureErrorError() throws BusinessException, TransformerException {

		doThrow(new BusinessException(ERROR_CODE, ERROR_MSG)).when(salesOrderDao)
				.createSalesOrder(any(CreateSalesOrderVBMRequestType.class), anyString(), anyString());

		List<String> assets = new ArrayList<>();
		assets.add(MSISDN_1);

		boolean catched = true;

		try {
			salesOrderServiceImpl.manipulateBundles(getSalesOrderDto(), assets, "Mobile");
		} catch (BusinessException ex) {
			catched = true;
			assertEquals(ERROR_CODE, ex.getCode());
			assertEquals(ERROR_MSG, ex.getMessage());
		}

		assertTrue(catched);

	}

	@Test(expected = BusinessException.class)
	public void testEmptyResponse() throws BusinessException, TransformerException {

		doReturn(null).when(salesOrderDao).createSalesOrder(any(CreateSalesOrderVBMRequestType.class), anyString(),
				anyString());

		doReturn(getSoapErrorHeader()).when(soapInterceptor).getSoapErrorHeader(anyString(), anyString());

		List<String> assets = new ArrayList<>();
		assets.add(MSISDN_1);

		salesOrderServiceImpl.manipulateBundles(getSalesOrderDto(), assets, "Mobile");
	}

	@Test
	public void testEmptyResponseExceptionError() throws BusinessException, TransformerException {

		doReturn(null).when(salesOrderDao).createSalesOrder(any(CreateSalesOrderVBMRequestType.class), anyString(),
				anyString());

		doReturn(getSoapErrorHeader()).when(soapInterceptor).getSoapErrorHeader(anyString(), anyString());

		List<String> assets = new ArrayList<>();
		assets.add(MSISDN_1);

		boolean catched = true;

		try {

			salesOrderServiceImpl.manipulateBundles(getSalesOrderDto(), assets, "Mobile");
		} catch (BusinessException ex) {
			catched = true;
			assertEquals(ERROR_CODE, ex.getCode());
			assertEquals(ERROR_MSG, ex.getMessage());
		}

		assertTrue(catched);

	}

	private CreateSalesOrderVBMResponseType getCreateSalesOrderVBMResponseType() throws TransformerException {

		vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.ObjectFactory vbObjectFactory = new vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.ObjectFactory();

		ObjectFactory vbmFactory = new ObjectFactory();

		CreateSalesOrderVBMResponseType createSalesOrderVBMResponseType = vbmFactory
				.createCreateSalesOrderVBMResponseType();

		SalesOrderVBOType salesOrderVBO = vbObjectFactory.createSalesOrderVBOType();

		CodeType codeType = new CodeType();
		codeType.setValue("OK");

		Category category = new Category();
		category.setListName("OrderSubType");

		Categories categories = new Categories();
		categories.getCategory().add(category);

		IDType salesOrderIdType = new IDType();
		salesOrderIdType.setSchemeName("OrderNumber");

		IDs salesOrderIds = new IDs();
		salesOrderIds.getID().add(salesOrderIdType);

		IDType subIdType = new IDType();
		subIdType.setSchemeName("MSISDN");

		IDs subOrderIds = new IDs();
		subOrderIds.getID().add(subIdType);

		SubscriptionType subscriptionType = new SubscriptionType();
		subscriptionType.setIDs(subOrderIds);

		LineItemType lineItemType = new LineItemType();
		lineItemType.setSubscription(subscriptionType);

		LineItems lineItems = new LineItems();
		lineItems.getLineItem().add(lineItemType);

		SalesOrderPartsType salesOrderPartsType = new SalesOrderPartsType();
		salesOrderPartsType.setLineItems(lineItems);

		salesOrderVBO.setStatus(codeType);
		salesOrderVBO.setIDs(salesOrderIds);
		salesOrderVBO.setCategories(categories);
		salesOrderVBO.setParts(salesOrderPartsType);

		createSalesOrderVBMResponseType.setSalesOrderVBO(salesOrderVBO);

		return createSalesOrderVBMResponseType;

	}

	private SalesOrderDto getSalesOrderDto() {

		ProductOffer productOffer = new ProductOffer();
		productOffer.setAction(ActionEnum.ADD);
		productOffer.setName("SPD4G");

		List<String> productOfferingIdSchemeNames = new ArrayList<String>(1);
		productOfferingIdSchemeNames.add("AssetIntegrationId");

		productOffer.setOldThreshold(3);
		productOffer.setNewThreshold(4);

////		List<ProductOfferCategory> productOfferCategories = new ArrayList<ProductOfferCategory> (1);
//		ProductOfferCategory productOfferCategory = new ProductOfferCategory();
//		productOfferCategory.setCategoryListName("Threshold");
//		productOfferCategory.setCategoryValue("1");

//		productOfferCategories.add(productOfferCategory);

		// productOffer.setProductOfferCategories(productOfferCategories);

		List<ProductOffer> productOfferList = new ArrayList<>();
		productOfferList.add(productOffer);

		Addon addon = new Addon();
		addon.setProductOffers(productOfferList);
		addon.setMsisdn(MSISDN_1);
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

	private SoapErrorHeader getSoapErrorHeader() {

		SoapErrorHeader soapErrorHeader = new SoapErrorHeader();
		soapErrorHeader.setErrorCode(ERROR_CODE);
		soapErrorHeader.setErrorMessage(ERROR_MSG);

		return soapErrorHeader;
	}

}