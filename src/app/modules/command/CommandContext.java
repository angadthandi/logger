package app.modules.command;

public class CommandContext {
    private String timestampFormat;
    private ICommand command;

    public CommandContext(String format, ICommand cmd) {
        timestampFormat = format;
        command = cmd;
    }

    public void handleLogMessage(String message) {
        command.handleMessage(message, timestampFormat);
    }

}