package vis.greece.makemyplan.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vis.core.errorhandling.annotations.AcceptLang;
import com.vis.core.errorhandling.exception.BusinessException;

import vis.greece.makemyplan.dto.sales.AddonOrdersDto;
import vis.greece.makemyplan.dto.sales.SalesOrderDto;
import vis.greece.makemyplan.dto.sales.SalesOrderResponseDto;
import vis.greece.makemyplan.service.ISalesOrderService;

@RestController
@RequestMapping("/gr/v1/sales")
@Validated
public class SalesOrderController {

	@Autowired
	private ISalesOrderService salesOrderService;

	@PostMapping(value = "/order", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SalesOrderResponseDto> manipulateBundles(@Valid @RequestBody SalesOrderDto salesOrderDto,
			@RequestHeader(name = "Destination-System", required = false) String destinationSys)
			throws BusinessException {

		SalesOrderResponseDto responseDto = salesOrderService.manipulateBundles(salesOrderDto,
				getAllMSISDNsFromRequest(salesOrderDto), destinationSys);

		return new ResponseEntity<SalesOrderResponseDto>(responseDto, HttpStatus.CREATED);
	}

	@GetMapping(value = "/order", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<AddonOrdersDto> getSalesOrders(
			@AcceptLang(locales = { "en",
					"el" }) @NotNull @NotEmpty @RequestHeader(value = "Accept-Language") String acceptLanguage,
			@RequestParam(value = "orderId", required = false) String orderId,
			@RequestParam(value = "cli", required = false) String cli) throws BusinessException {

		if (cli == null && orderId == null) {

			throw new BusinessException(400, "Request should include CLI or order id", HttpStatus.BAD_REQUEST);

		} else if (cli != null) {

			return new ResponseEntity<>(salesOrderService.getAddonOrdersByCli(cli, acceptLanguage), HttpStatus.OK);

		} else if (orderId != null) {

			return new ResponseEntity<>(salesOrderService.getAddonOrdersByOrderId(orderId, acceptLanguage),
					HttpStatus.OK);

		} else {

			throw new BusinessException(400, "Request should include only one query param, either CLI or order id",
					HttpStatus.BAD_REQUEST);
		}

	}

	private List<String> getAllMSISDNsFromRequest(SalesOrderDto salesOrderDto) {

		return salesOrderDto.getAddons().stream().map(addon -> addon.getMsisdn()).collect(Collectors.toList());
	}
}
