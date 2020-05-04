package app.modules.logger;

import app.modules.command.CommandContext;
import app.modules.command.ICommand;
import app.modules.loglevel.LogLevel;
import app.modules.timestamp.TimeStamp;
import app.modules.timestamp.TimeStampFormats;

public class Logger implements ILogger {

    private LogLevel logLevel;
    private int loggerMsgLevel;
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
        loggerMsgLevel = logLevel.getValue();

        context = new CommandContext(cmd);
    }

    // public void logMessage(String message) {
    //     context.handleLogMessage(message);
    // }

    public void logFatal(String message) {
        logMessageByLevelCheck(LogLevel.FATAL.getValue(), message);
    }

    public void logError(String message) {
        logMessageByLevelCheck(LogLevel.ERROR.getValue(), message);
    }

    public void logWarn(String message) {
        logMessageByLevelCheck(LogLevel.WARN.getValue(), message);
    }

    public void logInfo(String message) {
        logMessageByLevelCheck(LogLevel.INFO.getValue(), message);
    }

    public void logDebug(String message) {
        logMessageByLevelCheck(LogLevel.DEBUG.getValue(), message);
    }

    private void logMessageByLevelCheck(int currMsgLevel, String message) {
        if (currMsgLevel > loggerMsgLevel) {
            return;
        }

        String currTime = TimeStamp.getCurrentTime(timestampFormat.getValue());
        String formattedMsg = currTime + ": " + message;

        context.handleLogMessage(formattedMsg);
    }

    // SETTERS

    public void setLogLevel(LogLevel level) {
        logLevel = level;
    }

    public void setTimeStampFormat(TimeStampFormats format) {
        timestampFormat = format;
    }

    public void setCommand(ICommand cmd) {
        command = cmd;

        context = new CommandContext(cmd);
    }

}