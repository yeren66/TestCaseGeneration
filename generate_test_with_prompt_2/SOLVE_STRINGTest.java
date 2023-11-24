package humaneval;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SOLVE_STRINGTest {
    @Test
    public void testSolveString() {
        String input = "1234";
        assertEquals("4321", humaneval.correct.SOLVE_STRING.solve_string(input));
        
        input = "ab";
        assertEquals("AB", humaneval.correct.SOLVE_STRING.solve_string(input));
        
        input = "#a@C";
        assertEquals("#A@c", humaneval.correct.SOLVE_STRING.solve_string(input));
    }
}