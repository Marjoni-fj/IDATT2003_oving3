package edu.ntnu.command.replace;

import edu.ntnu.command.TextCommand;

public class ReplaceTextCommand implements TextCommand{
    private final String target;
    private final String replacement;

    public ReplaceTextCommand(String target, String replacement) {
        this.target = target;
        this.replacement = replacement;
    }

    public String getTarget() {
        return target;
    }

    public String getReplacement() {
        return replacement;
    }

    @Override
    public String execute(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
        }
        if (text.isEmpty()) {
            throw new IllegalArgumentException("Text cannot be empty");
        }
        return text.replace(this.getTarget(), this.getReplacement());
        
    }

}
