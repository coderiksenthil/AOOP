package main.payment;

public class CreditCard implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment.");
    }
}
