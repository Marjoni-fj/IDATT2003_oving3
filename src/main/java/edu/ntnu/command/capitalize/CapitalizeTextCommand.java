package edu.ntnu.command.capitalize;

import edu.ntnu.command.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

    @Override
    public String execute(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text cannot be null");
            }
        return 
        text.substring(0, 1).toUpperCase() 
        + text.substring(1);
        }  
        
    }
