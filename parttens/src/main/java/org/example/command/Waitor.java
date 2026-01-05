package org.example.command;

import java.util.ArrayList;
import java.util.List;

public class Waitor {
    private List<Command> commands = new ArrayList<Command>();

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void orderUp() {
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
