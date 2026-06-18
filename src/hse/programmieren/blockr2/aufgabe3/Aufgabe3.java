package hse.programmieren.blockr2.aufgabe3;

import java.util.List;

public class Aufgabe3 {

    /**
     * Gibt den übergebenen Text auf der Konsole aus.
     */
    public void read(String text) {
        System.out.println(text);
    }

    /**
     * Gibt hart den Text "text" auf der Konsole aus.
     */
    public void read() {
        read("text");
    }

    /**
     * Gibt die übergebenen Texte auf der Konsole aus.
     */
    public void read(List<String> texts) {
        for (String text : texts) {
            read(text);
        }
    }

}
