package hse.programmieren.exam.ss25.debugging;

public class Exercise5_1 {
    static void main() {
        exercise1();
    }

    public static void exercise1() {
        Komponente k = new Komponente();
        k.f(3);
        int a = k.g();
        k.f(4);
        int b = k.g();
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        printSolution();
    }

    public static class Komponente {
        private int status = 1;

        public void f(int x) {
            if (x % 2 == 0) {
                status += x / 2;
            } else {
                status *= x;
            }
        }

        public int g() {
            int temp = status;
            if (temp > 10) {
                status = temp - 3;
            } else {
                status += 4;
            }
            return temp;
        }
    }

    public static void printSolution() {
        System.out.println("""
                
                Lösung:
                Start: status = 1
                
                k.f(3): 3 ist ungerade -> status *= 3 -> status = 3
                k.g(): temp = 3, temp > 10? nein -> status += 4 -> status = 7, Rückgabe = 3
                => a = 3
                
                k.f(4): 4 ist gerade -> status += 4/2 -> status += 2 -> status = 9
                k.g(): temp = 9, temp > 10? nein -> status += 4 -> status = 13, Rückgabe = 9
                => b = 9
                
                Ausgabe:
                a: 3
                b: 9
                """);
    }
}
