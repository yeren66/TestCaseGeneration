
package humaneval;
import java.util.List;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.PARSE_NESTED_PARENS;
import java.util.ArrayList;
import java.util.List;

public class PARSE_NESTED_PARENSTest {
    @Test
    public void parse_nested_parensTEST() {
        String input = "( ( ) )";
        List<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(0);
        expectedOutput.add(1);
        expectedOutput.add(2);
        
        assertEquals(expectedOutput, PARSE_NESTED_PARENS.parse_nested_parens(input));
    }
}