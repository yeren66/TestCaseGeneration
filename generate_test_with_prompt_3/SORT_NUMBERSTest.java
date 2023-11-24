
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util;

public class SORT_NUMBERSTest {
    @Test
    public void sort_numbersTEST() {
        String input = "nine six two four five seven one three";
        String expectedOutput = "one three five seven nine six two four";
        
        assertEquals(expectedOutput, SORT_NUMBERS.sort_numbers(input));
    }
}