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
		return Math.random();
	}

}
