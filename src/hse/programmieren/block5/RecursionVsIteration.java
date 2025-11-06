package hse.programmieren.block5;

public class RecursionVsIteration {

    static void main() {
        System.out.println(recursiveFactorial(4));
        System.out.println(iterativeFactorial(4));
    }

    static int recursiveFactorial(int value) {
        if (value <= 1) {
            return 1;
        }
        return value * recursiveFactorial(value - 1);
    }

    static int iterativeFactorial(int value) {
        int sum = 1;
        for (int i = 2; i <= value; i++) {
            sum *= i;
        }
        return sum;
    }


}
