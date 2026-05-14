package hse.programmieren.block6;

import java.util.ArrayList;

public class Executor {

    static void main(String[] args) {
        Car combustionCar = new CombustionCar(50);
        Car electricalCar = new ElectricalCar(300);
        // Car car = new Car(); geht nicht, da abstract


        System.out.println(combustionCar);
        System.out.println(electricalCar);
        combustionCar.drive();
        electricalCar.drive();

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(combustionCar);
        cars.add(electricalCar);


        Object sum = sum(1, 1);

        System.out.println(sum);

    }

    public static Object sum(Integer a, Object b) {
        return false; // TODO sum mit Number
    }


}
