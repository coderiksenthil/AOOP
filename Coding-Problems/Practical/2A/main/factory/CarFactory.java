package main.factory;

import main.vehicle.Car;
import main.vehicle.Vehicle;

public class CarFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
