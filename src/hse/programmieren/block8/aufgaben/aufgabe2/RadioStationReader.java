package hse.programmieren.block8.aufgaben.aufgabe2;

import hse.programmieren.block8.aufgaben.aufgabe1.RadioStation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RadioStationReader {

    public static void main(String[] args) {
        Scanner scanner;
        try {
            scanner = new Scanner(new File("_radiostations.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<RadioStation> radioStations = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] rawStation = scanner.nextLine().split(",");
            RadioStation radioStation = new RadioStation(
                    rawStation[0],
                    rawStation[1],
                    Double.parseDouble(rawStation[2]));
            radioStations.add(radioStation);
        }

//        radioStations.sort(Comparator.comparing(RadioStation::getName));
        Collections.sort(radioStations);

        for (RadioStation radioStation : radioStations) {
            System.out.println(radioStation);
        }
    }
}
