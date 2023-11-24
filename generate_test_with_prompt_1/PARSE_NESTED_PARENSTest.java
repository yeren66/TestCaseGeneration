
package humaneval;

import static org.junit.Assert.*;

public class PARSE_NESTED_PARENSTest {
    @Test
    public void testEmptyString() {
        String parenString = "";
        List<Integer> expectedDepths = new ArrayList<>();
        
        List<Integer> actualDepths = PARSE_NESTED_PARENS.parseNestedParens(parenString);
        
        assertEquals(expectedDepths, actualDepths);
    }
    
    @Test
    public void testSingleGroup() {
        String parenString = "(())";
        List<Integer> expectedDepths = new ArrayList<>();
        expectedDepths.add(1);
        
        List<Integer> actualDepths = PARSE_NESTED_PARENS.parseNestedParens(parenString);
        
        assertEquals(expectedDepths, actualDepths);
    }
    
    @Test
    public void testMultipleGroups() {
        String parenString = "(()) (())";
        List<Integer> expectedDepths = new ArrayList<>();
        expectedDepths.add(1);
        expectedDepths.add(2);
        
        List<Integer> actualDepths = PARSE_NESTED_PARENS.parseNestedParens(parenString);
        
        assertEquals(expectedDepths, actualDepths);
    }
    
    @Test
    public void testMixedGroups() {
        String parenString = "(()) (((()))";
        List<Integer> expectedDepths = new ArrayList<>();
        expectedDepths.add(1);
        expectedDepths.add(3);
        
        List<Integer> actualDepths = PARSE_NESTED_PARENS.parseNestedParens(parenString);
        
        assertEquals(expectedDepths, actualDepths);
    }
    
    @Test
    public void testNullInput() {
        String parenString = null;
        List<Integer> expectedDepths = new ArrayList<>();
        
        List<Integer> actualDepths = PARSE_NESTED_PARENS.parseNestedParens(parenString);
        
        assertEquals(expectedDepths, actualDepths);
    }
}
