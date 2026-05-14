package hse.programmieren.block6.aufgaben.aufgabe5;

import java.util.HashMap;
import java.util.Map;

public class LetterCounter {

    public static void main(String[] args) {
        System.out.println(count("Hallo"));
    }

    public static Object count(String text) {
        String[] charArray = text.trim().replace(" ", "").toUpperCase().split("");
        Map<String, Integer> counter = new HashMap<>();

        for (String letter : charArray) {
            Integer orDefault = counter.getOrDefault(letter, 0);
            counter.put(letter, orDefault + 1);
        }

        return counter.toString().replace("{", "").replace("}", "");
    }

}
