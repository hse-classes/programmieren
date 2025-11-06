package hse.programmieren.block8;

import hse.programmieren.block8.examples.Auto;
import hse.programmieren.block8.examples.RadioSender;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static void main() {
        RadioSender swr1 = new RadioSender("SWR1", "iamge1", 234.4);
        RadioSender swr2 = new RadioSender("swr2", "iamge1", 244.4);
        RadioSender bigFM = new RadioSender("BigFM", "iamge1", 255.9);
        RadioSender bigFM2 = new RadioSender("BigFM", "iamge2", 155.9);


        List<String> a = new ArrayList<>();
        a.add("A");
        List<String> b = new ArrayList<>();
        a.addAll(b);
        Collections.sort(a);



        Auto auto = new Auto(List.of(swr1, swr2, bigFM));
        auto.printAllSenders();
        auto.checkSender(bigFM2);


    }


}
