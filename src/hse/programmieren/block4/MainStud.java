package hse.programmieren.block4;

public class MainStud {

    public static void main(String[] args) {

        System.out.println(pow(259,3));
    }

    public static int pow(int a, int b) {
        if(b == 0) {
            return 1;
        }
        int res = a;
        for(int i = 1; i < b; i++){
            res *= a;
        }
        return res;
    }
}
