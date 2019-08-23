
package vis.greece.makemyplan.model.red;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Red4AllInterfacesService", targetNamespace = "http://accenture.com/eai/Red4All", wsdlLocation = "file:/D:/Vis/VFGR/DAS-201/ps_mcarered4all_wsdl.wsdl")
public class Red4AllInterfacesService
    extends Service
{

    private final static URL RED4ALLINTERFACESSERVICE_WSDL_LOCATION;
    private final static WebServiceException RED4ALLINTERFACESSERVICE_EXCEPTION;
    private final static QName RED4ALLINTERFACESSERVICE_QNAME = new QName("http://accenture.com/eai/Red4All", "Red4AllInterfacesService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/Vis/VFGR/DAS-201/ps_mcarered4all_wsdl.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RED4ALLINTERFACESSERVICE_WSDL_LOCATION = url;
        RED4ALLINTERFACESSERVICE_EXCEPTION = e;
    }

    public Red4AllInterfacesService() {
        super(__getWsdlLocation(), RED4ALLINTERFACESSERVICE_QNAME);
    }

    public Red4AllInterfacesService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RED4ALLINTERFACESSERVICE_QNAME, features);
    }

    public Red4AllInterfacesService(URL wsdlLocation) {
        super(wsdlLocation, RED4ALLINTERFACESSERVICE_QNAME);
    }

    public Red4AllInterfacesService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RED4ALLINTERFACESSERVICE_QNAME, features);
    }

    public Red4AllInterfacesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Red4AllInterfacesService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Red4AllInterfacesPortType
     */
    @WebEndpoint(name = "Red4AllInterfacesPort")
    public Red4AllInterfacesPortType getRed4AllInterfacesPort() {
        return super.getPort(new QName("http://accenture.com/eai/Red4All", "Red4AllInterfacesPort"), Red4AllInterfacesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Red4AllInterfacesPortType
     */
    @WebEndpoint(name = "Red4AllInterfacesPort")
    public Red4AllInterfacesPortType getRed4AllInterfacesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://accenture.com/eai/Red4All", "Red4AllInterfacesPort"), Red4AllInterfacesPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RED4ALLINTERFACESSERVICE_EXCEPTION!= null) {
            throw RED4ALLINTERFACESSERVICE_EXCEPTION;
        }
        return RED4ALLINTERFACESSERVICE_WSDL_LOCATION;
    }

}