package vis.greece.makemyplan.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.transport.http.HttpUrlConnectionMessageSender;

import com.vis.core.errorhandling.exception.BusinessException;

import vis.greece.makemyplan.utils.MakeMyPlanUtil;

@Configuration
public class MakeMyPlanConfig {

	@Autowired
	ClientInterceptor[] interceptors;
	
	@Autowired
	@Qualifier("genericSoapMessageSender")
	private HttpUrlConnectionMessageSender genericSoapMessageSender;

	@Bean
	public MakeMyPlanUtil makeMyPlanUtil(@Value("${greece.makemyplan.url}") String url) throws BusinessException {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("vis.greece.makemyplan.model");
		MakeMyPlanUtil makeMyPlanUtil = new MakeMyPlanUtil();
		makeMyPlanUtil.setDefaultUri(url.trim());
		makeMyPlanUtil.setMarshaller(marshaller);
		makeMyPlanUtil.setUnmarshaller(marshaller);
		makeMyPlanUtil.setInterceptors(interceptors);
		makeMyPlanUtil.setMessageSender(genericSoapMessageSender);
		return makeMyPlanUtil;
	}

}
