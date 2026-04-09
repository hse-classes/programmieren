package hse.programmieren.block3;

public class Homework {

    static void main(String[] args) {
        exercise1();
//        exercise2();
//        exercise3();
//        exercise4();
    }

    static void exercise1() {
        int age = 17;
        double price = 0;
        boolean is3d = true;

        if (is3d) {
            price += 3;
        }
        if (age < 12) {
            price += 5;
        } else if (age >= 12 && age <= 17) {
            price += 8;
        } else if (age > 17) {
            price += 12;
        }

        System.out.println("Ticketpreis: " + price + "€");
    }

    static void exercise2() {
        boolean hasTuev = true;
        double odometer = 333_333;
        String rating = "";

        if (hasTuev) {
            if (odometer < 50_000) {
                rating = "Top-3 Angebot!";
            } else if (odometer < 100_000) {
                rating = "Gutes Angebot";
            } else {
                rating = "Preis verhandeln";
            }
        } else {
            rating = "Nicht kaufen - kein TÜV!";
        }

        System.out.println(rating);
    }

    static void exercise3() {
        int points = 100;
        String rating = "";

        if (points<50) {
            rating = "nicht bestanden";
        } else if (points>=50 && points <60) {
            rating = "ausreichend";
        } else if (points>=60 && points <75) {
            rating = "befriedigend";
        } else if (points>=75 && points <90) {
            rating = "gut";
        } else if (points>=90) {
            rating = "sehr gut";
        }

        System.out.println(rating);
    }

    static void exercise4() {
        int note = 2;

        if (note>=1) {
            System.out.println("Bestanden");
        }
        if (note == 1) {
            System.out.println("Sehr gut!");
        }
    }
}
