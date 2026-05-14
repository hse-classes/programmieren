package hse.programmieren.block6;

public class CombustionCar extends Car {

    private double fuelLevel;

    public CombustionCar(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void refuel(double fuel) {
        this.fuelLevel += fuel;
    }

    @Override
    public void drive() {
        this.fuelLevel--;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }
}
