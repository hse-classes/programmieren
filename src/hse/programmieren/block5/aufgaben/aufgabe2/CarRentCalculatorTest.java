package hse.programmieren.block5.aufgaben.aufgabe2;

public class CarRentCalculatorTest {

    public static void main (String[] args) {
        final CarRentCalculator carRentCalculator = new CarRentCalculator();

        final double priceForKleinwagen = carRentCalculator.calculate(CarType.KLEINWAGEN);
        final double priceForSportwagen = carRentCalculator.calculate(CarType.SPORTWAGEN);

        System.out.println(priceForKleinwagen);
        System.out.println(priceForSportwagen);
    }

}
