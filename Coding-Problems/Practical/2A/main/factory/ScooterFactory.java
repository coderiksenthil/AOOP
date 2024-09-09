package main.factory;

import main.vehicle.Scooter;
import main.vehicle.Vehicle;

public class ScooterFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Scooter();
    }
}
