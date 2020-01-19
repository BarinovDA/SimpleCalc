package ru.SimplCalc.calc.utils;

public class UserString {
    private  String userStr ="";

    public UserString(String userStr) {
        this.userStr = userStr;
    }

    public  String getUserStr() {
        return userStr;
    }

    public  boolean getBoolean (){
        return userStr.equals("stop");
    }
}
