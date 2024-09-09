
public class CreditCardPaymentFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }
}

