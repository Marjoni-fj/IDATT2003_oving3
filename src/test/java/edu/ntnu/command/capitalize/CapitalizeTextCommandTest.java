package edu.ntnu.command.capitalize;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class CapitalizeTextCommandTest {
    private CapitalizeTextCommand capitalizedText;

    @BeforeEach
    void setUp() {
        capitalizedText = new CapitalizeTextCommand();
    }

    @Test
    void testCapitalization() {
        String input = "hello World!";
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
