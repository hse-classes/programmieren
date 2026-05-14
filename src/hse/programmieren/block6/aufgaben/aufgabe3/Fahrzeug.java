package hse.programmieren.block6.aufgaben.aufgabe3;

public class Fahrzeug {

    int odometer;
    String vin;
    String model;
    double price;

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "odometer=" + odometer +
                '}';
    }
}
