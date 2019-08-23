package vis.greece.makemyplan.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import com.vis.core.errorhandling.exception.BusinessException;

import vis.greece.makemyplan.dto.red.RedAddonDto;
import vis.greece.makemyplan.dto.red.RedHouseholdMemberDto;
import vis.greece.makemyplan.dto.red.RedRequestDto;
import vis.greece.makemyplan.dto.red.RedResponseDto;
import vis.greece.makemyplan.model.red.Request;
import vis.greece.makemyplan.model.red.Response;
import vis.greece.makemyplan.service.RedFamilyService;
import vis.greece.makemyplan.utils.RedFamilyDao;

@Service
public class RedFamilyServiceImpl implements RedFamilyService {

	@Autowired
	private RedFamilyDao redFamiltDao;

	private static String SUCCES_RESPONSE_CODE = "OK";
	private static String NOT_EXIST_RESPONSE_CODE = "MSISDN_NEXISTS";

	@Override
	@PreAuthorize("@userContextService.isValidMsisdnAsset(#requestDto.parentMSISDN) or @userContextService.isValidFixedAsset(#requestDto.parentMSISDN)")
	public RedResponseDto getRedFamilyResponse(RedRequestDto requestDto) throws BusinessException {
		RedResponseDto responseDto = createResponseDtoFromResponse(
				redFamiltDao.getRedFamilyResonse(createRequestFromDto(requestDto)));
		if (responseDto.getResponseCode() != null
				&& !responseDto.getResponseCode().equalsIgnoreCase(SUCCES_RESPONSE_CODE)) {
			BusinessException be = new BusinessException(
					responseDto.getResponseMessage() + " - " + responseDto.getResponseCode());
			if (responseDto.getResponseCode().equalsIgnoreCase(NOT_EXIST_RESPONSE_CODE)) {
				be.setHttpStatus(HttpStatus.NOT_FOUND);
			}
			throw be;
		}
		return responseDto;
	}

	private Request createRequestFromDto(RedRequestDto requestDto) {
		Request request = new Request();
		BeanUtils.copyProperties(requestDto, request);
		return request;
	}

	private RedResponseDto createResponseDtoFromResponse(Response response) {
		RedResponseDto responseDto = new RedResponseDto();
		if (response != null) {
			responseDto.setResponseCode(response.getResponseCode());
			responseDto.setResponseMessage(response.getResponseMessage());

			if (response.getListOfHouseHoldMembers() != null
					&& !response.getListOfHouseHoldMembers().getHouseholdMember().isEmpty()) {

				List<RedHouseholdMemberDto> houseHoldMembers = new ArrayList<RedHouseholdMemberDto>(1);
				response.getListOfHouseHoldMembers().getHouseholdMember().stream().forEach(houseHold -> {
					RedHouseholdMemberDto memberDto = new RedHouseholdMemberDto();
					memberDto.setTariffPlan(houseHold.getTariffPlan());
					memberDto.setMemberMSISDN(houseHold.getMemberMSISDN());

					if (houseHold.getThresholdAddOnDetails() != null) {

						RedAddonDto addonDto = new RedAddonDto();
						addonDto.setAddOnAttributeName(houseHold.getThresholdAddOnDetails().getAddOnAttributeName());
						addonDto.setAddOnAttributeValue(houseHold.getThresholdAddOnDetails().getAddOnAttributeValue());
						addonDto.setAddOnName(houseHold.getThresholdAddOnDetails().getAddOnName());
						memberDto.setAddon(addonDto);
					}

					houseHoldMembers.add(memberDto);
				});
				responseDto.setHouseHoldMembers(houseHoldMembers);
			}
		}
		return responseDto;
	}
}
