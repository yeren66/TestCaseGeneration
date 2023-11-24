package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SOLVE;

public class SOLVETest {
    @Test
    public void solveTEST() {
        int N = 1000;
        String expectedOutput = "1";
        assertEquals(expectedOutput, SOLVE.solve(N));

        N = 150;
        expectedOutput = "110";
        assertEquals(expectedOutput, SOLVE.solve(N));

        N = 147;
        expectedOutput = "1100";
        assertEquals(expectedOutput, SOLVE.solve(N));
    }
}