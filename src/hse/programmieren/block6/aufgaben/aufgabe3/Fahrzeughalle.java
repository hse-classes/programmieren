package hse.programmieren.block6.aufgaben.aufgabe3;

import java.util.ArrayList;
import java.util.List;

public class Fahrzeughalle {

    List<Fahrzeug> fahrzeuge = new ArrayList<>();

    public void add(Fahrzeug fahrzeug) {
        if (fahrzeug == null) {
            return;
        }
        fahrzeuge.add(fahrzeug);
    }

    public int sum() {
        int sum = 0;
        for (Fahrzeug fahrzeug : fahrzeuge) {
            sum += fahrzeug.odometer;
        }

        return sum;
    }


    public static void main(String[] args) {
        Fahrzeughalle fahrzeughalle = new Fahrzeughalle();

        for (int position = 0; position < 100; position++) {
            Fahrzeug fahrzeug = new Fahrzeug();
            fahrzeug.odometer = position * 100;
            fahrzeughalle.add(fahrzeug);
            System.out.println(fahrzeug);
        }

        System.out.println(fahrzeughalle.fahrzeuge.size() + " Fahrzeuge haben insgesamt einen Kilometerstand von " + fahrzeughalle.sum());
    }
}
