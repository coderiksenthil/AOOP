package DIP;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        // Logic to send SMS
        System.out.println("Sending SMS: " + message);
    }
}