
public class CreditCardPayment implements PaymentMethod {
    @Override
    public String processPayment() {
        return "Processing credit card payment";
    }
}