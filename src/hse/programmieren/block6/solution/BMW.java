package hse.programmieren.block6.solution;

public class BMW extends Vehicle implements Combustion {

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
        this.fuelLevel += value;
    }

    @Override
    public void consume(int value) {
        this.fuelLevel -= value;
    }

    public int getFuelLevel() {
        return this.fuelLevel;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "speed=" + speed +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}
