package app.modules.logger;

import app.modules.command.CommandContext;
import app.modules.command.ICommand;
import app.modules.loglevel.LogLevel;
import app.modules.timestamp.TimeStampFormats;

public class Logger implements ILogger {

    private LogLevel logLevel;
    private TimeStampFormats timestampFormat;
    private ICommand command;
    private CommandContext context;

    public Logger(
        LogLevel level,
        TimeStampFormats format,
        ICommand cmd
    ) {
        logLevel = level;
        timestampFormat = format;
        command = cmd;

        context = new CommandContext(cmd);
    }

    public void logMessage(String message) {
        context.handleLogMessage(message);
    }
}