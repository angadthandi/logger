package app.modules.command.stdout;

import app.modules.command.ICommand;

public class Stdout implements ICommand {

    public void handleMessage(String message) {
        System.out.println(message);
    }

}