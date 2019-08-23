//package vis.greece.makemyplan.controller;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Unmarshaller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.vis.core.errorhandling.exception.BusinessException;
//
//import vis.greece.makemyplan.dto.CMS_Obj;
//import vis.greece.makemyplan.dto.sales.CMSAddon;
//import vis.greece.makemyplan.dto.sales.SalesOrderListConstants;
//import vis.greece.makemyplan.repository.CMSAddonsRepo;
//
//@RestController
//@RequestMapping("/gr/v1/sales")
//public class MongoInsertionController {
//
//	@Autowired
//	private CMSAddonsRepo cmsAddonsRepo;
//
//	@GetMapping("/order/mongo/cms")
//	public ResponseEntity<?> insertTheXmlIntoMongo() throws JAXBException, BusinessException {
//
//		JAXBContext jaxbContext = JAXBContext.newInstance(CMS_Obj.class);
//		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//		CMS_Obj cms;
//		try {
//			cms = (CMS_Obj) jaxbUnmarshaller.unmarshal(new ClassPathResource("ottCMS_final (5).xml").getInputStream());
//		} catch (IOException e) {
//			throw new BusinessException(e.getMessage());
//		}
//
//		List<CMSAddon> cmsAddons = mapXmlToCMSAddons(cms);
//
//		if (cmsAddonsRepo.count() == cmsAddons.size()) {
//			cmsAddonsRepo.deleteAll();
//		}
//
//		cmsAddonsRepo.saveAll(cmsAddons);
//
//		return new ResponseEntity<>(HttpStatus.CREATED);
//	}
//
//	private List<CMSAddon> mapXmlToCMSAddons(CMS_Obj cms_Obj) {
//
//		return cms_Obj.getOrders().stream().map(order_Obj -> {
//			CMSAddon cmsAddon = new CMSAddon();
//			cmsAddon.setAiosCode(order_Obj.getAiosCode());
//			cmsAddon.setColor(order_Obj.getColour());
//			cmsAddon.setCpe(order_Obj.getCpe());
//			cmsAddon.setEnDesc(replaceSpecialChars(order_Obj.getEnglishText()));
//			cmsAddon.setGreekDesc(replaceSpecialChars(order_Obj.getGreekText()));
//			cmsAddon.setInternalTitle(order_Obj.getTitle());
//			cmsAddon.setPercentage(order_Obj.getPercentage());
//			cmsAddon.setSpeed(order_Obj.getSpeed());
//			cmsAddon.setStb(order_Obj.getStb());
//			cmsAddon.setStep(order_Obj.getStep());
//			cmsAddon.setType(order_Obj.getType());
//
//			if (order_Obj.getStatus() != null && order_Obj.getStatus().equals("Submited")) {
//				cmsAddon.setStatus(SalesOrderListConstants.SUBMITTED_STATUS_ALL_MATCHED.getValue());
//			} else if (order_Obj.getStatus() != null && order_Obj.getStatus().equals("Complete")) {
//				cmsAddon.setStatus(SalesOrderListConstants.COMPLETED_STATUS_ALL_MATCHED.getValue());
//			} else {
//				cmsAddon.setStatus(order_Obj.getStatus());
//			}
//
//			return cmsAddon;
//		}).collect(Collectors.toList());
//	}
//
//	private static String replaceSpecialChars(String target) {
//
//		return target.replaceAll("\n", "").replaceAll("\\n", "").replaceAll("\\\\n", "").replaceAll("    ", "");
//
//	}
//
//}