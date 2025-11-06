package hse.programmieren.block7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchExceptions {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        try {
            final byte number = scanner.nextByte();
            System.out.println(number);
        } catch (InputMismatchException exception) {
            System.err.println("hey, nur Zahlen erlaubt!");
        } catch (IllegalArgumentException e) {
            System.err.println("hey, nur Zahlen erlaubt!");
        }

    }
}
