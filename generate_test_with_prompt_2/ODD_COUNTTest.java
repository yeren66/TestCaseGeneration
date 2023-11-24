package humaneval;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class ODD_COUNTTest {
    @Test
    public void testOddCount() {
        ArrayList<String> input = new ArrayList<>();
        input.add("1234567");
        ArrayList<String> result = humaneval.correct.ODD_COUNT.odd_count(input);
        
        assertEquals(result, Arrays.asList("the number of odd elements 4n the str4ng 4 of the 4nput."));
    }
}
