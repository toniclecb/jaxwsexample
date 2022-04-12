package com.toniclecb.jaxws.server;

import javax.xml.ws.Endpoint;

/**
 * Simple example server
 * @author toniclecb@gmail.com
 */
public class Publisher {
    public static void main( String[] args ){
    	System.out.println("Publisher :: init");
    	
		Endpoint.publish("http://localhost:8080/numbers",new NumbersImpl());
		
		System.out.println("Publisher :: running");
    }
}
