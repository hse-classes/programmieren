package hse.programmieren.blockr.aufgabe4;

public class Bike extends AbstractClass implements TheInterface {

    public Bike(final String brand, final double price) {
        super(brand, price);
    }

    @Override
    public String getBrand() {
        return super.brand;
    }

    @Override
    public double getPrice() {
        return super.price;
    }
}
