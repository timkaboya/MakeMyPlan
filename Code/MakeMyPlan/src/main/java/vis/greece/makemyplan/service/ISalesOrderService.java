package vis.greece.makemyplan.service;

import java.util.List;

import com.vis.core.errorhandling.exception.BusinessException;

import vis.greece.makemyplan.dto.sales.AddonOrdersDto;
import vis.greece.makemyplan.dto.sales.SalesOrderDto;
import vis.greece.makemyplan.dto.sales.SalesOrderResponseDto;
public interface ISalesOrderService {

	public SalesOrderResponseDto manipulateBundles(SalesOrderDto salesOrderDto, List<String> assets, String destSys) throws BusinessException;
	
	public AddonOrdersDto getAddonOrdersByCli(String cli,String lang) throws BusinessException;
	public AddonOrdersDto getAddonOrdersByOrderId(String salesOrderId,String lang) throws BusinessException;

}
