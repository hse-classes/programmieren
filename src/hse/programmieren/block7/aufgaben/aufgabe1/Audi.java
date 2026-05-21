package hse.programmieren.block7.aufgaben.aufgabe1;

public class Audi extends Vehicle implements Powerable {

    private double fuel;
    private double energy;

    private static int SPEED_LIMIT = 170;

    public Audi(final double fuel, final double energy) {
        super(0, SPEED_LIMIT);
        this.fuel = fuel;
        this.energy = energy;
    }

    @Override
    public void drive() {
        if (hasPower()) {
            super.drive();
            this.consume(1);
        } else {
            super.speed = 0;
        }
    }

    @Override
    public void brake() {
        if (this.speed >= 10) {
            super.brake();
            this.energy++;
        }
    }

    @Override
    public EngineType getEngineType() {
        return EngineType.HYBRID;
    }

    @Override
    public void add(final double amount) {
        this.fuel += amount;
        this.energy += amount;
    }

    @Override
    public void consume(final double amount) {
        if (hasPower()) {
            this.fuel -= amount;
            this.energy -= amount;
        }
    }

    private boolean hasPower() {
        return this.fuel > 0 && this.energy > 0;
    }

    public double getFuel() {
        return fuel;
    }

    public double getEnergy() {
        return energy;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "type=" + this.getEngineType() +
                ", fuel=" + this.fuel +
                ", energy=" + this.energy +
                "} " + super.toString();
    }
}
