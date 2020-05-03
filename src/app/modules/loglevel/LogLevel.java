package app.modules.loglevel;

public enum LogLevel {
    FATAL(0),
    ERROR(1),
    WARN(2),
    INFO(3),
    DEBUG(4);

    private int value;

    private LogLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}