package hse.programmieren.block9.app;

import java.util.ArrayList;
import java.util.List;

public class VehicleManager {

    private final List<Vehicle> vehicles = new ArrayList<>();

    public void add(final Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    public List<Vehicle> getVehicles() {
        return new ArrayList<>(vehicles);
    }
}
