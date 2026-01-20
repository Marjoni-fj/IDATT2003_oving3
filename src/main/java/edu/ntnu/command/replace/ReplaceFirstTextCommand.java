package edu.ntnu.command.replace;

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

    public ReplaceFirstTextCommand(final String target, final String replacement) {
        super(target, replacement);
    }

    @Override
    public String execute(String text) {
        if (text == null) {
        throw new IllegalArgumentException("Text cannot be null");
        }
        return text.replaceFirst(this.getTarget(), this.getReplacement());
        
    }



}
