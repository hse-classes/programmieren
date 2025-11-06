package hse.programmieren.block7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowExceptions {

    static void main() throws Blabla {
        Scanner scanner = new Scanner(System.in);

        final Number number = scanner.nextInt();

        if (number.equals(0)) {
            throw new Blabla("Ungültige Zahl, Programm wird gestoppt");
        }

        System.out.println(number);

    }
}
