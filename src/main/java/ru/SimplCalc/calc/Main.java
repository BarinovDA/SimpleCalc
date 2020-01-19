package ru.SimplCalc.calc;

import ru.SimplCalc.calc.app.Calc;
import ru.SimplCalc.calc.utils.MapNumbers;
import ru.SimplCalc.calc.utils.UserString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        boolean cycle = true;
        UserString userString;
        while (cycle == true) {
            userString = new UserString(bufferedReader.readLine());
            //пока не ввели слово stop продолжаем считать
            if (userString.getBoolean()) break;
            Calc.doWhatYouMast(userString);
        }
    }
}
