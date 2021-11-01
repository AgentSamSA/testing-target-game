package com.example.testingtargetgame.GetCoordinates;

public class GetUserCoordinates implements IGetUserCoordinates {
    public int[] getResult(int angle, int velocity) {
        Double angleToRadians = angle * Math.PI / 180;
        int xCoor = (int) Math.round(Math.cos(angleToRadians) * velocity);
        int yCoor = (int) Math.round(Math.sin(angleToRadians) * velocity);

        return new int[] {xCoor, yCoor};
    }
}
