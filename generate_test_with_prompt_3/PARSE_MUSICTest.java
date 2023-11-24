package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PARSE_MUSICTest {
    @Test
    public void parse_musicTEST() {
        // Test case 1: Empty input string
        String input = "";
        List<Integer> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, PARSE_MUSIC.parse_music(input));

        // Test case 2: Single note input
        input = "o";
        expectedOutput = Arrays.asList(4);
        assertEquals(expectedOutput, PARSE_MUSIC.parse_music(input));

        // Test case 3: Multiple notes input
        input = "o o| .|";
        expectedOutput = Arrays.asList(4, 2, 1);
        assertEquals(expectedOutput, PARSE_MUSIC.parse_music(input));
    }
}