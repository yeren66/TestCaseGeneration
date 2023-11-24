
package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.CHOOSE_NUM;

public class CHOOSE_NUMTest {
    @Test
    public void choose_numTEST() {
        // Test case 1: x > y
        int result = CHOOSE_NUM.choose_num(12, 15);
        assertEquals(-1, result);

        // Test case 2: y is even
        result = CHOOSE_NUM.choose_num(13, 14);
        assertEquals(14, result);

        // Test case 3: x == y
        result = CHOOSE_NUM.choose_num(12, 12);
        assertEquals(-1, result);
    }
}
