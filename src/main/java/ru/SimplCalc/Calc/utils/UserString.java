package ru.SimplCalc.Calc.utils;

public class UserString {
    private  String userStr ="";

    public UserString(String userStr) {
        this.userStr = userStr;
    }

    public  String getUserStr() {
        return userStr;
    }

    public  boolean isStop(){
        return userStr.toLowerCase().equals("stop");
    }
}
