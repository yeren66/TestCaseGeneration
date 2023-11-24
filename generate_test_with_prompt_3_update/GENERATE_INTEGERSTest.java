
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.GENERATE_INTEGERS;
import java.util.ArrayList;

public class GENERATE_INTEGERSTest {
    @Test
    public void generate_integersTEST() {
        // Test case 1: a = 2, b = 8
        int a = 2;
        int b = 8;
        ArrayList<Integer> expectedOutput = new ArrayList<Integer>();
        for (int i = 2; i <= 8; i += 2) {
            expectedOutput.add(i);
        }
        
        assertEquals(expectedOutput, GENERATE_INTEGERS.generate_integers(a, b));
        
        // Test case 2: a = 8, b = 2
        a = 8;
        b = 2;
        expectedOutput = new ArrayList<Integer>();
        for (int i = 2; i <= 8; i += 2) {
            expectedOutput.add(i);
        }
        
        assertEquals(expectedOutput, GENERATE_INTEGERS.generate_integers(a, b));
        
        // Test case 3: a = 10, b = 14
        a = 10;
        b = 14;
        expectedOutput = new ArrayList<Integer>();
        assertEquals(expectedOutput, GENERATE_INTEGERS.generate_integers(a, b));
    }
}