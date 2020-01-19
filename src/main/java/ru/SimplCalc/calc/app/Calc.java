package ru.SimplCalc.calc.app;

import ru.SimplCalc.calc.utils.UserEnterParser;
import ru.SimplCalc.calc.utils.UserString;
import ru.SimplCalc.calc.utils.UserEnterHandler;

import java.util.Map;

public class Calc {
    private static UserEnterParser userEnterParser;

    public static void doWhatYouMast (UserString userString) {
        try {
            userEnterParser = UserEnterHandler.validate(userString);
        }catch (Exception e){
            System.out.println("Not validate parameters!" + e);
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
        System.out.print(result);
        System.out.println("");
    }
}
