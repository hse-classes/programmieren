package hse.programmieren.block8.aufgaben.aufgabe3;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TestQueue {

    List<TestCar> testCars = new ArrayList<>();

    void addCar(TestCar testCar) {
        this.testCars.add(testCar);
    }

    TestCar getNextCar() {
        if (this.testCars.isEmpty()) {
            return null;
        }
        return this.testCars.getLast();
    }

    TestCar removeNextCar() {
        if (this.testCars.isEmpty()) {
            return null;
        }
        return this.testCars.removeLast();
    }

    int size() {
        return this.testCars.size();
    }

    void sortByYearAscending() {
        this.testCars.sort(Comparator.comparing(TestCar::getYear));
    }

    void printAll() {
        sortByYearAscending();
        for (TestCar testCar : this.testCars) {
            System.out.println(testCar);
        }
    }

    void save(String path) throws Exception {
        Writer writer = new FileWriter(path);
        for (TestCar testCar : this.testCars) {
            String vin = testCar.getVin() + "," +
                    testCar.getModel() + "," +
                    testCar.getYear() + "," +
                    testCar.getTestTyp() + System.lineSeparator();
            writer.write(vin);
        }
        writer.close();
    }

    void load(String path) throws Exception {
        Scanner scanner = new Scanner(new File(path));

        while (scanner.hasNextLine()) {
            String[] rawTestCar = scanner.nextLine().split(",");
            TestCar testCar = new TestCar(
                    rawTestCar[0],
                    rawTestCar[1],
                    Integer.parseInt(rawTestCar[2]),
                    TestTyp.valueOf(rawTestCar[3]));
            this.testCars.add(testCar);
        }
    }
}
