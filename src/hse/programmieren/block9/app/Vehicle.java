package hse.programmieren.block9.app;

public class Vehicle {

    private final String model;
    private final Engine engine;
    private final double price;
    private final Color color;

    public Vehicle(final String model, final double price, final Engine engine, final Color color) {
        this.model = model;
        this.price = price;
        this.engine = engine;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }
}
