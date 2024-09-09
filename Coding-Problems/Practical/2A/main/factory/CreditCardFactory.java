package main.factory;

import main.payment.CreditCard;
import main.payment.PaymentMethod;

public class CreditCardFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCard();
    }
}
