package hse.programmieren.block5.homework;

import java.util.ArrayList;

public class Solutions {

    static void main() {
        Car car1 = new Car("VW", "Golf", 1990);
        Car car2 = new Car("VW", "Golf", 1990);

        car1.info();
        car1.fahre(10);
        car1.info();

        car2.info();
        car2.fahre(725);
        car2.info();

        Fuhrpark fuhrpark = new Fuhrpark();
        fuhrpark.hinzufuegen(car1);
        fuhrpark.hinzufuegen(car2);

        fuhrpark.alleAnzeigen();
    }


    static class Car {
        // aufgabe 1 eigenschaften
        String marke;
        String model;
        int baujahr;
        double kilometerstand = 0;

        public Car(String marke, String model, int baujahr) {
            this.marke = marke;
            this.model = model;
            this.baujahr = baujahr;
        }

        // aufgabe 1 aktionen
        void fahre(double kilometer) {
            this.kilometerstand += kilometer;
            final double verbrauch = kilometer / 100 * verbrauchPro100km;

            if (this.tankinhalt - verbrauch <= 0) {
                System.err.println("ohoh, Tank geht auf Kontostand");
            }

            this.tankinhalt -= verbrauch;
        }

        void info() {
            System.out.println(
                            "Marke: " + this.marke + "; " +
                            "Model: " + this.model + "; " +
                            "Baujahr: " + this.baujahr + "; " +
                            "Tankinhalt: " + this.tankinhalt + "; " +
                            "Kilometerstand: " + this.kilometerstand
            );
        }

        // aufgabe 2 eigenschaften
        double tankinhalt = 50;
        double verbrauchPro100km = 7;

        // aufgabe 2 funktionen
        void tanke(double liter) {
            this.tankinhalt += liter;
        }

    }

    static class Fuhrpark {

        // aufgabe 3 eigenschaften
        ArrayList<Car> cars = new ArrayList<>();

        // aufgabe 3 funktionen
        void hinzufuegen(Car car) {
            this.cars.add(car);
        }

        void alleAnzeigen() {
            for (Car car : cars) {
                car.info();
            }
        }
    }
}
