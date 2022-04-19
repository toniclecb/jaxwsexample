package com.toniclecb.jaxws.server;

import javax.jws.WebService;

/**
 * SIB (Service Implementation Bean)
 * @author User
 *
 */
@WebService(endpointInterface = "com.toniclecb.jaxws.server.NumberService")
public class NumbersImpl implements NumberService {

	@Override
	public double getDouble() {
		System.out.println("Server is processing");
		try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Server returns");
		return Math.random();
	}

	@Override
	public int getInt(int start, int end) {
		int aux = end - start;
		return (int)(Math.random() * aux + start);
	}

}
