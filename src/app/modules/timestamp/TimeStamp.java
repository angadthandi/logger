package app.modules.timestamp;

public class TimeStamp {

    public static TimeStampFormats formatType;

    public TimeStamp(TimeStampFormats format) {
        formatType = format;
    }

    public String getFormat() {
        return formatType.getValue();
    }
}