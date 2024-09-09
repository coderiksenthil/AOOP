
public class PayPalPayment implements PaymentMethod {
    @Override
    public String processPayment() {
        return "Processing PayPal payment";
    }
}