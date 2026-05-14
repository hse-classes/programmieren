package hse.programmieren.block6.aufgaben.aufgabe2;

public class RegularCar extends Car {

    public RegularCar(final int kw, final String name) {
        super(kw, name);
    }

    @Override
    void accelerate() {
        super.speed = super.speed + (0.1 * kw);
    }

    @Override
    void brake() {
        super.speed -= 2;
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
