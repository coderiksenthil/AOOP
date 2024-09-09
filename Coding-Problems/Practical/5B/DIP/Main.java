package DIP;

public class Main {
    public static void main(String[] args) {
        // Use EmailService
        MessageService emailService = new EmailService();
        MyApplication appWithEmail = new MyApplication(emailService);
        appWithEmail.processMessage("Hello via Email!");

        // Use SMSService
        MessageService smsService = new SMSService();
        MyApplication appWithSMS = new MyApplication(smsService);
        appWithSMS.processMessage("Hello via SMS!");
    }
}