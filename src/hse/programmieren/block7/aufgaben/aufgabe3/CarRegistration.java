package hse.programmieren.block7.aufgaben.aufgabe3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CarRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie das Baujahr des Autos ein: ");

        while (scanner.hasNextInt()) {

            int constructionYear;
            try {
                constructionYear = scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.err.println("Wert muss eine Zahl sein. Bitte erneut eingeben.");
                continue;
            }

            if (constructionYear <= 0) {
                System.err.println("Wert muss über 0 sein. Bitte erneut eingeben.");
                continue;
            }

            System.out.println("Fahrzeug mit Baujahr " + constructionYear + " erfolgreich erfasst.");
        }
    }
}