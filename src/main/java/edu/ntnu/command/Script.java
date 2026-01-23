package edu.ntnu.command;

import java.util.List;
public class Script {
    private final List<TextCommand> textCommands;

    public Script(List<TextCommand> textCommands) {
        this.textCommands = textCommands;
    }

    public String execute(String text) {
        for (TextCommand command : this.textCommands) {
            text = command.execute(text);
        }
        return text;
    }   
}
