
package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class STARTS_ONE_ENDSTest {
    @Test
    void testStartsOneEnds() {
        assertEquals(1, humaneval.correct.STARTS_ONE_ENDS.starts_one_ends(1));
        assertEquals(90, humaneval.correct.STARTS_ONE_ENDS.starts_one_ends(2));
        assertEquals(899, humaneval.correct.STARTS_ONE_ENDS.starts_one_ends(3));
    }
}
