package com.example.testingtargetgame;

public class ValidVelocityCheck implements IRangeCheck {
    public boolean getResult(int num) {
        if (num > 0 && num <= 20) {
            return true;
        }
        return false;
    }
}
