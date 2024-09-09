
public class ScooterFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Scooter();
    }
}