package humaneval;

import static org.junit.Assert.*;

public class MATCH_PARENSTest {
    @Test
    public void testMatchParens1() {
        String[] lst = new String[] {"()(", ")"};
        assertEquals("Yes", MATCH_PARENS.match_parens(lst));
    }
    
    @Test
    public void testMatchParens2() {
        String[] lst = new String[] {"())", ")("};
        assertEquals("No", MATCH_PARENS.match_parens(lst));
    }
    
    @Test
    public void testMatchParens3() {
        String[] lst = new String[] {"(", ")"};
        assertEquals("Yes", MATCH_PARENS.match_parens(lst));
    }
    
    @Test
    public void testMatchParens4() {
        String[] lst = new String[] {"())", ")("};
        assertEquals("No", MATCH_PARENS.match_parens(lst));
    }
}
