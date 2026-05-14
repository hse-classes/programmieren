package hse.programmieren.block5.aufgaben.aufgabe3;

public class PalindromGenerator {

    static void main(String[] args) {
        System.out.println(generate("OT"));
    }

    static String generate(String text) {
        if (text.isEmpty()) {
            return "";
        }
        return text.charAt(0) + generate(text.substring(1)) + text.charAt(0);
    }


}
