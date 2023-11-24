package humaneval;
import static org.junit.Assert.*;

public class FIB4Test {
    @Test
    public void testFib4() {
        assertEquals(0, humaneval.correct.FIB4.fib4(0));
        assertEquals(0, humaneval.correct.FIB4.fib4(1));
        assertEquals(2, humaneval.correct.FIB4.fib4(2));
        assertEquals(0, humaneval.correct.FIB4.fib4(3));
        assertEquals(4, humaneval.correct.FIB4.fib4(5));
        assertEquals(8, humaneval.correct.FIB4.fib4(6));
        assertEquals(14, humaneval.correct.FIB4.fib4(7));
    }
}