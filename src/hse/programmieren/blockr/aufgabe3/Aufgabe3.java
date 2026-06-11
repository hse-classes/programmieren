package hse.programmieren.blockr.aufgabe3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Aufgabe3 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("_garage.txt"));
        Map<String, Integer> cars = new HashMap<>();

        while (scanner.hasNextLine()) {
            String rawCar = scanner.nextLine();
            Integer carCount = cars.getOrDefault(rawCar, 0);
            cars.put(rawCar, ++carCount);
        }

        for (Map.Entry<String, Integer> entry : cars.entrySet()) {
            System.out.println("Es gibt insgesamt " + entry.getValue() + " mal das Auto " + entry.getKey());
        }

        System.out.println(cars);

        Writer writer = new FileWriter("_vip.txt");

        for (Map.Entry<String, Integer> entry : cars.entrySet()) {
            if (entry.getKey().contains("Porsche")) {
                writer.write(entry.getKey());
            }
        }

        writer.close();
    }
}
