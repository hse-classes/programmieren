package hse.programmieren.block8.aufgaben.aufgabe4;

public class Main {

    public static void main(String[] args) {
        System.out.println(process(1602));
        System.out.println(process(1503));
        System.out.println(process(1701));
        System.out.println(process(1404));
        System.out.println(process(2070));
        System.out.println(process(2205));
        System.out.println(process(1800));
        System.out.println(process(117));
    }

    public static int process(int x) {
        int alpha = 0;
        int beta = x;

        while (beta > 0) {
            int gamma = beta % 10;
            alpha = alpha + gamma;
            beta = beta / 10;
        }

        return alpha;
    }

}
