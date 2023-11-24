package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class MATCH_PARENSTest {
    @Test
    public void checkTEST() {
        assertEquals("Yes", MATCH_PARENS.match_parens(new String[]{"(", ")"}));
        assertEquals("No", MATCH_PARENS.match_parens(new String[]{")", ")"}));
        assertEquals("Yes", MATCH_PARENS.match_parens(new String[]{"()(", ")"}));
    }
}