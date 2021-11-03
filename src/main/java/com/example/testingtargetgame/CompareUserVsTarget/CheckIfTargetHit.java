package com.example.testingtargetgame.CompareUserVsTarget;

import java.util.Arrays;

public class CheckIfTargetHit implements ICheckIfTargetHit {
    public boolean getResult(int[] user, int[] target) {
        return Arrays.equals(user, target);
    }
}
