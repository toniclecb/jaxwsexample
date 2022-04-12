
package com.toniclecb.jaxwsclient.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.toniclecb.jaxws.server package. 
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

    private final static QName _GetDouble_QNAME = new QName("http://server.jaxws.toniclecb.com/", "getDouble");
    private final static QName _GetDoubleResponse_QNAME = new QName("http://server.jaxws.toniclecb.com/", "getDoubleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.toniclecb.jaxws.server
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDouble }
     * 
     */
    public GetDouble createGetDouble() {
        return new GetDouble();
    }

    /**
     * Create an instance of {@link GetDoubleResponse }
     * 
     */
    public GetDoubleResponse createGetDoubleResponse() {
        return new GetDoubleResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDouble }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDouble }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.jaxws.toniclecb.com/", name = "getDouble")
    public JAXBElement<GetDouble> createGetDouble(GetDouble value) {
        return new JAXBElement<GetDouble>(_GetDouble_QNAME, GetDouble.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDoubleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDoubleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://server.jaxws.toniclecb.com/", name = "getDoubleResponse")
    public JAXBElement<GetDoubleResponse> createGetDoubleResponse(GetDoubleResponse value) {
        return new JAXBElement<GetDoubleResponse>(_GetDoubleResponse_QNAME, GetDoubleResponse.class, null, value);
    }

}
