package humaneval;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PARSE_NESTED_PARENSTest {
    @Test
    public void testParseNestedParens() {
        String input = "(())";
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        
        List<Integer> result = humaneval.correct.PARSE_NESTED_PARENS.parse_nested_parens(input);
        assertEquals(expected, result);
    }
}