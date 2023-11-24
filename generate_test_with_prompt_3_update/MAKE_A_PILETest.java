
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.MAKE_A_PILE;
import java.util.ArrayList;

public class MAKE_A_PILETest {
    @Test
    public void make_a_pileTEST() {
        int n = 3;
        ArrayList<Integer> expectedOutput = new ArrayList<>();
        expectedOutput.add(3);
        expectedOutput.add(5);
        expectedOutput.add(7);
        assertEquals("The output for input n=3 is incorrect", expectedOutput, MAKE_A_PILE.make_a_pile(n));
    }
}