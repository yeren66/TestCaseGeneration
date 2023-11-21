package humaneval;

import static org.junit.Assert.*;

public class SOLVE_STRINGTest {
    @Test
    public void testSolveString() {
        String s = "1234";
        assertEquals("4321", humaneval.correct.SOLVE_STRING.solve_string(s));
    }
    
    @Test
    public void testSolveStringWithAlphabeticCharacters() {
        String s = "ab";
        assertEquals("AB", humaneval.correct.SOLVE_STRING.solve_string(s));
    }
    
    @Test
    public void testSolveStringWithSpecialCharacters() {
        String s = "#a@C";
        assertEquals("#A@c", humaneval.correct.SOLVE_STRING.solve_string(s));
    }
}
