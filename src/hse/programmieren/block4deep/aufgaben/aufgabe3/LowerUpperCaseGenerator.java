package hse.programmieren.block4deep.aufgaben.aufgabe3;

public class LowerUpperCaseGenerator {

    static void main(String[] args) {
        System.out.println(toLowerCase("Porsche"));
    }

    static String toLowerCase(String text) {
        if (text.isEmpty()) {
            return "";
        }
        return text.substring(0,1).toLowerCase() + toUpperCase(text.substring(1));
    }

    static String toUpperCase(String text) {
        if (text.isEmpty()) {
            return "";
        }
        return text.substring(0,1).toUpperCase() + toLowerCase(text.substring(1));
    }


}
