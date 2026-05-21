package hse.programmieren.block7.aufgaben.aufgabe3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarBuilder {

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String rawLine = scanner.nextLine();

            int line;
            try {
                line = Integer.parseInt(rawLine);
            } catch (NumberFormatException exception) {
                System.err.println("Wert muss eine Zahl sein. Bitte erneut eingeben.");
                continue;
            }

            if (line <= 0) {
                System.err.println("Wert muss über 0 sein. Bitte erneut eingeben.");
                continue;
            }

            List<Car> cars = new ArrayList<>(line);

            for (int count = 0; count < line; count++) {
                Car car = new Car();
                cars.add(car);
            }

            System.out.println(cars);
        }

    }


}
