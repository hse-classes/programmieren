package hse.programmieren.block7.aufgaben.aufgabe3;

public class Car {

    private String color;
    private int price;

    public Car() {
        this.color = "red";
        this.price = 1_000_000;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
