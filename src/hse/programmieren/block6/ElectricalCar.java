package hse.programmieren.block6;

public class ElectricalCar extends Car {

    private double batteryLevel;

    public ElectricalCar(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void charge(double fuel) {
        this.batteryLevel += fuel;
    }

    @Override
    public void drive() {
        this.batteryLevel--;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }
}
