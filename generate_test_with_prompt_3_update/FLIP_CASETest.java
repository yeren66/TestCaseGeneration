
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.FLIP_CASE;

public class FLIP_CASETest {
    @Test
    public void flip_caseTEST() {
        String testString = "Hello World";
        assertEquals("hELLO wORLD", FLIP_CASE.flip_case(testString));
    }
}
