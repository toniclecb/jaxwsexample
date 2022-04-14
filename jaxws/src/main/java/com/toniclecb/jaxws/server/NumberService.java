package com.toniclecb.jaxws.server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

/**
 * SEI (Service Endpoint Interface)
 * @author User
 *
 */
@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface NumberService {

	@WebMethod
	public double getDouble();
	
	@WebMethod
	public int getInt(int start, int end);

}
