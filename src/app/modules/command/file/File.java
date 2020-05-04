package app.modules.command.file;

import java.io.FileWriter;
import java.io.IOException;

import app.modules.command.ICommand;

public class File implements ICommand {

    private final String defaultFilePath = System.getProperty("user.dir") + "\\logs\\logger.log";
    private String filePath;

    public File(String path) {
        filePath = defaultFilePath;

        if (path != "") {
            // TODO create file
            filePath = path;
        }
    }

    public void handleMessage(String message) {
        try {
            FileWriter myWriter = new FileWriter(filePath, true);
            myWriter.write(message + "\r\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

}