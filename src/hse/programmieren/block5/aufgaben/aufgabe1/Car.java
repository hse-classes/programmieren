package hse.programmieren.block5.aufgaben.aufgabe1;

import java.util.List;

public class Car {

    private final String model;
    private final int buildYear;
    private final String color;
    private final boolean leftHandDrive;
    private final boolean secondHand;
    private double odometer;
    private final List<String> features;

    public Car(String model, int buildYear, String color, boolean leftHandDrive, boolean secondHand, double odometer, List<String> features) {
        this.model = model;
        this.buildYear = buildYear;
        this.color = color;
        this.leftHandDrive = leftHandDrive;
        this.secondHand = secondHand;
        this.odometer = odometer;
        this.features = features;
    }

    public String getModel() {
        return model;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public String getColor() {
        return color;
    }

    public boolean isLeftHandDrive() {
        return leftHandDrive;
    }

    public boolean isSecondHand() {
        return secondHand;
    }

    public double getOdometer() {
        return odometer;
    }

    public List<String> getFeatures() {
        return features;
    }

    public void increaseOdometer(double odometer) {
        this.odometer += odometer;
    }

    public void decreaseOdometer(double odometer) {
        this.odometer -= odometer;
    }
}
