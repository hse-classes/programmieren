package hse.programmieren.block9.solution;

import hse.programmieren.exam.ss25.classes.Auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorySimulation {

    void main() {

        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                System.exit(0);
            } else if (command.equals("commandlist") || command.equals("help")) {
                System.out.println("exit, commandlist, help, vehiclelist, build");
            } else if (command.equals("build")) {
                vehicleList.add(build(scanner));
            } else if (command.equals("vehiclelist")) {
                for(Vehicle vehicle : vehicleList){
                    System.out.println(vehicle);
                }
            }
            else if (command.equals("vehiclelist2")) {
                System.out.println(vehicleList);
            }
        }

    }

    //private static void build(Scanner scanner, ArrayList<Vehicle> vehicleList) {
    private static Vehicle build(Scanner scanner) {
        System.out.println("Preis?");
        final double price = readPrice(scanner);
        System.out.println("Farbe?");
        final Farbe color = readFarbe(scanner);
        System.out.println("Model?");
        final String model = readModel(scanner);
        System.out.println("Motor?");
        final Motor motor = readMotor(scanner);

        Vehicle vehicle = new Vehicle(model, price, color, motor);
        //vehicleList.add(vehicle);
        return vehicle;

    }

    public static Motor readMotor(Scanner scanner) {
        String rawMotor = scanner.nextLine();
        String[] motorComponents = rawMotor.split(",");
        double hubraum = Double.parseDouble(motorComponents[0]);
        int ps = Integer.parseInt(motorComponents[1]);
        Motor motor = new Motor(hubraum, ps, motorComponents[2]);
        return motor;
    }

    public static double readPrice(Scanner scanner) {
        try {
            String rawPrice = scanner.nextLine();
            double price = Double.parseDouble(rawPrice);

            if (price <= 0) {
                return readPrice(scanner);
            }

            return price;
        } catch (NumberFormatException exception) {
            return readPrice(scanner);
        }
    }

    public static Farbe readFarbe(Scanner scanner) {
        try {
            String rawFarbe = scanner.nextLine().toUpperCase();
            return Farbe.valueOf(rawFarbe);
        } catch (IllegalArgumentException exception) {
            return readFarbe(scanner);
        }

    }

    public static String readModel(Scanner scanner) {
        String rawModel = scanner.nextLine();
        if(rawModel.trim().isEmpty()) {
            System.out.println("Bitte etwas eingeben.");
            return readModel(scanner);
        }
        return rawModel;
    }
}
