
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.STRLEN;

public class STRLENTest {
    @Test
    public void strlenTEST() {
        assertEquals(3, STRLEN.strlen("abc"));
        assertEquals(5, STRLEN.strlen("hello"));
        assertEquals(0, STRLEN.strlen(""));
    }
}