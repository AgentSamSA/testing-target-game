package com.example.testingtargetgame;

import static org.junit.Assert.assertEquals;

import com.example.testingtargetgame.UserInput.ConvertToInt;
import com.example.testingtargetgame.UserInput.IConvertToInt;

import org.junit.Test;

public class ConvertToIntTests {
    
    @Test
    public void givenOneGetOne() {
        //Given: I am a user
        //When: I have the string "1"
        IConvertToInt ICTI = new ConvertToInt();
        int result = ICTI.getResult("1");
        //Then: I should get the integer 1
        assertEquals(1, result);
    }

    @Test
    public void givenTwoGetTwo() {
        //Given: I am a user
        //When: I have the string "2"
        IConvertToInt ICTI = new ConvertToInt();
        int result = ICTI.getResult("2");
        //Then: I should get the integer 2
        assertEquals(2, result);
    }

    @Test
    public void givenOneGetTwenty() {
        //Given: I am a user
        //When: I have the string "20"
        IConvertToInt ICTI = new ConvertToInt();
        int result = ICTI.getResult("20");
        //Then: I should get the integer 20
        assertEquals(20, result);
    }

    @Test
    public void givenNinetyGetNinety() {
        //Given: I am a user
        //When: I have the string "90"
        IConvertToInt ICTI = new ConvertToInt();
        int result = ICTI.getResult("90");
        //Then: I should get the integer 90
        assertEquals(90, result);
    }
}
