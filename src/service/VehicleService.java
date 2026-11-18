package service;

import domain.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleService {
    private final List<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> listVehicle() {
        List<Vehicle> listVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            listVehicles.add(vehicle);
        }

        return listVehicles;
    }

    public List<Vehicle> listActiveVehicle() {
        List<Vehicle> activeVehicle = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.isActive()) {
                activeVehicle.add(vehicle);
            }
        }

        return activeVehicle;
    }
}