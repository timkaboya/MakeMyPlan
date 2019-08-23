
package vis.greece.makemyplan.salesorderbackend.schema.vbm.sales_order;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vodafone.group.schema.vbm.order.sales_order.v2 package. 
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

    private final static QName _DeleteSalesOrderVBMResponse_QNAME = new QName("http://group.vodafone.com/schema/vbm/order/sales-order/v2", "DeleteSalesOrderVBMResponse");
    private final static QName _CreateSalesOrderVBMResponse_QNAME = new QName("http://group.vodafone.com/schema/vbm/order/sales-order/v2", "CreateSalesOrderVBMResponse");
    private final static QName _GetSalesOrderListVBMRequest_QNAME = new QName("http://group.vodafone.com/schema/vbm/order/sales-order/v2", "GetSalesOrderListVBMRequest");
    private final static QName _GetSalesOrderListVBMResponse_QNAME = new QName("http://group.vodafone.com/schema/vbm/order/sales-order/v2", "GetSalesOrderListVBMResponse");
    private final static QName _UpdateSalesOrderVBMRequest_QNAME = new QName("http://group.vodafone.com/schema/vbm/order/sales-order/v2", "UpdateSalesOrderVBMRequest");
    private final static QName _CreateSalesOrderVBMRequest_QNAME = new QName("http://group.vodafone.com/schema/vbm/order/sales-order/v2", "CreateSalesOrderVBMRequest");
    private final static QName _NotifySalesOrderVBMRequest_QNAME = new QName("http://group.vodafone.com/schema/vbm/order/sales-order/v2", "NotifySalesOrderVBMRequest");
    private final static QName _DeleteSalesOrderVBMRequest_QNAME = new QName("http://group.vodafone.com/schema/vbm/order/sales-order/v2", "DeleteSalesOrderVBMRequest");
    private final static QName _UpdateSalesOrderVBMResponse_QNAME = new QName("http://group.vodafone.com/schema/vbm/order/sales-order/v2", "UpdateSalesOrderVBMResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vodafone.group.schema.vbm.order.sales_order.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateSalesOrderVBMRequestType }
     * 
     */
    public UpdateSalesOrderVBMRequestType createUpdateSalesOrderVBMRequestType() {
        return new UpdateSalesOrderVBMRequestType();
    }

    /**
     * Create an instance of {@link DeleteSalesOrderVBMRequestType }
     * 
     */
    public DeleteSalesOrderVBMRequestType createDeleteSalesOrderVBMRequestType() {
        return new DeleteSalesOrderVBMRequestType();
    }

    /**
     * Create an instance of {@link GetSalesOrderListVBMResponseType }
     * 
     */
    public GetSalesOrderListVBMResponseType createGetSalesOrderListVBMResponseType() {
        return new GetSalesOrderListVBMResponseType();
    }

    /**
     * Create an instance of {@link GetSalesOrderListVBMRequestType }
     * 
     */
    public GetSalesOrderListVBMRequestType createGetSalesOrderListVBMRequestType() {
        return new GetSalesOrderListVBMRequestType();
    }

    /**
     * Create an instance of {@link NotifySalesOrderVBMRequestType }
     * 
     */
    public NotifySalesOrderVBMRequestType createNotifySalesOrderVBMRequestType() {
        return new NotifySalesOrderVBMRequestType();
    }

    /**
     * Create an instance of {@link UpdateSalesOrderVBMResponseType }
     * 
     */
    public UpdateSalesOrderVBMResponseType createUpdateSalesOrderVBMResponseType() {
        return new UpdateSalesOrderVBMResponseType();
    }

    /**
     * Create an instance of {@link CreateSalesOrderVBMResponseType }
     * 
     */
    public CreateSalesOrderVBMResponseType createCreateSalesOrderVBMResponseType() {
        return new CreateSalesOrderVBMResponseType();
    }

    /**
     * Create an instance of {@link CreateSalesOrderVBMRequestType }
     * 
     */
    public CreateSalesOrderVBMRequestType createCreateSalesOrderVBMRequestType() {
        return new CreateSalesOrderVBMRequestType();
    }

    /**
     * Create an instance of {@link DeleteSalesOrderVBMResponseType }
     * 
     */
    public DeleteSalesOrderVBMResponseType createDeleteSalesOrderVBMResponseType() {
        return new DeleteSalesOrderVBMResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSalesOrderVBMResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/schema/vbm/order/sales-order/v2", name = "DeleteSalesOrderVBMResponse")
    public JAXBElement<DeleteSalesOrderVBMResponseType> createDeleteSalesOrderVBMResponse(DeleteSalesOrderVBMResponseType value) {
        return new JAXBElement<DeleteSalesOrderVBMResponseType>(_DeleteSalesOrderVBMResponse_QNAME, DeleteSalesOrderVBMResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSalesOrderVBMResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/schema/vbm/order/sales-order/v2", name = "CreateSalesOrderVBMResponse")
    public JAXBElement<CreateSalesOrderVBMResponseType> createCreateSalesOrderVBMResponse(CreateSalesOrderVBMResponseType value) {
        return new JAXBElement<CreateSalesOrderVBMResponseType>(_CreateSalesOrderVBMResponse_QNAME, CreateSalesOrderVBMResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesOrderListVBMRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/schema/vbm/order/sales-order/v2", name = "GetSalesOrderListVBMRequest")
    public JAXBElement<GetSalesOrderListVBMRequestType> createGetSalesOrderListVBMRequest(GetSalesOrderListVBMRequestType value) {
        return new JAXBElement<GetSalesOrderListVBMRequestType>(_GetSalesOrderListVBMRequest_QNAME, GetSalesOrderListVBMRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalesOrderListVBMResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/schema/vbm/order/sales-order/v2", name = "GetSalesOrderListVBMResponse")
    public JAXBElement<GetSalesOrderListVBMResponseType> createGetSalesOrderListVBMResponse(GetSalesOrderListVBMResponseType value) {
        return new JAXBElement<GetSalesOrderListVBMResponseType>(_GetSalesOrderListVBMResponse_QNAME, GetSalesOrderListVBMResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSalesOrderVBMRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/schema/vbm/order/sales-order/v2", name = "UpdateSalesOrderVBMRequest")
    public JAXBElement<UpdateSalesOrderVBMRequestType> createUpdateSalesOrderVBMRequest(UpdateSalesOrderVBMRequestType value) {
        return new JAXBElement<UpdateSalesOrderVBMRequestType>(_UpdateSalesOrderVBMRequest_QNAME, UpdateSalesOrderVBMRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSalesOrderVBMRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/schema/vbm/order/sales-order/v2", name = "CreateSalesOrderVBMRequest")
    public JAXBElement<CreateSalesOrderVBMRequestType> createCreateSalesOrderVBMRequest(CreateSalesOrderVBMRequestType value) {
        return new JAXBElement<CreateSalesOrderVBMRequestType>(_CreateSalesOrderVBMRequest_QNAME, CreateSalesOrderVBMRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotifySalesOrderVBMRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/schema/vbm/order/sales-order/v2", name = "NotifySalesOrderVBMRequest")
    public JAXBElement<NotifySalesOrderVBMRequestType> createNotifySalesOrderVBMRequest(NotifySalesOrderVBMRequestType value) {
        return new JAXBElement<NotifySalesOrderVBMRequestType>(_NotifySalesOrderVBMRequest_QNAME, NotifySalesOrderVBMRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSalesOrderVBMRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/schema/vbm/order/sales-order/v2", name = "DeleteSalesOrderVBMRequest")
    public JAXBElement<DeleteSalesOrderVBMRequestType> createDeleteSalesOrderVBMRequest(DeleteSalesOrderVBMRequestType value) {
        return new JAXBElement<DeleteSalesOrderVBMRequestType>(_DeleteSalesOrderVBMRequest_QNAME, DeleteSalesOrderVBMRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSalesOrderVBMResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://group.vodafone.com/schema/vbm/order/sales-order/v2", name = "UpdateSalesOrderVBMResponse")
    public JAXBElement<UpdateSalesOrderVBMResponseType> createUpdateSalesOrderVBMResponse(UpdateSalesOrderVBMResponseType value) {
        return new JAXBElement<UpdateSalesOrderVBMResponseType>(_UpdateSalesOrderVBMResponse_QNAME, UpdateSalesOrderVBMResponseType.class, null, value);
    }

}
