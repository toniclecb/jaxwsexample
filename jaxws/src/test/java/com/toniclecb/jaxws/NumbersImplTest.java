package com.toniclecb.jaxws;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.toniclecb.jaxws.server.NumberService;
import com.toniclecb.jaxws.server.NumbersImpl;

public class NumbersImplTest {

	@Test
	public void testGetInt() {
		NumberService ns = new NumbersImpl();
		for (int i = 0; i < 100; i++) { // we dont have @RepeatedTest
			int a = ns.getInt(90, 100);
			System.out.println("a = " + a);
			assertTrue("Error, number is too high", 100 >= a);
			assertTrue("Error, number is too low",  90  <= a);			
		}
		for (int i = 0; i < 100; i++) {
			int b = ns.getInt(99, 100);
			System.out.println("b = " + b);
			assertTrue("Error, number is too high", 100 >= b);
			assertTrue("Error, number is too low",  99  <= b);			
		}
	}
}
