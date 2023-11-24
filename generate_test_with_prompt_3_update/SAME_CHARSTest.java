
package humaneval.correct;

import org.junit.Assert;
import static org.junit.Assert.*;
import humaneval.SAME_CHARS;

public class SAME_CHARSTest {
    @Test
    public void same_charsTEST() {
        String s0 = "eabcdzzzz";
        String s1 = "dddzzzzzzzddeddabc";
        boolean expected = true;
        boolean actual = SAME_CHARS.same_chars(s0, s1);
        Assert.assertEquals(expected, actual);
    }
}
