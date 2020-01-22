package ru.SimplCalc.Calc.app;

import ru.SimplCalc.Calc.utils.*;

public class Calc {
    private static UserEnterParser userEnterParser;

    public static void doWhatYouMast (UserString userString) {
        try {
            userEnterParser = UserEnterHandler.validate(userString);
        }catch (Exception e){
            System.out.println("Не корректный ввод" + e);
            System.exit(1);
        }
        calculate(userEnterParser);
    }

    public static void calculate (UserEnterParser userEnterParser){
        int a = userEnterParser.firstPart;
        int b = userEnterParser.secondPart;
        int result;

        switch (userEnterParser.symbol){
            case ("+"):
                result = a+b;
                break;
            case ("-"):
                result = a-b;
                break;
            case ("*"):
                result = a*b;
                break;
            case ("/"):
                result = a/b;
                break;
            default:
                throw new IllegalArgumentException("Допустимые действия +,-,*,/");
        }
        if (userEnterParser.numType == NumType.RIM){
            System.out.print(RomanNumeral.arabicToRoman(result));
        }
        System.out.print(" Arabic-" + result);
        System.out.println("");
    }
}
