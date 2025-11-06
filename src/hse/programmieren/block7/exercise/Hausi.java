package hse.programmieren.block7.exercise;

public class Hausi {

    public static int process(int number) {

        Number a  = 1;
        Integer b = 2;
        Double c = 4.5;

        c.doubleValue();



        int number2 = 0;

        while (number > 0) {
            number2 = number2 * 10 + (number % 10);
            number = number / 10;
        }

        return number2;
    }

    public static int process(int number1, int number2) {
        if (number1 == 0) {
            return number2;
        }
        return process(number1 / 10, number2 * 10 + number1 % 10);
    }


}
