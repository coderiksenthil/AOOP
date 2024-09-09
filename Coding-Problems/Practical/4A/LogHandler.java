public abstract class LogHandler {
    protected LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(String message) {
        if (nextHandler != null) {
            nextHandler.handle(message);
        }
    }
}
