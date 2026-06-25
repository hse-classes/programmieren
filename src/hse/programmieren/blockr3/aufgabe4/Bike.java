package hse.programmieren.blockr3.aufgabe4;

public class Bike extends Vehicle{

    public Bike(final String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Bike:" + super.getName();
    }
}
