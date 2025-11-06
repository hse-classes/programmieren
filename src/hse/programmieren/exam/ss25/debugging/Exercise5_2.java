package hse.programmieren.exam.ss25.debugging;

public class Exercise5_2 {
    static void main() {
        boolean x = false;
        boolean y = true;
        boolean z = x ? x || y || x : x;

        /*

        if (x) {
            z = x || y || x;
        } else {
            z = x;
        }

        if (false) {
            z = false || true || false;
        } else {
            z = false;
        }

         */

        System.out.println(z);
    }
}
