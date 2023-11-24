package humaneval;
import java.util.List;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.ODD_COUNT;
import java.util.ArrayList;

public class ODD_COUNTTest {
    @Test
    public void odd_countTEST() {
        ArrayList<String> input = new ArrayList<>();
        input.add("1234567");
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("the number of odd elements 4n the str4ng 4 of the 4nput.");
        
        assertEquals(expectedOutput, ODD_COUNT.odd_count(input));
    }
}