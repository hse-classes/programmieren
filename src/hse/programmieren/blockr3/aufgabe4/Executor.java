package hse.programmieren.blockr3.aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    public static void main(String[] args) {
        Vehicle bike1 = new Bike("sport bike");
        Vehicle bike2 = new Bike("city bike");
        Vehicle bike3 = new Bike("mountain bike");

        Vehicle skateboard1 = new Skateboard("longboard");
        Vehicle skateboard2 = new Skateboard("regular");
        Vehicle skateboard3 = new Skateboard("short");

        List<Vehicle> bikesAndSkateboards = new ArrayList<>();
        bikesAndSkateboards.add(bike1);
        bikesAndSkateboards.add(bike2);
        bikesAndSkateboards.add(bike3);
        bikesAndSkateboards.add(skateboard1);
        bikesAndSkateboards.add(skateboard2);
        bikesAndSkateboards.add(skateboard3);

        for (Vehicle vehicle : bikesAndSkateboards) {
            System.out.println(vehicle);
        }
    }
}
