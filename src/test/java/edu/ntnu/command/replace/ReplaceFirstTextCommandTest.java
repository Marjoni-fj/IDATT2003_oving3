package edu.ntnu.command.replace;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReplaceFirstTextCommandTest {
    private ReplaceTextCommand replaceAll;

    @BeforeEach
    void setUp() {
        replaceAll = new ReplaceFirstTextCommand("food", "beer");
    }

    @Test
    void testReplaceAllOccurrences() {
        String input = "food hello food";
        String expected = "beer hello food";
        String result = replaceAll.execute(input);
        assertEquals(expected, result);
    }

    @Test
    void testReplaceNoOccurrences() {
        String input = "hello world";
        String expected = "hello world";
        String result = replaceAll.execute(input);
        assertEquals(expected, result);
    }

    @Test
    void testEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> replaceAll.execute(""));
    }

    @Test
    void testNullString() {
        assertThrows(IllegalArgumentException.class, () -> replaceAll.execute(null));
    }
}
