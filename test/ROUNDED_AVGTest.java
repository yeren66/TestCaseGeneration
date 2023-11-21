
package humaneval;

import static org.junit.jupiter.api.Assertions.*;

class ROUNDED_AVGTest {
    
    @Test
    void testRoundedAvg() {
        assertEquals("11", humaneval.correct.ROUNDED_AVG.rounded_avg(1, 5));
        assertEquals("101", humaneval.correct.ROUNDED_AVG.rounded_avg(2, 6));
        assertEquals("1001", humaneval.correct.ROUNDED_AVG.rounded_avg(3, 7));
        assertEquals("111", humaneval.correct.ROUNDED_AVG.rounded_avg(4, 8));
    }
    
    @Test
    void testRoundedAvgNegative() {
        assertEquals(-1, humaneval.correct.ROUNDED_AVG.rounded_avg(7, 5));
        assertEquals(-1, humaneval.correct.ROUNDED_AVG.rounded_avg(10, 3));
        assertEquals(-1, humaneval.correct.ROUNDED_AVG.rounded_avg(9, 4));
    }
    
}
