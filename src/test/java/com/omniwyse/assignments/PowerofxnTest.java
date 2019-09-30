package com.omniwyse.assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PowerofxnTest {
    
	private static final Powerofxn POWEROFXN = new Powerofxn();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPowerofxn() {
		int res=POWEROFXN.power(2,3);
		System.out.println(res);
		assertEquals(8,res);
	}

}
