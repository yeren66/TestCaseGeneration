package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class CORRECT_BRACKETINGTest {
    @Test
    public void correct_bracketingTEST() {
        String brackets = "<>";
        boolean result = CORRECT_BRACKETING.correct_bracketing(brackets);
        assertTrue(result);
    }
}