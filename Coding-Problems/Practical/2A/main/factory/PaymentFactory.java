package main.factory;

import main.payment.PaymentMethod;

public interface PaymentFactory {
    PaymentMethod createPaymentMethod();
}
