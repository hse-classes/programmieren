package hse.programmieren.blockr.aufgabe4;

public class Car extends AbstractClass implements TheInterface {

    public Car(final String brand, final double price) {
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
