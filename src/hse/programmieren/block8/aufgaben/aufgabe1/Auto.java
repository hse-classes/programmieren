package hse.programmieren.block8.aufgaben.aufgabe1;

public class Auto {

    private Radio radio;

    public Auto(Radio radio) {
        this.radio = radio;
    }

    public Radio getRadio() {
        return radio;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "radio=" + radio +
                '}';
    }
}
