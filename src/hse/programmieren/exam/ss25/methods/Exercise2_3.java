package hse.programmieren.exam.ss25.methods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise2_3 {


    static void main() {
        String[] names = {"Anna", "Albert", "Anja", "Bernd", "Boris", "Clara", "andreas", "alice"};
        System.out.println("Exercise 2.3 | Solution 1: " + groessteAnzahlGleicherAnfangsbuchstaben1(names));
        System.out.println("Exercise 2.3 | Solution 2: " + groessteAnzahlGleicherAnfangsbuchstaben2(names));
        System.out.println("Exercise 2.3 | Solution 3: " + groessteAnzahlGleicherAnfangsbuchstaben3(names));
        System.out.println("Exercise 2.3 | Solution 4: " + groessteAnzahlGleicherAnfangsbuchstaben4(names));
        System.out.println("Exercise 2.3 | Solution 5: " + groessteAnzahlGleicherAnfangsbuchstaben5(names));
        System.out.println("Exercise 2.3 | Solution 6: " + groessteAnzahlGleicherAnfangsbuchstaben6(names));
    }

    // Exercise 2.3 / Solution 1
    public static int groessteAnzahlGleicherAnfangsbuchstaben1(String[] namen) {
        Map<Character, Integer> zaehler = new HashMap<>();

        for (String name : namen) {
            if (name != null && !name.isEmpty()) {
                char anfang = Character.toLowerCase(name.charAt(0));
                zaehler.put(anfang, zaehler.getOrDefault(anfang, 0) + 1);
            }
        }

        int max = 0;
        for (int anzahl : zaehler.values()) {
            if (anzahl > max) {
                max = anzahl;
            }
        }

        return max;
    }

    // Exercise 2.3 / Solution 2
    public static int groessteAnzahlGleicherAnfangsbuchstaben2(String[] namen) {
        int[] zaehler = new int[26];

        for (String name : namen) {
            if (name != null && !name.isEmpty()) {
                char c = Character.toLowerCase(name.charAt(0));
                if (c >= 'a' && c <= 'z') {
                    zaehler[c - 'a']++;
                }
            }
        }
        int max = 0;
        for (int wert : zaehler) {
            if (wert > max) {
                max = wert;
            }
        }
        return max;
    }

    // Exercise 2.3 / Solution 3
    public static int groessteAnzahlGleicherAnfangsbuchstaben3(String[] namen) {
        String[] kopie = namen.clone();

        java.util.Arrays.sort(kopie, (a, b) ->
                Character.compare(
                        Character.toLowerCase(a.charAt(0)),
                        Character.toLowerCase(b.charAt(0))
                )
        );

        int max = 1;
        int aktuell = 1;

        for (int i = 1; i < kopie.length; i++) {
            if (Character.toLowerCase(kopie[i].charAt(0)) ==
                    Character.toLowerCase(kopie[i - 1].charAt(0))) {
                aktuell++;
                if (aktuell > max) max = aktuell;
            } else {
                aktuell = 1;
            }
        }

        return max;
    }

    // Exercise 2.3 / Solution 4
    public static int groessteAnzahlGleicherAnfangsbuchstaben4(String[] namen) {
        Map<Character, Integer> map = new HashMap<>();

        for (String name : namen) {
            char c = Character.toLowerCase(name.charAt(0));
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = 0;
        for (int wert : map.values()) {
            if (wert > max) {
                max = wert;
            }
        }

        return max;
    }

    // Exercise 2.3 / Solution 5
    public static int groessteAnzahlGleicherAnfangsbuchstaben5(String[] namen) {
        String s = "";
        for (String name : namen) {
            s += Character.toLowerCase(name.charAt(0));
        }

        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int anzahl = s.length() - s.replace(String.valueOf(c), "").length();
            if (anzahl > max) {
                max = anzahl;
            }
        }
        return max;
    }

    // Exercise 2.3 / Solution 6
    public static int groessteAnzahlGleicherAnfangsbuchstaben6(String[] namen) {
        String s = Arrays.stream(namen)
                .map(n -> String.valueOf(Character.toLowerCase(n.charAt(0))))
                .reduce("", String::concat);

        return s.chars()
                .map(c -> s.length() - s.replace(String.valueOf((char) c), "").length())
                .max()
                .orElse(0);
    }
}