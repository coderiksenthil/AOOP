package main.factory;

import main.payment.PayPal;
import main.payment.PaymentMethod;

public class PayPalFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPal();
    }
}
