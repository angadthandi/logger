package app.modules.timestamp;

public enum TimeStampFormats {
    YMD("Y-MM-dd"),
    YMDHIS("Y-MM-dd hh:mm:ss");

    private String value;

    private TimeStampFormats(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}