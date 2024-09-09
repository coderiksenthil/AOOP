package DIP;

public class MyApplication {
    private MessageService messageService;

    // Constructor dependency injection
    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message) {
        messageService.sendMessage(message);
    }
}
