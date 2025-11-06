package hse.programmieren.block9.solution;

public class Vehicle {

    private String model;
    private double price;
    private Farbe farbe;
    private Motor motor;

    public Vehicle(String model, double price, Farbe farbe, Motor motor) {
        this.model = model;
        this.price = price;
        this.farbe = farbe;
        this.motor = motor;
    }

    public Vehicle() {
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return price;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFarbe(Farbe farbe) {
        this.farbe = farbe;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", farbe=" + farbe +
                ", motor=" + motor +
                '}';
    }
}
