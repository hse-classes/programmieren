package hse.programmieren.block8.aufgaben.aufgabe1;

import java.util.ArrayList;
import java.util.List;

public class Radio {

    private List<RadioStation> radioStations;

    public Radio( List<RadioStation> radioStations) {
        this.radioStations = radioStations;
    }

    public List<RadioStation> getRadioStations() {
        return radioStations;
    }

}
