package main1;

import main.factory.*;
import main.payment.*;
import main.auth.AuthenticationManager;
import main.vehicle.*;

public class RideSharingApp {
    public static void main(String[] args) {
        // Vehicle creation using Factory Method
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();
        
        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.drive();
        
        VehicleFactory scooterFactory = new ScooterFactory();
        Vehicle scooter = scooterFactory.createVehicle();
        scooter.drive();
        
        // Payment method creation using Abstract Factory
        PaymentFactory creditCardFactory = new CreditCardFactory();
        PaymentMethod creditCard = creditCardFactory.createPaymentMethod();
        creditCard.processPayment();
        
        PaymentFactory payPalFactory = new PayPalFactory();
        PaymentMethod payPal = payPalFactory.createPaymentMethod();
        payPal.processPayment();
        
        // Singleton Authentication Manager
        AuthenticationManager authManager = AuthenticationManager.getInstance();
        authManager.authenticateUser("user1", "password123");
    }
}
