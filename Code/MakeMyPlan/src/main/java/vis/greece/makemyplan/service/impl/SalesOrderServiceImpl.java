package vis.greece.makemyplan.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.vis.core.errorhandling.exception.BusinessException;
import com.vis.core.logging.interceptor.SoapIntercpetor;
import com.vis.core.logging.model.SoapErrorHeader;

import lombok.extern.slf4j.Slf4j;
import vis.greece.makemyplan.dto.sales.Addon;
import vis.greece.makemyplan.dto.sales.AddonOrdersDto;
import vis.greece.makemyplan.dto.sales.CMSAddon;
import vis.greece.makemyplan.dto.sales.IpTv;
import vis.greece.makemyplan.dto.sales.NeededSalesOrderVBOType;
import vis.greece.makemyplan.dto.sales.OneOffPriceDto;
import vis.greece.makemyplan.dto.sales.Order;
import vis.greece.makemyplan.dto.sales.PricePlan;
import vis.greece.makemyplan.dto.sales.ProductOffer;
import vis.greece.makemyplan.dto.sales.RecurringPricesDto;
import vis.greece.makemyplan.dto.sales.SalesOrderDto;
import vis.greece.makemyplan.dto.sales.SalesOrderListConstants;
import vis.greece.makemyplan.dto.sales.SalesOrderNamesEnum;
import vis.greece.makemyplan.dto.sales.SalesOrderResponseDto;
import vis.greece.makemyplan.repository.CMSAddonsRepo;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.CodeType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.IDType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.NumericType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.QuantityType;
import vis.greece.makemyplan.salesorderbackend.corecomponenttype.TextType;
import vis.greece.makemyplan.salesorderbackend.schema.common.ActionCodeType;
import vis.greece.makemyplan.salesorderbackend.schema.common.BaseComponentType.Categories;
import vis.greece.makemyplan.salesorderbackend.schema.common.BaseComponentType.Categories.Category;
import vis.greece.makemyplan.salesorderbackend.schema.common.InfoComponentType.IDs;
import vis.greece.makemyplan.salesorderbackend.schema.common.PriceFrequencyType;
import vis.greece.makemyplan.salesorderbackend.schema.common.QueryOperatorCodeType;
import vis.greece.makemyplan.salesorderbackend.schema.common.QueryType.Criteria;
import vis.greece.makemyplan.salesorderbackend.schema.common.QueryType.Criteria.QueryExpression;
import vis.greece.makemyplan.salesorderbackend.schema.common.ValueExpressionType;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.CreateSalesOrderVBMRequestType;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.CreateSalesOrderVBMResponseType;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.GetSalesOrderListVBMRequestType;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.GetSalesOrderListVBMResponseType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.ChannelType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.CharacteristicsType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.CharacteristicsType.CharacteristicsValue;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.LineItemType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.LineItemType.OneOffPrices;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.LineItemType.ProductOfferings;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.LineItemType.RecurringPrices;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.OneOffPriceType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.ProductOfferingType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.RecurringPriceType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderPartsType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderPartsType.LineItems;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SalesOrderVBOType;
import vis.greece.makemyplan.salesorderbackend.schema.vbo.sales_order.SubscriptionType;
import vis.greece.makemyplan.service.ISalesOrderService;
import vis.greece.makemyplan.utils.SalesOrderDao;

@Slf4j
@Service
public class SalesOrderServiceImpl implements ISalesOrderService {

	@Autowired
	private SalesOrderDao salesOrderDao;

	@Autowired
	private CMSAddonsRepo cmsAddonsRepo;

	@Autowired
	private SoapIntercpetor soapInterceptor;

	private final static String APIX_DATE_TIME_ISO_8601_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS";
	private final static String BACKEND_DATE_TIME_FORMAT = "dd/MM/yyyy HH:mm:ss";

	@Override
	// @PreAuthorize("@userContextService.isValidSalesOrderAssets(#assets)")
	public SalesOrderResponseDto manipulateBundles(SalesOrderDto salesOrderDto, List<String> assets, String destSys)
			throws BusinessException {

		log.info("Before Calling SalesOrder DAO");

		CreateSalesOrderVBMResponseType createSalesOrderVBMResponseType = salesOrderDao.createSalesOrder(
				getCreateSalesOrderVBMRequestTypeFromSalesOrderDto(salesOrderDto), salesOrderDto.getChannelName(),
				destSys);

		log.info("SalesOrder DAO called");
		if (createSalesOrderVBMResponseType == null || createSalesOrderVBMResponseType.getSalesOrderVBO() == null
				|| createSalesOrderVBMResponseType.getSalesOrderVBO().getStatus() == null) {
			log.error("Got Empty invalid response from Backend");

			SoapErrorHeader soapErrorHeader = soapInterceptor.getSoapErrorHeader(
					SalesOrderNamesEnum.ERROR_CODE_NODE_NAME.getName(),
					SalesOrderNamesEnum.ERROR_MSG_NODE_NAME.getName());
			log.info("==== TraceSRError" + soapErrorHeader);
			throw new BusinessException(
					soapErrorHeader.getErrorCode() != null ? soapErrorHeader.getErrorCode().intValue() : 0,
					soapErrorHeader.getErrorMessage() != null ? soapErrorHeader.getErrorMessage()
							: "Invalid backend response");
		} else if (!createSalesOrderVBMResponseType.getSalesOrderVBO().getStatus().getValue()
				.equalsIgnoreCase(SalesOrderNamesEnum.CREATE_ORDER_SUCCESS_STATUS.getName())) {
			log.error("Got unexpected status {} from backend",
					createSalesOrderVBMResponseType.getSalesOrderVBO().getStatus().getValue());
			SoapErrorHeader soapErrorHeader = soapInterceptor.getSoapErrorHeader(
					SalesOrderNamesEnum.ERROR_CODE_NODE_NAME.getName(),
					SalesOrderNamesEnum.ERROR_MSG_NODE_NAME.getName());
			throw new BusinessException(
					soapErrorHeader.getErrorCode() != null ? soapErrorHeader.getErrorCode().intValue() : 0,
					soapErrorHeader.getErrorMessage() != null ? soapErrorHeader.getErrorMessage()
							: "Invalid backend response");
		}

		SalesOrderResponseDto responseDto = createSalesOrderResponseDto(createSalesOrderVBMResponseType);

		log.info("SalesOrder DAO finished with {} status", SalesOrderNamesEnum.CREATE_ORDER_SUCCESS_STATUS.getName());

		return responseDto;
	}

	private SalesOrderResponseDto createSalesOrderResponseDto(CreateSalesOrderVBMResponseType response) {
		SalesOrderResponseDto responseDto = new SalesOrderResponseDto();
		for (IDType id : response.getSalesOrderVBO().getIDs().getID()) {
			if (id.getSchemeName()
					.equalsIgnoreCase(SalesOrderNamesEnum.CREATE_ORDER_ORDER_NUMBER_SCHEME_NAME.getName())) {
				responseDto.setOrderNumber(id.getValue());
				break;
			}
		}
		responseDto.setStatus(response.getSalesOrderVBO().getStatus().getValue());
		if (response.getSalesOrderVBO().getCategories() != null
				&& response.getSalesOrderVBO().getCategories().getCategory() != null
				&& response.getSalesOrderVBO().getCategories().getCategory().get(0) != null)
			responseDto.setCategory(response.getSalesOrderVBO().getCategories().getCategory().get(0).getValue());

		if (response.getSalesOrderVBO().getParts() != null
				&& response.getSalesOrderVBO().getParts().getLineItems() != null
				&& response.getSalesOrderVBO().getParts().getLineItems().getLineItem() != null
				&& response.getSalesOrderVBO().getParts().getLineItems().getLineItem().get(0) != null
				&& response.getSalesOrderVBO().getParts().getLineItems().getLineItem().get(0).getSubscription() != null
				&& response.getSalesOrderVBO().getParts().getLineItems().getLineItem().get(0).getSubscription()
						.getIDs() != null
				&& response.getSalesOrderVBO().getParts().getLineItems().getLineItem().get(0).getSubscription().getIDs()
						.getID() != null) {

			for (IDType id : response.getSalesOrderVBO().getParts().getLineItems().getLineItem().get(0)
					.getSubscription().getIDs().getID()) {
				if (id.getSchemeName().equalsIgnoreCase(SalesOrderNamesEnum.CREATE_ORDER_MSISDN.getName())) {
					responseDto.setMsisdn(id.getValue());
					break;
				}
			}
		}
		return responseDto;
	}

	@Override
	// @PreAuthorize("@userContextService.isValidMsisdnAsset(#cli) or
	// @userContextService.isValidFixedAsset(#cli)")
	public AddonOrdersDto getAddonOrdersByCli(String cli, String lang) throws BusinessException {
		return getAddonOrders(cli, null, lang);
	}

	@Override
	public AddonOrdersDto getAddonOrdersByOrderId(String salesOrderId, String lang) throws BusinessException {
		return getAddonOrders(null, salesOrderId, lang);
	}

	private AddonOrdersDto getAddonOrders(String cli, String salesOrderId, String lang) throws BusinessException {

		GetSalesOrderListVBMResponseType getSalesOrderListVBMResponseType = salesOrderDao
				.getSalesOrderList(createGetSalesOrderListVBMRequestType(cli, salesOrderId));

		if (validGetSalesOrderListVBMResponseType(getSalesOrderListVBMResponseType)) {

			int ordersListSize = getSalesOrderListVBMResponseType.getSalesOrderVBO().size();

			List<Order> orders = new ArrayList<>(ordersListSize);

			if (ordersListSize > 1) {

				getSalesOrderListVBMResponseType.getSalesOrderVBO().forEach(salesOrderVBOType -> {
					Order order = handleEverySalesOrderVBOType(salesOrderVBOType, lang);
					if (order != null)
						orders.add(order);
				});

			} else {

				SalesOrderVBOType salesOrderVBOType = getSalesOrderListVBMResponseType.getSalesOrderVBO().get(0);

				Order order = handleEverySalesOrderVBOType(salesOrderVBOType, lang);
				if (order != null) {
					orders.add(order);
				}
			}

			if (orders.size() == 0) {
				throw new BusinessException("No Order details available", HttpStatus.BAD_REQUEST);
			}
			return getAddonsOrdersDtoFromOrdersList(orders);
		} else {
			boolean businessError = true;
			SoapErrorHeader soapErrorHeader = soapInterceptor.getSoapErrorHeader(
					SalesOrderNamesEnum.ERROR_CODE_NODE_NAME.getName(),
					SalesOrderNamesEnum.ERROR_MSG_NODE_NAME.getName());
			if (soapErrorHeader == null || soapErrorHeader.getCategory() == null
					|| !soapErrorHeader.getCategory().equalsIgnoreCase("business"))
				businessError = false;

			if (soapErrorHeader != null && soapErrorHeader.getErrorCode() != null)
				throw new BusinessException(soapErrorHeader.getErrorCode().intValue(),
						soapErrorHeader.getErrorMessage(),
						businessError ? HttpStatus.BAD_REQUEST : HttpStatus.INTERNAL_SERVER_ERROR);

			else if (soapErrorHeader != null && soapErrorHeader.getTextErrorCode() != null
					&& soapErrorHeader.getErrorMessage() != null)
				throw new BusinessException(
						soapErrorHeader.getTextErrorCode() + " : " + soapErrorHeader.getErrorMessage(),
						businessError ? HttpStatus.BAD_REQUEST : HttpStatus.INTERNAL_SERVER_ERROR);

			else if (soapErrorHeader != null && soapErrorHeader.getErrorMessage() != null)
				throw new BusinessException(soapErrorHeader.getErrorMessage(),
						businessError ? HttpStatus.BAD_REQUEST : HttpStatus.INTERNAL_SERVER_ERROR);
			else
				throw new BusinessException("Invalid backend response",
						businessError ? HttpStatus.BAD_REQUEST : HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

	private boolean validGetSalesOrderListVBMResponseType(
			GetSalesOrderListVBMResponseType getSalesOrderListVBMResponseType) {

		if (getSalesOrderListVBMResponseType == null || getSalesOrderListVBMResponseType.getSalesOrderVBO() == null
				|| getSalesOrderListVBMResponseType.getSalesOrderVBO().isEmpty()
				|| getSalesOrderListVBMResponseType.getSalesOrderVBO().get(0) == null
				|| (getSalesOrderListVBMResponseType.getSalesOrderVBO().get(0).getIDs() == null
						&& getSalesOrderListVBMResponseType.getSalesOrderVBO().get(0).getDetails() == null
						&& getSalesOrderListVBMResponseType.getSalesOrderVBO().get(0).getParts() == null)) {
			return false;
		}
		return true;
	}

	private Order handleEverySalesOrderVBOType(SalesOrderVBOType salesOrderVBOType, String lang) {

		NeededSalesOrderVBOType neededSalesOrderVBOType = new NeededSalesOrderVBOType();
		setSalesOrderVBOTypeAllNeededProps(salesOrderVBOType, neededSalesOrderVBOType);

		// find the order object in the CMS
		SalesOrderListConstants salesOrderListConstants = SalesOrderListConstants
				.getSalesOrderListConstants(neededSalesOrderVBOType.getStatus());

		CMSAddon cmsAddon = getMainKStatusCmsAddon(neededSalesOrderVBOType, salesOrderListConstants);

		List<PricePlan> pricePlans = null;
		if (neededSalesOrderVBOType.getSalesQuoteId() != null) {
			pricePlans = getPricePlanList(neededSalesOrderVBOType.getSalesQuoteId(), neededSalesOrderVBOType.getSpeed(),
					lang);
		}

		List<IpTv> ipTvs = null;
		if (neededSalesOrderVBOType.getIptvCodes() != null && !neededSalesOrderVBOType.getIptvCodes().isEmpty()) {
			ipTvs = getAllIpTvs(neededSalesOrderVBOType.getIptvCodes(), lang);
		}

		return makeOrderObjOutOfOrderVBOTypeAndCMSAddon(pricePlans, ipTvs, salesOrderVBOType, cmsAddon,
				salesOrderListConstants != null ? salesOrderListConstants.getValue()
						: neededSalesOrderVBOType.getStatus(),
				lang);
	}

	private CMSAddon getMainKStatusCmsAddon(NeededSalesOrderVBOType neededSalesOrderVBOType,
			SalesOrderListConstants salesOrderListConstants) {

		List<CMSAddon> addonOrders = null;

		CMSAddon cmsAddon = null;

		if (neededSalesOrderVBOType.getReasonCodeValue() != null
				&& !neededSalesOrderVBOType.getReasonCodeValue().trim().isEmpty()) {

			log.info("Before getting matched CMS Addons for AIOS code {} ",
					neededSalesOrderVBOType.getReasonCodeValue());
			addonOrders = cmsAddonsRepo.findByAiosCode(neededSalesOrderVBOType.getReasonCodeValue());

		} else if (neededSalesOrderVBOType.getStatus() != null
				&& !neededSalesOrderVBOType.getStatus().trim().isEmpty()) {
			if (salesOrderListConstants != null) {
				log.info("Before getting matched CMS Addons for Status {} ", salesOrderListConstants.getValue());
				addonOrders = cmsAddonsRepo.findByStatus(salesOrderListConstants.getValue());
			} else {
				log.error("WS status is non properly mapped", neededSalesOrderVBOType.getStatus());
			}
		}

		if (addonOrders != null && !addonOrders.isEmpty()) {

			if (addonOrders.size() > 1) {

				// find the proper order object in the retrieved list
				if (neededSalesOrderVBOType.getReasonCodeValue() != null && (neededSalesOrderVBOType.getStatus() != null
						|| neededSalesOrderVBOType.getSpeed() != null)) {

					if (salesOrderListConstants != null) {
						cmsAddon = filterCMSAddonByStatusOrSpeed(addonOrders, salesOrderListConstants.getValue(),
								neededSalesOrderVBOType.getSpeed());
					} else {
						cmsAddon = filterCMSAddonByStatusOrSpeed(addonOrders, neededSalesOrderVBOType.getStatus(),
								neededSalesOrderVBOType.getSpeed());
					}
				}

				addonOrders.forEach(addon -> log.info("Found Addon: {}", addon.toString()));
			} else {
				cmsAddon = addonOrders.get(0);
				log.info("Found Addon: {}", cmsAddon.toString());
			}

		} else {
			handleMissingCMSProperErrorMessage(cmsAddon, neededSalesOrderVBOType.getReasonCodeValue(),
					neededSalesOrderVBOType.getStatus(), neededSalesOrderVBOType.getSpeed());

		}
		return cmsAddon;
	}

	private List<PricePlan> getPricePlanList(String pricePlanAoisCode, String speed, String lang) {

		List<CMSAddon> pricePlanAddons = cmsAddonsRepo.findByAiosCodeAndSpeed(pricePlanAoisCode, speed);
		List<PricePlan> pricePlans = new ArrayList<PricePlan>(1);

		if (pricePlanAddons != null && !pricePlanAddons.isEmpty()) {
			CMSAddon pricePlanCMSAddon = pricePlanAddons.get(0);
			PricePlan pricePlan = new PricePlan();

			if (pricePlanCMSAddon.getSpeed() != null && !pricePlanCMSAddon.getSpeed().trim().isEmpty())
				pricePlan.setSpeed(pricePlanCMSAddon.getSpeed());

			if (pricePlanCMSAddon.getInternalTitle() != null && !pricePlanCMSAddon.getInternalTitle().trim().isEmpty())
				pricePlan.setTitle(pricePlanCMSAddon.getInternalTitle());

			if (lang.equalsIgnoreCase("en"))
				pricePlan.setDescription(pricePlanCMSAddon.getEnDesc());
			else if (lang.equalsIgnoreCase("el"))
				pricePlan.setDescription(pricePlanCMSAddon.getGreekDesc());

			pricePlans.add(pricePlan);

		}

		return pricePlans;
	}

	private List<IpTv> getAllIpTvs(List<String> iptvAiosCodes, String lang) {

		List<CMSAddon> cmsAddons = cmsAddonsRepo.findByAiosCodeIn(iptvAiosCodes);

		List<IpTv> iptvs = new ArrayList<>(1);

		if (cmsAddons != null && !cmsAddons.isEmpty()) {
			cmsAddons.stream().forEach(addon -> {
				IpTv ipTv = new IpTv();
				if (addon.getColor() != null && !addon.getColor().trim().isEmpty())
					ipTv.setColor(addon.getColor());

				if (addon.getStb() != null && !addon.getStb().trim().isEmpty())
					ipTv.setStb(addon.getStb());

				if (lang.equalsIgnoreCase("en"))
					ipTv.setMessage(addon.getEnDesc());
				else if (lang.equalsIgnoreCase("el"))
					ipTv.setMessage(addon.getGreekDesc());

				iptvs.add(ipTv);
			});
		}

		return iptvs;
	}

	private void setSalesOrderVBOTypeAllNeededProps(SalesOrderVBOType salesOrderVBOType,
			NeededSalesOrderVBOType neededSalesOrderVBOType) {

		if (salesOrderVBOType.getDetails() != null && salesOrderVBOType.getDetails().getStatusReason() != null
				&& salesOrderVBOType.getDetails().getStatusReason().getReasonCode() != null
				&& salesOrderVBOType.getDetails().getStatusReason().getReasonCode().getListName() != null) {

			neededSalesOrderVBOType.setReasonCodeListName(
					salesOrderVBOType.getDetails().getStatusReason().getReasonCode().getListName());
			neededSalesOrderVBOType
					.setReasonCodeValue(salesOrderVBOType.getDetails().getStatusReason().getReasonCode().getValue());
		}

		if (salesOrderVBOType.getStatus() != null) {
			log.info("============= salesOrderVBOType.getStatus().getValue() = "
					+ salesOrderVBOType.getStatus().getValue());
			neededSalesOrderVBOType.setStatus(salesOrderVBOType.getStatus().getValue());
		}

		if (salesOrderVBOType.getParts() != null) {

			// setting the price plan AIOS code to be matched with the CMS later
			if (salesOrderVBOType.getParts().getSalesQuote() != null
					&& salesOrderVBOType.getParts().getSalesQuote().getIDs() != null
					&& salesOrderVBOType.getParts().getSalesQuote().getIDs().getID() != null
					&& !salesOrderVBOType.getParts().getSalesQuote().getIDs().getID().isEmpty()) {

				Optional<IDType> optionalIdType = salesOrderVBOType.getParts().getSalesQuote().getIDs().getID().stream()
						.filter(id -> id.getSchemeName()
								.equalsIgnoreCase(SalesOrderListConstants.SALES_QUOTE_ID_PRICE_PLAN.getValue()))
						.findFirst();

				if (optionalIdType != null && optionalIdType.isPresent()) {
					neededSalesOrderVBOType.setSalesQuoteId(optionalIdType.get().getValue());
				}
			}

			// Getting the price plan speed and AIOS codes for IPTVS
			if (salesOrderVBOType.getParts().getLineItems().getLineItem() != null
					&& !salesOrderVBOType.getParts().getLineItems().getLineItem().isEmpty()) {

				salesOrderVBOType.getParts().getLineItems().getLineItem().stream().forEach(lineItem -> {
					if (lineItem.getProductOfferings() != null
							&& lineItem.getProductOfferings().getProductOffering() != null) {
						lineItem.getProductOfferings().getProductOffering().stream().forEach(po -> {
							if (po.getStatus() != null && po.getStatus().getListName() != null) {
								if (po.getStatus().getListName().equalsIgnoreCase(
										SalesOrderListConstants.PRODUCT_OFFERING_STATUS_TV.getValue())) {
									if (neededSalesOrderVBOType.getIptvCodes() == null) {
										neededSalesOrderVBOType.setIptvCodes(new ArrayList<String>());
									}
									neededSalesOrderVBOType.getIptvCodes().add(po.getStatus().getValue());
								} else if (po.getStatus().getListName().equalsIgnoreCase(
										SalesOrderListConstants.PRODUCT_OFFERING_STATUS_SPEED.getValue())) {
									neededSalesOrderVBOType.setSpeed(po.getStatus().getValue());
								}
							}
						});
					}
				});
			}
		}
	}

	private GetSalesOrderListVBMRequestType createGetSalesOrderListVBMRequestType(String cli, String salesOrderId) {

		GetSalesOrderListVBMRequestType getSalesOrderListVBMRequestType = new GetSalesOrderListVBMRequestType();

		TextType queryIdTextType = new TextType();

		ValueExpressionType valueExpressionType = new ValueExpressionType();
		if (cli != null) {
			queryIdTextType.setValue(cli);
			valueExpressionType.setPath(SalesOrderNamesEnum.CLI_PATH_GET_ORDER_LIST.getName());
		} else {
			queryIdTextType.setValue(salesOrderId);
			valueExpressionType.setPath(SalesOrderNamesEnum.SALES_ORDER_NUM_PATH_GET_ORDER_LIST.getName());
		}

		QueryOperatorCodeType queryOperatorCodeType = QueryOperatorCodeType.EQUALS;
		valueExpressionType.setQueryOperatorCode(queryOperatorCodeType);
		valueExpressionType.getValue().add(queryIdTextType);

		QueryExpression queryExpression = new QueryExpression();
		queryExpression.getValueExpression().add(valueExpressionType);

		Criteria criteria = new Criteria();
		criteria.setQueryExpression(queryExpression);

		getSalesOrderListVBMRequestType.setCriteria(criteria);

		return getSalesOrderListVBMRequestType;
	}

	private CMSAddon filterCMSAddonByStatusOrSpeed(List<CMSAddon> addonOrders, String status, String speed) {

		CMSAddon matchedCMSAddon = null;

		Optional<CMSAddon> cmsAddonOptional = null;
		if (speed != null && status != null) {

			cmsAddonOptional = addonOrders.stream()
					.filter(cmsAddon -> cmsAddon.getStatus() != null && cmsAddon.getStatus().equalsIgnoreCase(status)
							&& cmsAddon.getSpeed() != null && cmsAddon.getSpeed().equalsIgnoreCase(speed))
					.findFirst();
		}

		if ((cmsAddonOptional == null || !cmsAddonOptional.isPresent()) && status != null) {

			cmsAddonOptional = addonOrders.stream()
					.filter(cmsAddon -> cmsAddon.getStatus() != null && cmsAddon.getStatus().equalsIgnoreCase(status))
					.findFirst();
		}

		if ((cmsAddonOptional == null || !cmsAddonOptional.isPresent()) && speed != null) {

			cmsAddonOptional = addonOrders.stream()
					.filter(cmsAddon -> cmsAddon.getSpeed() != null && cmsAddon.getSpeed().equalsIgnoreCase(speed))
					.findFirst();
		}

		if (cmsAddonOptional != null && cmsAddonOptional.isPresent()) {
			matchedCMSAddon = cmsAddonOptional.get();
		}

		return matchedCMSAddon;
	}

	private Order makeOrderObjOutOfOrderVBOTypeAndCMSAddon(List<PricePlan> pricePlans, List<IpTv> ipTvs,
			SalesOrderVBOType salesOrderVBOType, CMSAddon cmsAddon, String status, String lang) {

		Order order = new Order();
		if (ipTvs == null) {
			ipTvs = new ArrayList<IpTv>(0);
		}
		if (pricePlans == null) {
			pricePlans = new ArrayList<PricePlan>(0);
		}
		order.setIpTvs(ipTvs);
		order.setPricePlans(pricePlans);

		if (status != null && !status.trim().isEmpty())
			order.setStatus(status);

		if (salesOrderVBOType.getIDs() != null && salesOrderVBOType.getIDs().getID() != null
				&& !salesOrderVBOType.getIDs().getID().isEmpty()) {

			Optional<IDType> optionalIdType = salesOrderVBOType.getIDs().getID().stream()
					.filter(id -> id.getSchemeName()
							.equalsIgnoreCase(SalesOrderNamesEnum.SALES_ORDER_ID_PATH_GET_ORDER_LIST.getName()))
					.findFirst();
			if (optionalIdType.isPresent()) {
				order.setId(optionalIdType.get().getValue());
			}
		}

		if (salesOrderVBOType.getParts() != null && salesOrderVBOType.getParts().getLineItems() != null
				&& salesOrderVBOType.getParts().getLineItems().getLineItem() != null
				&& !salesOrderVBOType.getParts().getLineItems().getLineItem().isEmpty()) {

			Optional<LineItemType> optionalLineItemType = salesOrderVBOType.getParts().getLineItems().getLineItem()
					.stream().filter(lineItem -> lineItem.getScheduledDeliveryDateTime() != null).findFirst();

			if (optionalLineItemType.isPresent()) {

				SimpleDateFormat backendSDF = new SimpleDateFormat(BACKEND_DATE_TIME_FORMAT);
				SimpleDateFormat apixSDF = new SimpleDateFormat(APIX_DATE_TIME_ISO_8601_FORMAT);
				try {

					String scheuledDeliveryDate = optionalLineItemType.get().getScheduledDeliveryDateTime().getValue();
					if (scheuledDeliveryDate != null) {
						Date date = backendSDF.parse(scheuledDeliveryDate);
						order.setEnableDate(apixSDF.format(date));
					}
				} catch (ParseException e) {
					log.error("Invalid scheduled delivery date {}", e.getMessage());
				}

			}

		}

		if (order.getStatus() == null && order.getId() == null && cmsAddon == null) {
			return null;
		}

		addStausCMSAddonDataToOrder(cmsAddon, order, lang);

		return order;

	}

	private void addStausCMSAddonDataToOrder(CMSAddon statusCmsAddon, Order order, String lang) {

		if (statusCmsAddon != null) {

			if (statusCmsAddon.getColor() != null && !statusCmsAddon.getColor().isEmpty())
				order.setColor(statusCmsAddon.getColor());

			if (statusCmsAddon.getPercentage() != null && !statusCmsAddon.getPercentage().trim().isEmpty()
					&& StringUtils.isNumeric(statusCmsAddon.getPercentage()))
				order.setPercentage(Double.parseDouble(statusCmsAddon.getPercentage()));

			if (statusCmsAddon.getStep() != null && !statusCmsAddon.getStep().trim().isEmpty()
					&& StringUtils.isNumeric(statusCmsAddon.getStep()))
				order.setStep(Double.parseDouble(statusCmsAddon.getStep()));

			if (statusCmsAddon.getCpe() != null && !statusCmsAddon.getCpe().trim().isEmpty()) {
				order.setCpe(statusCmsAddon.getCpe());
			}
			if (lang.equalsIgnoreCase("en")) {
				order.setMessage(statusCmsAddon.getEnDesc());
			} else if (lang.equalsIgnoreCase("el")) {
				order.setMessage(statusCmsAddon.getGreekDesc());
			}
		}
	}

	private AddonOrdersDto getAddonsOrdersDtoFromOrdersList(List<Order> orders) {

		AddonOrdersDto addonOrdersDto = new AddonOrdersDto();
		addonOrdersDto.setOrders(orders);
		addonOrdersDto.setOrdersCount(orders.size());

		return addonOrdersDto;
	}

	private void handleMissingCMSProperErrorMessage(CMSAddon cmsAddon, String aiosCode, String status, String speed) {
		if (cmsAddon == null) {
			if (aiosCode != null && status != null) {
				log.error("No Order found in CMS with AIOS code {} and status {}", aiosCode, status);
				// throw new BusinessException(500,
				// "No Order found in CMS with AIOS code " + aiosCode +
				// " and status " + status,
				// HttpStatus.INTERNAL_SERVER_ERROR);
			}
			if (aiosCode != null && speed != null) {
				log.error("No Order found in CMS with AIOS code {} and speed {}", aiosCode, speed);
				// throw new BusinessException(500,
				// "No Order found in CMS with AIOS code " + aiosCode +
				// " and speed " + speed,
				// HttpStatus.INTERNAL_SERVER_ERROR);
			} else if (aiosCode != null) {
				log.error("No Order found in CMS with AIOS code {} ", aiosCode);
				// throw new BusinessException(500,
				// "No Order found in CMS with AIOS code " + aiosCode,
				// HttpStatus.INTERNAL_SERVER_ERROR);
			} else if (status != null) {
				log.error("No Order found in CMS with status {}", status);
				// throw new BusinessException(500,
				// "No Order found in CMS with status " + status,
				// HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	}

	private CreateSalesOrderVBMRequestType getCreateSalesOrderVBMRequestTypeFromSalesOrderDto(
			SalesOrderDto salesOrderDto) {

		log.info("Creating backend request of SalesOrderDto");

		CodeType orderType = new CodeType();
		orderType.setValue(salesOrderDto.getOrderType());

		Categories salesOrderVBOCategories = new Categories();

		Category subTypeCategory = new Category();
		subTypeCategory.setListName(SalesOrderNamesEnum.CREATE_ORDER_ORDER_SUB_TYPE.getName());
		subTypeCategory.setValue(salesOrderDto.getOrderSubType());

		salesOrderVBOCategories.getCategory().add(subTypeCategory);

		TextType versionTextType = new TextType();
		versionTextType.setValue(salesOrderDto.getVersion() == null ? SalesOrderNamesEnum.CREATE_ORDER_ASYNC.getName()
				: salesOrderDto.getVersion());

		CodeType channelType = new CodeType();
		channelType.setValue(salesOrderDto.getChannelType() == null
				? SalesOrderNamesEnum.CREATE_ORDER_ELECTRONIC_SUBMISSION.getName()
				: salesOrderDto.getChannelType());
		TextType channelName = new TextType();
		channelName.setValue(salesOrderDto.getChannelName());

		ChannelType channel = new ChannelType();
		channel.setName(channelName);
		channel.setType(channelType);

		LineItems lineItems = new LineItems();

		addBundlesToLineItem(salesOrderDto.getAddons(), lineItems);

		SalesOrderPartsType salesOrderPartsType = new SalesOrderPartsType();
		salesOrderPartsType.setChannel(channel);
		salesOrderPartsType.setLineItems(lineItems);

		SalesOrderVBOType salesOrderVBOType = new SalesOrderVBOType();
		salesOrderVBOType.setType(orderType);
		salesOrderVBOType.setCategories(salesOrderVBOCategories);
		salesOrderVBOType.setVersion(versionTextType);
		salesOrderVBOType.setParts(salesOrderPartsType);

		CreateSalesOrderVBMRequestType createSalesOrderVBMRequestType = new CreateSalesOrderVBMRequestType();
		createSalesOrderVBMRequestType.setSalesOrderVBO(salesOrderVBOType);

		return createSalesOrderVBMRequestType;

	}

	private void addBundlesToLineItem(List<Addon> bundles, LineItems lineItems) {

		bundles.forEach(addon -> {
			TextType desc = new TextType();
			desc.setValue(addon.getDescription() == null || addon.getDescription() == null
					? SalesOrderNamesEnum.CREATE_ORDER_CONNECTION.getName()
					: addon.getDescription());
			NumericType priority = new NumericType();
			priority.setValue(addon.getPriority() == null ? "1" : String.valueOf(addon.getPriority().intValue()));

			IDType msisdn = new IDType();
			msisdn.setSchemeName(SalesOrderNamesEnum.CREATE_ORDER_MSISDN.getName());
			msisdn.setValue(addon.getMsisdn());

			IDs ids = new IDs();
			ids.getID().add(msisdn);
			SubscriptionType subscriptionType = new SubscriptionType();
			subscriptionType.setIDs(ids);

			if (addon.getSubscriptionAction() != null)
				subscriptionType.setActionCode(addon.getSubscriptionAction().getActionCodeType());

			ProductOfferings productOfferings = new ProductOfferings();
			addProductOffersToLineItem(addon.getProductOffers(), productOfferings);

			OneOffPrices oneOffPrices = new OneOffPrices();
			addOneOffPricesToLineItem(addon.getOneOffPrices(), oneOffPrices);

			RecurringPrices recurringPrices = new RecurringPrices();
			addRecurringPricesToLineItem(addon.getRecurringPrices(), recurringPrices);

			LineItemType lineItem = new LineItemType();
			lineItem.setDesc(desc);
			lineItem.setPriority(priority);
			lineItem.setSubscription(subscriptionType);
			lineItem.setProductOfferings(productOfferings);
			lineItem.setOneOffPrices(oneOffPrices);
			lineItem.setRecurringPrices(recurringPrices);

			log.info("============ oneOffPrices: lineItem.oneOffPrices = " + lineItem.getOneOffPrices() != null
					? lineItem.getOneOffPrices().toString()
					: "null");

			Categories lineItemCategories = new Categories();

			if (addon.getCtegoryTarrifPlanl() != null) {
				Category tariffPlanCategory = new Category();
				tariffPlanCategory.setListName(SalesOrderNamesEnum.CATEGORY_TARRIFPLAN_LISTNAME.getName());
				tariffPlanCategory.setValue(addon.getCtegoryTarrifPlanl());
				lineItemCategories.getCategory().add(tariffPlanCategory);
			}
			if (addon.getCtegoryMonthDuration() != null) {
				Category monthDurationCategory = new Category();
				monthDurationCategory.setListName(SalesOrderNamesEnum.CATEGORY_MONTHDURATION_LISTNAME.getName());
				monthDurationCategory.setValue(addon.getCtegoryMonthDuration());
				lineItemCategories.getCategory().add(monthDurationCategory);
			}
			lineItem.setCategories(lineItemCategories);

			lineItems.getLineItem().add(lineItem);
		});

	}

	private void addRecurringPricesToLineItem(List<RecurringPricesDto> recurringPricesDto,
			RecurringPrices recurringPrices) {
		if (recurringPricesDto != null) {
			log.info("============ recurringPrices : recurringPricesDto not null");
			recurringPricesDto.forEach(recurringPriceDto -> {
				RecurringPriceType recurringPriceType = new RecurringPriceType();

				recurringPriceType
						.setID(createIdType(recurringPriceDto.getIdSchemeName(), recurringPriceDto.getIdValue()));
				recurringPriceType.setActionCode(recurringPriceDto.getAction().getActionCodeType());
				recurringPriceType
						.setDiscountPercent(new BigDecimal(recurringPriceDto.getDiscountPercent().intValue()));

				PriceFrequencyType priceFrequencyType = new PriceFrequencyType();

				QuantityType frequencyQuantityType = new QuantityType();
				frequencyQuantityType
						.setValue(new BigDecimal(recurringPriceDto.getFrequencyIntervalQuantity().intValue()));

				priceFrequencyType.setIntervalsQuantity(frequencyQuantityType);

				recurringPriceType.setFrequency(priceFrequencyType);

				CharacteristicsType characteristicsType = new CharacteristicsType();

				createAndAddCharachtarestic(null, null, characteristicsType,
						recurringPriceDto.getCharacteristicsValueDescription());

				recurringPriceType.setCharacteristics(characteristicsType);

				recurringPrices.getRecurringPrice().add(recurringPriceType);

			});
		}
	}

	private IDType createIdType(String IdSchemeName, String idValue) {
		IDType id = new IDType();
		id.setSchemeName(IdSchemeName != null ? IdSchemeName : null);
		id.setValue(idValue != null ? idValue : null);
		return id;
	}

	private void addOneOffPricesToLineItem(List<OneOffPriceDto> oneOffPricesDto, OneOffPrices oneOffPrices) {
		log.info("============ oneOffPrices: oneOffPricesDto" + oneOffPricesDto);
		if (oneOffPricesDto != null) {
			log.info("============ oneOffPrices: oneOffPricesDto not null");
			oneOffPricesDto.forEach(oneOffDto -> {
				log.info("============ oneOffPrices: oneOffPriceDto = " + oneOffDto);
				OneOffPriceType oneOffPriceType = new OneOffPriceType();

				IDType oneOffPriceId = new IDType();
				oneOffPriceId.setSchemeName(oneOffDto.getIdSchemeName());
				oneOffPriceId.setValue(oneOffDto.getIdValue());

				oneOffPriceType.setID(oneOffPriceId);

				oneOffPriceType.setActionCode(oneOffDto.getAction().getActionCodeType());

				oneOffPriceType.setDiscountPercent(new BigDecimal(oneOffDto.getDiscountPercent().intValue()));

				CharacteristicsType characteristicsType = new CharacteristicsType();

//				if (oneOffDto.getCharacteristicDescription() != null) {
				createAndAddCharachtarestic(oneOffDto.getCharacteristicDescription(),
						SalesOrderNamesEnum.CHARACTARISTIC_NAME_DESCRIPTION.getName(), characteristicsType, null);
//				}
//				if (oneOffDto.getCharacteristicMonthDuration() != null) {
				createAndAddCharachtarestic(oneOffDto.getCharacteristicMonthDuration(),
						SalesOrderNamesEnum.CHARACTARISTIC_NAME_MONTH_DURATION.getName(), characteristicsType, null);
//				}
				oneOffPriceType.setCharacteristics(characteristicsType);

				oneOffPrices.getOneOffPrice().add(oneOffPriceType);
			});
		}
		log.info("============ oneOffPrices: oneOffPrices = " + oneOffPrices);
	}

	private void createAndAddCharachtarestic(String characteristicValue, String characteristicName,
			CharacteristicsType characteristicsType, String characteristicDescription) {

		CharacteristicsValue characteristicsValue = new CharacteristicsValue();
		characteristicsValue.setCharacteristicName(characteristicName != null ? characteristicName : null);

		TextType charNameTextType = new TextType();
		charNameTextType.setValue(characteristicValue != null ? characteristicValue : null);

		characteristicsValue.setValue(charNameTextType);

		characteristicsValue.setDescription(createTextType(characteristicDescription));
		characteristicsType.getCharacteristicsValue().add(characteristicsValue);
	}

	private TextType createTextType(String textValue) {
		TextType textType = new TextType();
		textType.setValue(textValue != null ? textValue : null);
		return textType;
	}

	private void addProductOffersToLineItem(List<ProductOffer> productOffers, ProductOfferings productOfferings) {

		productOffers.forEach(productOffer -> {
			ActionCodeType actionCodeType = productOffer.getAction().getActionCodeType();
			TextType productOfferName = new TextType();

			IDType integrationId = new IDType();

			integrationId.setSchemeName(SalesOrderNamesEnum.CREATE_ORDER_ASSET_INTEGRATION_ID.getName());
			integrationId.setValue(productOffer.getIntegrationId());

			IDs productOfferIds = new IDs();
			productOfferIds.getID().add(integrationId);

			Categories productOfferCategories = new Categories();
			if (productOffer.getNewThreshold() != null) {
				Category productOfferCategory = new Category();
				productOfferCategory
						.setListName(SalesOrderNamesEnum.UPDATE_ORDER_CATEGORY_LIST_NAME_NEW_THRESHOLD.getName());
				productOfferCategory.setValue(productOffer.getNewThreshold() + "");
				productOfferCategories.getCategory().add(productOfferCategory);
			}
			if (productOffer.getOldThreshold() != null) {
				Category productOfferCategory = new Category();
				productOfferCategory
						.setListName(SalesOrderNamesEnum.UPDATE_ORDER_CATEGORY_LIST_NAME_OLD_THRESHOLD.getName());
				productOfferCategory.setValue(productOffer.getOldThreshold() + "");
				productOfferCategories.getCategory().add(productOfferCategory);
			}

			Category productOfferCategory = new Category();
			productOfferCategory.setListName(SalesOrderNamesEnum.CREATE_ORDER_CUSTOMER_BARRING_REASON.getName());

			productOfferName.setValue(productOffer.getName());
			ProductOfferingType productOfferingType = new ProductOfferingType();
			productOfferingType.setActionCode(actionCodeType);
			productOfferingType.setName(productOfferName);

			productOfferingType.setCategories(productOfferCategories);
			productOfferingType.setIDs(productOfferIds);

			productOfferings.getProductOffering().add(productOfferingType);
		});

	}
}