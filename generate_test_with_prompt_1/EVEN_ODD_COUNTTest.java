package humaneval;
import static org.junit.jupiter.api.Assertions.*;

class EVEN_ODD_COUNTTest {
    @Test
    void testEvenOddCount() {
        int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(123);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }
    
    @Test
    void testEvenOddCountNegative() {
        int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(-12);
        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
    }
    
    @Test
    void testEvenOddCountZero() {
        int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(0);
        assertEquals(0, result[0]);
        assertEquals(0, result[1]);
    }
    
    @Test
    void testEvenOddCountSingleDigit() {
        int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(5);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }
}