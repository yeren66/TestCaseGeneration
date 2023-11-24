
package humaneval;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.LONGEST;
import java.util.List;

public class LONGESTTest {
    @Test
    public void longestTEST() {
        List<String> input = Arrays.asList("hello", "world");
        String actual = LONGEST.longest(input);
        assertEquals("hello world", actual);
    }
}
