package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class FIBFIBTest {
    @Test
    public void testFibfib0() {
        assertEquals(0, humaneval.correct.FIBFIB.fibfib(0));
    }
    
    @Test
    public void testFibfib1() {
        assertEquals(0, humaneval.correct.FIBFIB.fibfib(1));
    }
    
    @Test
    public void testFibfib2() {
        assertEquals(1, humaneval.correct.FIBFIB.fibfib(2));
    }
    
    @Test
    public void testFibfib3() {
        assertEquals(0, humaneval.correct.FIBFIB.fibfib(3));
    }
    
    @Test
    public void testFibfib4() {
        assertEquals(1, humaneval.correct.FIBFIB.fibfib(4));
    }
}