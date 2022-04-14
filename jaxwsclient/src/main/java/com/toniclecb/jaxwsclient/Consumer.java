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
		getData();
	}

	private static void getData() {
		log("Creating port...");
		NumberService port = service.getNumbersImplPort();
		log("Port created.");
		log("Getting getDouble()...");
		double d = port.getDouble();
		log("Return with getDouble = " + d);
		log("Getting getInt()...");
		int i = port.getInt(10, 20);
		log("Return with getInt = " + i);
	}

	private static void log(String s) {
		System.out.println(s);
	}
}
