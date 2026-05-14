package hse.programmieren.block6.aufgaben.aufgabe1;

public class Processor {

    public static void main(String[] args) {
        Processor processor = new Processor();

        Number result = processor.process(16, null);
        System.out.println(result);

        for (Option option : Option.values()) {
            System.out.println(processor.process(16, option));
        }

    }

    public Number process(Integer input, Option option) {
        if (input == null) {
            return null;
        }

        return switch (option) {
            case null -> input;
            case NONE -> input;
            case INCREMENT -> input + 1;
            case DOUBLE -> input * 2;
            case MULTIPLICATIVE_INVERSE -> 1 / input;
            case DIVIDE_BY_ZERO -> input / 0; // Diese Aufgabenstellung macht keinen Sinn, durch 0 kann nie geteilt werden
            case SQUARE_ROOT -> Math.sqrt(input);
            case FACTORIAL -> factorial(input);
        };
    }

    private long factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
