package hse.programmieren.exam.ss25.methods;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise2_2 {


    static void main() {
        int numberCashRegisters = 2;
        List<String> persons = List.of("Lisa", "Max", "Peer", "Mike", "Fey", "Aron", "Luca");
        String[] personsArray = {"Lisa", "Max", "Peer", "Mike", "Fey", "Aron", "Luca"};

        System.out.println("Exercise 2.2 | Solution 1: " + verteileKassen1(persons, numberCashRegisters));
        System.out.println("Exercise 2.2 | Solution 2: " + verteileKassen2(persons, numberCashRegisters));
        System.out.println("Exercise 2.2 | Solution 3: " + verteileKassen3(personsArray, numberCashRegisters));
        System.out.println("Exercise 2.2 | Solution 4: " + verteileKassen4(persons, numberCashRegisters));
    }

    // Exercise 2.2 / Solution 1
    public static String verteileKassen1(List<String> personen, int kassen) {
        List<List<String>> verteilung = new ArrayList<>();
        for (int i = 0; i < kassen; i++) {
            verteilung.add(new ArrayList<>());
        }
        for (String person : personen) {
            int minIndex = 0;
            for (int i = 1; i < kassen; i++) {
                if (verteilung.get(i).size() < verteilung.get(minIndex).size()) {
                    minIndex = i;
                }
            }
            verteilung.get(minIndex).add(person);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < verteilung.size(); i++) {
            sb.append("Kasse").append(i + 1).append(": ");
            for (String name : verteilung.get(i)) {
                sb.append(name).append(", ");
            }
            sb.append("| ");
        }
        return sb.toString();
    }

    // Exercise 2.2 / Solution 2
    public static String verteileKassen2(List<String> personen, int anzahlKassen) {
        List<List<String>> kassen = new ArrayList<>();

        for (int i = 0; i < anzahlKassen; i++) {
            kassen.add(new ArrayList<>());
        }

        for (int i = 0; i < personen.size(); i++) {
            kassen.get(i % anzahlKassen).add(personen.get(i));
        }

        String ausgabe = "";

        for (int i = 0; i < kassen.size(); i++) {
            ausgabe += "Kasse " + (i + 1) + ": ";

            for (String name : kassen.get(i)) {
                ausgabe += name + ", ";
            }

            ausgabe += "| ";
        }

        return ausgabe;
    }

    // Exercise 2.2 / Solution 3
    public static String verteileKassen3(String[] personen, int anzahlKassen) {
        String[][] kassen = new String[anzahlKassen][personen.length];
        int[] zaehler = new int[anzahlKassen];

        for (int i = 0; i < personen.length; i++) {
            int kasse = i % anzahlKassen;
            kassen[kasse][zaehler[kasse]++] = personen[i];
        }

        String ausgabe = "";
        for (int i = 0; i < anzahlKassen; i++) {
            ausgabe += "Kasse " + (i + 1) + ": ";
            for (int j = 0; j < zaehler[i]; j++) {
                ausgabe += kassen[i][j] + ", ";
            }
            ausgabe += "| ";
        }
        return ausgabe;
    }

    // Exercise 2.2 / Solution 4
    public static String verteileKassen4(List<String> personen, int anzahlKassen) {
        Map<Integer, List<String>> kassen = new HashMap<>();

        for (int i = 1; i <= anzahlKassen; i++) {
            kassen.put(i, new ArrayList<>());
        }
        for (String person : personen) {
            int kuerzesteKasse = 1;

            for (int i = 2; i <= anzahlKassen; i++) {
                if (kassen.get(i).size() < kassen.get(kuerzesteKasse).size()) {
                    kuerzesteKasse = i;
                }
            }
            kassen.get(kuerzesteKasse).add(person);
        }
        return kassen.toString();
    }


}
