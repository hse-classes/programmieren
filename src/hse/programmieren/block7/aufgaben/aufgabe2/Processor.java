package hse.programmieren.block7.aufgaben.aufgabe2;

public class Processor {

    public static int process(int number) {
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

        System.out.println("number: " + number1);
        System.out.println("number2: " + number2);

        return process(number1 / 10, number2 * 10 + number1 % 10);
    }

    public static void main(String[] args) {
        int result = process(123);
        System.out.println(result);

        int result2 = process(123, 0);
        System.out.println(result2);

        /*
        process(123);
        number: 12
        number2: 3
        number: 1
        number2: 32
        number: 0
        number2: 321
         */

        /*
        process(123,0)
        number: 123
        number2: 0
        number: 12
        number2: 3
        number: 1
        number2: 32
         */
    }
}
