package DIP;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        // Logic to send email
        System.out.println("Sending email: " + message);
    }
}
