package edu.ntnu.command.wrap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class WrapTextCommandTest {
    private WrapTextCommand wrappedText;

    @BeforeEach
    void setUp() {
        wrappedText = new WrapTextCommand("<p>", "<p>");
    }

    @Test
    void testWrapWholeTest() {
        String input = "Hello World!";
        String expected = "<p>Hello World!<p>";
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
