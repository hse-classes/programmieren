package hse.programmieren.block7.aufgaben.aufgabe1;

public abstract class Vehicle {

    protected int speed;
    protected int speedLimit;

    protected Vehicle(final int speed, final int speedLimit) {
        this.speed = speed;
        this.speedLimit = speedLimit;
    }

    public void drive() {
        if (this.speed <= speedLimit) {
            this.speed += 10;
        }
    }

    public void brake() {
        if (this.speed >= 10) {
            this.speed -= 10;
        }
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                '}';
    }
}
