package hse.programmieren.block7.aufgaben.aufgabe1;

public class VW extends Vehicle implements Powerable {

    private double energy;

    private static int SPEED_LIMIT = 200;

    public VW(final double energy) {
        super(0, SPEED_LIMIT);
        this.energy = energy;
    }

    @Override
    public void drive() {
        if (hasEnergy()) {
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
        return EngineType.ELECTRIC;
    }

    @Override
    public void add(final double amount) {
        this.energy += amount;
    }

    @Override
    public void consume(final double amount) {
        if (hasEnergy()) {
            this.energy -= amount;
        }
    }

    private boolean hasEnergy() {
        return this.energy != 0;
    }

    public double getEnergy() {
        return energy;
    }

    @Override
    public String toString() {
        return "VW{" +
                "type=" + getEngineType() +
                ", energy=" + energy +
                ", speed=" + speed +
                '}';
    }
}
