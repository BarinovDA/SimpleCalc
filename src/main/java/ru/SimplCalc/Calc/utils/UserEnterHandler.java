package ru.SimplCalc.Calc.utils;

    import java.util.regex.Pattern;

public class UserEnterHandler {


    public static UserEnterParser validate(UserString userEnter) throws IllegalArgumentException {

        String reExArabian = "\\d{1,2}(\\+|-|\\*|\\/)\\d{1,2}";
        String reExRim = "[IVXLC]{1,4}(\\+|-|\\*|\\/)[IVXLC]{1,4}";

        String userEnterStr = userEnter.getUserStr();
        UserEnterParser userEnterParser;
        if (Pattern.matches(reExArabian, userEnterStr)) {
            return userEnterParser = new UserEnterParser(userEnterStr, NumType.ARABIAN);
        } else if (Pattern.matches(reExRim, userEnterStr)) {
            return userEnterParser = new UserEnterParser(userEnterStr, NumType.RIM);
        }
        throw new IllegalArgumentException("Калькулятор считает только однотипные цифры!");
    }
}
