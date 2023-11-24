package humaneval;
import static org.junit.jupiter.api.Assertions.*;

public class SEPARATE_PAREN_GROUPSTest {
    @Test
    public void testEmptyString() {
        List<String> result = humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups("");
        assertEquals(0, result.size());
    }
    
    @Test
    public void testSingleGroup() {
        List<String> result = humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups("(A)");
        assertEquals(1, result.size());
        assertEquals("(A)", result.get(0));
    }
    
    @Test
    public void testMultipleGroups() {
        List<String> result = humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups("((AB)C)");
        assertEquals(2, result.size());
        assertEquals("((AB)", result.get(0));
        assertEquals("C)", result.get(1));
    }
    
    @Test
    public void testNestedGroups() {
        List<String> result = humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups("((A)BC)");
        assertEquals(2, result.size());
        assertEquals("((A)", result.get(0));
        assertEquals("BC)", result.get(1));
    }
    
    @Test
    public void testUnbalancedGroups() {
        List<String> result = humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups("((A)");
        assertEquals(0, result.size());
    }
}