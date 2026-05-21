package hse.programmieren.block7.aufgaben.aufgabe1;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe12 {

    public static void main(String[] args) {
        Vehicle bmwWithEnoughFuel = new BMW(100);
        Vehicle bmwWithNotEnoughFuel = new BMW(10);

        Vehicle vwWithEnoughEnergy = new VW(100);
        Vehicle vwWithNotEnoughEnergy = new VW(15);

        Vehicle audiWithEnoughPower = new Audi(100, 100);
        Vehicle audiWithNotEnoughPower = new Audi(12, 13);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(bmwWithEnoughFuel);
        vehicles.add(bmwWithNotEnoughFuel);
        vehicles.add(vwWithEnoughEnergy);
        vehicles.add(vwWithNotEnoughEnergy);
        vehicles.add(audiWithEnoughPower);
        vehicles.add(audiWithNotEnoughPower);

        System.out.println("### START ### ");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        System.out.println("### START ### ");
        System.out.println();

        for (int times = 0; times < 30; times++) {
            for (Vehicle vehicle : vehicles) {
                vehicle.drive();
                System.out.println(vehicle);
            }
        }

        for (int times = 0; times < 30; times++) {
            for (Vehicle vehicle : vehicles) {
                vehicle.brake();
                System.out.println(vehicle);
            }
        }

        System.out.println();
        System.out.println("### ENDE ### ");

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }

        System.out.println("### ENDE ### ");

    }
}
