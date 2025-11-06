package hse.programmieren.exam.ss25.classes;

public class Exercise3 {
    public static void main(String[] args) {
        exercise3_3();
        exercise3_4();
    }

    public static void exercise3_3() {
        Parkplatz p1 = new Parkplatz(101, 3.0);
        Parkplatz p2 = new Parkplatz(102, 2.2);

        Auto a1 = new Auto("HS-AB123", 2.0);
        Auto a2 = new Auto("HS-CD456", 2.4);
        Auto a3 = new Auto("HS-EF789", -1.0);

        p1.parken(a1);
        p2.parken(a2);
        p2.parken(a3);
        p1.parken(a2);
    }


    public static void exercise3_4() {
        System.out.println("""
                
                Exercise 3.4 | Solution: 
                Es wurden 2 Auto-Objekte in Zeile 1 und 2 erzeugt. 
                
                Bonus:
                Nach der letzten Zuweisung ist eines davon nicht mehr referenziert und damit garbage-collectable. 
                Effektiv verwendbar bleibt ein Objekt.""");
    }
}
