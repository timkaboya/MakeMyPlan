package vis.greece.makemyplan.utils;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.SoapFaultClientException;

import com.vis.core.errorhandling.exception.BusinessException;
import com.vis.core.logging.annotations.LogBackEndMethod;

import lombok.extern.slf4j.Slf4j;
import vis.greece.makemyplan.model.red.Request;
import vis.greece.makemyplan.model.red.Response;

@LogBackEndMethod
@Slf4j
public class RedFamilyDao extends WebServiceGatewaySupport {

	public Response getRedFamilyResonse(Request redFamilyRequest) throws BusinessException {

		try {
			Response redResponse = (Response) getWebServiceTemplate()
					.marshalSendAndReceive(redFamilyRequest, new WebServiceMessageCallback() {
						@Override
						public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {

						}
					});
			return redResponse;
		} catch (SoapFaultClientException e) {
			log.error("Soap Fault {}", e.getFaultStringOrReason());
			throw new BusinessException(e.getFaultStringOrReason());
		}
	}

}
