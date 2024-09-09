package main.payment;

public class PayPal implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment.");
    }
}
