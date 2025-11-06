package hse.programmieren.exam.ss25.classes;

public class Auto {
    private final String kennzeichen;
    private final double breite;

    public Auto(String kennzeichen, double breite) {
        this.kennzeichen = kennzeichen;
        this.breite = (breite > 0) ? breite : 2.0;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public double getBreite() {
        return breite;
    }
}
