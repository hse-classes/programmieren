package hse.programmieren.block8.examples;

import java.util.Objects;

public class RadioSender {
    String name;
    String image;
    double frequence;

    public RadioSender(String name, String image, double frequence) {
        this.name = name;
        this.image = image;
        this.frequence = frequence;
    }

    @Override
    public String toString() {
        return "RadioSender{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", frequence=" + frequence +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RadioSender that = (RadioSender) o;

        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
