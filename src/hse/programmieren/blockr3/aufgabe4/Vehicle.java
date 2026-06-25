package hse.programmieren.blockr3.aufgabe4;

public abstract class Vehicle {

    private String name;

    protected Vehicle(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
