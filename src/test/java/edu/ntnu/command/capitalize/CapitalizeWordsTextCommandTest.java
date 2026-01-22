package edu.ntnu.command.capitalize;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class CapitalizeWordsTextCommandTest {
    private CapitalizeWordsTextCommand capitalizedText;

    @BeforeEach
    void setUp() {
        capitalizedText = new CapitalizeWordsTextCommand();
    }

    @Test
    void testCapitalization() {
        String input = "hello world!";
        String expected = "Hello World!";
        String result = capitalizedText.execute(input);
        assertEquals(expected, result);
    }

    @Test
    void testTrimCapitalization() {
        String input = "hello world!        ";
        String expected = "Hello World!";
        String result = capitalizedText.execute(input);
        assertEquals(expected, result);
    }

    @Test
    void testEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> capitalizedText.execute(""));
    }

    @Test
    void testNullString() {
        assertThrows(IllegalArgumentException.class, () -> capitalizedText.execute(null));
    }
}
