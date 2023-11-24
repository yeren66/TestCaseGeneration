
package humaneval.correct;

import org.junit.Assert;
import static org.junit.Assert.*;
import humaneval.correct.CORRECT_BRACKETING;

public class CORRECT_BRACKETINGTest {
    @Test
    public void correct_bracketingTEST() {
        String brackets = "<>";
        boolean result = CORRECT_BRACKETING.correct_bracketing(brackets);
        Assert.assertEquals(true, result);
    }
}
