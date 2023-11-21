package humaneval;
import static org.junit.jupiter.api.Assertions.*;

class CLOSEST_INTEGERTest {
    @Test
    void shouldReturnClosestInteger() {
        assertEquals(10, humaneval.correct.CLOSEST_INTEGER.closest_integer("10"));
        assertEquals(15, humaneval.correct.CLOSEST_INTEGER.closest_integer("15.3"));
        assertEquals(-14, humaneval.correct.CLOSEST_INTEGER.closest_integer("-14.5"));
    }

    @Test
    void shouldReturnClosestIntegerWithFraction() {
        assertEquals(20, humaneval.correct.CLOSEST_INTEGER.closest_integer("20.3"));
        assertEquals(-20, humaneval.correct.CLOSEST_INTEGER.closest_integer("-20.6"));
    }
}