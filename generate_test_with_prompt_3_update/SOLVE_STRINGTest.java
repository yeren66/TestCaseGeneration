package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SOLVE_STRING;

public class SOLVE_STRINGTest {
    @Test
    public void solve_stringTEST() {
        String input1 = "ab";
        String expectedOutput1 = "AB";
        assertEquals(expectedOutput1, SOLVE_STRING.solve_string(input1));
        
        String input2 = "#a@C";
        String expectedOutput2 = "#A@c";
        assertEquals(expectedOutput2, SOLVE_STRING.solve_string(input2));
        
        String input3 = "1234";
        String expectedOutput3 = "4321";
        assertEquals(expectedOutput3, SOLVE_STRING.solve_string(input3));
    }
}