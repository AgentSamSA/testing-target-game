package com.example.testingtargetgame.UserInput;

public class ValidAngleCheck implements IRangeCheck {
    public boolean getResult(int num) {
        if (num > 0 && num <= 90) {
            return true;
        }
        return false;
    }
}
