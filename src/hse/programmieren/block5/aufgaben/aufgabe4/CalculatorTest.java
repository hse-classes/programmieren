package hse.programmieren.block5.aufgaben.aufgabe4;

public class CalculatorTest {

    static void main(String[] args) {
        Calculator calculator = new Calculator(Option.SQUARE_ROOT);

        System.out.println(calculator.process(4));
    }
}
