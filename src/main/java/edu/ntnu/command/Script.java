package edu.ntnu.command;

import java.util.List;
public class Script implements TextCommand{
    private final List<TextCommand> textCommands;

    public Script(List<TextCommand> textCommands) {
        if (textCommands == null) {
        throw new IllegalArgumentException("Command list cannot be null");
        }
        this.textCommands = textCommands;
    }

    @Override
    public String execute(String text) {
        for (TextCommand command : this.textCommands) {
            text = command.execute(text);
        }
        return text;
    }   
}
