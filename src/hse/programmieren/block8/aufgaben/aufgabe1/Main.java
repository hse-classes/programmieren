package hse.programmieren.block8.aufgaben.aufgabe1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<RadioStation> radioStations = new ArrayList<>();
        radioStations.add(new RadioStation("sunshine live", "sunshine live Logo", 104.9));
        radioStations.add(new RadioStation("BigFM", "BigFM Logo", 89.5));
        radioStations.add(new RadioStation("SWR3", "SWR3 Logo", 92.2));
        Radio radio = new Radio(radioStations);
        Auto auto = new Auto(radio);

        List<RadioStation> radioStationsInCar = auto.getRadio().getRadioStations();
        RadioStation bigFM = new RadioStation("BigFM", "BigFM Logo", 89.5);
        boolean isBigFMAvailable = radioStationsInCar.contains(bigFM);

        System.out.println("bigFM available: " + isBigFMAvailable);
        System.out.println(radioStationsInCar.indexOf(bigFM));
        System.out.println(radioStationsInCar.get(radioStationsInCar.indexOf(bigFM)));
    }

}
