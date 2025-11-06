package hse.programmieren.block9.solution;

public class Motor {

    private double hubraum;
    private int ps;
    private String treibstoff;

    public Motor(double hubraum, int ps, String treibstoff) {
        this.hubraum = hubraum;
        this.ps = ps;
        this.treibstoff = treibstoff;
    }

    public double getHubraum() {
        return hubraum;
    }

    public int getPs() {
        return ps;
    }

    public String getTreibstoff() {
        return treibstoff;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "hubraum=" + hubraum +
                ", ps=" + ps +
                ", treibstoff='" + treibstoff + '\'' +
                '}';
    }
}
