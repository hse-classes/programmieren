package hse.programmieren.blockr2.aufgabe3;

import java.util.ArrayList;
import java.util.List;

public class Starter {

    public static void main(String[] args) {

        // List ist ein Interface, ArrayList implementiert das Interface. Auf der Linken Seite steht immer der gleiche Typ oder ein gemeinsamer Super-Typ.
        List<String> texts = new ArrayList<>();
        texts.add("text");

        Aufgabe3 aufgabe3 = new Aufgabe3();

        // Kein Problem, wenn alle 3 Methoden gleichzeitig existieren. Sie dürfen gleich heißen, solange diese unterschiedliche Typen haben.
        // Kein Problem dass sie nicht static sind. Es bleibt uns überlassen wann wir etwas als static definieren und wan nnicht.
        aufgabe3.read("text");
        aufgabe3.read();
        aufgabe3.read(texts);

        // text
        // text
        // text

        // aufgabe3 erlaubt
        // 3aufgabe nicht erlaubt

        // Starter1 erlaubt
        // 1Starter nicht erlaubt
    }
}
