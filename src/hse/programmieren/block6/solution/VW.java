package hse.programmieren.block6.solution;

public class VW extends Vehicle implements Electric {

    private int energyLevel;

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
    }

    public int getEnergyLevel() {
        return this.energyLevel;
    }

    @Override
    public String toString() {
        return "VW{" +
                "speed=" + speed +
                ", energyLevel=" + energyLevel +
                '}';
    }
}
