package com.omniwyse.assignments;



import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PallindromeTest {
     
	private static final Pallindrome PALLINDROME = new Pallindrome();
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
	void testPalindrome() {
		assertEquals(true,PALLINDROME.findPallindrome(454));
	}

}
