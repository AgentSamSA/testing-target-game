package com.example.testingtargetgame.UserInput;

public class IntegerCheck implements IIntegerCheck {
    public boolean getResult(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
