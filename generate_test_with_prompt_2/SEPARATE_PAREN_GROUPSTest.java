package humaneval;
import static org.junit.Assert.*;

public class SEPARATE_PAREN_GROUPSTest {
    @Test
    public void testSeparateParenGroups() {
        // Test case 1: Empty string
        assertEquals(0, humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups("").size());

        // Test case 2: Single group with no inner parens
        assertEquals(Collections.singletonList("(a)"), humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups("(a)"));

        // Test case 3: Multiple groups with no inner parens
        assertEquals(Arrays.asList("(a)", "(b)", "(c)"), humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups("(a)(b)(c)"));

        // Test case 4: Single group with inner parens
        assertEquals(Collections.singletonList("(a(b))"), humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups("(a(b))"));

        // Test case 5: Multiple groups with inner parens
        assertEquals(Arrays.asList("(a(b))", "(c(d))", "(e)"), humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups("(a(b))(c(d))(e)"));
    }
}