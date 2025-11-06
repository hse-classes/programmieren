package hse.programmieren.exam.ss25.classes;

public class Parkplatz {
    private final int nummer;
    private final double breite;
    private Auto geparktesAuto;

    public Parkplatz(int nummer, double breite) {
        this.nummer = nummer;
        this.breite = breite;
    }

    public void parken(Auto auto) {
        if (geparktesAuto != null) {
            System.out.println("kein Platz");
            return;
        }

        if (auto.getBreite() <= breite) {
            geparktesAuto = auto;
        } else {
            System.out.println("kein Platz");
        }
    }
}
