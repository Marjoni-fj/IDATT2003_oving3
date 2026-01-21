package edu.ntnu.command.replace;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {
    private ReplaceTextCommand replaceAll;
    private ReplaceTextCommand replaceNone;

    @BeforeEach
    void setUp() {
        replaceAll = new ReplaceTextCommand("foo", "bar");
        replaceNone = new ReplaceTextCommand("missing", "replacement");
    }

    @Test
    void testReplaceAllOccurrences() {
        String input = "foo hello foo";
        String expected = "bar hello bar";
        String result = replaceAll.execute(input);
        assertEquals(expected, result);
    }

    @Test
    void testReplaceNoOccurrences() {
        String input = "hello world";
        String expected = "hello world";
        String result = replaceNone.execute(input);
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
