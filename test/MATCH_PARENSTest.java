package humaneval;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.MATCH_PARENS;

public class MATCH_PARENSTest {
    @Test
    public void checkTEST() {
        String[] input = new String[]{"(", ")"};
        assertEquals(MATCH_PARENS.match_parens(input), "Yes");
        
        input = new String[]{")", "("};
        assertEquals(MATCH_PARENS.match_parens(input), "No");
    }
}