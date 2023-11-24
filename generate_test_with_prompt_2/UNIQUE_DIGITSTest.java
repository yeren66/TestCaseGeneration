
package humaneval;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class UNIQUE_DIGITSTest {
    @Test
    public void testUniqueDigits() {
        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(15, 33, 1422, 1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 15, 33));
        
        assertEquals(expected, humaneval.correct.UNIQUE_DIGITS.unique_digits(x));
    }
}
