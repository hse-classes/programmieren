package hse.programmieren.block4deep;

public class Car {
    public String name;
    public int baujahr;
    public long price;
    public String farbe;
    public int km;

    public Car(String name, int baujahr, long price, String farbe) {
        this.name = name;
        this.baujahr = baujahr;
        this.price = price;
        this.farbe = farbe;
        this.km = 0;
    }

    public void fahren(int km) {
        this.km = this.km + km;
    }


    @Override
    public String toString() {
        return ("Name: " +this.name + " price:" + this.price);
    }
}
