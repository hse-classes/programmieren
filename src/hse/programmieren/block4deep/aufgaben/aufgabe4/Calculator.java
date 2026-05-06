package hse.programmieren.block4deep.aufgaben.aufgabe4;

public class Calculator {

    private final Option option;

    public Calculator(final Option option) {
        this.option = option;
    }

    public String process(int input) {
        return switch (this.option) {
            case NONE -> "";
            case INCREMENT -> "" + input + 1;
            case DOUBLE -> "" + input * 2;
            case MULTIPLICATIVE_INVERSE -> "" + 1 / input;
            case IS_EVEN -> "" + (input % 2 == 0);
            case SQUARE_ROOT -> "" + Math.sqrt(input);
            case FACTORIAL -> "" + factorial(input);
        };
    }

    long factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }

}
