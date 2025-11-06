package hse.programmieren.block6;

import hse.programmieren.block6.solution.Audi;
import hse.programmieren.block6.solution.BMW;
import hse.programmieren.block6.solution.VW;
import hse.programmieren.block6.solution.Vehicle;

import java.util.Arrays;

public class Main {

    static void main() {

        Vehicle vw = new VW(); // electrical
        Vehicle bmw = new BMW(); // combustion
        Audi audi = new Audi(); // electrical + combustion
        int i = audi.energyLevel;
        audi.drive();

        int[] array = {6};
        int bla = array.length;

        vw.drive();
        vw.brake();
        bmw.drive();
        bmw.brake();
        audi.drive();
        audi.brake();

        System.out.println(vw);
        System.out.println(bmw);
        System.out.println(audi);


    }

}
