package hse.programmieren.exam.ss25.methods;

import java.util.Arrays;

public class Exercise2_1 {
    static void main() {
        int[] myArray = {-3, 4, 0, 7, -1, 2};
        System.out.println("Exercise 2.1 | Solution 1: " +  berechneWert1(myArray));
        System.out.println("Exercise 2.1 | Solution 2: " +  berechneWert2(myArray));
        System.out.println("Exercise 2.1 | Solution 3: " +  berechneWert3(myArray));
        System.out.println("Exercise 2.1 | Solution 4: " +  berechneWert4(myArray));
    }

    // Exercise 2.1 / Solution 1
    public static int berechneWert1(int[] zahlen) {
        int summe = 0;
        int anzahlPositiv = 0;
        for (int zahl : zahlen) {
            if (zahl > 0) {
                summe += zahl * 2;
                anzahlPositiv++;
            }
        }
        return summe + anzahlPositiv;
    }

    // Exercise 2.1 / Solution 2
    public static int berechneWert2(int[] zahlen) {
        int ergebnis = 0;
        for (int i = 0; i < zahlen.length; i++) {
            if (zahlen[i] > 0) {
                ergebnis += (zahlen[i] * 2) + 1;
            }
        }
        return ergebnis;
    }

    // Exercise 2.1 / Solution 3
    public static int berechneWert3(int[] zahlen) {
        int ergebnis = 0;
        for (int z : zahlen) if (z > 0) ergebnis += z * 2 + 1;
        return ergebnis;
    }

    // Exercise 2.1 / Solution 4
    public static int berechneWert4(int[] zahlen) {
        return Arrays.stream(zahlen).filter(zahl -> zahl > 0).map(zahl -> zahl * 2 + 1).sum();
    }
}
