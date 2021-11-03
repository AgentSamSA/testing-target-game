package com.example.testingtargetgame;

import static org.junit.Assert.assertEquals;

import com.example.testingtargetgame.CompareUserVsTarget.CheckIfTargetHit;
import com.example.testingtargetgame.CompareUserVsTarget.ICheckIfTargetHit;

import org.junit.Test;

public class CheckIfTargetHitTests {
    
    @Test
    public void givenUserOneZeroTargetOneZeroGetTrue() {
        //Given: I am a user
        //When: I have the user be [1, 0] and the target [1, 0]
        ICheckIfTargetHit ICITH = new CheckIfTargetHit();
        boolean result = ICITH.getResult(new int[] {1, 0}, new int[] {1, 0});
        //Then: it should return true
        assertEquals(true, result);
    }

    @Test
    public void givenUserFiveFiveTargetFiveFiveGetTrue() {
        //Given: I am a user
        //When: I have the user be [5, 5] and the target [5, 5]
        ICheckIfTargetHit ICITH = new CheckIfTargetHit();
        boolean result = ICITH.getResult(new int[] {5, 5}, new int[] {5, 5});
        //Then: it should return true
        assertEquals(true, result);
    }

    @Test
    public void givenUserOneOneTargetOneZeroGetTrue() {
        //Given: I am a user
        //When: I have the user be [1, 1] and the target [1, 0]
        ICheckIfTargetHit ICITH = new CheckIfTargetHit();
        boolean result = ICITH.getResult(new int[] {1, 1}, new int[] {1, 0});
        //Then: it should return false
        assertEquals(false, result);
    }
}
