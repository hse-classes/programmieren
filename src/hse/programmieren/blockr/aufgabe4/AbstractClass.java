package hse.programmieren.blockr.aufgabe4;

public abstract class AbstractClass {

    protected String brand;
    protected double price;

    protected AbstractClass(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "AbstractClass{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
