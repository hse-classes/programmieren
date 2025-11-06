package hse.programmieren.block6.task;

public class CombustionCar {
    // eigenschaften
    int wheels = 4;
    int fuelLevel;
    int horsepower;

    public CombustionCar(int fuelLevel, int horsepower) {
        this.fuelLevel = fuelLevel;
        this.horsepower = horsepower;
    }

    // methoden
    public void drive() {
        this.fuelLevel -= 10;
        System.out.println("Vroom");
    }

    public int refuel(int fuel) {
        this.fuelLevel += fuel;
        return this.fuelLevel;
    }

    @Override
    public String toString() {
        return "CombustionCar{" + wheels + "," + fuelLevel + ", " + horsepower + "}";
    }
}
