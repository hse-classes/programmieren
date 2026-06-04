package hse.programmieren.block8.aufgaben.aufgabe3;

public class TestCar {
    private String vin;
    private String model;
    private int year;
    private TestTyp testTyp;

    public TestCar(String vin, String model, int year, TestTyp testTyp) {
        this.vin = vin;
        this.model = model;
        this.year = year;
        this.testTyp = testTyp;
    }

    public String getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public TestTyp getTestTyp() {
        return testTyp;
    }

    @Override
    public String toString() {
        return "TestCar{" +
                "vin='" + vin + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", testTyp=" + testTyp +
                '}';
    }
}
