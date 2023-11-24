package humaneval;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class GENERATE_INTEGERSTest {
    @Test
    public void testGenerateIntegers() {
        // Test case 1: lower and upper bounds within the same even number
        ArrayList<Integer> result = humaneval.correct.GENERATE_INTEGERS.generate_integers(2, 8);
        assertEquals(Arrays.asList(2, 4, 6, 8), result);
        
        // Test case 2: lower bound is an odd number and upper bound is an even number
        ArrayList<Integer> result = humaneval.correct.GENERATE_INTEGERS.generate_integers(13, 24);
        assertEquals(Arrays.asList(24), result);
        
        // Test case 3: both lower and upper bounds are odd numbers
        ArrayList<Integer> result = humaneval.correct.GENERATE_INTEGERS.generate_integers(19, 37);
        assertEquals(Arrays.asList(), result);
    }
}
