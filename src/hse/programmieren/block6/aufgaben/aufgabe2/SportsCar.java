package hse.programmieren.block6.aufgaben.aufgabe2;

public class SportsCar extends Car {

    public SportsCar(final int kw, final String name) {
        super(kw, name);
    }

    @Override
    void accelerate() {
        super.speed = super.speed + (0.1 * kw);
    }

    @Override
    void brake() {
        super.speed -= 3;
    }

    @Override
    void steerLeft() {
        super.steer(SteeringState.LEFT);
    }

    @Override
    void steerRight() {
        super.steer(SteeringState.RIGHT);
    }
}
