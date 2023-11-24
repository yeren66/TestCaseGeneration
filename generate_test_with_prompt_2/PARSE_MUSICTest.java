package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class PARSE_MUSICTest {
    @Test
    public void testParseMusic() {
        String input = "o o| .| o";
        List<Integer> expectedResult = Arrays.asList(4, 2, 1, 4);
        
        assertEquals(expectedResult, humaneval.correct.PARSE_MUSIC.parse_music(input));
    }
}