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
public class SalesOrderDaoConfig {

	@Autowired
	private ClientInterceptor[] interceptors;

	@Autowired
	@Qualifier("genericSoapMessageSender")
	private HttpUrlConnectionMessageSender genericSoapMessageSender;

	@Bean
	public SalesOrderDao salesOrderDao(@Value("${greece.sales-order.url}") String url) throws SOAPException {

		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPaths("vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order",
				"vis.greece.makemyplan.salesorderbackend.contract.fault");
		SalesOrderDao salesOrderDao = new SalesOrderDao();
		salesOrderDao.setDefaultUri(url.trim());
		salesOrderDao.setMarshaller(marshaller);
		salesOrderDao.setUnmarshaller(marshaller);
		salesOrderDao.setInterceptors(interceptors);
		salesOrderDao.setMessageSender(genericSoapMessageSender);

		return salesOrderDao;
	}
}
