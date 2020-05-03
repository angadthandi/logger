package app.modules.timestamp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeStamp {

    private TimeStampFormats formatType;

    public TimeStamp(TimeStampFormats format) {
        formatType = format;
    }

    public String getFormat() {
        return formatType.getValue();
    }

    public static String getCurrentTime(String format) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(format);//"dd-MM-yyyy HH:mm:ss");
        return formatter.format(date);
    }
}