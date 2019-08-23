package vis.greece.makemyplan.service;

import com.vis.core.errorhandling.exception.BusinessException;

import vis.greece.makemyplan.dto.red.RedRequestDto;
import vis.greece.makemyplan.dto.red.RedResponseDto;

public interface RedFamilyService {

	public RedResponseDto getRedFamilyResponse(RedRequestDto requestDto) throws BusinessException;

}
