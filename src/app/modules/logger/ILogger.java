package app.modules.logger;

public interface ILogger {
    // void logMessage(String message);
    void logFatal(String message);
    void logError(String message);
    void logWarn(String message);
    void logInfo(String message);
    void logDebug(String message);
}