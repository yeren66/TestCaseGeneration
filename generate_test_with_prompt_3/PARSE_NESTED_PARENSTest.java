
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PARSE_NESTED_PARENSTest {
    @Test
    public void parse_nested_parensTEST() {
        String parenString = "((())())(()())";
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(3);
        expectedResult.add(2);
        expectedResult.add(1);
        expectedResult.add(0);

        PARSE_NESTED_PARENS parser = new PARSE_NESTED_PARENS();
        List<Integer> actualResult = parser.parse_nested_parens(parenString);

        assertEquals(expectedResult, actualResult);
    }
}
