package com.example.testingtargetgame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class IntegerCheckTests {

	@Test
	public void givenIntOneGetTrue() {
		//Given: I am a user
		//When: I enter the integer 1
		IIntegerCheck IIC = new IntegerCheck();
		boolean result = IIC.getResult("1");
		//Then: I should return true
		assertEquals(true, result);
	}

	@Test
	public void givenIntTwoGetTrue() {
		//Given: I am a user
		//When: I enter the integer 2
		IIntegerCheck IIC = new IntegerCheck();
		boolean result = IIC.getResult("2");
		//Then: I should return true
		assertEquals(true, result);
	}

	@Test
	public void givenIntTwentyGetTrue() {
		//Given: I am a user
		//When: I enter the integer 20
		IIntegerCheck IIC = new IntegerCheck();
		boolean result = IIC.getResult("20");
		//Then: I should return true
		assertEquals(true, result);
	}
	
	@Test
	public void givenIntNinetyGetTrue() {
		//Given: I am a user
		//When: I enter the integer 90
		IIntegerCheck IIC = new IntegerCheck();
		boolean result = IIC.getResult("90");
		//Then: I should return true
		assertEquals(true, result);
	}

}
