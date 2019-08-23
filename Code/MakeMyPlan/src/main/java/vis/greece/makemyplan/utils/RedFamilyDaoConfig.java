package vis.greece.makemyplan.utils;

import javax.xml.soap.SOAPException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.transport.http.HttpUrlConnectionMessageSender;

@Configuration
public class RedFamilyDaoConfig {

	@Autowired
	private ClientInterceptor[] interceptors;

	@Autowired
	@Qualifier("genericSoapMessageSender")
	private HttpUrlConnectionMessageSender genericSoapMessageSender;
	
	@Bean
	public RedFamilyDao redFamilyDao(@Value("${greece.redfamily.url}") String url) throws SOAPException {

		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPaths("vis.greece.makemyplan.model.red");
		RedFamilyDao redFamilyDao = new RedFamilyDao();
		redFamilyDao.setDefaultUri(url.trim());
		redFamilyDao.setMarshaller(marshaller);
		redFamilyDao.setUnmarshaller(marshaller);
		redFamilyDao.setInterceptors(interceptors);
		redFamilyDao.setMessageSender(genericSoapMessageSender);

		return redFamilyDao;
	}
}
