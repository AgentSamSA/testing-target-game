package com.example.testingtargetgame.UserInput;

public class ConvertToInt implements IConvertToInt {
    public int getResult(String s) {
        return Integer.parseInt(s);
    }
}
