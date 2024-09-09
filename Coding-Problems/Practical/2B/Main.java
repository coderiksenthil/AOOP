
public class Main {
    public static void main(String[] args) {
        // Vehicle Factory Method
        VehicleFactory vehicleFactory = new CarFactory(); // Could be CarFactory, BikeFactory, or ScooterFactory
        Vehicle vehicle = vehicleFactory.createVehicle();
        System.out.println("Created vehicle type: " + vehicle.getType());

        // Payment Abstract Factory
        PaymentFactory paymentFactory = new CreditCardPaymentFactory(); // Could be CreditCardPaymentFactory or PayPalPaymentFactory
        PaymentMethod paymentMethod = paymentFactory.createPaymentMethod();
        System.out.println(paymentMethod.processPayment());

        // Singleton User Authentication
        UserAuthentication auth = UserAuthentication.getInstance();
        auth.authenticateUser("user123", "password");
    }
}
