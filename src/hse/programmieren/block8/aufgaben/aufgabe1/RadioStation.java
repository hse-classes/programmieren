package hse.programmieren.block8.aufgaben.aufgabe1;

import java.util.Comparator;
import java.util.Objects;

public class RadioStation implements Comparable<RadioStation> {
    private String name;
    private String logo;
    private double frequency;

    public RadioStation(String name, String logo, double frequency) {
        this.name = name;
        this.logo = logo;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        final RadioStation that = (RadioStation) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "RadioStation{" + "name='" + name + ", logo='" + logo + ", frequency=" + frequency + '}';
    }

    @Override
    public int compareTo(final RadioStation radioStation) {
        return Comparator.comparing(RadioStation::getName).compare(this, radioStation);
    }
}
