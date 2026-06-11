package hse.programmieren.blockr.aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe4 {

    public static void main(String[] args) {
        List<TheInterface> vehicles = new ArrayList<>(16);

        for (int index = 0; index < 4; index++) {
            TheInterface bike = new Bike("the brand no.: " + index, 1 + index * index);
            TheInterface car = new Car("the brand no.: " + index, 2 + index * index);
            TheInterface skateboard = new Skateboard("the brand no.: " + 3 + index, index * index);

            vehicles.add(bike);
            vehicles.add(car);
            vehicles.add(skateboard);
        }

        for (TheInterface vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
