package edu.ntnu.command;

import java.util.List;
public class Script {
    private final List<TextCommand> textCommands;

    public Script(List<TextCommand> textCommands) {
        if (textCommands == null) {
        throw new IllegalArgumentException("Command list cannot be null");
        }
        this.textCommands = textCommands;
    }

    public String execute(String text) {
        for (TextCommand command : this.textCommands) {
            text = command.execute(text);
        }
        return text;
    }   
}
