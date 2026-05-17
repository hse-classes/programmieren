package hse.programmieren.block6.aufgaben.aufgabe2;

public class RegularCar extends Car {

    public RegularCar(final int kw, final String name) {
        this(kw, name, 0);
    }

    public RegularCar(final int kw, final String name, final double speed) {
        super(kw, name);
        this.speed = speed;
    }

    @Override
    void accelerate() {
        this.speed = super.speed + (0.1 * kw);
    }

    @Override
    void brake() {
        super.speed -= 2;
    }

    @Override
    void steerLeft() {
        super.steer(SteeringState.LEFT);
        brake();
    }

    @Override
    void steerRight() {
        super.steer(SteeringState.RIGHT);
        brake();
    }
}
