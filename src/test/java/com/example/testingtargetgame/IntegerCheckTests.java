package com.example.testingtargetgame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntegerCheckTests {

    @Test
    public void givenOneGetTrue() {
        //Given: I am a user
        //When: I have the integer "1"
        IIntegerCheck IIC = new IntegerCheck();
        boolean result = IIC.getResult("1");
        //Then: I will return true
        assertEquals(true, result);
    }

    @Test
    public void givenTwoGetTrue() {
        //Given: I am a user
        //When: I have the integer "2"
        IIntegerCheck IIC = new IntegerCheck();
        boolean result = IIC.getResult("2");
        //Then: I will return true
        assertEquals(true, result);
    }

    @Test
    public void givenTwentyGetTrue() {
        //Given: I am a user
        //When: I have the integer "20"
        IIntegerCheck IIC = new IntegerCheck();
        boolean result = IIC.getResult("20");
        //Then: I will return true
        assertEquals(true, result);
    }

    @Test
    public void givenNinetyGetTrue() {
        //Given: I am a user
        //When: I have the integer "90"
        IIntegerCheck IIC = new IntegerCheck();
        boolean result = IIC.getResult("90");
        //Then: I will return true
        assertEquals(true, result);
    }

    @Test
    public void givenStringOneGetFalse() {
        //Given: I am a user
        //When: I have the string "one"
        IIntegerCheck IIC = new IntegerCheck();
        boolean result = IIC.getResult("one");
        //Then: I will return false
        assertEquals(false, result);
    }

    @Test
    public void givenDecimalOneGetFalse() {
        //Given: I am a user
        //When: I have the string "1.0"
        IIntegerCheck IIC = new IntegerCheck();
        boolean result = IIC.getResult("1.0");
        //Then: I will return false
        assertEquals(false, result);
    }
}
