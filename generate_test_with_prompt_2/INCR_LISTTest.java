package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class INCR_LISTTest {
    @Test
    public void testIncrList() {
        List<Integer> input = Arrays.asList(1, 2, 3);
        List<Integer> expectedOutput = Arrays.asList(2, 3, 4);
        assertEquals(expectedOutput, humaneval.correct.INCR_LIST.incr_list(input));
    }
}