package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class SUM_TO_NTest {
    
    @Test
    public void testSumToN() {
        int n = 30;
        assertEquals(465, humaneval.correct.SUM_TO_N.sum_to_n(n));
    }
    
    @Test
    public void testSumToNLargeNumber() {
        int n = 100;
        assertEquals(5050, humaneval.correct.SUM_TO_N.sum_to_n(n));
    }
    
    @Test
    public void testSumToNSmallNumber() {
        int n = 5;
        assertEquals(15, humaneval.correct.SUM_TO_N.sum_to_n(n));
    }
    
    @Test
    public void testSumToNMediumNumber() {
        int n = 10;
        assertEquals(55, humaneval.correct.SUM_TO_N.sum_to_n(n));
    }
    
    @Test
    public void testSumToNSingleDigit() {
        int n = 1;
        assertEquals(1, humaneval.correct.SUM_TO_N.sum_to_n(n));
    }
}