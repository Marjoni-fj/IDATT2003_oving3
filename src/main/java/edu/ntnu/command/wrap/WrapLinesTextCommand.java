package edu.ntnu.command.wrap;

public class WrapLinesTextCommand extends WrapTextCommand{

    public WrapLinesTextCommand(String opening, String ending) {
        super(opening, ending);
    }
    
    @Override
    public String execute(String text) {
        if (text == null) {
        throw new IllegalArgumentException("Text cannot be null");
        }
        if (text.isEmpty()) {
            throw new IllegalArgumentException("Text cannot be empty");
        }
        String[] lines = text.split("\n");
        StringBuilder result = new StringBuilder();
        for (String line : lines)  {
            String wrapped = super.execute(line);
            result.append(wrapped);
            result.append("\n");
            }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
        }
    }

