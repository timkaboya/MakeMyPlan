
package vis.greece.makemyplan.salesorderbackend.contract.fault;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vis.greece.backend.contract.vfo.fault.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Fault_QNAME = new QName("http://group.vodafone.com/contract/vfo/fault/v1", "Fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vis.greece.backend.contract.vfo.fault.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link FailureType }
     * 
     */
    public FailureType createFailureType() {
        return new FailureType();
    }

    /**
     * Create an instance of {@link DataRefType }
     * 
     */
    public DataRefType createDataRefType() {
        return new DataRefType();
    }

    /**
     * Create an instance of {@link FaultType.Specification }
     * 
     */
    public FaultType.Specification createFaultTypeSpecification() {
        return new FaultType.Specification();
    }

    /**
     * Create an instance of {@link FaultType.Failures }
     * 
     */
    public FaultType.Failures createFaultTypeFailures() {
        return new FaultType.Failures();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/contract/vfo/fault/v1", name = "Fault")
    public JAXBElement<FaultType> createFault(FaultType value) {
        return new JAXBElement<FaultType>(_Fault_QNAME, FaultType.class, null, value);
    }

}
