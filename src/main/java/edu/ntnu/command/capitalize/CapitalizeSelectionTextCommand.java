package edu.ntnu.command.capitalize;

public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
    private final String selection;

    public CapitalizeSelectionTextCommand(String selection) {
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
        String[] words = text.split("[\\s]");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.equals(getSelection())) {
                String capitalWord = super.execute(word);
                result.append(capitalWord);
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
