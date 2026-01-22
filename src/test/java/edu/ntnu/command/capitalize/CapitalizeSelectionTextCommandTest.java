package edu.ntnu.command.capitalize;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class CapitalizeSelectionTextCommandTest {
    private CapitalizeSelectionTextCommand capitalizedText;

    @BeforeEach
    void setUp() {
        final String selection = "selection";
        capitalizedText = new CapitalizeSelectionTextCommand(selection);
    }

    @Test
    void testCapitalization() {
        String input = "text with selection and another selection";
        String expected = "text with Selection and another Selection";
        String result = capitalizedText.execute(input);
        assertEquals(expected, result);
    }

    @Test
    void testNoneCapitalization() {
        String input = "text with boy and another boy";
        String expected = "text with boy and another boy";
        String result = capitalizedText.execute(input);
        assertEquals(expected, result);
    }

    @Test
    void testTrimCapitalization() {
        String input = "text with selection and another selection      ";
        String expected = "text with Selection and another Selection";
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
