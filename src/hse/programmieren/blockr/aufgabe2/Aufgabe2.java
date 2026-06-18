package hse.programmieren.blockr.aufgabe2;

public class Aufgabe2 {

    public static void main(String[] args) {
        printMirror("Java");
    }

    public static void printMirror(String text) {
        if (text.isEmpty()) {
            return;
        }

        char zeichen = Character.toUpperCase(text.charAt(0));

        System.out.print(zeichen);
        printMirror(text.substring(1));
        System.out.print(zeichen);
    }
}
