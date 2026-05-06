package hse.programmieren.block4deep.aufgaben.aufgabe1;

import java.util.List;

public class CarWithEnum {

    private final String model;
    private final int buildYear;
    private final Color color;
    private final SteeringType steeringType;
    private final Status status;
    private double odometer;
    private final List<Feature> features;

    public CarWithEnum(String model,
                       int buildYear,
                       Color color,
                       SteeringType steeringType,
                       Status status,
                       double odometer,
                       List<Feature> features) {

        this.model = model;
        this.buildYear = buildYear;
        this.color = color;
        this.steeringType = steeringType;
        this.status = status;
        this.odometer = odometer;
        this.features = features;
    }

    public String getModel() {
        return model;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public Color getColor() {
        return color;
    }

    public SteeringType getSteeringType() {
        return steeringType;
    }

    public Status getStatus() {
        return status;
    }

    public double getOdometer() {
        return odometer;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void increaseOdometer(double odometer) {
        this.odometer += odometer;
    }

    public void decreaseOdometer(double odometer) {
        this.odometer -= odometer;
    }
}
