package hse.programmieren.exam.ss25.concept;

public class Exercise1 {

    static void main() {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
    }

    public static void exercise1() {
        System.out.println("Exercise 1.1");
        System.out.println("""
                Primitive Datentypen
                 - Speichern direkt den Wert
                 - Haben eine feste Größe
                 - Sind keine Objekte
                 - Können keine Methoden besitzen
                
                Beispiele: int, double, boolean, char, byte, short, long, float
                """);

        System.out.println("""
                Referenzdatentypen
                - Speichern eine Referenz (Adresse) auf ein Objekt im Speicher
                - Das Objekt liegt im Heap
                - Können Methoden und Attribute besitzen
                - Mehrere Variablen können auf dasselbe Objekt zeigen
                
                Beispiele: String, Arrays, Klassen, Interface
                """);
    }

    public static void exercise2() {
        int anInt = 1;
        String aString = "randomString";
    }

    public static void exercise3() {
        System.out.println("Exercise 1.3");
        System.out.println("""
                Unterschied zwischen einer Liste und einem Set in Java:
                
                - Eine Liste ist eine geordnete Sammlung von Elementen
                - In einer Liste sind doppelte Elemente erlaubt
                - Auf Listenelemente kann über einen Index zugegriffen werden
                - Beispiele für Listen sind ArrayList und LinkedList
                
                - Ein Set ist eine ungeordnete Sammlung von Elementen
                - In einem Set sind keine doppelten Elemente erlaubt
                - Ein Set besitzt keinen Indexzugriff
                - Ein Set speichert nur eindeutige Elemente
                - Beispiele für Sets sind HashSet, TreeSet und LinkedHashSet
                """);
    }

    public static void exercise4() {
        System.out.println("Exercise 1.4");
        System.out.println("""
                Der Gültigkeitsbereich (Scope) einer Variablen beschreibt den Bereich im Programm,
                in dem eine Variable sichtbar ist und verwendet werden kann.
                
                Der Scope wird z.B. durch Klassen, Methoden oder geschweifte Klammern {} festgelegt.
                
                Wird innerhalb einer Methode eine lokale Variable mit demselben Namen wie ein
                Methodenparameter verwendet, passiert Folgendes:
                
                - Der Methodenparameter ist im gesamten Methodenrumpf gültig
                - Die lokale Variable überdeckt (shadowing) den Parameter
                - Innerhalb des Blocks, in dem die lokale Variable deklariert ist,
                  wird der Parameter nicht mehr direkt angesprochen
                - Außerhalb dieses Blocks ist wieder der Parameter sichtbar
                
                Das nennt man Variablenüberdeckung (Shadowing).
                """);
    }

    public static void exercise5() {
        System.out.println("Exercise 1.5");
        System.out.println("""
                Unterschied zwischen dem << Operator und dem ^ Operator in Java:
                
                - Der << Operator ist ein Bitverschiebungsoperator (Linksverschiebung)
                - Er verschiebt alle Bits einer Zahl um eine bestimmte Anzahl Stellen nach links
                - Dabei werden rechts Nullen eingefügt
                - Eine Linksverschiebung um n Bits entspricht einer Multiplikation mit 2^n
                
                Beispiel:
                int a = 3;        // binär: 0011
                int b = a << 1;   // binär: 0110 -> Wert: 6
                
                - Der ^ Operator ist ein bitweiser XOR-Operator
                - Er vergleicht die Bits zweier Werte
                - Das Ergebnisbit ist 1, wenn die Bits unterschiedlich sind
                - Das Ergebnisbit ist 0, wenn die Bits gleich sind
                
                Beispiel:
                Paritätsprüfungen
                int x = 5;        // binär: 0101
                int y = 3;        // binär: 0011
                int z = x ^ y;    // binär: 0110 -> Wert: 6
                """);
    }

    public static void exercise6() {
        System.out.println("Exercise 1.6");
        System.out.println("""
                Ja, denn return liefert zwar keinen Wert, darf aber in einer void-Methode genutzt werden. 
                Nach return endet die Ausführung der Methode sofort. """
        );
        return;
        //System.out.println("wird nicht ausgegeben");  //nur auskommentiert wegen intellij
    }


    public static void exercise7() {
        System.out.println("Exercise 1.7");
        System.out.println("""
                Eine StringIndexOutOfBoundsException ist eine Laufzeitexception in Java.
                
                Sie tritt auf, wenn auf ein Zeichen eines Strings mit einem ungültigen Index
                zugegriffen wird.
                
                Ursachen:
                - Der verwendete Index ist kleiner als 0
                - Der verwendete Index ist größer oder gleich der Länge des Strings
                
                Da String-Indizes bei 0 beginnen, ist der größte erlaubte Index length() - 1.
                """);
        String myString = "abc";
        //myString.charAt(3);
    }

    public static void exercise8() {
        System.out.println("Exercise 1.8");
        final int MAX_WERT = 100;
    }

    public static void exercise9() {
        System.out.println("Exercise 1.9");
        System.out.println("""
                Den Inhalt von zwei Strings vergleicht man in Java mit der Methode equals().
                
                Begründung:
                - Der Operator == vergleicht nur die Referenzen (Speicheradressen)
                - equals() vergleicht den tatsächlichen Inhalt der Strings Zeichen für Zeichen
                - Zwei unterschiedliche String-Objekte können den gleichen Inhalt haben
                
                Beispiel:
                String s1 = new String("Java");
                String s2 = new String("Java");
                
                s1 == s2        // false
                s1.equals(s2)   // true
                """);

        System.out.println("Super Bonus Wissen");
        System.out.println("""
                s1 == s2 liefert manchmal true wegen des String-Pools in Java.
                
                Begründung:
                - String-Literale werden im sogenannten String-Pool gespeichert
                - Identische String-Literale verweisen auf dasselbe Objekt
                - == vergleicht Referenzen, nicht den Inhalt
                
                Beispiel:
                String s1 = "Java";
                String s2 = "Java";
                
                s1 == s2 // true, beide Referenzen zeigen auf dasselbe Objekt im String-Pool
                
                Im Gegensatz dazu:
                String s3 = new String("Java");
                String s4 = new String("Java");
                
                s3 == s4 // false, unterschiedliche Objekte im Heap
                """);
    }

    public static void exercise10() {
        System.out.println("Exercise 1.10");
        System.out.println("""
                Beim Deklarieren einer Variable muss der Datentyp angegeben werden,
                damit der Compiler weiß, welche Art von Werten die Variable speichern darf.
                
                Begründung:
                - Der Datentyp legt den Speicherbedarf der Variable fest
                - Der Datentyp bestimmt, welche Operationen erlaubt sind
                - Er ermöglicht Typüberprüfung zur Compile-Zeit
                - Er verhindert ungültige Zuweisungen und Laufzeitfehler
                
                Dadurch wird Typensicherheit und Zuverlässigkeit des Programms gewährleistet.
                """);
    }


}
