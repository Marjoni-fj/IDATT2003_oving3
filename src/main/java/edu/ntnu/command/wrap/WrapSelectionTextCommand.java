package edu.ntnu.command.wrap;

public class WrapSelectionTextCommand extends WrapLinesTextCommand {
    private final String selection;

    public WrapSelectionTextCommand(String opening, String ending, String selection) {
        super(opening, ending);
        this.selection = selection;
    }

    public String getSelection() {
        return selection;
    }
    
    @Override
    public String execute(String text) {
        if (text == null) {
        throw new IllegalArgumentException("Text cannot be null");
        }
        String[] lines = text.split("[\\s]");
        StringBuilder result  = new StringBuilder();
        for (String word : lines) {
            if (word.equals(getSelection())) {
                String wrapped = super.execute(word);
                result.append(wrapped);
                result.append(" ");
            }
            else {
                result.append(word);
                result.append(" ");
            }
        }
        return result.toString().trim();
    }
}
