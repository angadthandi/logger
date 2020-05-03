package app.modules.timestamp;

public enum TimeStampFormats {
    YMD("Y-m-d"),
    YMDHIS("Y-m-d H:i:s");

    private String value;

    private TimeStampFormats(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}