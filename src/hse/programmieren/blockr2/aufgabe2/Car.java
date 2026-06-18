package hse.programmieren.blockr2.aufgabe2;

import java.util.List;

public class Car {

	private String vin;
	private List<Error> errors;
	private Color color;
	private double price;
	private Owner owner;
	private double odometer;

	public Car() {
	}

    public String getVin() {
        return vin;
    }

    public void setVin(final String vin) {
        this.vin = vin;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(final List<Error> errors) {
        this.errors = errors;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(final Color color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(final Owner owner) {
        this.owner = owner;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(final double odometer) {
        this.odometer = odometer;
    }
}