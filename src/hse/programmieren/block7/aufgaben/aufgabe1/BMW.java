package hse.programmieren.block7.aufgaben.aufgabe1;

public class BMW extends Vehicle implements Powerable {

    private double fuel;
    private static int SPEED_LIMIT = 240;

    public BMW(final double fuel) {
        super(0, SPEED_LIMIT);
        this.fuel = fuel;
    }

    @Override
    public void drive() {
        if (hasFuel()) {
            super.drive();
            this.consume(2);
        } else {
            super.speed = 0;
        }
    }

    @Override
    public void brake() {
        if (this.speed >= 10) {
            super.brake();
        }
    }

    @Override
    public EngineType getEngineType() {
        return EngineType.PETROL;
    }

    @Override
    public void add(final double amount) {
        this.fuel += amount;
    }

    @Override
    public void consume(final double amount) {
        if (hasFuel()) {
            this.fuel -= amount;
        }
    }

    private boolean hasFuel() {
        return this.fuel > 1;
    }

    public double getFuel() {
        return fuel;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "type=" + this.getEngineType() +
                ", fuel=" + this.fuel +
                ", speed=" + super.speed +
                '}';
    }
}
