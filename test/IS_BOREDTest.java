package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.IS_BORED;

public class IS_BOREDTest {
    @Test
    public void is_boredTEST() {
        String input = "Hello world";
        int expectedOutput = 0;
        IS_BORED boredomCounter = new IS_BORED();
        int actualOutput = boredomCounter.is_bored(input);
        assertEquals(expectedOutput, actualOutput);
    }
}