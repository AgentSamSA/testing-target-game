package com.example.testingtargetgame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidVelocityCheckTests {
    
    @Test
    public void givenOneGetTrue() {
        //Given: I am a user
        //When: I have the integer "1"
        IRangeCheck IRC = new ValidVelocityCheck();
        boolean result = IRC.getResult(1);
        //Then: I will return true
        assertEquals(true, result);
    }

    @Test
    public void givenTwoGetTrue() {
        //Given: I am a user
        //When: I have the integer "2"
        IRangeCheck IRC = new ValidVelocityCheck();
        boolean result = IRC.getResult(2);
        //Then: I will return true
        assertEquals(true, result);
    }

    @Test
    public void givenTwentyGetTrue() {
        //Given: I am a user
        //When: I have the integer "20"
        IRangeCheck IRC = new ValidVelocityCheck();
        boolean result = IRC.getResult(20);
        //Then: I will return true
        assertEquals(true, result);
    }


    @Test
    public void givenZeroGetFalse() {
        //Given: I am a user
        //When: I have the integer "0"
        IRangeCheck IRC = new ValidVelocityCheck();
        boolean result = IRC.getResult(0);
        //Then: I will return false
        assertEquals(false, result);
    }

    @Test
    public void givenTwentyOneGetFalse() {
        //Given: I am a user
        //When: I have the integer "21"
        IRangeCheck IRC = new ValidVelocityCheck();
        boolean result = IRC.getResult(21);
        //Then: I will return false
        assertEquals(false, result);
    }
}
