package main.factory;

import main.vehicle.Bike;
import main.vehicle.Vehicle;

public class BikeFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
