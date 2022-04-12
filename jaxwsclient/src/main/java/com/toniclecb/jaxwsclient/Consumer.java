package com.toniclecb.jaxwsclient;

/**
 * Example of a simple consumer for a wsdl server
 * @author toniclecb@gmail.com
 */
import javax.xml.ws.WebServiceRef;

import com.toniclecb.jaxwsclient.generated.NumberService;
import com.toniclecb.jaxwsclient.generated.NumbersImplService;


public class Consumer {
	@WebServiceRef(wsdlLocation = "http://localhost:8080/numbers?wsdl")
	private static NumbersImplService service = new NumbersImplService();

	public static void main(String[] args) {
		System.out.println("DOUBLE:" + getDouble());
	}

	private static double getDouble() {
		NumberService port = service.getNumbersImplPort();
		return port.getDouble();
	}
}
