package vis.greece.makemyplan;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import vis.greece.makemyplan.salesorderbackend.contract.fault.FaultType;
import vis.greece.makemyplan.utils.SalesOrderDao;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
public class SoapFaultTest {

	@Spy
	private SalesOrderDao salesOrderDao;

	@Test
	public void test() {

		String soapFault = "<tns:VodafoneFault xmlns:tns=\"http://group.vodafone.com/contract/vfo/fault/v1\" xmlns:wsrf-bf=\"http://docs.oasis-open.org/wsrf/bf-2\">\r\n"
				+ "               <wsrf-bf:Timestamp>2018-12-10T10:14:39.645+02:00</wsrf-bf:Timestamp>\r\n"
				+ "               <wsrf-bf:ErrorCode dialect=\"http://group.vodafone.com/contract/vfo/errorcodes\">401</wsrf-bf:ErrorCode>\r\n"
				+ "               <tns:Name>Backend System Interface Timeout</tns:Name>\r\n"
				+ "               <tns:Severity>Minor</tns:Severity>\r\n"
				+ "               <tns:Category>Technical</tns:Category>\r\n" + "            </tns:VodafoneFault>";

		FaultType faultType = null;

		try {

			JAXBContext context = JAXBContext.newInstance(FaultType.class);
			Unmarshaller unMarshaller = context.createUnmarshaller();

			InputStream in = new ByteArrayInputStream(soapFault.getBytes());
			faultType = (FaultType) unMarshaller.unmarshal(in);

		} catch (JAXBException e) {
		}

		assertEquals(401, Integer.parseInt(faultType.getErrorCode().getContent().get(0).toString()));
		assertEquals("Backend System Interface Timeout", faultType.getName());

	}

}
