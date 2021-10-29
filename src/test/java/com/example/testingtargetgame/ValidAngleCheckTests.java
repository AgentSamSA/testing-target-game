package com.example.testingtargetgame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ValidAngleCheckTests {
    
    @Test
    public void givenOneReturnTrue() {
        //Given: I am a user
        //When: I enter the integer "1"
        IRangeCheck IRC = new ValidAngleCheck();
        boolean result = IRC.getResult(1);
        //Then: I will return true
        assertEquals(true, result);
    }

    @Test
    public void givenTwoReturnTrue() {
        //Given: I am a user
        //When: I enter the integer "2"
        IRangeCheck IRC = new ValidAngleCheck();
        boolean result = IRC.getResult(2);
        //Then: I will return true
        assertEquals(true, result);
    }

    @Test
    public void givenNinetyReturnTrue() {
        //Given: I am a user
        //When: I enter the integer "90"
        IRangeCheck IRC = new ValidAngleCheck();
        boolean result = IRC.getResult(90);
        //Then: I will return true
        assertEquals(true, result);
    }

    @Test
    public void givenZeroReturnFalse() {
        //Given: I am a user
        //When: I enter the integer "0"
        IRangeCheck IRC = new ValidAngleCheck();
        boolean result = IRC.getResult(0);
        //Then: I will return false
        assertEquals(false, result);
    }

    @Test
    public void givenNinetyOneReturnFalse() {
        //Given: I am a user
        //When: I enter the integer "91"
        IRangeCheck IRC = new ValidAngleCheck();
        boolean result = IRC.getResult(91);
        //Then: I will return false
        assertEquals(false, result);
    }
}
