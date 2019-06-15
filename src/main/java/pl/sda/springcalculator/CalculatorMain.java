package pl.sda.springcalculator;

public class CalculatorMain {

    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        double result = calculatorService.calculate("4+3");
        System.out.println(result);

    }
}
