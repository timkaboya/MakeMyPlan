package vis.greece.makemyplan.utils;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;
import org.springframework.ws.transport.http.HttpUrlConnection;

import com.vis.core.logging.annotations.LogBackEndMethod;

import vis.greece.makemyplan.model.ActivateBundle;
import vis.greece.makemyplan.model.ActivateBundleResponse;
import vis.greece.makemyplan.model.Register;
import vis.greece.makemyplan.model.RegisterResponse;
import vis.greece.makemyplan.model.Unregister;
import vis.greece.makemyplan.model.UnregisterResponse;

@LogBackEndMethod
public class MakeMyPlanUtil extends WebServiceGatewaySupport {

	@Value("${greece.makemyplan.activatebundle.sopaaction}")
	private String activateBundleSoapAction;

	@Value("${greece.makemyplan.register.sopaaction}")
	private String registerSoapAction;

	@Value("${greece.makemyplan.unregister.sopaaction}")
	private String unRegisterSoapAction;

	private String acceptLanguageRequestHeaderName = "Accept-Language";

	public ActivateBundleResponse activateBundle(String acceptLang, ActivateBundle request) {
		ActivateBundleResponse response = (ActivateBundleResponse) getWebServiceTemplate()
				.marshalSendAndReceive(request, new WebServiceMessageCallback() {
					@Override
					public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
						SoapMessage msg = (SoapMessage) message;

						TransportContext context = TransportContextHolder.getTransportContext();
						HttpUrlConnection connection = (HttpUrlConnection) context.getConnection();
						connection.getConnection().addRequestProperty(acceptLanguageRequestHeaderName, acceptLang);

						msg.setSoapAction(activateBundleSoapAction);
					}
				});
		return response;
	}

	public RegisterResponse register(String acceptLang, Register request) {
		RegisterResponse response = (RegisterResponse) getWebServiceTemplate().marshalSendAndReceive(request,
				new WebServiceMessageCallback() {
					@Override
					public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
						SoapMessage msg = (SoapMessage) message;

						TransportContext context = TransportContextHolder.getTransportContext();
						HttpUrlConnection connection = (HttpUrlConnection) context.getConnection();
						connection.getConnection().addRequestProperty(acceptLanguageRequestHeaderName, acceptLang);

						msg.setSoapAction(registerSoapAction);
					}
				});
		return response;
	}

	public UnregisterResponse unregister(String acceptLang, Unregister request) {
		UnregisterResponse response = (UnregisterResponse) getWebServiceTemplate().marshalSendAndReceive(request,
				new WebServiceMessageCallback() {
					@Override
					public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
						SoapMessage msg = (SoapMessage) message;

						TransportContext context = TransportContextHolder.getTransportContext();
						HttpUrlConnection connection = (HttpUrlConnection) context.getConnection();
						connection.getConnection().addRequestProperty(acceptLanguageRequestHeaderName, acceptLang);

						msg.setSoapAction(unRegisterSoapAction);
					}
				});
		return response;
	}
}
