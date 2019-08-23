package vis.greece.makemyplan.utils;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerException;

import org.springframework.oxm.XmlMappingException;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.SoapFaultClientException;
import org.springframework.ws.soap.saaj.SaajSoapMessage;

import com.vis.core.errorhandling.exception.BusinessException;
import com.vis.core.logging.annotations.LogBackEndMethod;

import lombok.extern.slf4j.Slf4j;
import vis.greece.makemyplan.dto.sales.SalesOrderNamesEnum;
import vis.greece.makemyplan.salesorderbackend.contract.fault.FaultType;
import vis.greece.makemyplan.salesorderbackend.contract.fault.VodafoneFault;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.CreateSalesOrderVBMRequestType;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.CreateSalesOrderVBMResponseType;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.GetSalesOrderListVBMRequestType;
import vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order.GetSalesOrderListVBMResponseType;

@LogBackEndMethod
@Slf4j
public class SalesOrderDao extends WebServiceGatewaySupport {

	@SuppressWarnings("unchecked")
	public CreateSalesOrderVBMResponseType createSalesOrder(CreateSalesOrderVBMRequestType createSalesOrderRequest,
			String source, String destination) throws BusinessException {

		try {
			CreateSalesOrderVBMResponseType response = ((JAXBElement<CreateSalesOrderVBMResponseType>) getWebServiceTemplate()
					.marshalSendAndReceive(createSalesOrderRequest, new WebServiceMessageCallback() {
						@Override
						public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {

							SOAPMessage msg = ((SaajSoapMessage) message).getSaajMessage();
							SOAPHeader header;
							String headerPrefix = "head";
							try {
								header = msg.getSOAPHeader();
								
								header.addNamespaceDeclaration(headerPrefix,
										SalesOrderNamesEnum.CREATE_ORDER_SOURCE_SYSTEM_HEADER_URL.getName());
								QName qNameSystem = new QName(
										SalesOrderNamesEnum.CREATE_ORDER_SOURCE_SYSTEM_HEADER_URL.getName(), "System",
										headerPrefix);
								SOAPHeaderElement systemHeaderElement = header.addHeaderElement(qNameSystem);
								systemHeaderElement.addTextNode(source != null ? source
										: SalesOrderNamesEnum.CREATE_ORDER_SOURCE_SYSTEM.getName());

								QName qNameSource = new QName(
										SalesOrderNamesEnum.CREATE_ORDER_SOURCE_SYSTEM_HEADER_URL.getName(), "Source",
										headerPrefix);
								SOAPHeaderElement sourceHeaderElement = header.addHeaderElement(qNameSource);
								sourceHeaderElement.addChildElement(systemHeaderElement);
								
								
								header.addNamespaceDeclaration(headerPrefix,
										SalesOrderNamesEnum.CREATE_ORDER_SOURCE_SYSTEM_HEADER_URL.getName());
								QName qNameSystemDest = new QName(
										SalesOrderNamesEnum.CREATE_ORDER_SOURCE_SYSTEM_HEADER_URL.getName(), "System",
										headerPrefix);
								SOAPHeaderElement systemHeaderElementDest = header.addHeaderElement(qNameSystemDest);
								systemHeaderElementDest.addTextNode(destination != null ? destination
										: SalesOrderNamesEnum.CREATE_ORDER_DESTINATION_SYSTEM.getName());

								QName qNameDestination = new QName(
										SalesOrderNamesEnum.CREATE_ORDER_SOURCE_SYSTEM_HEADER_URL.getName(), "Destination",
										headerPrefix);
								SOAPHeaderElement destinatioHeaderElement = header.addHeaderElement(qNameDestination);
								destinatioHeaderElement.addChildElement(systemHeaderElementDest);

							} catch (SOAPException e) {
								log.error("Error occurred while preparing soap header request {} ", e.getMessage());
								throw new TransformerException(
										"Error occurred while preparing soap header request: " + e.getMessage());
							}
							((SaajSoapMessage) message)
									.setSoapAction(SalesOrderNamesEnum.CREATE_ORDER_SOAP_ACTION.getName());
						}
					})).getValue();

			return response;

		} catch (SoapFaultClientException e) {
			log.error("Soap Fault {}", e.getFaultStringOrReason());
			throw new BusinessException(e.getFaultStringOrReason());
		}

	}

	@SuppressWarnings({ "unchecked" })
	public GetSalesOrderListVBMResponseType getSalesOrderList(
			GetSalesOrderListVBMRequestType getSalesOrderListVBMRequestType) throws BusinessException {

		try {
			GetSalesOrderListVBMResponseType response = ((JAXBElement<GetSalesOrderListVBMResponseType>) getWebServiceTemplate()
					.marshalSendAndReceive(getSalesOrderListVBMRequestType, new WebServiceMessageCallback() {
						@Override

						public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {

							((SaajSoapMessage) message)
									.setSoapAction(SalesOrderNamesEnum.GET_ORDER_LIST_SOAP_ACTION.getName());
						}
					})).getValue();

			return response;

		} catch (SoapFaultClientException e) {

			if (e.getSoapFault().getFaultDetail() != null
					&& e.getSoapFault().getFaultDetail().getDetailEntries() != null) {

				FaultType faultType = null;
				try {

					Source errSource = e.getSoapFault().getFaultDetail().getDetailEntries().next().getSource();

					if (getWebServiceTemplate().getUnmarshaller().supports(VodafoneFault.class)) {

						log.info("before unmarshalling the soap fault source using WebServiceTemplate Unmarshaller");
						faultType = (FaultType) getWebServiceTemplate().getUnmarshaller().unmarshal(errSource);
					} else {
						log.info("before unmarshalling the soap fault source using new Unmarshaller");
						JAXBContext context = JAXBContext.newInstance(FaultType.class);
						Unmarshaller unMarshaller = context.createUnmarshaller();
						faultType = (FaultType) unMarshaller.unmarshal(errSource);
					}
					log.info("after unmarshalling the soap fault source");

				} catch (JAXBException | XmlMappingException | IOException e1) {
					log.error(e1.getMessage());
					throw new BusinessException();
				}

				log.info("thowing BusinessException with saopfault name");
				throw new BusinessException(Integer.parseInt(faultType.getErrorCode().getContent().get(0).toString()),
						faultType.getName());

			}

			log.info("thowing BusinessException with FaultStringOrReason");
			throw new BusinessException(e.getFaultStringOrReason());
		}

	}
}