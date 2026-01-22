package edu.ntnu.command.wrap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class WrapLinesTextCommandTest {
    private WrapLinesTextCommand wrappedText;

    @BeforeEach
    void setUp() {
        wrappedText = new WrapLinesTextCommand("<p>", "</p>");
    }

    @Test
    void testWrapWholeTest() {
        String input = "Hello World!\nHow are you doing?";
        String expected = "<p>Hello World!</p>\n<p>How are you doing?</p>";
        String result = wrappedText.execute(input);
        assertEquals(expected, result);
    }

    @Test
    void testEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> wrappedText.execute(""));
    }

    @Test
    void testNullString() {
        assertThrows(IllegalArgumentException.class, () -> wrappedText.execute(null));
    }
}
