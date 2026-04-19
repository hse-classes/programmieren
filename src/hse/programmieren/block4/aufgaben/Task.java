package hse.programmieren.block4.aufgaben;

import java.util.*;

public class Task {

    static void main() {
        whileLoop();
    }

    // Array
    public static void printEverySecondCar() {
        // 10 cars
        String[] vehicles = {"BMW", "Audi", "VW", "Mercedes", "Seat", "Skoda", "Ford", "Tesla", "Fiat", "Porsche"};

        for (int i = 0; i < vehicles.length; i += 2) {

            System.out.println(vehicles[i]);
        }


    }

    // ArrayList
    public static void printReversedCars() {
        // 10 cars
        ArrayList<String> vehicles = new ArrayList<>();
        vehicles.add("BMW");
        vehicles.add("Audi");
        vehicles.add("VW");
        vehicles.add("Mercedes");
        vehicles.add("Seat");
        vehicles.add("Skoda");
        vehicles.add("Ford");
        vehicles.add("Tesla");
        vehicles.add("Fiat");
        vehicles.add("Porsche");

        for (int i = vehicles.size() - 1; i >= 0; i--) {
            System.out.println(vehicles.get(i));
        }
    }

    // Iterator
    public static void printAndDeleteCars() {
        // 10 cars
        ArrayList<String> vehicles = new ArrayList<String>();
        vehicles.add("BMW");
        vehicles.add("Audi");
        vehicles.add("VW");
        vehicles.add("Mercedes");
        vehicles.add("Seat");
        vehicles.add("Skoda");
        vehicles.add("Ford");
        vehicles.add("Tesla");
        vehicles.add("Fiat");
        vehicles.add("Porsche");
        Iterator<String> iterator = vehicles.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
        System.out.println(vehicles);
    }

    // HashMap
    public static void printMostExpensiveCar() {
        // 10 cars
        HashMap<String, Integer> vehicles = new HashMap<>();
        vehicles.put("BMW", 40_000);
        vehicles.put("Audi", 44_000);
        vehicles.put("VW", 41_000);
        vehicles.put("Mercedes", 49_000);
        vehicles.put("Seat", 35_000);
        vehicles.put("Skoda", 35_000);
        vehicles.put("Ford", 33_000);
        vehicles.put("Tesla", 60_000);
        vehicles.put("Fiat", 10_000);
        vehicles.put("Bobbycar", 20);
        vehicles.put("Porsche", 99_000);
        int biggestPrice = 0;
        String nameoftheCar = "undefined";


        for (Map.Entry<String, Integer> entry : vehicles.entrySet()) {
            if (biggestPrice < entry.getValue()) {
                biggestPrice = entry.getValue();
                nameoftheCar = entry.getKey();
            }
        }
        System.out.println("Auto: " + nameoftheCar + "Preis: " + biggestPrice);


    }

    // HashSet
    public static void printDistinctCars() {
        // 10 cars
        HashSet<String> vehicles = new HashSet<>();
        vehicles.add("BMW");
        vehicles.add("BMW");
        vehicles.add("VW");
        vehicles.add("Mercedes");
        vehicles.add("Seat");
        vehicles.add("Skoda");
        vehicles.add("Ford");
        vehicles.add("Tesla");
        vehicles.add("Fiat");
        vehicles.add("Fiat");
        for (String vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public static void forLoop() {
        int currentMileage = 47_500;
        int serviceInterval = 50_000;
        int dailyDistance = 150;
        int day = 1;

        for (; ; day++) {
            currentMileage += dailyDistance;
            System.out.println("Tag " + day + ": " + currentMileage);
            if (currentMileage > serviceInterval) {
                System.out.println("Service erforderlich");
                break;
            }
        }
    }

    public static void whileLoopBefore() {
        System.out.println("Reifendruckkontrolle");

        for (int tire = 1; tire <= 4; tire++) {
            System.out.println("Prüfe Reifen " + tire);

            int pressure = (new Random().nextInt(10)) + 15;
            System.out.println("Druck: " + pressure + " bar");

            if (pressure >= 20) {
                System.out.println("Reifen " + tire + " OK");
                continue;
            }

            System.out.println("WARNUNG: Reifen " + tire + " zu wenig Druck!");
            System.out.println("Reifen " + tire + " muss aufgepumpt werden");
        }

        System.out.println("Reifendruckkontrolle beendet");
    }

    public static void whileLoop() {
        System.out.println("Reifendruckkontrolle");

        int tire = 0;
        while (tire < 4) {
            tire++;
            System.out.println("Prüfe Reifen " + tire);

            int pressure = (new Random().nextInt(10)) + 15;
            System.out.println("Druck: " + pressure + " bar");

            if (pressure >= 20) {
                System.out.println("Reifen " + tire + " OK");
                continue;
            }

            System.out.println("WARNUNG: Reifen " + tire + " zu wenig Druck!");
            System.out.println("Reifen " + tire + " muss aufgepumpt werden");
        }

        System.out.println("Reifendruckkontrolle beendet");
    }

}
