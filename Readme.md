# Design a Logger

1. Have an enum for LogLevels i.e. FATAL, ERROR, WARN, INFO, DEBUG

2. Have a main Logger class. Provide API in your logger class getMessage(String message, LogLeveLEnum level) which client can use to send log message and associated log level.

3. Have a field to store configured log level in your Logger class. Provide API and maybe have constructor of logger class set a log level and store it in a Enum field, something like setLogLevel(LogLevelEnum level)

4. After receiving a message via getMessage forward it to another function to process it. (filter it if it is less than configured log level, otherwise append timestamp, loglevel)

5. We can use command pattern to tie a sink to a loglevel and a message can be passed on to appropriate command based on the log level. (Logger class can probably keep a Map of logLevel as key, and various classes implementing command interface to map a logLevel to a command. This map should expose setter APIs to change behavior at run-time.) \
OR \
You can implement Sink using the strategic pattern , i.e the code will determine on the runtime whether it has the destination as the text file, database or on console. You can achieve this by Constructor injection. By this you will get the single responsibility of the code as well.