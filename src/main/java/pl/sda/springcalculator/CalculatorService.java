package pl.sda.springcalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorService {

    public double calculate(String sentValue){
        Pattern pattern = Pattern.compile("(\\d+)(\\D+)(\\d+)");
        Matcher matcher = pattern.matcher(sentValue);
        if (matcher.matches()) {
            String number1 = matcher.group(1);
            String sign = matcher.group(2).trim();
            String number2 = matcher.group(3);

            Integer num1 = Integer.valueOf(number1);
            Integer num2 = Integer.valueOf(number2);

            if (sign.equals("+")) {
                return num1 + num2;
            }
        }
        return 0;
    }

}
