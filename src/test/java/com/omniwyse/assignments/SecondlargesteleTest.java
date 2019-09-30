package com.omniwyse.assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecondlargesteleTest {
	
	private static final Secondlargestele SLE = new Secondlargestele();

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
	void testSecondlargestele() {
		int a[]= {1,2,3,4,5,6};
		assertEquals(5,SLE.getSecondLargest(a,6));
	}

}
