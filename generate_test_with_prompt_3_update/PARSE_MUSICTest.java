
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.PARSE_MUSIC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PARSE_MUSICTest {
    @Test
    public void parse_musicTEST() {
        String musicString = "o o| .|";
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(4);
        expectedResult.add(2);
        expectedResult.add(1);

        List<Integer> actualResult = PARSE_MUSIC.parseMusic(musicString);

        assertEquals(expectedResult, actualResult);
    }
}
