package hse.programmieren.block4deep.aufgaben.aufgabe4;

public class CalculatorTest {

    static void main(String[] args) {
        Calculator calculator = new Calculator(Option.FACTORIAL);

        System.out.println(calculator.process(4));
    }
}
