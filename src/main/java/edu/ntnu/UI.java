package edu.ntnu;

import java.util.ArrayList;
import java.util.List;

import edu.ntnu.command.Script;
import edu.ntnu.command.TextCommand;
import edu.ntnu.command.capitalize.CapitalizeSelectionTextCommand;
import edu.ntnu.command.capitalize.CapitalizeTextCommand;
import edu.ntnu.command.capitalize.CapitalizeWordsTextCommand;
import edu.ntnu.command.replace.ReplaceFirstTextCommand;
import edu.ntnu.command.replace.ReplaceTextCommand;
import edu.ntnu.command.wrap.WrapLinesTextCommand;
import edu.ntnu.command.wrap.WrapSelectionTextCommand;
import edu.ntnu.command.wrap.WrapTextCommand;

public class UI {
    private TextCommand pipeline;
    public UI() {
    }

    public void init() {
        List<TextCommand> commands = new ArrayList<>();
        commands.add(new ReplaceTextCommand("hello", "hi"));
        commands.add(new WrapTextCommand("<p>", "</p>"));
        commands.add(new CapitalizeTextCommand());
        commands.add(new ReplaceFirstTextCommand("test", "example"));
        commands.add(new WrapLinesTextCommand("<div>", "</div>"));
        commands.add(new WrapSelectionTextCommand("<b>", "</b>", "example"));
        commands.add(new CapitalizeWordsTextCommand());
        commands.add(new CapitalizeSelectionTextCommand("world"));

        pipeline = new Script(commands);
    }

    public void start() {
        String input = "hello world\nthis is a test";
        System.out.println("Before:");
        System.out.println(input);
        System.out.println("--------------------------");
        System.out.println("After: ");
        System.out.println(pipeline.execute(input)); 
    }
    
    /*public static void runCommand(TextCommand command, String input) {
        System.out.println(command.execute(input));
    } */
    
}
