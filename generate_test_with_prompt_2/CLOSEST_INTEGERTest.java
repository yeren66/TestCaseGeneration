package humaneval;
import static org.junit.Assert.*;

public class CLOSEST_INTEGERTest {
    @Test
    public void testClosestInteger() {
        // Test cases for positive numbers
        assertEquals(10, humaneval.correct.CLOSEST_INTEGER.closest_integer("10"));
        assertEquals(15, humaneval.correct.CLOSEST_INTEGER.closest_integer("15.3"));
        assertEquals(20, humaneval.correct.CLOSEST_INTEGER.closest_integer("19.5"));
        assertEquals(21, humaneval.correct.CLOSEST_INTEGER.closest_integer("20.5"));
        assertEquals(22, humaneval.correct.CLOSEST_INTEGER.closest_integer("21.5"));

        // Test cases for negative numbers
        assertEquals(-10, humaneval.correct.CLOSEST_INTEGER.closest_integer("-10"));
        assertEquals(-15, humaneval.correct.CLOSEST_INTEGER.closest_integer("-15.3"));
        assertEquals(-20, humaneval.correct.CLOSEST_INTEGER.closest_integer("-19.5"));
        assertEquals(-21, humaneval.correct.CLOSEST_INTEGER.closest_integer("-20.5"));
        assertEquals(-22, humaneval.correct.CLOSEST_INTEGER.closest_integer("-21.5"));
    }
}