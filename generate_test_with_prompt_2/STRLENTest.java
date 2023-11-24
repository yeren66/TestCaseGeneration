
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class STRLENTest {
    @Test
    public void testStrlen() {
        assertEquals(0, humaneval.correct.STRLEN.strlen(""));
        assertEquals(1, humaneval.correct.STRLEN.strlen("a"));
        assertEquals(5, humaneval.correct.STRLEN.strlen("hello"));
        assertEquals(12, humaneval.correct.STRLEN.strlen("Hello World!"));
    }
}
