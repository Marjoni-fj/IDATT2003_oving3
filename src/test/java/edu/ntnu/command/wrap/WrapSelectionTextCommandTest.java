package edu.ntnu.command.wrap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class WrapSelectionTextCommandTest {
    private WrapSelectionTextCommand wrappedText;

    @BeforeEach
    void setUp() {
        final String selection = "you";
        wrappedText = new WrapSelectionTextCommand("<p>", "</p>", selection);
    }

    @Test
    void testWrapWholeTest() {
        String input = "Hello World! How are you doing?";
        String expected = "Hello World! How are <p>you</p> doing?";
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
