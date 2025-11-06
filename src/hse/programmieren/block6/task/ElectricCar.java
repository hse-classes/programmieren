package hse.programmieren.block6.task;

import java.io.Serializable;

public class ElectricCar extends Vehicle implements Electrical, Serializable, Chargable {
    // eigenschaften
    int batteryLevel;
    int horsepower;

    public ElectricCar(int batteryLevel, int horsepower) {
        super(4, horsepower);
        this.batteryLevel = batteryLevel;
    }

    public void load(int kWh) {
        this.batteryLevel += kWh;
    }

    @Override
    public void drive() {
        System.out.println("Whirr..");
    }

    @Override
    public String toString() {
        return "ElectricCar{" + super.toString() + this.horsepower + "," + batteryLevel+"}";
    }

    @Override
    public void charge() {
        this.batteryLevel+=10;
    }
}
