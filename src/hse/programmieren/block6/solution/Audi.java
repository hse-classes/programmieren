package hse.programmieren.block6.solution;

public class Audi extends Vehicle implements Electric, Combustion {

    public int energyLevel;
    private int fuelLevel;

    @Override
    public void drive() {
        this.speed += 20;
        consume(10);
    }

    @Override
    public void brake() {
        this.speed -= 20;
        add(1);
    }

    @Override
    public void add(int value) {
        this.energyLevel += value;
    }

    @Override
    public void consume(int value) {
        this.energyLevel -= value;
        this.fuelLevel -= value;
    }

    public int getEnergyLevel() {
        return this.energyLevel;
    }

    public int getFuelLevel() {
        return this.fuelLevel;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "energyLevel=" + energyLevel +
                ", fuelLevel=" + fuelLevel +
                ", speed=" + speed +
                '}';
    }
}
