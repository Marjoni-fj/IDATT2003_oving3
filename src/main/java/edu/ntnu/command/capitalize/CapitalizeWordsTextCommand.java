package edu.ntnu.command.capitalize;

public class CapitalizeWordsTextCommand extends CapitalizeTextCommand{

    @Override
    public String execute(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
            }
        if (text.isEmpty()) {
            throw new IllegalArgumentException("Text cannot be empty");
        }
        String[] words = text.split("[\\s]");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String capitalWord = super.execute(word);
            result.append(capitalWord);
            result.append(" ");
        }
        return result.toString().trim();
    }
}
