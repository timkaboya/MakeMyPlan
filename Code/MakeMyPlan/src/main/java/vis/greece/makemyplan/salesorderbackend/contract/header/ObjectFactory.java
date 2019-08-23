
package vis.greece.makemyplan.salesorderbackend.contract.header;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import vis.greece.makemyplan.salesorderbackend.contract.fault.FaultType;



/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vis.greece.backend.contract.vho.header.v1 package. 
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

    private final static QName _Correlation_QNAME = new QName("http://group.vodafone.com/contract/vho/header/v1", "Correlation");
    private final static QName _Destination_QNAME = new QName("http://group.vodafone.com/contract/vho/header/v1", "Destination");
    private final static QName _Source_QNAME = new QName("http://group.vodafone.com/contract/vho/header/v1", "Source");
    private final static QName _QueryResult_QNAME = new QName("http://group.vodafone.com/contract/vho/header/v1", "QueryResult");
    private final static QName _RouteInfo_QNAME = new QName("http://group.vodafone.com/contract/vho/header/v1", "RouteInfo");
    private final static QName _ResultStatus_QNAME = new QName("http://group.vodafone.com/contract/vho/header/v1", "ResultStatus");
    private final static QName _ServiceDocumentation_QNAME = new QName("http://group.vodafone.com/contract/vho/header/v1", "ServiceDocumentation");
    private final static QName _Cache_QNAME = new QName("http://group.vodafone.com/contract/vho/header/v1", "Cache");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vis.greece.backend.contract.vho.header.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RouteType }
     * 
     */
    public RouteType createRouteType() {
        return new RouteType();
    }

    /**
     * Create an instance of {@link RouteType.Keys }
     * 
     */
    public RouteType.Keys createRouteTypeKeys() {
        return new RouteType.Keys();
    }

    /**
     * Create an instance of {@link ServiceDocumentationType }
     * 
     */
    public ServiceDocumentationType createServiceDocumentationType() {
        return new ServiceDocumentationType();
    }

    /**
     * Create an instance of {@link DestinationType }
     * 
     */
    public DestinationType createDestinationType() {
        return new DestinationType();
    }

    /**
     * Create an instance of {@link CorrelationType }
     * 
     */
    public CorrelationType createCorrelationType() {
        return new CorrelationType();
    }

    /**
     * Create an instance of {@link QueryResultType }
     * 
     */
    public QueryResultType createQueryResultType() {
        return new QueryResultType();
    }

    /**
     * Create an instance of {@link RouteInfoType }
     * 
     */
    public RouteInfoType createRouteInfoType() {
        return new RouteInfoType();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link CacheType }
     * 
     */
    public CacheType createCacheType() {
        return new CacheType();
    }

    /**
     * Create an instance of {@link IdentityType }
     * 
     */
    public IdentityType createIdentityType() {
        return new IdentityType();
    }

    /**
     * Create an instance of {@link RouteType.Keys.Key }
     * 
     */
    public RouteType.Keys.Key createRouteTypeKeysKey() {
        return new RouteType.Keys.Key();
    }

    /**
     * Create an instance of {@link ServiceDocumentationType.Implementation }
     * 
     */
    public ServiceDocumentationType.Implementation createServiceDocumentationTypeImplementation() {
        return new ServiceDocumentationType.Implementation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CorrelationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/contract/vho/header/v1", name = "Correlation")
    public JAXBElement<CorrelationType> createCorrelation(CorrelationType value) {
        return new JAXBElement<CorrelationType>(_Correlation_QNAME, CorrelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DestinationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/contract/vho/header/v1", name = "Destination")
    public JAXBElement<DestinationType> createDestination(DestinationType value) {
        return new JAXBElement<DestinationType>(_Destination_QNAME, DestinationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/contract/vho/header/v1", name = "Source")
    public JAXBElement<SourceType> createSource(SourceType value) {
        return new JAXBElement<SourceType>(_Source_QNAME, SourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/contract/vho/header/v1", name = "QueryResult")
    public JAXBElement<QueryResultType> createQueryResult(QueryResultType value) {
        return new JAXBElement<QueryResultType>(_QueryResult_QNAME, QueryResultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RouteInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/contract/vho/header/v1", name = "RouteInfo")
    public JAXBElement<RouteInfoType> createRouteInfo(RouteInfoType value) {
        return new JAXBElement<RouteInfoType>(_RouteInfo_QNAME, RouteInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/contract/vho/header/v1", name = "ResultStatus")
    public JAXBElement<FaultType> createResultStatus(FaultType value) {
        return new JAXBElement<FaultType>(_ResultStatus_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceDocumentationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/contract/vho/header/v1", name = "ServiceDocumentation")
    public JAXBElement<ServiceDocumentationType> createServiceDocumentation(ServiceDocumentationType value) {
        return new JAXBElement<ServiceDocumentationType>(_ServiceDocumentation_QNAME, ServiceDocumentationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CacheType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/contract/vho/header/v1", name = "Cache")
    public JAXBElement<CacheType> createCache(CacheType value) {
        return new JAXBElement<CacheType>(_Cache_QNAME, CacheType.class, null, value);
    }

}
