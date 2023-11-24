package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class UNIQUE_DIGITSTest {
    @Test
    public void unique_digitsTEST() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(15);
        input.add(33);
        input.add(1422);
        input.add(1);
        
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(1);
        expectedOutput.add(15);
        expectedOutput.add(33);
        
        assertEquals(UNIQUE_DIGITS.unique_digits(input), expectedOutput);
    }
}