package hse.programmieren.blockr3.aufgabe4;

public class Skateboard extends Vehicle{

    public Skateboard(final String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Skateboard:" + super.getName();
    }
}
