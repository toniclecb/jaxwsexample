package com.toniclecb.jaxwsclient.generated;

import java.util.concurrent.Future;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NumberService", targetNamespace = "http://server.jaxws.toniclecb.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NumberService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getInt", targetNamespace = "http://server.jaxws.toniclecb.com/", className = "com.toniclecb.jaxws.server.GetInt")
    @ResponseWrapper(localName = "getIntResponse", targetNamespace = "http://server.jaxws.toniclecb.com/", className = "com.toniclecb.jaxwsclient.generated.GetIntResponse")
    @Action(input = "http://server.jaxws.toniclecb.com/NumberService/getIntRequest", output = "http://server.jaxws.toniclecb.com/NumberService/getIntResponse")
    public int getInt(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @return
     *     returns double
     */
    /**/
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDouble", targetNamespace = "http://server.jaxws.toniclecb.com/", className = "com.toniclecb.jaxws.server.GetDouble")
    @ResponseWrapper(localName = "getDoubleResponse", targetNamespace = "http://server.jaxws.toniclecb.com/", className = "com.toniclecb.jaxwsclient.generated.GetDoubleResponse")
    @Action(input = "http://server.jaxws.toniclecb.com/NumberService/getDoubleRequest", output = "http://server.jaxws.toniclecb.com/NumberService/getDoubleResponse")
    public double getDouble();
    /**/
    /*
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDouble", targetNamespace = "http://server.jaxws.toniclecb.com/", className = "com.toniclecb.jaxws.server.GetDouble")
    @ResponseWrapper(localName = "getDoubleResponse", targetNamespace = "http://server.jaxws.toniclecb.com/", className = "com.toniclecb.jaxwsclient.generated.GetDoubleResponse")
    @Action(input = "http://server.jaxws.toniclecb.com/NumberService/getDoubleRequest", output = "http://server.jaxws.toniclecb.com/NumberService/getDoubleResponse")
    public Future<?> getDouble(
          @WebParam(name = "asyncHandler", targetNamespace = "")
          AsyncHandler<GetDoubleResponse> asyncHandler);
    */
    /**/
	@WebMethod(operationName = "getDouble")
    @RequestWrapper(localName = "getDouble", targetNamespace = "http://server.jaxws.toniclecb.com/", className = "com.toniclecb.jaxws.server.GetDouble")
    @ResponseWrapper(localName = "getDoubleResponse", targetNamespace = "http://server.jaxws.toniclecb.com/", className = "com.toniclecb.jaxwsclient.generated.GetDoubleResponse")
    public Future<?> getDoubleAsync(
        @WebParam(name = "asyncHandler", targetNamespace = "")
        AsyncHandler<GetDoubleResponse> asyncHandler);
     /**/
}
