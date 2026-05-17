package hse.programmieren.block6.aufgaben.aufgabe4;

public class Methoden {

    public static void main(String[] args) {
        String text = "Hallo wie gehts?";
        System.out.println(findPosition(text, "wie"));
        System.out.println(startsWithCapitalLetter(text));
        System.out.println(endsWithPunctuation(text));
        System.out.println(validateText(text));
    }

    static int findPosition(String text, String word) { // 4.1
        if (text == null) {
            return -1;
        }

        return text.indexOf(word);
    }

    static boolean startsWithCapitalLetter(String text) { // 4.2
        if (text == null) {
            return false;
        }
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "Ä", "Ö", "Ü"};
        for (String letter : alphabet) {
            if (text.startsWith(letter)) {
                return true;
            }
        }
        return false;
    }

    static boolean endsWithPunctuation(String text) { // 4.3
        if (text == null) {
            return false;
        }
        String[] alphabet = {".", "!", "?"};
        for (String punctuation : alphabet) {
            if (text.endsWith(punctuation)) {
                return true;
            }
        }
        return false;
    }

    static String validateText(String text) {
        if (text == null) {
            return "NO-DATA";
        }
        return text;
    }
}
