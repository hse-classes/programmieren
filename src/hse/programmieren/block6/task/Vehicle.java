package hse.programmieren.block6.task;

public abstract class Vehicle extends Object {
    // eigenschaften
    int wheels = 4;
    int horsepower;

    public Vehicle(int wheels, int horsepower) {
        this.wheels = wheels;
        this.horsepower = horsepower;
    }

    // methoden
    public abstract void drive();

    @Override
    public String toString() {
        return "Vehicle{" + wheels + ", " + horsepower + "}" + super.toString();
    }
}
