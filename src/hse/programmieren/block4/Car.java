package hse.programmieren.block4;

public class Car {

    private String brand;
    public String model;
    public int price;
    public int odometer;
    public double speed;
    public String color;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void drive() {
        speed = 50;
    }

    public void stop() {
        speed = 0;
    }

    public void steer() {

    }

    public String getBrand() {
        return this.brand;
    }

}
