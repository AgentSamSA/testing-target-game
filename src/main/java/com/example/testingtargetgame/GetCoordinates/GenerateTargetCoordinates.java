package com.example.testingtargetgame.GetCoordinates;

import java.util.Random;

public class GenerateTargetCoordinates implements IGenerateTargetCoordinates {
    public int[] getResult() {
        Random rand = new Random();

        int xCoor = rand.nextInt(10) + 1;
        int yCoor = rand.nextInt(10) + 1;
        
        return new int[] {xCoor, yCoor};
    }
}
