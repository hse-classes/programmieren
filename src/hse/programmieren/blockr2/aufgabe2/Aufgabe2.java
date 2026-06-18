package hse.programmieren.blockr2.aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe2 {

    /**
     * Darf der Konstruktor leer sein? Ja. Der Entwickler selbst entscheidet, welche Parameter Sinn ergeben im Konstruktor und welche nicht.
     *
     */
    public static void main(String[] args) {
        Car car = new Car();

        // List ist ein Interface, ArrayList implementiert das Interface. Auf der Linken Seite steht immer der gleiche Typ oder ein gemeinsamer Super-Typ.
        List<Error> errors = new ArrayList<>();
        errors.add(new Error("boom"));
        errors.add(new Error("piff paff"));
        errors.add(new Error("yeet"));
        errors.add(new Error("bamboozle"));

        // ein paar Errors setzen
        car.setErrors(errors);

        // eine Farbe setzen
        car.setColor(Color.WHITE);

        // siehe Klasse
        car.setOwner(new Owner("Harry", "Potter"));

        // kein Problem, solange wir nicht das komplette Auto auf der Konsole ausgeben möchten
        System.out.println(car);
    }
}
