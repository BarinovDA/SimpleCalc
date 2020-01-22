package ru.SimplCalc.Calc;

import ru.SimplCalc.Calc.app.Calc;
import ru.SimplCalc.Calc.utils.UserString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        UserString userString;
        while (true) {
            userString = new UserString(bufferedReader.readLine());
            //пока не ввели слово stop продолжаем считать
            if (userString.isStop()) break;
            Calc.doWhatYouMast(userString);
        }
    }
}
