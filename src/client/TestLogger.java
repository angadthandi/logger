package client;

import app.modules.command.file.File;
import app.modules.command.stdout.Stdout;
import app.modules.logger.Logger;
import app.modules.loglevel.LogLevel;
import app.modules.timestamp.TimeStampFormats;

public class TestLogger {

    public static TestMetric Run() {
        int totalTests = 0;
        int totalPassed = 0;
        int totalFailed = 0;

        if (TestLogToConsole()) {
            totalTests += 1;
            totalPassed += 1;
        } else {
            totalTests += 1;
            totalFailed += 1;
        }

        if (TestLogToFile()) {
            totalTests += 1;
            totalPassed += 1;
        } else {
            totalTests += 1;
            totalFailed += 1;
        }

        if (TestLogFilterMessages()) {
            totalTests += 1;
            totalPassed += 1;
        } else {
            totalTests += 1;
            totalFailed += 1;
        }

        TestMetric t = new TestMetric();
        t.Total = totalTests;
        t.Pass = totalPassed;
        t.Fail = totalFailed;

        return t;
    }

    public static boolean TestLogToConsole() {
        boolean pass = false;

        // SETUP ------------------------------------
        Stdout console = new Stdout();
        Logger logger = new Logger(
            LogLevel.DEBUG, TimeStampFormats.YMDHIS, console
        );
        // /SETUP ------------------------------------

        logger.logFatal("Test Fatal message!");
        logger.logError("Test Error message!");
        logger.logWarn("Test Warning message!");
        logger.logInfo("Test Info message!");
        logger.logDebug("Test Debug message!");

        pass = true;

        return pass;
    }

    public static boolean TestLogToFile() {
        boolean pass = false;

        // SETUP ------------------------------------
        File file = new File("");
        Logger logger = new Logger(
            LogLevel.DEBUG, TimeStampFormats.YMDHIS, file
        );
        // /SETUP ------------------------------------

        logger.logFatal("Test Fatal message!");
        logger.logError("Test Error message!");
        logger.logWarn("Test Warning message!");
        logger.logInfo("Test Info message!");
        logger.logDebug("Test Debug message!");

        pass = true;

        return pass;
    }

    public static boolean TestLogFilterMessages() {
        boolean pass = false;

        // SETUP ------------------------------------
        File file = new File("");
        Logger logger = new Logger(
            LogLevel.WARN, TimeStampFormats.YMD, file
        );
        // /SETUP ------------------------------------

        logger.logFatal("Test Fatal message!");
        logger.logError("Test Error message!");
        logger.logWarn("Test Warning message!");
        logger.logInfo("Test Info message!");
        logger.logDebug("Test Debug message!");

        pass = true;

        return pass;
    }

}