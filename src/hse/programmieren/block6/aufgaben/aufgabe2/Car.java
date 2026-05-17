package hse.programmieren.block6.aufgaben.aufgabe2;

public abstract class Car {

    protected double speed;
    protected SteeringState steeringState;
    protected int kw;
    protected String name;

    public Car(final int kw, final String name) {
        this.kw = kw;
        this.name = name;
    }

    abstract void accelerate(); // Fällt eucht etwas auf?

    abstract void brake();

    abstract void steerLeft(); // Hier auch?

    abstract void steerRight(); // Hier auch?

    public String getName() {
        return name;
    }

    public void steer(SteeringState steeringState) {
        switch (steeringState) {
            case RIGHT -> this.steeringState = SteeringState.STRAIGHT;
            case STRAIGHT, LEFT -> this.steeringState = SteeringState.LEFT; // TODO KMO fix
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", steeringState=" + steeringState +
                '}';
    }
}
