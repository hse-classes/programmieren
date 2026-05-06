package hse.programmieren.block4deep.aufgaben.aufgabe2;

public class CarRentCalculator {

    public double calculate(CarType carType) {
        return switch (carType) {
            case KLEINWAGEN -> 39.99;
            case LIMOUSINE -> 79.99;
            case SUV -> 99.99;
            case SPORTWAGEN -> 149.99;
        };
    }
}
