package humaneval;

import static org.junit.Assert.*;

public class SOLVETest {
    @Test
    public void testSolve() {
        int N = 1000;
        assertEquals("1", humaneval.correct.SOLVE.solve(N)); // expected output: "1"
        
        N = 150;
        assertEquals("110", humaneval.correct.SOLVE.solve(N)); // expected output: "110"
        
        N = 147;
        assertEquals("1100", humaneval.correct.SOLVE.solve(N)); // expected output: "1100"
    }
}