package app.modules.command.stdout;

import app.modules.command.ICommand;
import app.modules.timestamp.TimeStamp;

public class Stdout implements ICommand {

    public void handleMessage(String message, String timestampFormat) {
        String currTime = TimeStamp.getCurrentTime(timestampFormat);
        System.out.println(currTime + ": " + message);
    }

}