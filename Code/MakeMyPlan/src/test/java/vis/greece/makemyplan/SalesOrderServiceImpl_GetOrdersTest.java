package vis.greece.makemyplan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doReturn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.vis.core.errorhandling.exception.BusinessException;
import com.vis.core.logging.interceptor.SoapIntercpetor;
import com.vis.core.logging.model.SoapErrorHeader;

import vis.greece.makemyplan.dto.sales.AddonOrdersDto;
import vis.greece.makemyplan.dto.sales.CMSAddon;
import vis.greece.makemyplan.dto.sales.SalesOrderListConstants;
import vis.greece.makemyplan.dto.sales.SalesOrderNamesEnum;
import vis.greece.makemyplan.repository.CMSAddonsRepo;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.CodeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.DateTimeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.schema.common.InfoComponentType.IDs;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.GetSalesOrderListVBMRequestType;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.GetSalesOrderListVBMResponseType;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.ObjectFactory;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.LineItemType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.LineItemType.ProductOfferings;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.ProductOfferingType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderDetailsType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderPartsType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderPartsType.LineItems;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderVBOType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesQuoteType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.StatusReasonType;
import vis.greece.makemyplan.service.impl.SalesOrderServiceImpl;
import vis.greece.makemyplan.utils.SalesOrderDao;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class SalesOrderServiceImpl_GetOrdersTest {

	@Mock
	private CMSAddonsRepo cmsAddonsRepo;

	@Mock
	private SalesOrderDao salesOrderDao;

	@Mock
	private SoapIntercpetor soapInterceptor;

	@InjectMocks
	private SalesOrderServiceImpl salesOrderServiceImpl;

	private final int ERROR_CODE = 102;
	private final String ERROR_MSG = "Invalid request data";

	private final String ID = "1-532C4ZP";
	private final String COLOR_1 = "#00b0ca";
	private final String SPEED_1 = "300 Mbps";
	private final String PERCENTAGE_1 = "10";
	private final String STEP_1 = "1";
	private final String STB = "Ναι";
	private final String CPE = "Ναι";

	private final String EN_LANG = "en";
	private final String GR_LANG = "el";

	private final String SUBMITTED_EN_DESC_1 = "Telephony and internet services have been activated. If you have ordered the Vodafone home triple-play pack, please install the Vodafone router and keep it switched on, in order for us to run the required TV service checks. Within the next days, you will be notified by sms for the free delivery of the Vodafone TV's STB to your premises by a courier.";
	private final String COMPLETED_EN_DESC_2 = "Telephony and internet services have been activated.";
	private final String AWAITING_APPROVAL_EN_DESC_3 = "The application has been created and we either await the signed copy of the supporting documents or (if the supporting documents are attached) we expect the necessary documentary checks to be made to launch the application for implementation.";
	private final String CANCELLED_EN_DESC_4 = "Your application was automatically canceled due to non-receipt of supporting documents";
	private final String PRICE_PLAN_EN_DESC_5 = "* unlimited calls to Greek landlines * 360 minutes of calls Greek mobile phones and international landlines * Internet speed till 300 Mbps * Vodafone TV";
	private final String IP_TV_EN_DESC_6 = "Your Vodafone TV cancellation request has been successfully processed.";

	private final String SUBMITTED_GR_DESC_1 = "Οι υπηρεσίες τηλεφωνίας και internet ενεργοποιήθηκαν. Σε περίπτωση που έχεις κάνει αίτηση σε Vodafone home triple-play παρακαλούμε σύνδεσε το router της Vodafone για να ξεκινήσουν οι απαραίτητοι έλεγχοι για την ενεργοποίηση της υπηρεσίας τηλεόρασης. Θα λάβεις σχετικό μήνυμα στο κινητό σου αναφορικά με την παράδοση του εξοπλισμού της υπηρεσίας τηλεόρασης.";
	private final String COMPLETED_GR_DESC_2 = "Οι υπηρεσίες τηλεφωνίας και internet ενεργοποιήθηκαν.";
	private final String AWAITING_APPROVAL_GR_DESC_3 = "Η αίτηση έχει δημιουργηθεί και είτε αναμένουμε το υπογεγραμμένο αντίτυπο με τα δικαιολογητικά, είτε (εφόσον τα δικαιολογητικά έχουν επισυναφθεί)  αναμένουμε να γίνουν οι απαραίτητοι έλεγχοι στα δικαιολογητικά ώστε να δρομολογηθεί η αίτηση για υλοποίηση.	";
	private final String CANCELLED_GR_DESC_4 = "Η αίτησή σου ακυρώθηκε αυτόματα λόγω μη παραλαβής δικαιολογητικών.";
	private final String PRICE_PLAN_GR_DESC_5 = "* Απεριόριστα εθνικά σταθερά * 360 λεπτά προς εθνικά κινητά και διεθνή σταθερά * Internet έως 300 Mbps * Vodafone TV";
	private final String IP_TV_GR_DESC_6 = "Το αίτημα ακύρωσης του Vodafone TV ολοκληρώθηκε.";

	private final String K5_AIOS_CODE = "K5";
	private final String K5_INTERNAL_TITLE = "K5";

	private final String K01_AIOS_CODE = "K01";
	private final String K01_INTERNAL_TITLE = "K01";

	private final String PRICE_PLAN_AIOS_CODE = "1-A6ALN3";
	private final String PRICE_PLAN_INTERNAL_TITLE = "Vodafone Home double play ";

	private final String IP_TV_AIOS_CODE = "IPTV.6";
	private final String IP_TV_INTERNAL_TITLE = "IPTV.6";

	private final String CLI_1 = "6973268024";

	private final String APIX_DATE_TIME_ISO_8601_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS";

	// given OneSalesOrderVBO When Reason Code is K Status and AIOS code is Not
	// Unique Then Assert Completed Status
	// Selection Validity
	@Test
	public void oneCompletedOrderWithK_StausAndNonUniqueAios() throws BusinessException, ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		SimpleDateFormat apixSimpleDateFormat = new SimpleDateFormat(APIX_DATE_TIME_ISO_8601_FORMAT);

		Date date = new Date();
		String dateStr = simpleDateFormat.format(date);
		String apixDateStr = apixSimpleDateFormat.format(simpleDateFormat.parse(dateStr));

		doReturn(getCMSAddon(SalesOrderListConstants.K_STATUS_ALL_MATCHED.getValue(), K5_AIOS_CODE,
				SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue(), null, K5_INTERNAL_TITLE,
				COMPLETED_EN_DESC_2, COMPLETED_GR_DESC_2, null, null, false)).when(cmsAddonsRepo)
						.findByAiosCode(anyString());

		doReturn(getSalesOrderVBOList(SalesOrderListConstants.K_STATUS_ALL_MATCHED.getValue(), K5_AIOS_CODE,
				SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue(), dateStr, false)).when(salesOrderDao)
						.getSalesOrderList(any(GetSalesOrderListVBMRequestType.class));

		AddonOrdersDto addonOrdersDto = salesOrderServiceImpl.getAddonOrdersByCli(CLI_1, EN_LANG);
		assertEquals(1, addonOrdersDto.getOrdersCount());
		assertEquals(ID, addonOrdersDto.getOrders().get(0).getId());
		assertEquals(COLOR_1, addonOrdersDto.getOrders().get(0).getColor());
		assertEquals(apixDateStr, addonOrdersDto.getOrders().get(0).getEnableDate());
		assertEquals(COMPLETED_EN_DESC_2, addonOrdersDto.getOrders().get(0).getMessage());
		assertEquals(Double.parseDouble(STEP_1), addonOrdersDto.getOrders().get(0).getStep().doubleValue(), 0.0);
		assertEquals(Double.parseDouble(PERCENTAGE_1), addonOrdersDto.getOrders().get(0).getPercentage().doubleValue(),
				0.0);
		assertEquals(SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue(),
				addonOrdersDto.getOrders().get(0).getStatus());
		assertNull(addonOrdersDto.getOrders().get(0).getCpe());
		assert (addonOrdersDto.getOrders().get(0).getIpTvs().isEmpty());
		assert (addonOrdersDto.getOrders().get(0).getPricePlans().isEmpty());

	}

	@Test
	public void oneCompleteWSOrderWithK_StausAndNonUniqueAios() throws BusinessException, ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		SimpleDateFormat apixSimpleDateFormat = new SimpleDateFormat(APIX_DATE_TIME_ISO_8601_FORMAT);

		Date date = new Date();
		String dateStr = simpleDateFormat.format(date);
		String apixDateStr = apixSimpleDateFormat.format(simpleDateFormat.parse(dateStr));

		doReturn(getCMSAddon(SalesOrderListConstants.K_STATUS_ALL_MATCHED.getValue(), K5_AIOS_CODE,
				SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue(), null, K5_INTERNAL_TITLE,
				COMPLETED_EN_DESC_2, COMPLETED_GR_DESC_2, null, null, false)).when(cmsAddonsRepo)
						.findByAiosCode(anyString());

		doReturn(getSalesOrderVBOList(SalesOrderListConstants.K_STATUS_ALL_MATCHED.getValue(), K5_AIOS_CODE, "Complete",
				dateStr, false)).when(salesOrderDao).getSalesOrderList(any(GetSalesOrderListVBMRequestType.class));

		AddonOrdersDto addonOrdersDto = salesOrderServiceImpl.getAddonOrdersByCli(CLI_1, EN_LANG);
		assertEquals(1, addonOrdersDto.getOrdersCount());
		assertEquals(ID, addonOrdersDto.getOrders().get(0).getId());
		assertEquals(COLOR_1, addonOrdersDto.getOrders().get(0).getColor());
		assertEquals(apixDateStr, addonOrdersDto.getOrders().get(0).getEnableDate());
		assertEquals(COMPLETED_EN_DESC_2, addonOrdersDto.getOrders().get(0).getMessage());
		assertEquals(Double.parseDouble(STEP_1), addonOrdersDto.getOrders().get(0).getStep().doubleValue(), 0.0);
		assertEquals(Double.parseDouble(PERCENTAGE_1), addonOrdersDto.getOrders().get(0).getPercentage().doubleValue(),
				0.0);
		assertEquals(SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue(),
				addonOrdersDto.getOrders().get(0).getStatus());
		assertNull(addonOrdersDto.getOrders().get(0).getCpe());
		assert (addonOrdersDto.getOrders().get(0).getIpTvs().isEmpty());
		assert (addonOrdersDto.getOrders().get(0).getPricePlans().isEmpty());

	}

	@Test
	public void oneCompleteCMSOrderWithK_StausAndNonUniqueAios() throws BusinessException, ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		SimpleDateFormat apixSimpleDateFormat = new SimpleDateFormat(APIX_DATE_TIME_ISO_8601_FORMAT);

		Date date = new Date();
		String dateStr = simpleDateFormat.format(date);
		String apixDateStr = apixSimpleDateFormat.format(simpleDateFormat.parse(dateStr));

		doReturn(getCMSAddon(SalesOrderListConstants.K_STATUS_ALL_MATCHED.getValue(), K5_AIOS_CODE, "Complete", null,
				K5_INTERNAL_TITLE, COMPLETED_EN_DESC_2, COMPLETED_GR_DESC_2, null, null, false)).when(cmsAddonsRepo)
						.findByAiosCode(anyString());

		doReturn(getSalesOrderVBOList(SalesOrderListConstants.K_STATUS_ALL_MATCHED.getValue(), K5_AIOS_CODE,
				SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue(), dateStr, false)).when(salesOrderDao)
						.getSalesOrderList(any(GetSalesOrderListVBMRequestType.class));

		AddonOrdersDto addonOrdersDto = salesOrderServiceImpl.getAddonOrdersByCli(CLI_1, EN_LANG);
		assertEquals(1, addonOrdersDto.getOrdersCount());
		assertEquals(ID, addonOrdersDto.getOrders().get(0).getId());
		assertEquals(COLOR_1, addonOrdersDto.getOrders().get(0).getColor());
		assertEquals(apixDateStr, addonOrdersDto.getOrders().get(0).getEnableDate());
		assertEquals(COMPLETED_EN_DESC_2, addonOrdersDto.getOrders().get(0).getMessage());
		assertEquals(Double.parseDouble(STEP_1), addonOrdersDto.getOrders().get(0).getStep().doubleValue(), 0.0);
		assertEquals(Double.parseDouble(PERCENTAGE_1), addonOrdersDto.getOrders().get(0).getPercentage().doubleValue(),
				0.0);
		assertEquals(SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue(),
				addonOrdersDto.getOrders().get(0).getStatus());
		assertNull(addonOrdersDto.getOrders().get(0).getCpe());
		assert (addonOrdersDto.getOrders().get(0).getIpTvs().isEmpty());
		assert (addonOrdersDto.getOrders().get(0).getPricePlans().isEmpty());

	}

	// given OneSalesOrderVBO When Reason Code is K Status and AIOS code is Unique
	// Then Assert Submitted Status
	// Selection Validity
	@Test
	public void oneSubmittedOrderWithK_StatusAndUniqueAios() throws BusinessException, ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		SimpleDateFormat apixSimpleDateFormat = new SimpleDateFormat(APIX_DATE_TIME_ISO_8601_FORMAT);

		Date date = new Date();
		String dateStr = simpleDateFormat.format(date);
		String apixDateStr = apixSimpleDateFormat.format(simpleDateFormat.parse(dateStr));

		doReturn(getCMSAddon(SalesOrderListConstants.K_STATUS_ALL_MATCHED.getValue(), K01_AIOS_CODE,
				SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue(), null, K01_INTERNAL_TITLE,
				SUBMITTED_EN_DESC_1, SUBMITTED_GR_DESC_1, CPE, null, true)).when(cmsAddonsRepo)
						.findByAiosCode(anyString());

		doReturn(getSalesOrderVBOList(SalesOrderListConstants.K_STATUS_ALL_MATCHED.getValue(), K01_AIOS_CODE,
				SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue(), dateStr, true)).when(salesOrderDao)
						.getSalesOrderList(any(GetSalesOrderListVBMRequestType.class));

		AddonOrdersDto addonOrdersDto = salesOrderServiceImpl.getAddonOrdersByCli(CLI_1, GR_LANG);
		assertEquals(1, addonOrdersDto.getOrdersCount());
		assertEquals(ID, addonOrdersDto.getOrders().get(0).getId());
		assertEquals(COLOR_1, addonOrdersDto.getOrders().get(0).getColor());
		assertEquals(apixDateStr, addonOrdersDto.getOrders().get(0).getEnableDate());
		assertEquals(SUBMITTED_GR_DESC_1, addonOrdersDto.getOrders().get(0).getMessage());
		assertEquals(Double.parseDouble(STEP_1), addonOrdersDto.getOrders().get(0).getStep().doubleValue(), 0.0);
		assertEquals(Double.parseDouble(PERCENTAGE_1), addonOrdersDto.getOrders().get(0).getPercentage().doubleValue(),
				0.0);
		assertEquals(SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue(),
				addonOrdersDto.getOrders().get(0).getStatus());
		assertEquals(CPE, addonOrdersDto.getOrders().get(0).getCpe());
		assert (addonOrdersDto.getOrders().get(0).getIpTvs().isEmpty());
		assert (addonOrdersDto.getOrders().get(0).getPricePlans().isEmpty());

	}

	@Test
	public void oneSubmitedOrderWithK_StatusAndUniqueAios() throws BusinessException, ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		SimpleDateFormat apixSimpleDateFormat = new SimpleDateFormat(APIX_DATE_TIME_ISO_8601_FORMAT);

		Date date = new Date();
		String dateStr = simpleDateFormat.format(date);
		String apixDateStr = apixSimpleDateFormat.format(simpleDateFormat.parse(dateStr));

		doReturn(getCMSAddon(SalesOrderListConstants.K_STATUS_ALL_MATCHED.getValue(), K01_AIOS_CODE,
				SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue(), null, K01_INTERNAL_TITLE,
				SUBMITTED_EN_DESC_1, SUBMITTED_GR_DESC_1, CPE, null, true)).when(cmsAddonsRepo)
						.findByAiosCode(anyString());

		doReturn(getSalesOrderVBOList(SalesOrderListConstants.K_STATUS_ALL_MATCHED.getValue(), K01_AIOS_CODE,
				"Submited", dateStr, true)).when(salesOrderDao)
						.getSalesOrderList(any(GetSalesOrderListVBMRequestType.class));

		AddonOrdersDto addonOrdersDto = salesOrderServiceImpl.getAddonOrdersByCli(CLI_1, GR_LANG);
		assertEquals(1, addonOrdersDto.getOrdersCount());
		assertEquals(ID, addonOrdersDto.getOrders().get(0).getId());
		assertEquals(COLOR_1, addonOrdersDto.getOrders().get(0).getColor());
		assertEquals(apixDateStr, addonOrdersDto.getOrders().get(0).getEnableDate());
		assertEquals(SUBMITTED_GR_DESC_1, addonOrdersDto.getOrders().get(0).getMessage());
		assertEquals(Double.parseDouble(STEP_1), addonOrdersDto.getOrders().get(0).getStep().doubleValue(), 0.0);
		assertEquals(Double.parseDouble(PERCENTAGE_1), addonOrdersDto.getOrders().get(0).getPercentage().doubleValue(),
				0.0);
		assertEquals(SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue(),
				addonOrdersDto.getOrders().get(0).getStatus());
		assertEquals(CPE, addonOrdersDto.getOrders().get(0).getCpe());
		assert (addonOrdersDto.getOrders().get(0).getIpTvs().isEmpty());
		assert (addonOrdersDto.getOrders().get(0).getPricePlans().isEmpty());

	}

	@Test
	public void oneSubmitOrderWithK_StatusAndUniqueAios() throws BusinessException, ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		SimpleDateFormat apixSimpleDateFormat = new SimpleDateFormat(APIX_DATE_TIME_ISO_8601_FORMAT);

		Date date = new Date();
		String dateStr = simpleDateFormat.format(date);
		String apixDateStr = apixSimpleDateFormat.format(simpleDateFormat.parse(dateStr));

		doReturn(getCMSAddon(SalesOrderListConstants.K_STATUS_ALL_MATCHED.getValue(), K01_AIOS_CODE, "Submited", null,
				K01_INTERNAL_TITLE, SUBMITTED_EN_DESC_1, SUBMITTED_GR_DESC_1, CPE, null, true)).when(cmsAddonsRepo)
						.findByAiosCode(anyString());

		doReturn(getSalesOrderVBOList(SalesOrderListConstants.K_STATUS_ALL_MATCHED.getValue(), K01_AIOS_CODE,
				SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue(), dateStr, true)).when(salesOrderDao)
						.getSalesOrderList(any(GetSalesOrderListVBMRequestType.class));

		AddonOrdersDto addonOrdersDto = salesOrderServiceImpl.getAddonOrdersByCli(CLI_1, GR_LANG);
		assertEquals(1, addonOrdersDto.getOrdersCount());
		assertEquals(ID, addonOrdersDto.getOrders().get(0).getId());
		assertEquals(COLOR_1, addonOrdersDto.getOrders().get(0).getColor());
		assertEquals(apixDateStr, addonOrdersDto.getOrders().get(0).getEnableDate());
		assertEquals(SUBMITTED_GR_DESC_1, addonOrdersDto.getOrders().get(0).getMessage());
		assertEquals(Double.parseDouble(STEP_1), addonOrdersDto.getOrders().get(0).getStep().doubleValue(), 0.0);
		assertEquals(Double.parseDouble(PERCENTAGE_1), addonOrdersDto.getOrders().get(0).getPercentage().doubleValue(),
				0.0);
		assertEquals(SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue(),
				addonOrdersDto.getOrders().get(0).getStatus());
		assertEquals(CPE, addonOrdersDto.getOrders().get(0).getCpe());
		assert (addonOrdersDto.getOrders().get(0).getIpTvs().isEmpty());
		assert (addonOrdersDto.getOrders().get(0).getPricePlans().isEmpty());

	}

	@Test
	public void oneOrderWithPricePlanAndUniqueAios() throws BusinessException {

		doReturn(getCMSAddon(SalesOrderListConstants.CMS_PRICE_PLAN_TYPE.getValue(), PRICE_PLAN_AIOS_CODE,
				SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue(), SPEED_1, PRICE_PLAN_INTERNAL_TITLE,
				PRICE_PLAN_EN_DESC_5, PRICE_PLAN_GR_DESC_5, null, null, true)).when(cmsAddonsRepo)
						.findByAiosCode(anyString());

		GetSalesOrderListVBMResponseType getSalesOrderListVBMResponseType = getSalesOrderVBOList(
				SalesOrderListConstants.CMS_PRICE_PLAN_TYPE.getValue(), PRICE_PLAN_AIOS_CODE,
				SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue(), null, true);
		SalesQuoteType salesQuoteType = new SalesQuoteType();
		IDType subIdType = new IDType();
		subIdType.setSchemeName(SalesOrderListConstants.SALES_QUOTE_ID_PRICE_PLAN.getValue());
		subIdType.setValue(PRICE_PLAN_AIOS_CODE);
		IDs subOrderIds = new IDs();
		subOrderIds.getID().add(subIdType);
		salesQuoteType.setIDs(subOrderIds);
		getSalesOrderListVBMResponseType.getSalesOrderVBO().get(0).getParts().setSalesQuote(salesQuoteType);

		doReturn(getSalesOrderListVBMResponseType).when(salesOrderDao)
				.getSalesOrderList(any(GetSalesOrderListVBMRequestType.class));

		doReturn(getCMSAddon(SalesOrderListConstants.CMS_PRICE_PLAN_TYPE.getValue(), PRICE_PLAN_AIOS_CODE,
				SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue(), SPEED_1, PRICE_PLAN_INTERNAL_TITLE,
				PRICE_PLAN_EN_DESC_5, PRICE_PLAN_GR_DESC_5, null, null, true)).when(cmsAddonsRepo)
						.findByAiosCodeAndSpeed(anyString(), anyString());

		AddonOrdersDto addonOrdersDto = salesOrderServiceImpl.getAddonOrdersByCli(CLI_1, EN_LANG);
		assertEquals(1, addonOrdersDto.getOrdersCount());
		assertEquals(ID, addonOrdersDto.getOrders().get(0).getId());
		assertEquals(COLOR_1, addonOrdersDto.getOrders().get(0).getColor());
		assertEquals(PRICE_PLAN_EN_DESC_5, addonOrdersDto.getOrders().get(0).getMessage());
		assertEquals(Double.parseDouble(STEP_1), addonOrdersDto.getOrders().get(0).getStep().doubleValue(), 0.0);
		assertEquals(Double.parseDouble(PERCENTAGE_1), addonOrdersDto.getOrders().get(0).getPercentage().doubleValue(),
				0.0);
		assertEquals(SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue(),
				addonOrdersDto.getOrders().get(0).getStatus());
		assertEquals(1, addonOrdersDto.getOrders().get(0).getPricePlans().size());

		assertEquals(PRICE_PLAN_EN_DESC_5, addonOrdersDto.getOrders().get(0).getPricePlans().get(0).getDescription());
		assertEquals(SPEED_1, addonOrdersDto.getOrders().get(0).getPricePlans().get(0).getSpeed());
		assertEquals(PRICE_PLAN_INTERNAL_TITLE, addonOrdersDto.getOrders().get(0).getPricePlans().get(0).getTitle());

		assertNull(addonOrdersDto.getOrders().get(0).getEnableDate());
		assertNull(addonOrdersDto.getOrders().get(0).getCpe());
		assert (addonOrdersDto.getOrders().get(0).getIpTvs().isEmpty());

	}

	@Test
	public void oneOrderWithIPTVAndUniqueAios() throws BusinessException {

		vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.ObjectFactory vbObjectFactory = new vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.ObjectFactory();

		doReturn(getCMSAddon(SalesOrderListConstants.CMS_TV_STATUS_TYPE.getValue(), IP_TV_AIOS_CODE,
				SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue(), null, IP_TV_INTERNAL_TITLE,
				IP_TV_EN_DESC_6, IP_TV_GR_DESC_6, null, STB, true)).when(cmsAddonsRepo).findByAiosCode(anyString());

		doReturn(getCMSAddon(SalesOrderListConstants.CMS_TV_STATUS_TYPE.getValue(), IP_TV_AIOS_CODE,
				SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue(), null, IP_TV_INTERNAL_TITLE,
				IP_TV_EN_DESC_6, IP_TV_GR_DESC_6, null, STB, true)).when(cmsAddonsRepo).findByAiosCodeIn(any());
		
		GetSalesOrderListVBMResponseType getSalesOrderListVBMResponseType = getSalesOrderVBOList(
				SalesOrderListConstants.CMS_TV_STATUS_TYPE.getValue(), IP_TV_AIOS_CODE,
				SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue(), null, true);

		LineItemType lineItemType = vbObjectFactory.createLineItemType();

		ProductOfferingType productOfferingType = vbObjectFactory.createProductOfferingType();
		CodeType productOfferingStatusCodeType = new CodeType();
		productOfferingStatusCodeType.setListName(SalesOrderListConstants.PRODUCT_OFFERING_STATUS_TV.getValue());
		productOfferingStatusCodeType.setValue(IP_TV_AIOS_CODE);
		productOfferingType.setStatus(productOfferingStatusCodeType);
		
		ProductOfferings productOfferings = vbObjectFactory.createLineItemTypeProductOfferings();
		productOfferings.getProductOffering().add(productOfferingType);
		lineItemType.setProductOfferings(productOfferings);


		getSalesOrderListVBMResponseType.getSalesOrderVBO().get(0).getParts().getLineItems().getLineItem().add(lineItemType);

		doReturn(getSalesOrderListVBMResponseType).when(salesOrderDao)
				.getSalesOrderList(any(GetSalesOrderListVBMRequestType.class));

		AddonOrdersDto addonOrdersDto = salesOrderServiceImpl.getAddonOrdersByCli(CLI_1, GR_LANG);
		assertEquals(1, addonOrdersDto.getOrdersCount());
		assertEquals(ID, addonOrdersDto.getOrders().get(0).getId());
		assertEquals(COLOR_1, addonOrdersDto.getOrders().get(0).getColor());
		assertEquals(IP_TV_GR_DESC_6, addonOrdersDto.getOrders().get(0).getMessage());
		assertEquals(Double.parseDouble(STEP_1), addonOrdersDto.getOrders().get(0).getStep().doubleValue(), 0.0);
		assertEquals(Double.parseDouble(PERCENTAGE_1), addonOrdersDto.getOrders().get(0).getPercentage().doubleValue(),
				0.0);
		assertEquals(SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue(),
				addonOrdersDto.getOrders().get(0).getStatus());
		assertEquals(1, addonOrdersDto.getOrders().get(0).getIpTvs().size());

		assertEquals(COLOR_1, addonOrdersDto.getOrders().get(0).getIpTvs().get(0).getColor());
		assertEquals(IP_TV_GR_DESC_6, addonOrdersDto.getOrders().get(0).getIpTvs().get(0).getMessage());
		assertEquals(STB, addonOrdersDto.getOrders().get(0).getIpTvs().get(0).getStb());

		assertNull(addonOrdersDto.getOrders().get(0).getEnableDate());
		assertNull(addonOrdersDto.getOrders().get(0).getCpe());
		assert (addonOrdersDto.getOrders().get(0).getPricePlans().isEmpty());

	}

	@Test()
	public void noOrderSoapHeaderBusinessError() throws BusinessException {

		doReturn(null).when(salesOrderDao).getSalesOrderList(any(GetSalesOrderListVBMRequestType.class));

		doReturn(getSoapErrorHeader()).when(soapInterceptor).getSoapErrorHeader(
				SalesOrderNamesEnum.ERROR_CODE_NODE_NAME.getName(), SalesOrderNamesEnum.ERROR_MSG_NODE_NAME.getName());

		boolean catched = false;

		try {

			salesOrderServiceImpl.getAddonOrdersByCli(CLI_1, GR_LANG);
		} catch (BusinessException ex) {
			catched = true;
			assertEquals(ERROR_CODE, ex.getCode());
			assertEquals(ERROR_MSG, ex.getMessage());
		}
		assertTrue(catched);
	}

	@Test
	public void oneAwaitingApprovalOrderWithoutK_StatusAndWithoutAios() throws BusinessException {

		doReturn(getCMSAddon(null, null, SalesOrderListConstants.AWAITING_APPROVAL_STATUS.getValue(), null, null,
				AWAITING_APPROVAL_EN_DESC_3, AWAITING_APPROVAL_GR_DESC_3, null, null, true)).when(cmsAddonsRepo)
						.findByStatus(anyString());

		doReturn(getSalesOrderVBOList(null, null, SalesOrderListConstants.AWAITING_APPROVAL_STATUS.getValue(), null,
				true)).when(salesOrderDao).getSalesOrderList(any(GetSalesOrderListVBMRequestType.class));

		AddonOrdersDto addonOrdersDto = salesOrderServiceImpl.getAddonOrdersByCli(CLI_1, EN_LANG);

		assertEquals(1, addonOrdersDto.getOrdersCount());
		assertEquals(ID, addonOrdersDto.getOrders().get(0).getId());
		assertEquals(COLOR_1, addonOrdersDto.getOrders().get(0).getColor());
		assertEquals(AWAITING_APPROVAL_EN_DESC_3, addonOrdersDto.getOrders().get(0).getMessage());
		assertEquals(Double.parseDouble(STEP_1), addonOrdersDto.getOrders().get(0).getStep().doubleValue(), 0.0);
		assertEquals(Double.parseDouble(PERCENTAGE_1), addonOrdersDto.getOrders().get(0).getPercentage().doubleValue(),
				0.0);
		assertEquals(SalesOrderListConstants.AWAITING_APPROVAL_STATUS.getValue(),
				addonOrdersDto.getOrders().get(0).getStatus());
		assertNull(addonOrdersDto.getOrders().get(0).getCpe());
		assertNull(addonOrdersDto.getOrders().get(0).getEnableDate());
		assert (addonOrdersDto.getOrders().get(0).getIpTvs().isEmpty());
		assert (addonOrdersDto.getOrders().get(0).getPricePlans().isEmpty());

	}

	@Test
	public void oneAutoCancelledOrderWithoutK_StatusAndWithoutAios() throws BusinessException, ParseException {

		doReturn(getCMSAddon(null, null, SalesOrderListConstants.CANCELLED_STATUS.getValue(), null, null,
				CANCELLED_EN_DESC_4, CANCELLED_GR_DESC_4, null, null, true)).when(cmsAddonsRepo)
						.findByStatus(anyString());

		doReturn(getSalesOrderVBOList(null, null, SalesOrderListConstants.CANCELLED_STATUS.getValue(), null, true))
				.when(salesOrderDao).getSalesOrderList(any(GetSalesOrderListVBMRequestType.class));

		AddonOrdersDto addonOrdersDto = salesOrderServiceImpl.getAddonOrdersByCli(CLI_1, GR_LANG);
		assertEquals(1, addonOrdersDto.getOrdersCount());
		assertEquals(ID, addonOrdersDto.getOrders().get(0).getId());
		assertEquals(COLOR_1, addonOrdersDto.getOrders().get(0).getColor());
		assertEquals(CANCELLED_GR_DESC_4, addonOrdersDto.getOrders().get(0).getMessage());
		assertEquals(Double.parseDouble(STEP_1), addonOrdersDto.getOrders().get(0).getStep().doubleValue(), 0.0);
		assertEquals(Double.parseDouble(PERCENTAGE_1), addonOrdersDto.getOrders().get(0).getPercentage().doubleValue(),
				0.0);
		assertEquals(SalesOrderListConstants.CANCELLED_STATUS.getValue(),
				addonOrdersDto.getOrders().get(0).getStatus());
		assertNull(addonOrdersDto.getOrders().get(0).getCpe());
		assertNull(addonOrdersDto.getOrders().get(0).getEnableDate());
		assert (addonOrdersDto.getOrders().get(0).getIpTvs().isEmpty());
		assert (addonOrdersDto.getOrders().get(0).getPricePlans().isEmpty());

	}

	private GetSalesOrderListVBMResponseType getSalesOrderVBOList(String reasonCode, String reasonCodeValue,
			String status, String dateStr, boolean unique) {

		vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.ObjectFactory vbObjectFactory = new vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.ObjectFactory();

		ObjectFactory vbmFactory = new ObjectFactory();

		GetSalesOrderListVBMResponseType getSalesOrderListVBMResponseType = vbmFactory
				.createGetSalesOrderListVBMResponseType();

		CodeType reasonCodeType = new CodeType();

		reasonCodeType.setListName(reasonCode);

		if (unique) {
			reasonCodeType.setValue(K01_AIOS_CODE);
		} else {
			reasonCodeType.setValue(K5_AIOS_CODE);
		}

		StatusReasonType statusReasonType = vbObjectFactory.createStatusReasonType();
		statusReasonType.setReasonCode(reasonCodeType);
		SalesOrderDetailsType salesOrderDetailsType = vbObjectFactory.createSalesOrderDetailsType();
		salesOrderDetailsType.setStatusReason(statusReasonType);
		SalesOrderVBOType salesOrderVBOType_1 = vbObjectFactory.createSalesOrderVBOType();
		salesOrderVBOType_1.setDetails(salesOrderDetailsType);

		SalesOrderPartsType salesOrderPartsType = vbObjectFactory.createSalesOrderPartsType();
		LineItems lineItems = vbObjectFactory.createSalesOrderPartsTypeLineItems();

		LineItemType lineItemType = vbObjectFactory.createLineItemType();

		lineItems.getLineItem().add(lineItemType);
		ProductOfferingType productOfferingType = vbObjectFactory.createProductOfferingType();

		if (reasonCode != null && reasonCode.equals(SalesOrderListConstants.CMS_PRICE_PLAN_TYPE.getValue())) {
			CodeType productOfferingStatusCodeType = new CodeType();
			productOfferingStatusCodeType.setListName(SalesOrderListConstants.CMS_SPEED.getValue());
			productOfferingStatusCodeType.setValue(SPEED_1);
			productOfferingType.setStatus(productOfferingStatusCodeType);
		}
		ProductOfferings productOfferings = vbObjectFactory.createLineItemTypeProductOfferings();
		productOfferings.getProductOffering().add(productOfferingType);
		lineItemType.setProductOfferings(productOfferings);

		DateTimeType dateTimeType = new DateTimeType();
		dateTimeType.setValue(dateStr);
		lineItemType.setScheduledDeliveryDateTime(dateTimeType);

		salesOrderPartsType.setLineItems(lineItems);
		salesOrderVBOType_1.setParts(salesOrderPartsType);

		CodeType statusCodeType = new CodeType();
		statusCodeType.setValue(status);
		salesOrderVBOType_1.setStatus(statusCodeType);

		IDType subIdType = new IDType();
		subIdType.setSchemeName(SalesOrderNamesEnum.SALES_ORDER_ID_PATH_GET_ORDER_LIST.getName());
		subIdType.setValue(ID);
		IDs subOrderIds = new IDs();
		subOrderIds.getID().add(subIdType);
		salesOrderVBOType_1.setIDs(subOrderIds);

		getSalesOrderListVBMResponseType.getSalesOrderVBO().add(salesOrderVBOType_1);

		return getSalesOrderListVBMResponseType;
	}

	private List<CMSAddon> getCMSAddon(String type, String aiosCode, String status, String speed, String title,
			String enMessage, String grMessage, String cpe, String stb, boolean unique) {

		List<CMSAddon> cmsAddons = new ArrayList<>();

		CMSAddon cmsAddon_1 = new CMSAddon();

		cmsAddons.add(cmsAddon_1);

		cmsAddon_1.setAiosCode(aiosCode);
		cmsAddon_1.setColor(COLOR_1);
		cmsAddon_1.setCpe(cpe);
		cmsAddon_1.setInternalTitle(title);
		cmsAddon_1.setEnDesc(enMessage);
		cmsAddon_1.setGreekDesc(grMessage);
		cmsAddon_1.setPercentage(PERCENTAGE_1);
		cmsAddon_1.setSpeed(speed);
		cmsAddon_1.setStatus(status);
		cmsAddon_1.setStb(stb);
		cmsAddon_1.setStep(STEP_1);
		cmsAddon_1.setType(type);

		if (!unique) {

			CMSAddon cmsAddon_2 = new CMSAddon();

			// AIOS should be the same but status should be different
			cmsAddon_2.setAiosCode(aiosCode);
			if (status.equals(SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue())) {
				cmsAddon_2.setStatus(SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue());
				cmsAddon_2.setEnDesc(SUBMITTED_EN_DESC_1);
				cmsAddon_2.setGreekDesc(SUBMITTED_GR_DESC_1);

			} else {
				cmsAddon_2.setStatus(SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue());
				cmsAddon_2.setEnDesc(COMPLETED_EN_DESC_2);
				cmsAddon_2.setGreekDesc(COMPLETED_GR_DESC_2);

			}

			cmsAddon_2.setColor(COLOR_1);
			cmsAddon_2.setCpe(cpe);
			cmsAddon_2.setInternalTitle(title);
			cmsAddon_2.setPercentage(PERCENTAGE_1);
			cmsAddon_2.setSpeed(speed);
			cmsAddon_2.setStb(stb);
			cmsAddon_2.setStep(STEP_1);
			cmsAddon_2.setType(type);

			cmsAddons.add(cmsAddon_2);
		}

		return cmsAddons;
	}

	private SoapErrorHeader getSoapErrorHeader() {

		SoapErrorHeader soapErrorHeader = new SoapErrorHeader();
		soapErrorHeader.setErrorCode(ERROR_CODE);
		soapErrorHeader.setErrorMessage(ERROR_MSG);

		return soapErrorHeader;
	}

//	private GetSalesOrderListVBMResponseType getSoapHeaderError(MessageContext messageContext)
//			throws TransformerException {
//
//		vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.ObjectFactory vbObjectFactory = new vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.ObjectFactory();
//
//		ObjectFactory vbmFactory = new ObjectFactory();
//
//		GetSalesOrderListVBMResponseType getSalesOrderListVBMResponseType = vbmFactory
//				.createGetSalesOrderListVBMResponseType();
//
//		SalesOrderVBOType salesOrderVBOType_1 = vbObjectFactory.createSalesOrderVBOType();
//
//		SaajSoapMessage soapResponse = (SaajSoapMessage) messageContext.getResponse();
//		SoapHeader respheader = soapResponse.getSoapHeader();
//		TransformerFactory transformerFactory = TransformerFactory.newInstance();
//		Transformer transformer = transformerFactory.newTransformer();
//		// error response
//		SOAPMessage msg = soapResponse.getSaajMessage();
//		SOAPHeader header;
//
//		try {
//			header = msg.getSOAPHeader();
//
//			QName qNameDestination = new QName("http://group.vodafone.com/contract/vho/header/v1", "ResultStatus");
//			SOAPHeaderElement destination;
//			destination = header.addHeaderElement(qNameDestination);
//			DOMSource domsource = new DOMSource(destination);
//			transformer.transform(domsource, respheader.getResult());
//			QName qNameTimeStamp = new QName("http://docs.oasis-open.org/wsrf/bf-2", "Timestamp");
//			SOAPHeaderElement timeStamp = header.addHeaderElement(qNameTimeStamp);
//			timeStamp.addTextNode("time");
//			destination.addChildElement(timeStamp);
//
//			QName qNameErrorCode = new QName("http://docs.oasis-open.org/wsrf/bf-2", "ErrorCode");
//			SOAPHeaderElement errorCode = header.addHeaderElement(qNameErrorCode);
//			errorCode.addTextNode("101");
//			destination.addChildElement(errorCode);
//
//			QName qNameName = new QName("http://group.vodafone.com/contract/vfo/fault/v1", "Name");
//			SOAPHeaderElement name = header.addHeaderElement(qNameName);
//			name.addTextNode("Invalid Input Data");
//			destination.addChildElement(name);
//
//		} catch (SOAPException e) {
//			e.printStackTrace();
//		}
//		getSalesOrderListVBMResponseType.getSalesOrderVBO().add(salesOrderVBOType_1);
//
//		return getSalesOrderListVBMResponseType;
//	}

}