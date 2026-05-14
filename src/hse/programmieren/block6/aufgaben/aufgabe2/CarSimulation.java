package hse.programmieren.block6.aufgaben.aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class CarSimulation {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new SportsCar(280, "Seat Leon Cupra"));
        cars.add(new SportsCar(190, "Seat Leon FR"));
        cars.add(new RegularCar(116, "Seat Leon"));

        for (Car car : cars) {
            car.accelerate();
            car.accelerate();
            car.accelerate();
            car.steerLeft();
            car.steerRight();
            car.steerRight();
            System.out.println(car);
        }

    }

}
