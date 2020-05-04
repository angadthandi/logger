package app.modules.command;

public class CommandContext {
    private ICommand command;

    public CommandContext(ICommand cmd) {
        command = cmd;
    }

    public void handleLogMessage(String message) {
        command.handleMessage(message);
    }

}