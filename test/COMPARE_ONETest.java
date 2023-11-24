package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.COMPARE_ONE;

public class COMPARE_ONETest {
    @Test
    public void compare_oneTEST() {
        // Test case 1: Both inputs are integers
        assertEquals(5, COMPARE_ONE.compare_one(5, 3));
        // Test case 2: Both inputs are floating point numbers
        assertEquals(6.0f, COMPARE_ONE.compare_one(4.0f, 6.0f));
        // Test case 3: One input is a string and the other is an integer
        assertEquals("12", COMPARE_ONE.compare_one("12", 7));
        // Test case 4: Both inputs are strings representing real numbers
        assertEquals("2.5", COMPARE_ONE.compare_one("1.3", "2.5"));
    }
}