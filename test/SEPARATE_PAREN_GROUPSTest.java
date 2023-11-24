
package humaneval;
import java.util.List;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SEPARATE_PAREN_GROUPS;
import java.util.ArrayList;
import java.util.List;

public class SEPARATE_PAREN_GROUPSTest {
    @Test
    public void separate_paren_groupsTEST() {
        String input = "(()())";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("(()())");

        assertEquals(expectedOutput, SEPARATE_PAREN_GROUPS.separate_paren_groups(input));
    }
}
