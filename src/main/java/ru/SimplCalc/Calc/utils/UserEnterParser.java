package ru.SimplCalc.Calc.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserEnterParser {
  public int firstPart;
  public int secondPart;
  public String symbol = "";
  public NumType numType;

  public UserEnterParser(String userEnterStr, NumType numType) {
    this.numType = numType;

    Pattern pattern = Pattern.compile("(\\/|-|\\+|\\*)");
    Matcher matcher = pattern.matcher(userEnterStr);

    matcher.find();
    int symbolIndex = matcher.start();
    //парсим числовые выражения в инты (римские -парсим из мапы)
    //если цифры римские
    if (numType == NumType.RIM) {
      /*mapNumbers.addition();*/
      firstPart = RomanNumeral.romanToArabic(userEnterStr.substring(0, symbolIndex));
      secondPart = RomanNumeral.romanToArabic(userEnterStr.substring(symbolIndex + 1));
    } else {
      //если цифры арабские
      firstPart = Integer.parseInt(userEnterStr.substring(0, symbolIndex));
      secondPart = Integer.parseInt(userEnterStr.substring(symbolIndex + 1));
    }
    symbol = String.valueOf(userEnterStr.charAt(symbolIndex));

    //проверяем вхождение от 0 до 10
    if (firstPart > 10 || firstPart < 1) throw new IllegalArgumentException("Вводить можно числа от 0 до 10!");
    if (secondPart > 10 || secondPart < 1) throw new IllegalArgumentException("Вводить можно числа от 0 до 10!");
  }

  @Override
  public String toString() {
    return
        firstPart + "=firstPart, " +
            secondPart + "=secondPart, " +
            symbol + "=symbol" +
            numType + "=numtype";
  }
}
