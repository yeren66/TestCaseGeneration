package humaneval;

import static org.junit.Assert.*;

public class CORRECT_BRACKETINGTest {
    @Test
    public void testCorrectBracketing() {
        assertTrue(CORRECT_BRACKETING.correct_bracketing("<>"));
        assertTrue(CORRECT_BRACKETING.correct_bracketing("<<><>>"));
        assertFalse(CORRECT_BRACKETING.correct_bracketing("<"));
        assertFalse(CORRECT_BRACKETING.correct_bracketing("><<>"));
    }
}
