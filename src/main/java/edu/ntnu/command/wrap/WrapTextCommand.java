package edu.ntnu.command.wrap;

import edu.ntnu.command.TextCommand;

public class WrapTextCommand implements TextCommand{
    private final String opening;
    private final String ending;

    public WrapTextCommand(String opening, String ending) {
        this.opening = opening;
        this.ending = ending;
    }

    public String getOpening() {
        return opening;
    }

    public String getEnding() {
        return ending;
    }

    @Override
    public String execute(String text) {
        if (text == null) {
        throw new IllegalArgumentException("Text cannot be null");
        }
        if (text.isEmpty()) {
            throw new IllegalArgumentException("Text cannot be empty");
        }
        return getOpening() + text + getEnding();
    }
}