package hse.programmieren.block5;

public class Recursion {

    static void main() {
        final int power = pow(2, 3);
        System.out.println(power);
    }

    static int pow(int basis, int exponent) {
        if (exponent == 0) return 1;
        return basis * pow(basis, exponent - 1);
    }

}
