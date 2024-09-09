
public class PayPalPaymentFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}
