package strategy.zadanie;

public class Main {
    public static void main(String[] args) {
        //Zastosować wzorzec strategia
        Calculator calculator = new Calculator();

        System.out.println(calculator.calculate(12,3, "add"));
        System.out.println(calculator.calculate(12,3, "multiply"));
        System.out.println(calculator.calculate(12,3, "divide"));
        System.out.println(calculator.calculate(12,3, "subtract"));

    }
}
