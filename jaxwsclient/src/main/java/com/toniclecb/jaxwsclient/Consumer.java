package com.toniclecb.jaxwsclient;

import java.util.concurrent.Future;

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
//		log("Getting getDouble()...");
//		double d = port.getDouble();
//		log("Return with getDouble = " + d);
		log("Getting getInt()...");
		int i = port.getInt(10, 20);
		log("Return with getInt = " + i);

		log("-------------------------");
		try {
			invokeAsyncWithCallBack(port);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * example from https://examples.javacodegeeks.com/enterprise-java/jws/jax-ws-callback-example/
	 * @param port
	 * @throws InterruptedException
	 */
	private static void invokeAsyncWithCallBack(NumberService port) throws InterruptedException {
		log("Requesting... getDouble");
		Future future = port.getDoubleAsync((response) -> {
			log("response: " + response);
			try {
				log("Retrieved via callback response: " + response.get().getReturn());
			} catch (Exception exc) {
				log(exc.getClass().getName() + " using callback for response:" + exc.getMessage());
				exc.printStackTrace();
			}
		});

		for (int i = 0; i < 9; i++) {
			log("Program can do something while waiting for the callback response!!!");
			Thread.sleep(2000);
		}

	}

	private static void log(String s) {
		System.out.println(s);
	}
}
