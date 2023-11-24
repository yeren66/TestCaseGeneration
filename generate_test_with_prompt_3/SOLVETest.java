package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class SOLVETest {
    @Test
    public void solveTEST() {
        int input = 1000;
        String expectedOutput = "1";
        assertEquals(expectedOutput, SOLVE.solve(input));
        
        input = 150;
        expectedOutput = "110";
        assertEquals(expectedOutput, SOLVE.solve(input));
        
        input = 147;
        expectedOutput = "1100";
        assertEquals(expectedOutput, SOLVE.solve(input));
    }
}