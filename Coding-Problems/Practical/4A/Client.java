public class Client {
    public static void main(String[] args) {
        // Create handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Set up chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create commands
        Command infoCommand = new LogCommand(infoHandler);
        Command debugCommand = new LogCommand(debugHandler);
        Command errorCommand = new LogCommand(errorHandler);

        // Create logger and add commands
        Logger logger = new Logger();
        logger.addCommand(infoCommand);
        logger.addCommand(debugCommand);
        logger.addCommand(errorCommand);

        // Process commands
        logger.processCommands();
    }
}
