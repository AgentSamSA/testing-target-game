package com.example.testingtargetgame;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import com.example.testingtargetgame.GetCoordinates.GetUserCoordinates;
import com.example.testingtargetgame.GetCoordinates.IGetUserCoordinates;

import org.junit.Test;

public class GetUserCoordinatesTests {
    
    @Test
    public void givenDegreeOneVelocityOneGetOneZero() {
        //Given: I am a user
        //When: I have the angle of degree "1" and velocity of "1"
        IGetUserCoordinates IGUC = new GetUserCoordinates();
        int[] result = IGUC.getResult(1, 1);
        //Then: I get the coordinates [1, 3]
        assertEquals(Arrays.toString(new int[] {1, 0}), Arrays.toString(result));
    }

    @Test
    public void givenDegreeOneVelocityTwoGetTwoZero() {
        //Given: I am a user
        //When: I have the angle of degree "1" and velocity of "2"
        IGetUserCoordinates IGUC = new GetUserCoordinates();
        int[] result = IGUC.getResult(1, 2);
        //Then: I get the coordinates [2, 0]
        assertEquals(Arrays.toString(new int[] {2, 0}), Arrays.toString(result));
    }

    @Test
    public void givenDegreeFortyFiveVelocityTenGetSevenSeven() {
        //Given: I am a user
        //When: I have the angle of degree "45" and velocity of "10"
        IGetUserCoordinates IGUC = new GetUserCoordinates();
        int[] result = IGUC.getResult(45, 10);
        //Then: I get the coordinates [7, 7]
        assertEquals(Arrays.toString(new int[] {7, 7}), Arrays.toString(result));
    }

    @Test
    public void givenDegreeNinetyVelocityTwentyGetZeroTwenty() {
        //Given: I am a user
        //When: I have the angle of degree "90" and velocity of "20"
        IGetUserCoordinates IGUC = new GetUserCoordinates();
        int[] result = IGUC.getResult(90, 20);
        //Then: I get the coordinates [0, 20]
        assertEquals(Arrays.toString(new int[] {0, 20}), Arrays.toString(result));
    }
}
